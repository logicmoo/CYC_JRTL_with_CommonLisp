package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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

public class inference_analysis extends SubLTranslatedFile {
    public static SubLFile me = new inference_analysis();
    public static String myFingerPrint = "3b592e637e10cdbaeb6a299b678f76fbde7a016b057b961f308a04c3bedced1b";
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
    private static SubLSymbol $sym0$_TRANSFORMATION_RULE_STATISTICS_TABLE_ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-TABLE*");
    private static SubLInteger $int$64 = makeInteger(64);
    private static SubLSymbol $sym2$_TRANSFORMATION_RULE_STATISTICS_LOCK_ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-LOCK*");
    private static SubLString $str3$Transformation_Rule_Statistics_Lo = makeString("Transformation Rule Statistics Lock");
    private static SubLSymbol $sym4$_TRANSFORMATION_RULE_STATISTICS_FILENAME_LOAD_HISTORY_ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY*");
    private static SubLSymbol $sym5$_TRANSFORMATION_RULE_STATISTICS_RECEIVED_FILENAME_LOAD_HISTORY_ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY*");
    private static SubLList $list6 = list(list(makeSymbol("RULE-VAR"), makeSymbol("&KEY"), makeSymbol("RECENT?"), makeSymbol("RECEIVED?"), makeSymbol("COPY?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
    private static SubLList $list7 = list(makeKeyword("RECENT?"), makeKeyword("RECEIVED?"), makeKeyword("COPY?"), makeKeyword("DONE"));
    private static SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
    private static SubLSymbol $RECENT_ = makeKeyword("RECENT?");
    private static SubLSymbol $RECEIVED_ = makeKeyword("RECEIVED?");
    private static SubLSymbol $COPY_ = makeKeyword("COPY?");
    private static SubLSymbol $DONE = makeKeyword("DONE");
    private static SubLSymbol $sym13$DO_LIST = makeSymbol("DO-LIST");
    private static SubLList $list14 = list(makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-HELPER"));
    private static SubLSymbol $sym15$PWHEN = makeSymbol("PWHEN");
    private static SubLSymbol $sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_ = makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-CONDITION-PASSES?");
    private static SubLSymbol $sym17$STATISTICS_VAR = makeUninternedSymbol("STATISTICS-VAR");
    private static SubLSymbol $sym18$DO_HASH_TABLE = makeSymbol("DO-HASH-TABLE");
    private static SubLList $list19 = list(makeSymbol("TRANSFORMATION-RULE-STATISTICS-TABLE"));
    private static SubLSymbol $sym20$IGNORE = makeSymbol("IGNORE");
    private static SubLSymbol $sym21$TRANSFORMATION_RULE_STATISTICS_TABLE = makeSymbol("TRANSFORMATION-RULE-STATISTICS-TABLE");
    private static SubLSymbol $sym22$DO_TRANSFORMATION_RULES_WITH_STATISTICS = makeSymbol("DO-TRANSFORMATION-RULES-WITH-STATISTICS");
    private static SubLSymbol $sym23$TRANSFORMATION_RULES_WITH_STATISTICS_HELPER = makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-HELPER");
    private static SubLSymbol $UNINITIALIZED = makeKeyword("UNINITIALIZED");
    private static SubLSymbol $NONE = makeKeyword("NONE");
    private static SubLSymbol $CONSIDERED = makeKeyword("CONSIDERED");
    private static SubLSymbol $sym27$_ = makeSymbol(">");
    private static SubLSymbol $sym28$TRANSFORMATION_RULE_SUCCESS_COUNT = makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT");
    private static SubLSymbol $sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT = makeSymbol("TRANSFORMATION-RULE-CONSIDERED-COUNT");
    private static SubLSymbol $SUCCESS = makeKeyword("SUCCESS");
    private static SubLSymbol $sym31$_ = makeSymbol("<");
    private static SubLSymbol $SUCCESS_PROBABILITY = makeKeyword("SUCCESS-PROBABILITY");
    private static SubLSymbol $sym33$TRANSFORMATION_RULE_SUCCESS_PROBABILITY = makeSymbol("TRANSFORMATION-RULE-SUCCESS-PROBABILITY");
    private static SubLSymbol $HISTORICAL_UTILITY = makeKeyword("HISTORICAL-UTILITY");
    private static SubLSymbol $sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY = makeSymbol("TRANSFORMATION-RULE-HISTORICAL-UTILITY");
    private static SubLSymbol $sym36$ASSERTION_P = makeSymbol("ASSERTION-P");
    private static SubLSymbol $sym37$INTEGERP = makeSymbol("INTEGERP");
    private static SubLString $str38$Incrementing_transformation_rule_ = makeString("Incrementing transformation rule considered count by zero; this is is vacuous and suspicious");
    private static SubLInteger $int$_100 = makeInteger(-100);
    private static SubLInteger $int$100 = makeInteger(100);
    private static SubLSymbol $sym41$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
    private static SubLSymbol $sym42$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
    private static SubLSymbol $OUTPUT = makeKeyword("OUTPUT");
    private static SubLString $str44$Unable_to_open__S = makeString("Unable to open ~S");
    private static SubLSymbol $INPUT = makeKeyword("INPUT");
    private static SubLString $str46$Transformation_rule_statistics_up = makeString("Transformation rule statistics updating is not enabled.");
    private static SubLString $str47$_________________________________ = makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
    private static SubLString $str48$______S_rules__sorted_by__A = makeString("~%;; ~S rules, sorted by ~A");
    private static SubLString $str49$________S__S___S_____utility____S = makeString("~%~%;; ~S/~S (~S %)  utility : ~S~%~S");
    private static SubLString $str50$Save_recent_experience_lock = makeString("Save recent experience lock");
    private static SubLString $str51$experience = makeString("experience");
    private static SubLString $str52$_TS = makeString(".TS");
    private static SubLString $str53$_CFASL = makeString(".CFASL");
    private static SubLString $str54$_ts = makeString(".ts");
    private static SubLString $str55$_cfasl = makeString(".cfasl");
    private static SubLSymbol $sym56$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
    private static SubLSymbol $sym57$DIRECTORY_P = makeSymbol("DIRECTORY-P");
    private static SubLString $str58$Loading_transformation_rule_stati = makeString("Loading transformation rule statistics");
    private static SubLString $str59$cdolist = makeString("cdolist");
    private static SubLString $str60$_experience_cfasl = makeString("-experience.cfasl");
    private static SubLSymbol $sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
    private static SubLList $list62;
    private static SubLSymbol $sym63$CSETQ = makeSymbol("CSETQ");
    private static SubLString $str64$_A = makeString("~A");
    private static SubLFloat $float$0_02939361143247565 = makeDouble(0.029393611432475649D);
    private static SubLString $str66$Repairing_transformation_rule_sta = makeString("Repairing transformation rule statistics");
    private static SubLString $str67$Repairing__a_spurious_zeroes_in__ = makeString("Repairing ~a spurious zeroes in ~a~%");
    private static SubLString $str68$_bloated_cfasl = makeString("-bloated.cfasl");
    private static SubLString $str69$Could_not_load__a = makeString("Could not load ~a");
    private static SubLSymbol $EOF = makeKeyword("EOF");
    private static SubLList $list71 = cons(makeSymbol("RULE"), makeSymbol("VECTOR"));
    private static SubLSymbol $sym72$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_ = makeSymbol("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH*");
    private static SubLInteger $int$256 = makeInteger(256);
    private static SubLSymbol $sym74$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_ = makeSymbol("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH-LOCK*");
    private static SubLString $str75$Rule_Historical_Connectivity_Grap = makeString("Rule Historical Connectivity Graph Lock");
    private static SubLSymbol $sym76$SET_CONTENTS_P = makeSymbol("SET-CONTENTS-P");
    private static SubLString $str77$Got_a_directed_instead_of_undirec = makeString("Got a directed instead of undirected link in the rule historical connectedness graph while trying to compute the ratio for ~s");
    private static SubLString $str78$____Rule_____S__Connected_Rules__ = makeString("~%~%Rule :~%~S~%Connected Rules :");
    private static SubLString $str79$___S = makeString("~%~S");
    private static SubLString $str80$Rule__ = makeString("Rule :");
    private static SubLString $str81$Connected_Rules__ = makeString("Connected Rules :");
    private static SubLSymbol $sym82$CLET = makeSymbol("CLET");
    private static SubLList $list83;
    private static SubLSymbol $sym84$CDR = makeSymbol("CDR");
    private static SubLList $list85 = cons(makeSymbol("HL-MODULE"), makeSymbol("COUNT"));
    private static SubLString $str86$___4_D__S__ = makeString("~&~4,D ~S~%");
    private static SubLSymbol $sym87$_ASKED_QUERIES_QUEUE_ = makeSymbol("*ASKED-QUERIES-QUEUE*");
    private static SubLString $str88$Query_logging_lock = makeString("Query logging lock");
    private static SubLInteger $int$300 = makeInteger(300);
    private static SubLList $list90 = list(makeKeyword("PROBLEM-STORE"));
    private static SubLString $str91$Read_invalid_query_info__s = makeString("Read invalid query info ~s");
    private static SubLList $list92 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));
    private static SubLString $str93$asked_queries = makeString("asked-queries");
    private static SubLSymbol $APPEND = makeKeyword("APPEND");
    private static SubLSymbol $sym95$QUERY_INFO_P = makeSymbol("QUERY-INFO-P");
    private static SubLSymbol $sym96$ASKED_QUERIES_FILENAME_ = makeSymbol("ASKED-QUERIES-FILENAME?");
    private static SubLSymbol $sym97$DO_ASKED_QUERIES_IN_DIRECTORY = makeSymbol("DO-ASKED-QUERIES-IN-DIRECTORY");
    private static SubLString $str98$local_asked_queries_cfasl = makeString("local-asked-queries.cfasl");
    private static SubLSymbol $sym99$_ASKED_QUERY_COMMON_SYMBOLS_ = makeSymbol("*ASKED-QUERY-COMMON-SYMBOLS*");
    private static SubLSymbol $sym100$_ASKED_QUERY_COMMON_SYMBOLS_SIMPLE_ = makeSymbol("*ASKED-QUERY-COMMON-SYMBOLS-SIMPLE*");
    private static SubLSymbol $sym101$VECTOR = makeSymbol("VECTOR");
    private static SubLString $str102$Entering__s__ = makeString("Entering ~s~%");
    private static SubLInteger $int$1000 = makeInteger(1000);
    private static SubLString $str104$_ = makeString(".");
    private static SubLString $str105$__Number_of_saved_queries_per_dir = makeString("~%Number of saved queries per directory:~%");
    private static SubLString $str106$__Histogram_of_saved_queries_per_ = makeString("~%Histogram of saved queries per file:~%");
    private static SubLString $str107$__Total_number_of_saved_queries__ = makeString("~%Total number of saved queries: ~s~%");
    private static SubLString $str108$__Total_number_of_unique_saved_qu = makeString("~%Total number of unique saved queries: ~s~%~%");
    private static SubLSymbol $sym109$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");
    private static SubLSymbol $sym110$SUPPORT_MT = makeSymbol("SUPPORT-MT");
    private static SubLObject $$InferencePSC = makeConstSym(("InferencePSC"));
    private static SubLSymbol $SKIP = makeKeyword("SKIP");
    private static SubLSymbol $sym113$SINGLETON_ = makeSymbol("SINGLETON?");
    private static SubLSymbol $sym114$FIRST = makeSymbol("FIRST");
    private static SubLString $str115$non_singleton_max_floor_mts_of_si = makeString("non-singleton max-floor-mts-of-singletons: ~s ~s");
    private static SubLString $str116$multiple_justifications___s__S = makeString("multiple justifications: ~s ~S");
    private static SubLSymbol $sym117$APPEND = makeSymbol("APPEND");
    private static SubLObject $$EverythingPSC = makeConstSym(("EverythingPSC"));
    private static SubLList $list119 = list(makeSymbol("CONCLUDED-MTS"), makeSymbol("SUPPORT-COMBINATION"));
    private static SubLSymbol $sym120$HLMT_EQUAL_ = makeSymbol("HLMT-EQUAL?");
    static {
        $list62 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);
        $list83 = list(list(makeSymbol("*HL-MODULE-EXPAND-COUNTS-ENABLED?*"), T), list(makeSymbol("*HL-MODULE-EXPAND-COUNTS*"), list(makeSymbol("NEW-DICTIONARY"))));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 800L)
    public static SubLObject problem_store_estimated_problem_reuses_count(SubLObject store) {
        return Numbers.subtract(inference_datastructures_problem_store.problem_store_dependent_link_count(store), inference_datastructures_problem_store.problem_store_problem_count(store));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 1200L)
    public static SubLObject problem_store_estimated_reuse_ratio(SubLObject store) {
        SubLObject problem_count = inference_datastructures_problem_store.problem_store_problem_count(store);
        return problem_count.isZero() ? ZERO_INTEGER : Numbers.divide(problem_store_estimated_problem_reuses_count(store), problem_count);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 2300L)
    public static SubLObject clear_transformation_rule_statistics_filename_load_history() {
        $transformation_rule_statistics_filename_load_history$.setGlobalValue(NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 2500L)
    public static SubLObject clear_transformation_rule_statistics_received_filename_load_history() {
        $transformation_rule_statistics_received_filename_load_history$.setGlobalValue(NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 2700L)
    public static SubLObject add_to_transformation_rule_statistics_filename_load_history(SubLObject filename, SubLObject receivedP) {
        if (NIL != receivedP) {
            SubLObject new_cons = cons(filename, NIL);
            SubLObject list = $transformation_rule_statistics_received_filename_load_history$.getGlobalValue();
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                $transformation_rule_statistics_received_filename_load_history$.setGlobalValue(new_cons);
            }
        } else {
            SubLObject new_cons = cons(filename, NIL);
            SubLObject list = $transformation_rule_statistics_filename_load_history$.getGlobalValue();
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                $transformation_rule_statistics_filename_load_history$.setGlobalValue(new_cons);
            }
        }
        return filename;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3000L)
    public static SubLObject transformation_rule_statistics_filename_load_history() {
        return $transformation_rule_statistics_filename_load_history$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3100L)
    public static SubLObject transformation_rule_statistics_received_filename_load_history() {
        return $transformation_rule_statistics_received_filename_load_history$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3500L)
    public static SubLObject transformation_rule_statistics_update_enabledP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3600L)
    public static SubLObject enable_transformation_rule_statistics_update() {
        $transformation_rule_statistics_update_enabledP$.setDynamicValue(T);
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3800L)
    public static SubLObject disable_transformation_rule_statistics_update() {
        $transformation_rule_statistics_update_enabledP$.setDynamicValue(NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3900L)
    public static SubLObject do_transformation_rules_with_statistics(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list6);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_var = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list6);
        rule_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list6);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list6);
            if (NIL == conses_high.member(current_$1, $list7, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list6);
        }
        SubLObject recentP_tail = cdestructuring_bind.property_list_member($RECENT_, current);
        SubLObject recentP = (NIL != recentP_tail) ? conses_high.cadr(recentP_tail) : NIL;
        SubLObject receivedP_tail = cdestructuring_bind.property_list_member($RECEIVED_, current);
        SubLObject receivedP = (NIL != receivedP_tail) ? conses_high.cadr(receivedP_tail) : NIL;
        SubLObject copyP_tail = cdestructuring_bind.property_list_member($COPY_, current);
        SubLObject copyP = (NIL != copyP_tail) ? conses_high.cadr(copyP_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        if (NIL != copyP) {
            return list($sym13$DO_LIST, list(rule_var, $list14, $DONE, done), listS($sym15$PWHEN, list($sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, rule_var, recentP, receivedP), append(body, NIL)));
        }
        SubLObject statistics_var = $sym17$STATISTICS_VAR;
        return list($sym18$DO_HASH_TABLE, list(rule_var, statistics_var, $list19, $DONE, done), list($sym20$IGNORE, statistics_var), listS($sym15$PWHEN, list($sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, rule_var, recentP, receivedP), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 4800L)
    public static SubLObject transformation_rule_statistics_table() {
        return $transformation_rule_statistics_table$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 5000L)
    public static SubLObject transformation_rules_with_statistics_helper() {
        SubLObject rules = NIL;
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
            rules = hash_table_utilities.hash_table_keys(transformation_rule_statistics_table());
        } finally {
            if (NIL != release) {
                Locks.release_lock($transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return rules;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 5300L)
    public static SubLObject transformation_rules_with_statistics_condition_passesP(SubLObject rule, SubLObject recentP, SubLObject receivedP) {
        return makeBoolean(NIL != assertion_handles.valid_assertionP(rule, UNPROVIDED) && (NIL == recentP || NIL != transformation_rule_has_recent_statisticsP(rule)) && (NIL == receivedP || NIL != transformation_rule_has_received_statisticsP(rule)));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 5600L)
    public static SubLObject new_transformation_rule_statistics() {
        return Vectors.make_vector(SIX_INTEGER, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 6300L)
    public static SubLObject clear_all_transformation_rule_statistics() {
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
            Hashtables.clrhash($transformation_rule_statistics_table$.getGlobalValue());
            clear_transformation_rule_statistics_filename_load_history();
        } finally {
            if (NIL != release) {
                Locks.release_lock($transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 6500L)
    public static SubLObject clear_transformation_rule_statistics(SubLObject rule) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
            result = Hashtables.remhash(rule, $transformation_rule_statistics_table$.getGlobalValue());
        } finally {
            if (NIL != release) {
                Locks.release_lock($transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 6800L)
    public static SubLObject transformation_rules_with_statistics_count() {
        return Hashtables.hash_table_count($transformation_rule_statistics_table$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 6900L)
    public static SubLObject get_transformation_rule_statistics(SubLObject rule) {
        return Hashtables.gethash_without_values(rule, $transformation_rule_statistics_table$.getGlobalValue(), $UNINITIALIZED);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 7100L)
    public static SubLObject ensure_transformation_rule_statistics(SubLObject rule) {
        SubLObject statistics = get_transformation_rule_statistics(rule);
        if ($UNINITIALIZED == statistics) {
            statistics = new_transformation_rule_statistics();
            SubLObject release = NIL;
            try {
                release = Locks.seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
                Hashtables.sethash(rule, $transformation_rule_statistics_table$.getGlobalValue(), statistics);
            } finally {
                if (NIL != release) {
                    Locks.release_lock($transformation_rule_statistics_lock$.getGlobalValue());
                }
            }
        }
        return statistics;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 7500L)
    public static SubLObject transformation_rules_with_statistics(SubLObject order, SubLObject recentP, SubLObject receivedP) {
        if (order == UNPROVIDED) {
            order = $NONE;
        }
        if (recentP == UNPROVIDED) {
            recentP = NIL;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        SubLObject rules = NIL;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, recentP, receivedP)) {
                    rules = cons(rule, rules);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        SubLObject pcase_var = order;
        if (pcase_var.eql($CONSIDERED)) {
            rules = Sort.sort(rules, Symbols.symbol_function($sym27$_), $sym28$TRANSFORMATION_RULE_SUCCESS_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function($sym27$_), $sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT);
        } else if (pcase_var.eql($SUCCESS)) {
            rules = Sort.sort(rules, Symbols.symbol_function($sym31$_), $sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function($sym27$_), $sym28$TRANSFORMATION_RULE_SUCCESS_COUNT);
        } else if (pcase_var.eql($SUCCESS_PROBABILITY)) {
            rules = Sort.sort(rules, Symbols.symbol_function($sym27$_), $sym28$TRANSFORMATION_RULE_SUCCESS_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function($sym27$_), $sym33$TRANSFORMATION_RULE_SUCCESS_PROBABILITY);
        } else if (pcase_var.eql($HISTORICAL_UTILITY)) {
            rules = Sort.sort(rules, Symbols.symbol_function($sym31$_), $sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function($sym27$_), $sym28$TRANSFORMATION_RULE_SUCCESS_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function($sym27$_), $sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY);
        }
        return rules;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 8600L)
    public static SubLObject transformation_rules_with_recent_statistics() {
        SubLObject rules = NIL;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    rules = cons(rule, rules);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sequences.nreverse(rules);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 8800L)
    public static SubLObject transformation_rules_with_received_statistics() {
        SubLObject rules = NIL;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    rules = cons(rule, rules);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sequences.nreverse(rules);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9000L)
    public static SubLObject transformation_rules_with_recent_statistics_count() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    count = Numbers.add(count, ONE_INTEGER);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9200L)
    public static SubLObject transformation_rules_with_received_statistics_count() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    count = Numbers.add(count, ONE_INTEGER);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9400L)
    public static SubLObject any_recent_experienceP() {
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    return T;
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9500L)
    public static SubLObject any_received_experienceP() {
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    return T;
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9700L)
    public static SubLObject total_transformation_rule_considered_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    total = Numbers.add(total, transformation_rule_considered_count(rule));
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9900L)
    public static SubLObject total_transformation_rule_recent_considered_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    total = Numbers.add(total, transformation_rule_considered_count(rule));
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 10100L)
    public static SubLObject total_transformation_rule_received_considered_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    total = Numbers.add(total, transformation_rule_considered_count(rule));
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 10400L)
    public static SubLObject transformation_rule_considered_count(SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        SubLObject statistics = get_transformation_rule_statistics(rule);
        return ($UNINITIALIZED == statistics) ? ZERO_INTEGER : Numbers.add(Vectors.aref(statistics, ZERO_INTEGER), Vectors.aref(statistics, FOUR_INTEGER));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 10700L)
    public static SubLObject transformation_rule_recent_considered_count(SubLObject rule) {
        SubLObject statistics = get_transformation_rule_statistics(rule);
        return ($UNINITIALIZED == statistics) ? ZERO_INTEGER : Vectors.aref(statistics, TWO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 10900L)
    public static SubLObject transformation_rule_received_considered_count(SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        SubLObject statistics = get_transformation_rule_statistics(rule);
        return ($UNINITIALIZED == statistics) ? ZERO_INTEGER : Vectors.aref(statistics, FOUR_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11200L)
    public static SubLObject transformation_rule_has_recent_statisticsP(SubLObject rule) {
        return Numbers.plusp(transformation_rule_recent_considered_count(rule));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11400L)
    public static SubLObject transformation_rule_has_received_statisticsP(SubLObject rule) {
        return Numbers.plusp(transformation_rule_received_considered_count(rule));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11500L)
    public static SubLObject total_transformation_rule_success_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    total = Numbers.add(total, transformation_rule_success_count(rule));
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11700L)
    public static SubLObject total_transformation_rule_recent_success_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    total = Numbers.add(total, transformation_rule_success_count(rule));
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11900L)
    public static SubLObject total_transformation_rule_received_success_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    total = Numbers.add(total, transformation_rule_success_count(rule));
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 12200L)
    public static SubLObject transformation_rule_success_count(SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        SubLObject statistics = get_transformation_rule_statistics(rule);
        return ($UNINITIALIZED == statistics) ? ZERO_INTEGER : Numbers.add(Vectors.aref(statistics, ONE_INTEGER), Vectors.aref(statistics, FIVE_INTEGER));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 12500L)
    public static SubLObject transformation_rule_recent_success_count(SubLObject rule) {
        SubLObject statistics = get_transformation_rule_statistics(rule);
        return ($UNINITIALIZED == statistics) ? ZERO_INTEGER : Vectors.aref(statistics, THREE_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 12700L)
    public static SubLObject transformation_rule_received_success_count(SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        SubLObject statistics = get_transformation_rule_statistics(rule);
        return ($UNINITIALIZED == statistics) ? ZERO_INTEGER : Vectors.aref(statistics, FIVE_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 13000L)
    public static SubLObject transformation_rule_success_probability(SubLObject rule, SubLObject unused_probability) {
        if (unused_probability == UNPROVIDED) {
            unused_probability = ZERO_INTEGER;
        }
        SubLObject considered = transformation_rule_considered_count(rule);
        if (!considered.isPositive()) {
            return unused_probability;
        }
        SubLObject success = transformation_rule_success_count(rule);
        return Numbers.divide(success, considered);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 13500L)
    public static SubLObject increment_transformation_rule_considered_count(SubLObject rule, SubLObject recentP, SubLObject count, SubLObject receivedP) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(rule) : rule;
        assert NIL != Types.integerp(count) : count;
        if (NIL == subl_promotions.positive_integer_p(count)) {
            Errors.warn($str38$Incrementing_transformation_rule_);
        }
        SubLObject statistics = ensure_transformation_rule_statistics(rule);
        if (NIL != $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread)) {
            if (NIL == receivedP) {
                Vectors.set_aref(statistics, ZERO_INTEGER, Numbers.add(Vectors.aref(statistics, ZERO_INTEGER), count));
            }
            if (NIL != recentP) {
                Vectors.set_aref(statistics, TWO_INTEGER, Numbers.add(Vectors.aref(statistics, TWO_INTEGER), count));
            }
            if (NIL != receivedP) {
                Vectors.set_aref(statistics, FOUR_INTEGER, Numbers.add(Vectors.aref(statistics, FOUR_INTEGER), count));
            }
        }
        return Vectors.aref(statistics, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 14400L)
    public static SubLObject increment_transformation_rule_success_count(SubLObject rule, SubLObject recentP, SubLObject count, SubLObject receivedP) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(rule) : rule;
        assert NIL != Types.integerp(count) : count;
        SubLObject statistics = ensure_transformation_rule_statistics(rule);
        if (NIL != $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread)) {
            if (NIL == receivedP) {
                Vectors.set_aref(statistics, ONE_INTEGER, Numbers.add(Vectors.aref(statistics, ONE_INTEGER), count));
            }
            if (NIL != recentP) {
                Vectors.set_aref(statistics, THREE_INTEGER, Numbers.add(Vectors.aref(statistics, THREE_INTEGER), count));
            }
            if (NIL != receivedP) {
                Vectors.set_aref(statistics, FIVE_INTEGER, Numbers.add(Vectors.aref(statistics, FIVE_INTEGER), count));
            }
        }
        return Vectors.aref(statistics, ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 15200L)
    public static SubLObject clear_all_recent_transformation_rule_statistics() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    clear_transformation_rule_recent_counts(rule);
                    count = Numbers.add(count, ONE_INTEGER);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 15400L)
    public static SubLObject clear_all_received_transformation_rule_statistics() {
        SubLObject count = ZERO_INTEGER;
        clear_transformation_rule_statistics_received_filename_load_history();
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    clear_transformation_rule_received_counts(rule);
                    count = Numbers.add(count, ONE_INTEGER);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 15700L)
    public static SubLObject clear_transformation_rule_recent_counts(SubLObject rule) {
        assert NIL != assertion_handles.assertion_p(rule) : rule;
        SubLObject statistics = ensure_transformation_rule_statistics(rule);
        Vectors.set_aref(statistics, TWO_INTEGER, ZERO_INTEGER);
        Vectors.set_aref(statistics, THREE_INTEGER, ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 16100L)
    public static SubLObject clear_transformation_rule_received_counts(SubLObject rule) {
        assert NIL != assertion_handles.assertion_p(rule) : rule;
        possibly_extend_transformation_rule_utility_table();
        SubLObject statistics = ensure_transformation_rule_statistics(rule);
        Vectors.set_aref(statistics, FOUR_INTEGER, ZERO_INTEGER);
        Vectors.set_aref(statistics, FIVE_INTEGER, ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 16500L)
    public static SubLObject clean_transformation_rule_statistics() {
        SubLObject count = ZERO_INTEGER;
        SubLObject dirty_rules = NIL;
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
            hash_table_utilities.rehash($transformation_rule_statistics_table$.getGlobalValue());
            SubLObject rule = NIL;
            SubLObject statistics = NIL;
            Iterator cdohash_iterator = Hashtables.getEntrySetIterator($transformation_rule_statistics_table$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    rule = Hashtables.getEntryKey(cdohash_entry);
                    statistics = Hashtables.getEntryValue(cdohash_entry);
                    if (NIL == assertion_handles.valid_assertionP(rule, UNPROVIDED) || NIL == assertions_high.rule_assertionP(rule) || Vectors.aref(statistics, ZERO_INTEGER).isZero()) {
                        dirty_rules = cons(rule, dirty_rules);
                    }
                }
            } finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            SubLObject cdolist_list_var = dirty_rules;
            SubLObject rule2 = NIL;
            rule2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                clear_transformation_rule_statistics(rule2);
                count = Numbers.add(count, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                rule2 = cdolist_list_var.first();
            }
        } finally {
            if (NIL != release) {
                Locks.release_lock($transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 17400L)
    public static SubLObject rule_utility_p(SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && v_object.numGE($int$_100) && v_object.numLE($int$100));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 17500L)
    public static SubLObject transformation_rule_has_insufficient_historical_utilityP(SubLObject rule, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject min_rule_utility = inference_datastructures_inference.inference_min_rule_utility(inference);
        if (ZERO_INTEGER.numE($transformation_rule_historical_success_pruning_threshold$.getDynamicValue(thread)) && $int$_100.numE(min_rule_utility)) {
            return NIL;
        }
        return makeBoolean(transformation_rule_success_count(rule).numL($transformation_rule_historical_success_pruning_threshold$.getDynamicValue(thread)) || transformation_rule_historical_utility(rule).numL(min_rule_utility));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 18000L)
    public static SubLObject rule_historical_utility_success_threshold(SubLObject success_fraction) {
        if (success_fraction == UNPROVIDED) {
            success_fraction = ONE_INTEGER;
        }
        SubLObject rules = transformation_rules_with_statistics($HISTORICAL_UTILITY, UNPROVIDED, UNPROVIDED);
        SubLObject total_successes = total_transformation_rule_success_count();
        SubLObject success_threshold = Numbers.ceiling(Numbers.multiply(success_fraction, total_successes), UNPROVIDED);
        SubLObject sofar = ZERO_INTEGER;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject successes = transformation_rule_success_count(rule);
            sofar = Numbers.add(sofar, successes);
            if (sofar.numGE(success_threshold)) {
                return transformation_rule_historical_utility(rule);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return $int$_100;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 18700L)
    public static SubLObject rule_historical_utility_saved_considerations(SubLObject utility_threshold) {
        if (utility_threshold == UNPROVIDED) {
            utility_threshold = ZERO_INTEGER;
        }
        SubLObject rules = transformation_rules_with_statistics($HISTORICAL_UTILITY, UNPROVIDED, UNPROVIDED);
        SubLObject saved_considerations = ZERO_INTEGER;
        SubLObject lost_successes = ZERO_INTEGER;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!transformation_rule_historical_utility(rule).numGE(utility_threshold)) {
                SubLObject considered_count = transformation_rule_considered_count(rule);
                SubLObject success_count = transformation_rule_success_count(rule);
                saved_considerations = Numbers.add(saved_considerations, considered_count);
                lost_successes = Numbers.add(lost_successes, success_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Values.values(saved_considerations, lost_successes);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 19700L)
    public static SubLObject transformation_rules_considered_with_success(SubLObject recentP, SubLObject receivedP) {
        if (recentP == UNPROVIDED) {
            recentP = NIL;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        SubLObject rules = NIL;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, recentP, receivedP) && transformation_rule_success_count(rule).isPositive()) {
                    rules = cons(rule, rules);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(rules, Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym28$TRANSFORMATION_RULE_SUCCESS_COUNT));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 20100L)
    public static SubLObject transformation_rules_considered_with_no_success() {
        SubLObject rules = NIL;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL) && !transformation_rule_success_count(rule).isPositive()) {
                    rules = cons(rule, rules);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(rules, Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 20500L)
    public static SubLObject transformation_rules_considered_with_success_from_mt(SubLObject mt) {
        SubLObject rules = transformation_rules_considered_with_success(UNPROVIDED, UNPROVIDED);
        SubLObject filtered_rules = NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != hlmt.hlmt_equal(mt, assertions_high.assertion_mt(rule))) {
                filtered_rules = cons(rule, filtered_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_rules);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 20900L)
    public static SubLObject transformation_rules_considered_with_no_success_from_mt(SubLObject mt) {
        SubLObject rules = transformation_rules_considered_with_no_success();
        SubLObject filtered_rules = NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != hlmt.hlmt_equal(mt, assertions_high.assertion_mt(rule))) {
                filtered_rules = cons(rule, filtered_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_rules);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 21300L)
    public static SubLObject transformation_rules_considered_with_no_success_not_in_mts(SubLObject mts) {
        SubLObject rules = transformation_rules_considered_with_no_success();
        SubLObject filtered_rules = NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(assertions_high.assertion_mt(rule), mts, Symbols.symbol_function($sym41$HLMT_EQUAL), UNPROVIDED)) {
                filtered_rules = cons(rule, filtered_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_rules);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 21800L)
    public static SubLObject transformation_rule_mts_considered_with_success() {
        SubLObject success_mts = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL) && transformation_rule_success_count(rule).isPositive()) {
                    SubLObject mt = assertions_high.assertion_mt(rule);
                    set.set_add(mt, success_mts);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return set.set_element_list(success_mts);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 22300L)
    public static SubLObject transformation_rule_mts_considered_with_no_success() {
        SubLObject success_mts = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject considered_mts = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    SubLObject mt = assertions_high.assertion_mt(rule);
                    set.set_add(mt, considered_mts);
                    if (!transformation_rule_success_count(rule).isPositive()) {
                        continue;
                    }
                    set.set_add(mt, success_mts);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        SubLObject useless_mts = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject set_contents_var = set.do_set_internal(considered_mts);
        SubLObject basis_object;
        SubLObject state;
        SubLObject mt2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            mt2 = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, mt2) && NIL == set.set_memberP(mt2, success_mts)) {
                set.set_add(mt2, useless_mts);
            }
        }
        return set.set_element_list(useless_mts);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 23000L)
    public static SubLObject transformation_rules_considered_with_success_proving_predicate(SubLObject predicate) {
        SubLObject success_rules = NIL;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL) && transformation_rule_success_count(rule).isPositive()) {
                    SubLObject successP;
                    SubLObject rest;
                    SubLObject asent;
                    for (successP = NIL, rest = NIL, rest = clauses.neg_lits(assertions_high.assertion_cnf(rule)); NIL == successP && NIL != rest; rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = T;
                        }
                    }
                    for (rest = NIL, rest = clauses.pos_lits(assertions_high.assertion_cnf(rule)); NIL == successP && NIL != rest; rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = T;
                        }
                    }
                    if (NIL == successP) {
                        continue;
                    }
                    success_rules = cons(rule, success_rules);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(success_rules, Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym28$TRANSFORMATION_RULE_SUCCESS_COUNT));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 23800L)
    public static SubLObject transformation_rules_considered_with_no_success_proving_predicate(SubLObject predicate) {
        SubLObject failure_rules = NIL;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL) && !transformation_rule_success_count(rule).isPositive()) {
                    SubLObject successP;
                    SubLObject rest;
                    SubLObject asent;
                    for (successP = NIL, rest = NIL, rest = clauses.neg_lits(assertions_high.assertion_cnf(rule)); NIL == successP && NIL != rest; rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = T;
                        }
                    }
                    for (rest = NIL, rest = clauses.pos_lits(assertions_high.assertion_cnf(rule)); NIL == successP && NIL != rest; rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = T;
                        }
                    }
                    if (NIL == successP) {
                        continue;
                    }
                    failure_rules = cons(rule, failure_rules);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(failure_rules, Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 24500L)
    public static SubLObject transformation_rule_predicates_considered_with_success() {
        SubLObject success_predicates = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    SubLObject successP = Numbers.plusp(transformation_rule_success_count(rule));
                    SubLObject cdolist_list_var = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                    SubLObject asent = NIL;
                    asent = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if (NIL != forts.fort_p(predicate) && NIL != successP) {
                            set.set_add(predicate, success_predicates);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    }
                    cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(rule));
                    asent = NIL;
                    asent = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if (NIL != forts.fort_p(predicate) && NIL != successP) {
                            set.set_add(predicate, success_predicates);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    }
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return set.set_element_list(success_predicates);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 25200L)
    public static SubLObject transformation_rule_predicates_considered_with_no_success() {
        SubLObject success_predicates = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject considered_predicates = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    SubLObject successP = Numbers.plusp(transformation_rule_success_count(rule));
                    SubLObject cdolist_list_var = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                    SubLObject asent = NIL;
                    asent = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if (NIL != forts.fort_p(predicate)) {
                            set.set_add(predicate, considered_predicates);
                            if (NIL != successP) {
                                set.set_add(predicate, success_predicates);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    }
                    cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(rule));
                    asent = NIL;
                    asent = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if (NIL != forts.fort_p(predicate)) {
                            set.set_add(predicate, considered_predicates);
                            if (NIL != successP) {
                                set.set_add(predicate, success_predicates);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    }
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        SubLObject useless_predicates = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject set_contents_var = set.do_set_internal(considered_predicates);
        SubLObject basis_object;
        SubLObject state;
        SubLObject predicate2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            predicate2 = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, predicate2) && NIL == set.set_memberP(predicate2, success_predicates)) {
                set.set_add(predicate2, useless_predicates);
            }
        }
        return set.set_element_list(useless_predicates);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 26300L)
    public static SubLObject reinforce_transformation_rule(SubLObject rule, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        assert NIL != assertions_high.rule_assertionP(rule) : rule;
        increment_transformation_rule_considered_count(rule, T, n, UNPROVIDED);
        increment_transformation_rule_success_count(rule, T, n, UNPROVIDED);
        return rule;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 26500L)
    public static SubLObject reinforce_inference_transformation_rules_in_answers(SubLObject inference, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        SubLObject cdolist_list_var;
        SubLObject rules = cdolist_list_var = inference_datastructures_inference.inference_transformation_rules_in_answers(inference);
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            reinforce_transformation_rule(rule, n);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.length(rules);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 26900L)
    public static SubLObject reinforce_inference_transformation_rules(SubLObject inference, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject considered_rules = inference_datastructures_problem_store.problem_store_transformation_rules(store);
        SubLObject success_rules = inference_datastructures_inference.inference_transformation_rules_in_answers(inference);
        SubLObject cdolist_list_var = considered_rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            increment_transformation_rule_considered_count(rule, T, n, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        cdolist_list_var = success_rules;
        rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            increment_transformation_rule_success_count(rule, T, n, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Values.values(Sequences.length(success_rules), Sequences.length(considered_rules));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 27400L)
    public static SubLObject save_transformation_rule_statistics(SubLObject filename, SubLObject internalP) {
        if (internalP == UNPROVIDED) {
            internalP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        clean_transformation_rule_statistics();
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            SubLObject stream_$2 = stream;
            SubLObject count = transformation_rules_with_statistics_count();
            cfasl.cfasl_output(count, stream_$2);
            SubLObject cdolist_list_var = transformation_rules_with_statistics_helper();
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    save_transformation_rule_statistics_for_rule(stream_$2, rule, NIL, NIL, internalP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 27900L)
    public static SubLObject load_transformation_rule_statistics(SubLObject filename, SubLObject mergeP, SubLObject receivedP) {
        if (mergeP == UNPROVIDED) {
            mergeP = T;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        return load_transformation_rule_statistics_int(filename, mergeP, NIL, receivedP);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 28100L)
    public static SubLObject load_transformation_rule_statistics_except_for_rules(SubLObject filename, SubLObject rules, SubLObject mergeP, SubLObject receivedP) {
        if (mergeP == UNPROVIDED) {
            mergeP = T;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        return load_transformation_rule_statistics_int(filename, mergeP, rules, receivedP);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 28500L)
    public static SubLObject load_transformation_rule_statistics_int(SubLObject filename, SubLObject mergeP, SubLObject exclude_rules, SubLObject receivedP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject exclude_rule_set = (NIL != exclude_rules) ? set_utilities.construct_set_from_list(exclude_rules, UNPROVIDED, UNPROVIDED) : NIL;
        load_transformation_rule_statistics_bookkeeping(filename, mergeP, receivedP);
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            SubLObject stream_$3 = stream;
            SubLObject count;
            SubLObject i;
            for (count = cfasl.cfasl_input(stream_$3, UNPROVIDED, UNPROVIDED), i = NIL, i = ZERO_INTEGER; i.numL(count); i = Numbers.add(i, ONE_INTEGER)) {
                load_transformation_rule_statistics_for_rule(stream_$3, exclude_rule_set, receivedP);
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 28900L)
    public static SubLObject load_transformation_rule_statistics_bookkeeping(SubLObject filename, SubLObject mergeP, SubLObject receivedP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread)) {
            Errors.error($str46$Transformation_rule_statistics_up);
        }
        if (NIL == mergeP) {
            clear_all_transformation_rule_statistics();
        }
        add_to_transformation_rule_statistics_filename_load_history(filename, receivedP);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 29300L)
    public static SubLObject save_recent_transformation_rule_statistics(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            SubLObject stream_$4 = stream;
            SubLObject count = transformation_rules_with_recent_statistics_count();
            cfasl.cfasl_output(count, stream_$4);
            SubLObject cdolist_list_var = transformation_rules_with_statistics_helper();
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    SubLObject internalP = NIL;
                    save_transformation_rule_statistics_for_rule(stream_$4, rule, T, NIL, internalP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 29800L)
    public static SubLObject save_received_experience(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            SubLObject stream_$5 = stream;
            SubLObject count = transformation_rules_with_received_statistics_count();
            cfasl.cfasl_output(count, stream_$5);
            SubLObject cdolist_list_var = transformation_rules_with_statistics_helper();
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    SubLObject internalP = NIL;
                    save_transformation_rule_statistics_for_rule(stream_$5, rule, NIL, T, internalP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 30300L)
    public static SubLObject save_transformation_rule_statistics_for_rule(SubLObject stream, SubLObject rule, SubLObject recentP, SubLObject receivedP, SubLObject internalP) {
        if (NIL != internalP) {
            cfasl.cfasl_output(rule, stream);
        } else {
            cfasl.cfasl_output_externalized(rule, stream);
        }
        SubLObject considered = transformation_rule_something_considered_count(rule, recentP, receivedP);
        SubLObject success = transformation_rule_something_success_count(rule, recentP, receivedP);
        cfasl.cfasl_output(considered, stream);
        cfasl.cfasl_output(success, stream);
        return rule;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 31000L)
    public static SubLObject transformation_rule_something_considered_count(SubLObject rule, SubLObject recentP, SubLObject receivedP) {
        if (NIL != recentP) {
            return transformation_rule_recent_considered_count(rule);
        }
        if (NIL != receivedP) {
            return transformation_rule_received_considered_count(rule);
        }
        return transformation_rule_considered_count(rule);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 31400L)
    public static SubLObject transformation_rule_something_success_count(SubLObject rule, SubLObject recentP, SubLObject receivedP) {
        if (NIL != recentP) {
            return transformation_rule_recent_success_count(rule);
        }
        if (NIL != receivedP) {
            return transformation_rule_received_success_count(rule);
        }
        return transformation_rule_success_count(rule);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 31800L)
    public static SubLObject load_transformation_rule_statistics_for_rule(SubLObject stream, SubLObject exclude_rule_set, SubLObject receivedP) {
        SubLObject rule = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject considered = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject success = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL != subl_promotions.non_negative_integer_p(considered) && NIL != subl_promotions.non_negative_integer_p(success) && NIL != assertion_handles.valid_assertionP(rule, UNPROVIDED) && (NIL == exclude_rule_set || NIL == set.set_memberP(rule, exclude_rule_set))) {
            increment_transformation_rule_considered_count(rule, NIL, considered, receivedP);
            increment_transformation_rule_success_count(rule, NIL, success, receivedP);
        }
        return rule;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 32600L)
    public static SubLObject show_transformation_rule_statistics(SubLObject stream, SubLObject order) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (order == UNPROVIDED) {
            order = $HISTORICAL_UTILITY;
        }
        SubLObject rules = transformation_rules_with_statistics(order, UNPROVIDED, UNPROVIDED);
        PrintLow.format(stream, $str47$_________________________________);
        PrintLow.format(stream, $str48$______S_rules__sorted_by__A, Sequences.length(rules), order);
        PrintLow.format(stream, $str47$_________________________________);
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject considered = transformation_rule_considered_count(rule);
            SubLObject success = transformation_rule_success_count(rule);
            SubLObject probability = transformation_rule_success_probability(rule, UNPROVIDED);
            SubLObject utility = transformation_rule_historical_utility(rule);
            PrintLow.format(stream, $str49$________S__S___S_____utility____S, new SubLObject[] { success, considered, number_utilities.significant_digits(Numbers.multiply($int$100, probability), FOUR_INTEGER), utility, rule });
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.length(rules);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 33800L)
    public static SubLObject possibly_save_recent_experience() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != Locks.lock_idle_p($save_recent_experience_lock$.getDynamicValue(thread))) {
            return save_recent_experience();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 34000L)
    public static SubLObject save_recent_experience() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != any_recent_experienceP()) {
            SubLObject release = NIL;
            try {
                release = Locks.seize_lock($save_recent_experience_lock$.getDynamicValue(thread));
                save_recent_experience_internal();
            } finally {
                if (NIL != release) {
                    Locks.release_lock($save_recent_experience_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 34200L)
    public static SubLObject local_experience_transcript() {
        return string_utilities.replace_substring(string_utilities.replace_substring(transcript_utilities.construct_transcript_filename(transcript_utilities.make_local_transcript_filename($str51$experience)), $str52$_TS, $str53$_CFASL), $str54$_ts, $str55$_cfasl);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 34400L)
    public static SubLObject save_recent_experience_internal() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject local_experience_transcript = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind($sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    local_experience_transcript = local_experience_transcript();
                    if (NIL != local_experience_transcript && NIL != save_recent_transformation_rule_statistics(local_experience_transcript) && NIL == error) {
                        successP = T;
                    }
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return successP;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 34800L)
    public static SubLObject replace_and_collate_experience(SubLObject old_experience_file, SubLObject new_experience_directory) {
        load_transformation_rule_statistics(old_experience_file, NIL, UNPROVIDED);
        return collate_experience(new_experience_directory);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 35200L)
    public static SubLObject collate_experience(SubLObject new_experience_directory) {
        return load_all_experience_transcripts_from_directory(new_experience_directory, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 35500L)
    public static SubLObject receive_experience() {
        clear_all_received_transformation_rule_statistics();
        return load_all_experience_transcripts_from_directory(transcript_utilities.transcript_directory(), T);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 35900L)
    public static SubLObject load_received_experience(SubLObject filename) {
        clear_all_received_transformation_rule_statistics();
        return load_experience_transcript(filename, T);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 36100L)
    public static SubLObject load_all_experience_transcripts_from_directory(SubLObject directory, SubLObject receivedP) {
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        assert NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        SubLObject progress_message_var = $str58$Loading_transformation_rule_stati;
        SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            SubLObject list_var = directory_contents_var;
            SubLObject _prev_bind_0_$6 = utilities_macros.$progress_note$.currentBinding(thread);
            SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((NIL != progress_message_var) ? progress_message_var : $str59$cdolist, thread);
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
                    SubLObject filename = NIL;
                    filename = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != transformation_rule_utility_experience_filenameP(filename)) {
                            load_experience_transcript(filename, receivedP);
                            count = Numbers.add(count, ONE_INTEGER);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        filename = csome_list_var.first();
                    }
                } finally {
                    SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 36600L)
    public static SubLObject transformation_rule_utility_experience_filenameP(SubLObject v_object) {
        return makeBoolean(v_object.isString() && NIL != string_utilities.ends_with(v_object, $str60$_experience_cfasl, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 36700L)
    public static SubLObject load_experience_transcript(SubLObject filename, SubLObject receivedP) {
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject message_var = NIL;
        SubLObject was_appendingP = Eval.eval($sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        Eval.eval($list62);
        try {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind($sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        result = load_transformation_rule_statistics(filename, T, receivedP);
                    } catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                Eval.eval(list($sym63$CSETQ, $sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str64$_A, message_var);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 37100L)
    public static SubLObject transformation_rule_historical_utility(SubLObject rule) {
        assert NIL != assertions_high.rule_assertionP(rule) : rule;
        return rule_historical_utility_from_observations(transformation_rule_success_count(rule), transformation_rule_considered_count(rule));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 37600L)
    public static SubLObject transformation_rule_historical_utility_G(SubLObject rule1, SubLObject rule2) {
        return Numbers.numG(transformation_rule_historical_utility(rule1), transformation_rule_historical_utility(rule2));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 37800L)
    public static SubLObject current_average_rule_historical_success_probability(SubLObject unused_probability) {
        if (unused_probability == UNPROVIDED) {
            unused_probability = ZERO_INTEGER;
        }
        SubLObject success = ZERO_INTEGER;
        SubLObject considered = ZERO_INTEGER;
        SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    success = Numbers.add(success, transformation_rule_success_count(rule));
                    considered = Numbers.add(considered, transformation_rule_considered_count(rule));
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        if (!considered.isPositive()) {
            return unused_probability;
        }
        return Numbers.divide(success, considered);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 38700L)
    public static SubLObject rule_historical_utility_from_observations(SubLObject success, SubLObject considered) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return historical_utility_from_observations(success, considered, $average_rule_historical_success_probability$.getDynamicValue(thread), $rule_historical_success_happiness_scaling_factor$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 39000L)
    public static SubLObject historical_utility_from_observations(SubLObject success, SubLObject considered, SubLObject average_historical_probability, SubLObject utility_scaling_factor) {
        if (!considered.isPositive()) {
            return ZERO_INTEGER;
        }
        SubLObject probability = Numbers.divide(success, considered);
        if (probability.numG(average_historical_probability)) {
            SubLObject raw_utility = Numbers.multiply(utility_scaling_factor, Numbers.divide(Numbers.subtract(probability, average_historical_probability), Numbers.subtract(ONE_INTEGER, average_historical_probability)), Numbers.integer_length(considered));
            SubLObject utility = Numbers.truncate(Numbers.min($int$100, raw_utility), UNPROVIDED);
            return utility;
        }
        if (probability.numL(average_historical_probability)) {
            SubLObject raw_utility = Numbers.multiply(utility_scaling_factor, Numbers.divide(Numbers.subtract(probability, average_historical_probability), average_historical_probability), Numbers.integer_length(considered));
            SubLObject utility = Numbers.truncate(Numbers.max($int$_100, raw_utility), UNPROVIDED);
            return utility;
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 40000L)
    public static SubLObject repair_all_experience_files_in_directory(SubLObject directory) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        assert NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        SubLObject progress_message_var = $str66$Repairing_transformation_rule_sta;
        SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            SubLObject list_var = directory_contents_var;
            SubLObject _prev_bind_0_$8 = utilities_macros.$progress_note$.currentBinding(thread);
            SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((NIL != progress_message_var) ? progress_message_var : $str59$cdolist, thread);
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
                    SubLObject filename = NIL;
                    filename = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != transformation_rule_utility_experience_filenameP(filename)) {
                            count = Numbers.add(count, repair_experience_file(filename));
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        filename = csome_list_var.first();
                    }
                } finally {
                    SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$8, thread);
            }
        } finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 40300L)
    public static SubLObject repair_experience_file(SubLObject filename) {
        SubLObject repaired_rule_count = ZERO_INTEGER;
        SubLObject load_successP = load_transformation_rule_statistics_ignoring_header(filename, NIL);
        if (NIL != load_successP) {
            repaired_rule_count = clean_transformation_rule_statistics();
            if (NIL != subl_promotions.positive_integer_p(repaired_rule_count)) {
                format_nil.force_format(T, $str67$Repairing__a_spurious_zeroes_in__, repaired_rule_count, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject new_filename = string_utilities.string_subst($str68$_bloated_cfasl, $str55$_cfasl, filename, UNPROVIDED);
                Filesys.rename_file(filename, new_filename);
                save_transformation_rule_statistics(filename, NIL);
            }
        } else {
            Errors.warn($str69$Could_not_load__a, filename);
        }
        return repaired_rule_count;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 41300L)
    public static SubLObject load_transformation_rule_statistics_ignoring_header(SubLObject filename, SubLObject mergeP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject message_var = NIL;
        SubLObject was_appendingP = Eval.eval($sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        Eval.eval($list62);
        try {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind($sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        load_transformation_rule_statistics_bookkeeping(filename, mergeP, NIL);
                        SubLObject _prev_bind_0_$10 = cfasl.$cfasl_stream_extensions_enabled$.currentBinding(thread);
                        SubLObject _prev_bind_2 = cfasl.$cfasl_unread_byte$.currentBinding(thread);
                        try {
                            cfasl.$cfasl_stream_extensions_enabled$.bind(T, thread);
                            cfasl.$cfasl_unread_byte$.bind(NIL, thread);
                            SubLObject stream = NIL;
                            try {
                                SubLObject _prev_bind_0_$11 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_binary(filename, $INPUT);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$11, thread);
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str44$Unable_to_open__S, filename);
                                }
                                SubLObject stream_$12 = stream;
                                SubLObject count = cfasl.cfasl_input(stream_$12, UNPROVIDED, UNPROVIDED);
                                for (SubLObject eofP = Equality.eq($EOF, cfasl.cfasl_opcode_peek(stream_$12, NIL, $EOF)); NIL == eofP; eofP = Equality.eq($EOF, cfasl.cfasl_opcode_peek(stream_$12, NIL, $EOF))) {
                                    load_transformation_rule_statistics_for_rule(stream_$12, NIL, NIL);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (stream.isStream()) {
                                        streams_high.close(stream, UNPROVIDED);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        } finally {
                            cfasl.$cfasl_unread_byte$.rebind(_prev_bind_2, thread);
                            cfasl.$cfasl_stream_extensions_enabled$.rebind(_prev_bind_0_$10, thread);
                        }
                        successP = T;
                    } catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values2 = Values.getValuesAsVector();
                Eval.eval(list($sym63$CSETQ, $sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                Values.restoreValuesFromVector(_values2);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str64$_A, message_var);
        }
        return successP;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 42000L)
    public static SubLObject possibly_extend_transformation_rule_utility_table() {
        if (NIL != rule_utility_table_uses_new_formatP()) {
            return NIL;
        }
        SubLObject cdolist_list_var = hash_table_utilities.hash_table_to_alist($transformation_rule_statistics_table$.getGlobalValue());
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = cons;
            SubLObject rule = NIL;
            SubLObject vector = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list71);
            rule = current.first();
            current = (vector = current.rest());
            SubLObject new_vector = vector_utilities.extend_vector(vector, TWO_INTEGER, ZERO_INTEGER);
            Hashtables.sethash(rule, $transformation_rule_statistics_table$.getGlobalValue(), new_vector);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 42300L)
    public static SubLObject rule_utility_table_uses_new_formatP() {
        SubLObject vector = hash_table_utilities.hash_table_arbitrary_value($transformation_rule_statistics_table$.getGlobalValue());
        return Numbers.numE(SIX_INTEGER, Sequences.length(vector));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 43100L)
    public static SubLObject historically_connected_rules_set_contents(SubLObject rule) {
        assert NIL != assertion_handles.assertion_p(rule) : rule;
        return Hashtables.gethash_without_values(rule, $transformation_rule_historical_connectivity_graph$.getGlobalValue(), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 43400L)
    public static SubLObject set_historically_connected_rules_set_contents(SubLObject rule, SubLObject rule_set_contents) {
        assert NIL != assertion_handles.assertion_p(rule) : rule;
        assert NIL != set_contents.set_contents_p(rule_set_contents) : rule_set_contents;
        return Hashtables.sethash(rule, $transformation_rule_historical_connectivity_graph$.getGlobalValue(), rule_set_contents);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 43700L)
    public static SubLObject rules_historically_connectedP(SubLObject rule1, SubLObject rule2) {
        return set_contents.set_contents_memberP(rule2, historically_connected_rules_set_contents(rule1), Symbols.symbol_function(EQL));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 43800L)
    public static SubLObject historically_connected_rules(SubLObject rule) {
        return set_contents.set_contents_element_list(historically_connected_rules_set_contents(rule));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 44000L)
    public static SubLObject rule_historical_connectedness_ratio(SubLObject rules) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject n = Sequences.length(rules);
        if (n.numL(TWO_INTEGER)) {
            return ZERO_INTEGER;
        }
        SubLObject max = number_utilities.choose(n, TWO_INTEGER);
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = rules;
            SubLObject other_rule = NIL;
            other_rule = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                if (!rule.eql(other_rule) && NIL != rules_historically_connectedP(rule, other_rule)) {
                    count = Numbers.add(count, ONE_INTEGER);
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                other_rule = cdolist_list_var_$14.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == Numbers.evenp(count)) {
            Errors.error($str77$Got_a_directed_instead_of_undirec, rules);
        }
        count = Numbers.integerDivide(count, TWO_INTEGER);
        return Numbers.divide(count, max);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 44900L)
    public static SubLObject rule_historical_connectedness_percentage(SubLObject rules) {
        return Numbers.round(Numbers.multiply($int$100, rule_historical_connectedness_ratio(rules)), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 45000L)
    public static SubLObject note_rules_historically_connected(SubLObject from_rule, SubLObject to_rule) {
        if (!from_rule.eql(to_rule)) {
            SubLObject release = NIL;
            try {
                release = Locks.seize_lock($transformation_rule_historical_connectivity_graph_lock$.getGlobalValue());
                SubLObject v_set_contents = historically_connected_rules_set_contents(from_rule);
                v_set_contents = set_contents.set_contents_add(to_rule, v_set_contents, Symbols.symbol_function(EQL));
                set_historically_connected_rules_set_contents(from_rule, v_set_contents);
            } finally {
                if (NIL != release) {
                    Locks.release_lock($transformation_rule_historical_connectivity_graph_lock$.getGlobalValue());
                }
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 45500L)
    public static SubLObject note_inference_answer_proof_rules(SubLObject rules) {
        if (NIL != list_utilities.lengthGE(rules, TWO_INTEGER, UNPROVIDED)) {
            SubLObject cdolist_list_var = rules;
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$15 = rules;
                SubLObject connected_rule = NIL;
                connected_rule = cdolist_list_var_$15.first();
                while (NIL != cdolist_list_var_$15) {
                    if (!rule.eql(connected_rule)) {
                        note_rules_historically_connected(rule, connected_rule);
                    }
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    connected_rule = cdolist_list_var_$15.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 45900L)
    public static SubLObject show_transformation_rule_historical_connectivity_graph(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject rules = hash_table_utilities.hash_table_keys($transformation_rule_historical_connectivity_graph$.getGlobalValue());
        SubLObject cdolist_list_var;
        rules = (cdolist_list_var = Sort.sort(rules, Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY)));
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject connected_rules = historically_connected_rules(rule);
            if (NIL != connected_rules) {
                connected_rules = Sort.sort(connected_rules, Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY));
                PrintLow.format(stream, $str78$____Rule_____S__Connected_Rules__, rule);
                SubLObject cdolist_list_var_$16 = connected_rules;
                SubLObject connected_rule = NIL;
                connected_rule = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    PrintLow.format(stream, $str79$___S, connected_rule);
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    connected_rule = cdolist_list_var_$16.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 46500L)
    public static SubLObject cb_show_transformation_rule_historical_connectivity_graph() {
        SubLObject rules = hash_table_utilities.hash_table_keys($transformation_rule_historical_connectivity_graph$.getGlobalValue());
        SubLObject cdolist_list_var;
        rules = (cdolist_list_var = Sort.sort(rules, Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY)));
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject connected_rules = historically_connected_rules(rule);
            if (NIL != connected_rules) {
                connected_rules = Sort.sort(connected_rules, Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY));
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ($str80$Rule__);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                cb_utilities.cb_form(rule, UNPROVIDED, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ($str81$Connected_Rules__);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_newline(UNPROVIDED);
                SubLObject cdolist_list_var_$17 = connected_rules;
                SubLObject connected_rule = NIL;
                connected_rule = cdolist_list_var_$17.first();
                while (NIL != cdolist_list_var_$17) {
                    cb_utilities.cb_form(connected_rule, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_newline(UNPROVIDED);
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    connected_rule = cdolist_list_var_$17.first();
                }
                html_utilities.html_newline(UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 47300L)
    public static SubLObject save_transformation_rule_historical_connectivity_graph(SubLObject filename, SubLObject externalizedP) {
        if (externalizedP == UNPROVIDED) {
            externalizedP = NIL;
        }
        if (NIL != externalizedP) {
            return cfasl_utilities.cfasl_save_externalized($transformation_rule_historical_connectivity_graph$.getGlobalValue(), filename);
        }
        return cfasl_utilities.cfasl_save($transformation_rule_historical_connectivity_graph$.getGlobalValue(), filename);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 47700L)
    public static SubLObject load_transformation_rule_historical_connectivity_graph(SubLObject filename) {
        $transformation_rule_historical_connectivity_graph$.setGlobalValue(cfasl_utilities.cfasl_load(filename));
        return Hashtables.hash_table_size($transformation_rule_historical_connectivity_graph$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48200L)
    public static SubLObject clear_hl_module_expand_counts() {
        SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary($hl_module_expand_counts$.getDynamicValue(thread));
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48300L)
    public static SubLObject noting_hl_module_expand_counts(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym82$CLET, $list83, append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48500L)
    public static SubLObject hl_module_expand_count(SubLObject hl_module) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($hl_module_expand_counts$.getDynamicValue(thread), hl_module, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48600L)
    public static SubLObject all_hl_module_expand_counts() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module_expand_counts = dictionary_utilities.dictionary_to_alist($hl_module_expand_counts$.getDynamicValue(thread));
        return Sort.sort(hl_module_expand_counts, Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym84$CDR));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48800L)
    public static SubLObject cinc_hl_module_expand_count(SubLObject hl_module) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $hl_module_expand_counts_enabledP$.getDynamicValue(thread)) {
            SubLObject count = dictionary.dictionary_lookup($hl_module_expand_counts$.getDynamicValue(thread), hl_module, ZERO_INTEGER);
            count = Numbers.add(count, ONE_INTEGER);
            dictionary.dictionary_enter($hl_module_expand_counts$.getDynamicValue(thread), hl_module, count);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 49100L)
    public static SubLObject show_hl_module_expand_counts(SubLObject counts, SubLObject stream) {
        if (counts == UNPROVIDED) {
            counts = all_hl_module_expand_counts();
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = counts;
        SubLObject hl_module_expand_count_info = NIL;
        hl_module_expand_count_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = hl_module_expand_count_info;
            SubLObject hl_module = NIL;
            SubLObject count = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list85);
            hl_module = current.first();
            current = (count = current.rest());
            PrintLow.format(stream, $str86$___4_D__S__, count, hl_module);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module_expand_count_info = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 49400L)
    public static SubLObject cinc_module_expand_count(SubLObject name) {
        SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        return cinc_hl_module_expand_count(hl_module);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 50000L)
    public static SubLObject clear_asked_query_queue() {
        queues.clear_queue($asked_queries_queue$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 50100L)
    public static SubLObject possibly_enqueue_asked_query(SubLObject query_sentence, SubLObject query_mt, SubLObject query_properties) {
        SubLObject result = NIL;
        if (NIL != control_vars.save_asked_queriesP() && NIL == operation_queues.within_a_remote_opP()) {
            result = enqueue_asked_query(query_sentence, query_mt, query_properties);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 50400L)
    public static SubLObject enqueue_asked_query(SubLObject query_sentence, SubLObject query_mt, SubLObject query_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_info = list(query_sentence, query_mt, list_utilities.plist_except(query_properties, $list90));
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock($save_recent_asked_queries_lock$.getDynamicValue(thread));
            queues.enqueue(query_info, $asked_queries_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                Locks.release_lock($save_recent_asked_queries_lock$.getDynamicValue(thread));
            }
        }
        if (queues.queue_size($asked_queries_queue$.getGlobalValue()).numGE($asked_queries_queue_limit$.getGlobalValue())) {
            save_recent_asked_queries();
        }
        return query_info;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 50800L)
    public static SubLObject possibly_enqueue_asked_query_from_inference(SubLObject inference) {
        SubLObject result = NIL;
        if (NIL != control_vars.save_asked_queriesP() && NIL == operation_queues.within_a_remote_opP()) {
            result = enqueue_asked_query_from_inference(inference);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 51100L)
    public static SubLObject enqueue_asked_query_from_inference(SubLObject inference) {
        SubLObject el_query_sentence = inference_datastructures_inference.inference_el_query(inference);
        SubLObject query_sentence = (NIL != el_query_sentence) ? el_query_sentence : inference_datastructures_inference.inference_hl_query(inference);
        SubLObject query_mt = inference_datastructures_inference.inference_mt(inference);
        SubLObject query_properties = inference_datastructures_inference.inference_input_query_properties(inference);
        return enqueue_asked_query(query_sentence, query_mt, query_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 51500L)
    public static SubLObject possibly_save_recent_asked_queries() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return (NIL != Locks.lock_idle_p($save_recent_asked_queries_lock$.getDynamicValue(thread))) ? save_recent_asked_queries() : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 51700L)
    public static SubLObject load_asked_queries(SubLObject filename, SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == subl_promotions.positive_integer_p(n)) {
            n = number_utilities.positive_infinity();
        }
        SubLObject query_infos = NIL;
        SubLObject doneP = NIL;
        SubLObject done_varP = NIL;
        SubLObject i = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            SubLObject input_stream = stream;
            SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind(NIL, thread);
                cfasl.cfasl_set_common_symbols(asked_query_common_symbols());
                while (NIL == done_varP) {
                    SubLObject query_info = load_asked_query_from_stream(input_stream);
                    if ($EOF == query_info) {
                        done_varP = T;
                    } else if (query_info.isString()) {
                        Errors.warn($str91$Read_invalid_query_info__s, query_info);
                    } else {
                        SubLObject i_$18 = i;
                        if (NIL != number_utilities.potentially_infinite_integer_GE(i_$18, n)) {
                            doneP = T;
                        }
                        if (NIL == doneP) {
                            query_infos = cons(query_info, query_infos);
                        }
                        i = Numbers.add(i, ONE_INTEGER);
                    }
                    if (NIL != doneP) {
                        done_varP = doneP;
                    }
                }
            } finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        } finally {
            SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return Sequences.nreverse(query_infos);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 52400L)
    public static SubLObject query_info_p(SubLObject v_object) {
        if (NIL != list_utilities.tripleP(v_object)) {
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            SubLObject query_properties = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, $list92);
            sentence = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, $list92);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, $list92);
            query_properties = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(NIL != el_utilities.possibly_cycl_sentence_p(sentence) && (NIL == mt || NIL != hlmt.possibly_mt_p(mt)) && NIL != list_utilities.property_list_p(query_properties));
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, $list92);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 52700L)
    public static SubLObject valid_query_infoP(SubLObject v_object) {
        if (NIL != query_info_p(v_object) && NIL == list_utilities.tree_find(cfasl_kb_methods.cfasl_invalid_constant(), v_object, UNPROVIDED, UNPROVIDED) && NIL == list_utilities.tree_find(cfasl_kb_methods.cfasl_invalid_nart(), v_object, UNPROVIDED, UNPROVIDED)) {
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            SubLObject query_properties = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, $list92);
            sentence = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, $list92);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, $list92);
            query_properties = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != clauses.dnf_clauses_p(sentence) || NIL != cycl_grammar.cycl_sentence_p(sentence)) && (NIL == mt || NIL != hlmt.hlmt_p(mt)) && NIL != inference_datastructures_enumerated_types.query_properties_p(query_properties)) {
                    return T;
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(v_object, $list92);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53100L)
    public static SubLObject load_asked_query(SubLObject filename) {
        return load_asked_queries(filename, ONE_INTEGER).first();
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53200L)
    public static SubLObject save_recent_asked_queries() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject any_savedP = NIL;
        if (NIL != any_recent_asked_queriesP()) {
            SubLObject release = NIL;
            try {
                release = Locks.seize_lock($save_recent_asked_queries_lock$.getDynamicValue(thread));
                any_savedP = save_recent_asked_queries_int();
            } finally {
                if (NIL != release) {
                    Locks.release_lock($save_recent_asked_queries_lock$.getDynamicValue(thread));
                }
            }
        }
        return any_savedP;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53500L)
    public static SubLObject any_recent_asked_queriesP() {
        return makeBoolean(NIL == queues.queue_empty_p($asked_queries_queue$.getGlobalValue()));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53600L)
    public static SubLObject local_asked_queries_transcript() {
        return string_utilities.replace_substring(string_utilities.replace_substring(transcript_utilities.construct_transcript_filename(transcript_utilities.make_local_transcript_filename($str93$asked_queries)), $str52$_TS, $str53$_CFASL), $str54$_ts, $str55$_cfasl);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53800L)
    public static SubLObject save_recent_asked_queries_int() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject error = NIL;
        SubLObject local_asked_queries_transcript = NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind($sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    local_asked_queries_transcript = local_asked_queries_transcript();
                    if (NIL != local_asked_queries_transcript) {
                        successP = save_recent_asked_queries_to_file(local_asked_queries_transcript);
                    }
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return makeBoolean(NIL != successP && NIL == error);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 54200L)
    public static SubLObject save_recent_asked_queries_to_file(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $APPEND);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            SubLObject stream_$19 = stream;
            for (SubLObject q = $asked_queries_queue$.getGlobalValue(), done_var = queues.queue_empty_p(q); NIL == done_var; done_var = queues.queue_empty_p(q)) {
                SubLObject query = queues.dequeue(q);
                write_asked_query_to_stream(stream_$19, query, T);
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 54400L)
    public static SubLObject write_asked_query_to_stream(SubLObject stream, SubLObject query_info, SubLObject externalizedP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(asked_query_common_symbols_simple());
            cfasl.cfasl_output_maybe_externalized(query_info, stream, externalizedP);
        } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return query_info;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 54700L)
    public static SubLObject load_asked_query_from_stream(SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_info = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind($sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    query_info = cfasl.cfasl_input(stream, NIL, UNPROVIDED);
                    if ($EOF != query_info && !assertionsDisabledInClass && NIL == query_info_p(query_info)) {
                        throw new AssertionError(query_info);
                    }
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            query_info = error;
        }
        return query_info;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 55100L)
    public static SubLObject asked_queries_filenameP(SubLObject v_object) {
        return makeBoolean(v_object.isString() && NIL != string_utilities.ends_with(v_object, $str98$local_asked_queries_cfasl, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 55300L)
    public static SubLObject asked_query_common_symbols() {
        if (NIL == $asked_query_common_symbols$.getGlobalValue()) {
            $asked_query_common_symbols$.setGlobalValue(inference_datastructures_enumerated_types.all_query_properties());
        }
        return $asked_query_common_symbols$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 55700L)
    public static SubLObject asked_query_common_symbols_simple() {
        if (!$asked_query_common_symbols_simple$.getGlobalValue().isVector()) {
            $asked_query_common_symbols_simple$.setGlobalValue(Functions.apply($sym101$VECTOR, asked_query_common_symbols()));
        }
        return $asked_query_common_symbols_simple$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 55900L)
    public static SubLObject show_asked_query_statistics(SubLObject directories) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject directory_stats = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
        SubLObject filename_stats = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
        SubLObject query_info_stats = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
        SubLObject dot_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = directories;
        SubLObject directory = NIL;
        directory = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format_nil.force_format(T, $str102$Entering__s__, directory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            assert NIL != Filesys.directory_p(directory) : directory;
            SubLObject directory_contents_var = Filesys.directory(directory, T);
            SubLObject progress_message_var = NIL;
            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                if (NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
                }
                SubLObject list_var = directory_contents_var;
                SubLObject _prev_bind_0_$20 = utilities_macros.$progress_note$.currentBinding(thread);
                SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((NIL != progress_message_var) ? progress_message_var : $str59$cdolist, thread);
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
                        SubLObject filename = NIL;
                        filename = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL != asked_queries_filenameP(filename)) {
                                SubLObject done_varP = NIL;
                                SubLObject i = ZERO_INTEGER;
                                SubLObject stream = NIL;
                                try {
                                    SubLObject _prev_bind_0_$21 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_binary(filename, $INPUT);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$21, thread);
                                    }
                                    if (!stream.isStream()) {
                                        Errors.error($str44$Unable_to_open__S, filename);
                                    }
                                    SubLObject input_stream = stream;
                                    SubLObject _prev_bind_0_$22 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                                    try {
                                        cfasl.$cfasl_common_symbols$.bind(NIL, thread);
                                        cfasl.cfasl_set_common_symbols(asked_query_common_symbols());
                                        while (NIL == done_varP) {
                                            SubLObject query_info = load_asked_query_from_stream(input_stream);
                                            if ($EOF == query_info) {
                                                done_varP = T;
                                            } else if (query_info.isString()) {
                                                Errors.warn($str91$Read_invalid_query_info__s, query_info);
                                            } else {
                                                dot_count = Numbers.add(dot_count, ONE_INTEGER);
                                                if (dot_count.numE($int$1000)) {
                                                    format_nil.force_format(T, $str104$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    dot_count = ZERO_INTEGER;
                                                }
                                                dictionary_utilities.dictionary_increment(directory_stats, directory, UNPROVIDED);
                                                dictionary_utilities.dictionary_increment(filename_stats, filename, UNPROVIDED);
                                                dictionary_utilities.dictionary_increment(query_info_stats, query_info, UNPROVIDED);
                                                i = Numbers.add(i, ONE_INTEGER);
                                            }
                                        }
                                    } finally {
                                        cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$22, thread);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values = Values.getValuesAsVector();
                                        if (stream.isStream()) {
                                            streams_high.close(stream, UNPROVIDED);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                    }
                                }
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            filename = csome_list_var.first();
                        }
                    } finally {
                        SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
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
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$20, thread);
                }
            } finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
            }
            show_asked_query_statistics_int(directory_stats, filename_stats, query_info_stats);
            cdolist_list_var = cdolist_list_var.rest();
            directory = cdolist_list_var.first();
        }
        return list(directory_stats, filename_stats, query_info_stats);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 56700L)
    public static SubLObject show_asked_query_statistics_int(SubLObject directory_stats, SubLObject filename_stats, SubLObject query_info_stats) {
        format_nil.force_format(T, $str105$__Number_of_saved_queries_per_dir, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        dictionary_utilities.print_dictionary_contents(directory_stats, UNPROVIDED);
        format_nil.force_format(T, $str106$__Histogram_of_saved_queries_per_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        list_utilities.pretty_print_histogram(list_utilities.histogram(dictionary.dictionary_values(filename_stats), Symbols.symbol_function($sym31$_), Symbols.symbol_function(EQL), Symbols.symbol_function($sym31$_)));
        format_nil.force_format(T, $str107$__Total_number_of_saved_queries__, number_utilities.summation(dictionary.dictionary_values(query_info_stats)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(T, $str108$__Total_number_of_unique_saved_qu, dictionary.dictionary_length(query_info_stats), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 60300L)
    public static SubLObject mts_of_inference_answer(SubLObject v_answer) {
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$25 = mts_of_inference_answer_justification(justification);
            SubLObject mt = NIL;
            mt = cdolist_list_var_$25.first();
            while (NIL != cdolist_list_var_$25) {
                SubLObject item_var = mt;
                if (NIL == conses_high.member(item_var, mts, EQUAL, Symbols.symbol_function(IDENTITY))) {
                    mts = cons(item_var, mts);
                }
                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                mt = cdolist_list_var_$25.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return Sort.sort(mts, $sym109$GENERALITY_ESTIMATE_, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 60800L)
    public static SubLObject mts_of_inference_answer_justification(SubLObject justification) {
        SubLObject supports = append(inference_datastructures_inference.inference_answer_justification_supports(justification), inference_datastructures_inference.inference_answer_justification_pragmatic_supports(justification));
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = Mapping.mapcar($sym110$SUPPORT_MT, supports);
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var = mt;
            if (NIL == conses_high.member(item_var, mts, EQUAL, Symbols.symbol_function(IDENTITY))) {
                mts = cons(item_var, mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        mts = Sequences.remove($$InferencePSC, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return mts;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 61300L)
    public static SubLObject max_floor_mts_of_inference(SubLObject inference, SubLObject preserve_multiple_justificationsP) {
        if (preserve_multiple_justificationsP == UNPROVIDED) {
            preserve_multiple_justificationsP = NIL;
        }
        SubLObject mt_tuples = NIL;
        SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$26 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$26);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject item_var;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        item_var = max_floor_mts_of_inference_answer(v_answer, preserve_multiple_justificationsP);
                        if (NIL == conses_high.member(item_var, mt_tuples, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                            mt_tuples = cons(item_var, mt_tuples);
                        }
                    }
                }
            }
            SubLObject idx_$27 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$27)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$27);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject item_var2 = max_floor_mts_of_inference_answer(v_answer2, preserve_multiple_justificationsP);
                        if (NIL == conses_high.member(item_var2, mt_tuples, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                            mt_tuples = cons(item_var2, mt_tuples);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return conjoin_mt_tuples(mt_tuples);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 61700L)
    public static SubLObject max_floor_mts_of_inference_answer(SubLObject v_answer, SubLObject preserve_multiple_justificationsP) {
        if (preserve_multiple_justificationsP == UNPROVIDED) {
            preserve_multiple_justificationsP = NIL;
        }
        SubLObject mt_tuples = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var = max_floor_mts_of_inference_answer_justification(justification);
            if (NIL == conses_high.member(item_var, mt_tuples, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                mt_tuples = cons(item_var, mt_tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        if (NIL != preserve_multiple_justificationsP) {
            return conjoin_mt_tuples(mt_tuples);
        }
        return disjoin_mt_tuples(mt_tuples);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 62100L)
    public static SubLObject conjoin_mt_tuples(SubLObject mt_tuples) {
        SubLObject mts = NIL;
        if (NIL != list_utilities.singletonP(mt_tuples)) {
            mts = mt_tuples.first();
        } else if (NIL != list_utilities.every_in_list($sym113$SINGLETON_, mt_tuples, UNPROVIDED)) {
            SubLObject justification_mts = Mapping.mapcar($sym114$FIRST, mt_tuples);
            mts = genl_mts.max_floor_mts(justification_mts, UNPROVIDED, UNPROVIDED);
        } else {
            SubLObject singletons = list_utilities.flatten(list_utilities.remove_if_not($sym113$SINGLETON_, mt_tuples, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject max_floor_mts_of_singletons = genl_mts.max_floor_mts(singletons, UNPROVIDED, UNPROVIDED);
            SubLObject remaining_tuples = Sequences.remove_if($sym113$SINGLETON_, mt_tuples, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject unsubsumed_tuples = NIL;
            if (NIL == list_utilities.singletonP(max_floor_mts_of_singletons)) {
                Errors.warn($str115$non_singleton_max_floor_mts_of_si, max_floor_mts_of_singletons, singletons);
                return NIL;
            }
            SubLObject max_floor_of_singletons = max_floor_mts_of_singletons.first();
            SubLObject cdolist_list_var = remaining_tuples;
            SubLObject tuple = NIL;
            tuple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject unsubsumed_tuple = NIL;
                SubLObject cdolist_list_var_$28 = tuple;
                SubLObject mt = NIL;
                mt = cdolist_list_var_$28.first();
                while (NIL != cdolist_list_var_$28) {
                    if (NIL == genl_mts.genl_mtP(max_floor_of_singletons, mt, UNPROVIDED, UNPROVIDED)) {
                        unsubsumed_tuple = cons(mt, unsubsumed_tuple);
                    }
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    mt = cdolist_list_var_$28.first();
                }
                SubLObject var = unsubsumed_tuple;
                if (NIL != var) {
                    unsubsumed_tuples = cons(var, unsubsumed_tuples);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tuple = cdolist_list_var.first();
            }
            if (NIL == unsubsumed_tuples) {
                return max_floor_of_singletons;
            }
            Errors.warn($str116$multiple_justifications___s__S, max_floor_of_singletons, unsubsumed_tuples);
            return NIL;
        }
        return mts;
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 63400L)
    public static SubLObject disjoin_mt_tuples(SubLObject mt_tuples) {
        return genl_mts.max_mts(Functions.apply($sym117$APPEND, mt_tuples), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 63600L)
    public static SubLObject max_floor_mts_of_inference_answer_justification(SubLObject justification) {
        SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
        supports = cycl_utilities.expression_subst($$InferencePSC, $$EverythingPSC, supports, UNPROVIDED, UNPROVIDED);
        return max_floor_mts_of_supports(supports);
    }

    @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 63900L)
    public static SubLObject max_floor_mts_of_supports(SubLObject supports) {
        SubLObject mts = NIL;
        SubLObject cdolist_list_var;
        SubLObject mt_support_combinations = cdolist_list_var = forward.compute_all_mt_and_support_combinations(supports, UNPROVIDED);
        SubLObject mt_support_combination = NIL;
        mt_support_combination = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = mt_support_combination;
            SubLObject concluded_mts = NIL;
            SubLObject support_combination = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list119);
            concluded_mts = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list119);
            support_combination = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$29 = concluded_mts;
                SubLObject concluded_mt = NIL;
                concluded_mt = cdolist_list_var_$29.first();
                while (NIL != cdolist_list_var_$29) {
                    SubLObject item_var = concluded_mt;
                    if (NIL == conses_high.member(item_var, mts, Symbols.symbol_function($sym120$HLMT_EQUAL_), Symbols.symbol_function(IDENTITY))) {
                        mts = cons(item_var, mts);
                    }
                    cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                    concluded_mt = cdolist_list_var_$29.first();
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list119);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_support_combination = cdolist_list_var.first();
        }
        return Sequences.nreverse(mts);
    }

    public static SubLObject declare_inference_analysis_file() {
        declareFunction("problem_store_estimated_problem_reuses_count", "PROBLEM-STORE-ESTIMATED-PROBLEM-REUSES-COUNT", 1, 0, false);
        declareFunction("problem_store_estimated_reuse_ratio", "PROBLEM-STORE-ESTIMATED-REUSE-RATIO", 1, 0, false);
        declareFunction("clear_transformation_rule_statistics_filename_load_history", "CLEAR-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 0, 0, false);
        declareFunction("clear_transformation_rule_statistics_received_filename_load_history", "CLEAR-TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY", 0, 0, false);
        declareFunction("add_to_transformation_rule_statistics_filename_load_history", "ADD-TO-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 2, 0, false);
        declareFunction("transformation_rule_statistics_filename_load_history", "TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 0, 0, false);
        declareFunction("transformation_rule_statistics_received_filename_load_history", "TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY", 0, 0, false);
        declareFunction("transformation_rule_statistics_update_enabledP", "TRANSFORMATION-RULE-STATISTICS-UPDATE-ENABLED?", 0, 0, false);
        declareFunction("enable_transformation_rule_statistics_update", "ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 0, false);
        declareFunction("disable_transformation_rule_statistics_update", "DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 0, false);
        declareMacro("do_transformation_rules_with_statistics", "DO-TRANSFORMATION-RULES-WITH-STATISTICS");
        declareFunction("transformation_rule_statistics_table", "TRANSFORMATION-RULE-STATISTICS-TABLE", 0, 0, false);
        declareFunction("transformation_rules_with_statistics_helper", "TRANSFORMATION-RULES-WITH-STATISTICS-HELPER", 0, 0, false);
        declareFunction("transformation_rules_with_statistics_condition_passesP", "TRANSFORMATION-RULES-WITH-STATISTICS-CONDITION-PASSES?", 3, 0, false);
        declareFunction("new_transformation_rule_statistics", "NEW-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction("clear_all_transformation_rule_statistics", "CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction("clear_transformation_rule_statistics", "CLEAR-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction("transformation_rules_with_statistics_count", "TRANSFORMATION-RULES-WITH-STATISTICS-COUNT", 0, 0, false);
        declareFunction("get_transformation_rule_statistics", "GET-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction("ensure_transformation_rule_statistics", "ENSURE-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction("transformation_rules_with_statistics", "TRANSFORMATION-RULES-WITH-STATISTICS", 0, 3, false);
        declareFunction("transformation_rules_with_recent_statistics", "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS", 0, 0, false);
        declareFunction("transformation_rules_with_received_statistics", "TRANSFORMATION-RULES-WITH-RECEIVED-STATISTICS", 0, 0, false);
        declareFunction("transformation_rules_with_recent_statistics_count", "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS-COUNT", 0, 0, false);
        declareFunction("transformation_rules_with_received_statistics_count", "TRANSFORMATION-RULES-WITH-RECEIVED-STATISTICS-COUNT", 0, 0, false);
        declareFunction("any_recent_experienceP", "ANY-RECENT-EXPERIENCE?", 0, 0, false);
        declareFunction("any_received_experienceP", "ANY-RECEIVED-EXPERIENCE?", 0, 0, false);
        declareFunction("total_transformation_rule_considered_count", "TOTAL-TRANSFORMATION-RULE-CONSIDERED-COUNT", 0, 0, false);
        declareFunction("total_transformation_rule_recent_considered_count", "TOTAL-TRANSFORMATION-RULE-RECENT-CONSIDERED-COUNT", 0, 0, false);
        declareFunction("total_transformation_rule_received_considered_count", "TOTAL-TRANSFORMATION-RULE-RECEIVED-CONSIDERED-COUNT", 0, 0, false);
        declareFunction("transformation_rule_considered_count", "TRANSFORMATION-RULE-CONSIDERED-COUNT", 1, 0, false);
        declareFunction("transformation_rule_recent_considered_count", "TRANSFORMATION-RULE-RECENT-CONSIDERED-COUNT", 1, 0, false);
        declareFunction("transformation_rule_received_considered_count", "TRANSFORMATION-RULE-RECEIVED-CONSIDERED-COUNT", 1, 0, false);
        declareFunction("transformation_rule_has_recent_statisticsP", "TRANSFORMATION-RULE-HAS-RECENT-STATISTICS?", 1, 0, false);
        declareFunction("transformation_rule_has_received_statisticsP", "TRANSFORMATION-RULE-HAS-RECEIVED-STATISTICS?", 1, 0, false);
        declareFunction("total_transformation_rule_success_count", "TOTAL-TRANSFORMATION-RULE-SUCCESS-COUNT", 0, 0, false);
        declareFunction("total_transformation_rule_recent_success_count", "TOTAL-TRANSFORMATION-RULE-RECENT-SUCCESS-COUNT", 0, 0, false);
        declareFunction("total_transformation_rule_received_success_count", "TOTAL-TRANSFORMATION-RULE-RECEIVED-SUCCESS-COUNT", 0, 0, false);
        declareFunction("transformation_rule_success_count", "TRANSFORMATION-RULE-SUCCESS-COUNT", 1, 0, false);
        declareFunction("transformation_rule_recent_success_count", "TRANSFORMATION-RULE-RECENT-SUCCESS-COUNT", 1, 0, false);
        declareFunction("transformation_rule_received_success_count", "TRANSFORMATION-RULE-RECEIVED-SUCCESS-COUNT", 1, 0, false);
        declareFunction("transformation_rule_success_probability", "TRANSFORMATION-RULE-SUCCESS-PROBABILITY", 1, 1, false);
        declareFunction("increment_transformation_rule_considered_count", "INCREMENT-TRANSFORMATION-RULE-CONSIDERED-COUNT", 2, 2, false);
        declareFunction("increment_transformation_rule_success_count", "INCREMENT-TRANSFORMATION-RULE-SUCCESS-COUNT", 2, 2, false);
        declareFunction("clear_all_recent_transformation_rule_statistics", "CLEAR-ALL-RECENT-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction("clear_all_received_transformation_rule_statistics", "CLEAR-ALL-RECEIVED-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction("clear_transformation_rule_recent_counts", "CLEAR-TRANSFORMATION-RULE-RECENT-COUNTS", 1, 0, false);
        declareFunction("clear_transformation_rule_received_counts", "CLEAR-TRANSFORMATION-RULE-RECEIVED-COUNTS", 1, 0, false);
        declareFunction("clean_transformation_rule_statistics", "CLEAN-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction("rule_utility_p", "RULE-UTILITY-P", 1, 0, false);
        declareFunction("transformation_rule_has_insufficient_historical_utilityP", "TRANSFORMATION-RULE-HAS-INSUFFICIENT-HISTORICAL-UTILITY?", 2, 0, false);
        declareFunction("rule_historical_utility_success_threshold", "RULE-HISTORICAL-UTILITY-SUCCESS-THRESHOLD", 0, 1, false);
        declareFunction("rule_historical_utility_saved_considerations", "RULE-HISTORICAL-UTILITY-SAVED-CONSIDERATIONS", 0, 1, false);
        declareFunction("transformation_rules_considered_with_success", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS", 0, 2, false);
        declareFunction("transformation_rules_considered_with_no_success", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
        declareFunction("transformation_rules_considered_with_success_from_mt", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS-FROM-MT", 1, 0, false);
        declareFunction("transformation_rules_considered_with_no_success_from_mt", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-FROM-MT", 1, 0, false);
        declareFunction("transformation_rules_considered_with_no_success_not_in_mts", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-NOT-IN-MTS", 1, 0, false);
        declareFunction("transformation_rule_mts_considered_with_success", "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-SUCCESS", 0, 0, false);
        declareFunction("transformation_rule_mts_considered_with_no_success", "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
        declareFunction("transformation_rules_considered_with_success_proving_predicate", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS-PROVING-PREDICATE", 1, 0, false);
        declareFunction("transformation_rules_considered_with_no_success_proving_predicate", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-PROVING-PREDICATE", 1, 0, false);
        declareFunction("transformation_rule_predicates_considered_with_success", "TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-SUCCESS", 0, 0, false);
        declareFunction("transformation_rule_predicates_considered_with_no_success", "TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
        declareFunction("reinforce_transformation_rule", "REINFORCE-TRANSFORMATION-RULE", 1, 1, false);
        declareFunction("reinforce_inference_transformation_rules_in_answers", "REINFORCE-INFERENCE-TRANSFORMATION-RULES-IN-ANSWERS", 1, 1, false);
        declareFunction("reinforce_inference_transformation_rules", "REINFORCE-INFERENCE-TRANSFORMATION-RULES", 1, 1, false);
        declareFunction("save_transformation_rule_statistics", "SAVE-TRANSFORMATION-RULE-STATISTICS", 1, 1, false);
        declareFunction("load_transformation_rule_statistics", "LOAD-TRANSFORMATION-RULE-STATISTICS", 1, 2, false);
        declareFunction("load_transformation_rule_statistics_except_for_rules", "LOAD-TRANSFORMATION-RULE-STATISTICS-EXCEPT-FOR-RULES", 2, 2, false);
        declareFunction("load_transformation_rule_statistics_int", "LOAD-TRANSFORMATION-RULE-STATISTICS-INT", 4, 0, false);
        declareFunction("load_transformation_rule_statistics_bookkeeping", "LOAD-TRANSFORMATION-RULE-STATISTICS-BOOKKEEPING", 3, 0, false);
        declareFunction("save_recent_transformation_rule_statistics", "SAVE-RECENT-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction("save_received_experience", "SAVE-RECEIVED-EXPERIENCE", 1, 0, false);
        declareFunction("save_transformation_rule_statistics_for_rule", "SAVE-TRANSFORMATION-RULE-STATISTICS-FOR-RULE", 5, 0, false);
        declareFunction("transformation_rule_something_considered_count", "TRANSFORMATION-RULE-SOMETHING-CONSIDERED-COUNT", 3, 0, false);
        declareFunction("transformation_rule_something_success_count", "TRANSFORMATION-RULE-SOMETHING-SUCCESS-COUNT", 3, 0, false);
        declareFunction("load_transformation_rule_statistics_for_rule", "LOAD-TRANSFORMATION-RULE-STATISTICS-FOR-RULE", 3, 0, false);
        declareFunction("show_transformation_rule_statistics", "SHOW-TRANSFORMATION-RULE-STATISTICS", 0, 2, false);
        declareFunction("possibly_save_recent_experience", "POSSIBLY-SAVE-RECENT-EXPERIENCE", 0, 0, false);
        declareFunction("save_recent_experience", "SAVE-RECENT-EXPERIENCE", 0, 0, false);
        declareFunction("local_experience_transcript", "LOCAL-EXPERIENCE-TRANSCRIPT", 0, 0, false);
        declareFunction("save_recent_experience_internal", "SAVE-RECENT-EXPERIENCE-INTERNAL", 0, 0, false);
        declareFunction("replace_and_collate_experience", "REPLACE-AND-COLLATE-EXPERIENCE", 2, 0, false);
        declareFunction("collate_experience", "COLLATE-EXPERIENCE", 1, 0, false);
        declareFunction("receive_experience", "RECEIVE-EXPERIENCE", 0, 0, false);
        declareFunction("load_received_experience", "LOAD-RECEIVED-EXPERIENCE", 1, 0, false);
        declareFunction("load_all_experience_transcripts_from_directory", "LOAD-ALL-EXPERIENCE-TRANSCRIPTS-FROM-DIRECTORY", 1, 1, false);
        declareFunction("transformation_rule_utility_experience_filenameP", "TRANSFORMATION-RULE-UTILITY-EXPERIENCE-FILENAME?", 1, 0, false);
        declareFunction("load_experience_transcript", "LOAD-EXPERIENCE-TRANSCRIPT", 1, 1, false);
        declareFunction("transformation_rule_historical_utility", "TRANSFORMATION-RULE-HISTORICAL-UTILITY", 1, 0, false);
        declareFunction("transformation_rule_historical_utility_G", "TRANSFORMATION-RULE-HISTORICAL-UTILITY->", 2, 0, false);
        declareFunction("current_average_rule_historical_success_probability", "CURRENT-AVERAGE-RULE-HISTORICAL-SUCCESS-PROBABILITY", 0, 1, false);
        declareFunction("rule_historical_utility_from_observations", "RULE-HISTORICAL-UTILITY-FROM-OBSERVATIONS", 2, 0, false);
        declareFunction("historical_utility_from_observations", "HISTORICAL-UTILITY-FROM-OBSERVATIONS", 4, 0, false);
        declareFunction("repair_all_experience_files_in_directory", "REPAIR-ALL-EXPERIENCE-FILES-IN-DIRECTORY", 1, 0, false);
        declareFunction("repair_experience_file", "REPAIR-EXPERIENCE-FILE", 1, 0, false);
        declareFunction("load_transformation_rule_statistics_ignoring_header", "LOAD-TRANSFORMATION-RULE-STATISTICS-IGNORING-HEADER", 2, 0, false);
        declareFunction("possibly_extend_transformation_rule_utility_table", "POSSIBLY-EXTEND-TRANSFORMATION-RULE-UTILITY-TABLE", 0, 0, false);
        declareFunction("rule_utility_table_uses_new_formatP", "RULE-UTILITY-TABLE-USES-NEW-FORMAT?", 0, 0, false);
        declareFunction("historically_connected_rules_set_contents", "HISTORICALLY-CONNECTED-RULES-SET-CONTENTS", 1, 0, false);
        declareFunction("set_historically_connected_rules_set_contents", "SET-HISTORICALLY-CONNECTED-RULES-SET-CONTENTS", 2, 0, false);
        declareFunction("rules_historically_connectedP", "RULES-HISTORICALLY-CONNECTED?", 2, 0, false);
        declareFunction("historically_connected_rules", "HISTORICALLY-CONNECTED-RULES", 1, 0, false);
        declareFunction("rule_historical_connectedness_ratio", "RULE-HISTORICAL-CONNECTEDNESS-RATIO", 1, 0, false);
        declareFunction("rule_historical_connectedness_percentage", "RULE-HISTORICAL-CONNECTEDNESS-PERCENTAGE", 1, 0, false);
        declareFunction("note_rules_historically_connected", "NOTE-RULES-HISTORICALLY-CONNECTED", 2, 0, false);
        declareFunction("note_inference_answer_proof_rules", "NOTE-INFERENCE-ANSWER-PROOF-RULES", 1, 0, false);
        declareFunction("show_transformation_rule_historical_connectivity_graph", "SHOW-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 0, 1, false);
        declareFunction("cb_show_transformation_rule_historical_connectivity_graph", "CB-SHOW-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 0, 0, false);
        declareFunction("save_transformation_rule_historical_connectivity_graph", "SAVE-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 1, 1, false);
        declareFunction("load_transformation_rule_historical_connectivity_graph", "LOAD-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 1, 0, false);
        declareFunction("clear_hl_module_expand_counts", "CLEAR-HL-MODULE-EXPAND-COUNTS", 0, 0, false);
        declareMacro("noting_hl_module_expand_counts", "NOTING-HL-MODULE-EXPAND-COUNTS");
        declareFunction("hl_module_expand_count", "HL-MODULE-EXPAND-COUNT", 1, 0, false);
        declareFunction("all_hl_module_expand_counts", "ALL-HL-MODULE-EXPAND-COUNTS", 0, 0, false);
        declareFunction("cinc_hl_module_expand_count", "CINC-HL-MODULE-EXPAND-COUNT", 1, 0, false);
        declareFunction("show_hl_module_expand_counts", "SHOW-HL-MODULE-EXPAND-COUNTS", 0, 2, false);
        declareFunction("cinc_module_expand_count", "CINC-MODULE-EXPAND-COUNT", 1, 0, false);
        declareFunction("clear_asked_query_queue", "CLEAR-ASKED-QUERY-QUEUE", 0, 0, false);
        declareFunction("possibly_enqueue_asked_query", "POSSIBLY-ENQUEUE-ASKED-QUERY", 3, 0, false);
        declareFunction("enqueue_asked_query", "ENQUEUE-ASKED-QUERY", 3, 0, false);
        declareFunction("possibly_enqueue_asked_query_from_inference", "POSSIBLY-ENQUEUE-ASKED-QUERY-FROM-INFERENCE", 1, 0, false);
        declareFunction("enqueue_asked_query_from_inference", "ENQUEUE-ASKED-QUERY-FROM-INFERENCE", 1, 0, false);
        declareFunction("possibly_save_recent_asked_queries", "POSSIBLY-SAVE-RECENT-ASKED-QUERIES", 0, 0, false);
        declareFunction("load_asked_queries", "LOAD-ASKED-QUERIES", 1, 1, false);
        declareFunction("query_info_p", "QUERY-INFO-P", 1, 0, false);
        declareFunction("valid_query_infoP", "VALID-QUERY-INFO?", 1, 0, false);
        declareFunction("load_asked_query", "LOAD-ASKED-QUERY", 1, 0, false);
        declareFunction("save_recent_asked_queries", "SAVE-RECENT-ASKED-QUERIES", 0, 0, false);
        declareFunction("any_recent_asked_queriesP", "ANY-RECENT-ASKED-QUERIES?", 0, 0, false);
        declareFunction("local_asked_queries_transcript", "LOCAL-ASKED-QUERIES-TRANSCRIPT", 0, 0, false);
        declareFunction("save_recent_asked_queries_int", "SAVE-RECENT-ASKED-QUERIES-INT", 0, 0, false);
        declareFunction("save_recent_asked_queries_to_file", "SAVE-RECENT-ASKED-QUERIES-TO-FILE", 1, 0, false);
        declareFunction("write_asked_query_to_stream", "WRITE-ASKED-QUERY-TO-STREAM", 3, 0, false);
        declareFunction("load_asked_query_from_stream", "LOAD-ASKED-QUERY-FROM-STREAM", 1, 0, false);
        declareFunction("asked_queries_filenameP", "ASKED-QUERIES-FILENAME?", 1, 0, false);
        declareFunction("asked_query_common_symbols", "ASKED-QUERY-COMMON-SYMBOLS", 0, 0, false);
        declareFunction("asked_query_common_symbols_simple", "ASKED-QUERY-COMMON-SYMBOLS-SIMPLE", 0, 0, false);
        declareFunction("show_asked_query_statistics", "SHOW-ASKED-QUERY-STATISTICS", 1, 0, false);
        declareFunction("show_asked_query_statistics_int", "SHOW-ASKED-QUERY-STATISTICS-INT", 3, 0, false);
        declareFunction("mts_of_inference_answer", "MTS-OF-INFERENCE-ANSWER", 1, 0, false);
        declareFunction("mts_of_inference_answer_justification", "MTS-OF-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
        declareFunction("max_floor_mts_of_inference", "MAX-FLOOR-MTS-OF-INFERENCE", 1, 1, false);
        declareFunction("max_floor_mts_of_inference_answer", "MAX-FLOOR-MTS-OF-INFERENCE-ANSWER", 1, 1, false);
        declareFunction("conjoin_mt_tuples", "CONJOIN-MT-TUPLES", 1, 0, false);
        declareFunction("disjoin_mt_tuples", "DISJOIN-MT-TUPLES", 1, 0, false);
        declareFunction("max_floor_mts_of_inference_answer_justification", "MAX-FLOOR-MTS-OF-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
        declareFunction("max_floor_mts_of_supports", "MAX-FLOOR-MTS-OF-SUPPORTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_analysis_file() {
        $transformation_rule_statistics_table$ = deflexical("*TRANSFORMATION-RULE-STATISTICS-TABLE*", maybeDefault($sym0$_TRANSFORMATION_RULE_STATISTICS_TABLE_, $transformation_rule_statistics_table$, () -> (Hashtables.make_hash_table($int$64, Symbols.symbol_function(EQL), UNPROVIDED))));
        $transformation_rule_statistics_lock$ = deflexical("*TRANSFORMATION-RULE-STATISTICS-LOCK*", maybeDefault($sym2$_TRANSFORMATION_RULE_STATISTICS_LOCK_, $transformation_rule_statistics_lock$, () -> (Locks.make_lock($str3$Transformation_Rule_Statistics_Lo))));
        $transformation_rule_statistics_filename_load_history$ = deflexical("*TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY*", (maybeDefault($sym4$_TRANSFORMATION_RULE_STATISTICS_FILENAME_LOAD_HISTORY_, $transformation_rule_statistics_filename_load_history$, NIL)));
        $transformation_rule_statistics_received_filename_load_history$ = deflexical("*TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY*",
                (maybeDefault($sym5$_TRANSFORMATION_RULE_STATISTICS_RECEIVED_FILENAME_LOAD_HISTORY_, $transformation_rule_statistics_received_filename_load_history$, NIL)));
        $transformation_rule_statistics_update_enabledP$ = SubLFiles.defvar("*TRANSFORMATION-RULE-STATISTICS-UPDATE-ENABLED?*", T);
        $transformation_rule_historical_success_pruning_threshold$ = SubLFiles.defvar("*TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING-THRESHOLD*", ZERO_INTEGER);
        $save_recent_experience_lock$ = defparameter("*SAVE-RECENT-EXPERIENCE-LOCK*", Locks.make_lock($str50$Save_recent_experience_lock));
        $average_rule_historical_success_probability$ = SubLFiles.defparameter("*AVERAGE-RULE-HISTORICAL-SUCCESS-PROBABILITY*", $float$0_02939361143247565);
        $rule_historical_success_happiness_scaling_factor$ = SubLFiles.defparameter("*RULE-HISTORICAL-SUCCESS-HAPPINESS-SCALING-FACTOR*", TEN_INTEGER);
        $transformation_rule_historical_connectivity_graph$ = deflexical("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH*",
                maybeDefault($sym72$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_, $transformation_rule_historical_connectivity_graph$, () -> (Hashtables.make_hash_table($int$256, Symbols.symbol_function(EQL), UNPROVIDED))));
        $transformation_rule_historical_connectivity_graph_lock$ = deflexical("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH-LOCK*",
                maybeDefault($sym74$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_, $transformation_rule_historical_connectivity_graph_lock$, () -> (Locks.make_lock($str75$Rule_Historical_Connectivity_Grap))));
        $hl_module_expand_counts_enabledP$ = defvar("*HL-MODULE-EXPAND-COUNTS-ENABLED?*", NIL);
        $hl_module_expand_counts$ = defvar("*HL-MODULE-EXPAND-COUNTS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        $asked_queries_queue$ = deflexical("*ASKED-QUERIES-QUEUE*", maybeDefault($sym87$_ASKED_QUERIES_QUEUE_, $asked_queries_queue$, () -> (queues.create_queue(UNPROVIDED))));
        $save_recent_asked_queries_lock$ = defparameter("*SAVE-RECENT-ASKED-QUERIES-LOCK*", Locks.make_lock($str88$Query_logging_lock));
        $asked_queries_queue_limit$ = deflexical("*ASKED-QUERIES-QUEUE-LIMIT*", $int$300);
        $asked_query_common_symbols$ = deflexical("*ASKED-QUERY-COMMON-SYMBOLS*", (maybeDefault($sym99$_ASKED_QUERY_COMMON_SYMBOLS_, $asked_query_common_symbols$, NIL)));
        $asked_query_common_symbols_simple$ = deflexical("*ASKED-QUERY-COMMON-SYMBOLS-SIMPLE*", (maybeDefault($sym100$_ASKED_QUERY_COMMON_SYMBOLS_SIMPLE_, $asked_query_common_symbols_simple$, NIL)));
        return NIL;
    }

    public static SubLObject setup_inference_analysis_file() {
        subl_macro_promotions.declare_defglobal($sym0$_TRANSFORMATION_RULE_STATISTICS_TABLE_);
        subl_macro_promotions.declare_defglobal($sym2$_TRANSFORMATION_RULE_STATISTICS_LOCK_);
        subl_macro_promotions.declare_defglobal($sym4$_TRANSFORMATION_RULE_STATISTICS_FILENAME_LOAD_HISTORY_);
        subl_macro_promotions.declare_defglobal($sym5$_TRANSFORMATION_RULE_STATISTICS_RECEIVED_FILENAME_LOAD_HISTORY_);
        access_macros.register_macro_helper($sym21$TRANSFORMATION_RULE_STATISTICS_TABLE, $sym22$DO_TRANSFORMATION_RULES_WITH_STATISTICS);
        access_macros.register_macro_helper($sym23$TRANSFORMATION_RULES_WITH_STATISTICS_HELPER, $sym22$DO_TRANSFORMATION_RULES_WITH_STATISTICS);
        access_macros.register_macro_helper($sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, $sym22$DO_TRANSFORMATION_RULES_WITH_STATISTICS);
        subl_macro_promotions.declare_defglobal($sym72$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_);
        subl_macro_promotions.declare_defglobal($sym74$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_);
        utilities_macros.register_global_lock($sym74$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_, $str75$Rule_Historical_Connectivity_Grap);
        subl_macro_promotions.declare_defglobal($sym87$_ASKED_QUERIES_QUEUE_);
        access_macros.register_macro_helper($sym96$ASKED_QUERIES_FILENAME_, $sym97$DO_ASKED_QUERIES_IN_DIRECTORY);
        subl_macro_promotions.declare_defglobal($sym99$_ASKED_QUERY_COMMON_SYMBOLS_);
        subl_macro_promotions.declare_defglobal($sym100$_ASKED_QUERY_COMMON_SYMBOLS_SIMPLE_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_analysis_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_analysis_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_analysis_file();
    }
}
/*
 *
 * Total time: 1158 ms synthetic
 */