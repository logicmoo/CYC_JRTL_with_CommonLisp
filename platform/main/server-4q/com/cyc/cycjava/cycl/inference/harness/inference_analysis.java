package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.save_asked_queriesP;
import static com.cyc.cycjava.cycl.el_utilities.possibly_cycl_sentence_p;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cfasl_kb_methods;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_queues;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transcript_utilities;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_analysis extends SubLTranslatedFile {
    public static final SubLFile me = new inference_analysis();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_analysis";

    public static final String myFingerPrint = "3b592e637e10cdbaeb6a299b678f76fbde7a016b057b961f308a04c3bedced1b";









    // defvar
    /**
     * When non-nil, the transformation rule statistics are updated during
     * inference.
     */
    public static final SubLSymbol $transformation_rule_statistics_update_enabledP$ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-UPDATE-ENABLED?*");

    // defvar
    /**
     * Absolute historical success limit, below which rules are never even tried.
     */
    public static final SubLSymbol $transformation_rule_historical_success_pruning_threshold$ = makeSymbol("*TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING-THRESHOLD*");

    // defparameter
    /**
     * This lock controls who actually gets to write to the experience transcript
     * file, since multiple threads could otherwise open the same file for appending
     * and stomp all over each other.
     */
    private static final SubLSymbol $save_recent_experience_lock$ = makeSymbol("*SAVE-RECENT-EXPERIENCE-LOCK*");

    // defparameter
    private static final SubLSymbol $average_rule_historical_success_probability$ = makeSymbol("*AVERAGE-RULE-HISTORICAL-SUCCESS-PROBABILITY*");

    // defparameter
    private static final SubLSymbol $rule_historical_success_happiness_scaling_factor$ = makeSymbol("*RULE-HISTORICAL-SUCCESS-HAPPINESS-SCALING-FACTOR*");





    // defvar
    private static final SubLSymbol $hl_module_expand_counts_enabledP$ = makeSymbol("*HL-MODULE-EXPAND-COUNTS-ENABLED?*");

    // defvar
    public static final SubLSymbol $hl_module_expand_counts$ = makeSymbol("*HL-MODULE-EXPAND-COUNTS*");



    // defparameter
    // The lock for the asked queries queue.
    private static final SubLSymbol $save_recent_asked_queries_lock$ = makeSymbol("*SAVE-RECENT-ASKED-QUERIES-LOCK*");

    // deflexical
    // The limit to the number of queries we will store before writing them out.
    private static final SubLSymbol $asked_queries_queue_limit$ = makeSymbol("*ASKED-QUERIES-QUEUE-LIMIT*");





    // Internal Constants
    public static final SubLSymbol $transformation_rule_statistics_table$ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-TABLE*");



    public static final SubLSymbol $transformation_rule_statistics_lock$ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-LOCK*");

    public static final SubLString $str3$Transformation_Rule_Statistics_Lo = makeString("Transformation Rule Statistics Lock");

    public static final SubLSymbol $transformation_rule_statistics_filename_load_history$ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY*");

    private static final SubLSymbol $transformation_rule_statistics_received_filename_load_history$ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY*");

    public static final SubLList $list6 = list(list(makeSymbol("RULE-VAR"), makeSymbol("&KEY"), makeSymbol("RECENT?"), makeSymbol("RECEIVED?"), makeSymbol("COPY?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list7 = list(makeKeyword("RECENT?"), makeKeyword("RECEIVED?"), makeKeyword("COPY?"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");











    private static final SubLList $list14 = list(makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-HELPER"));



    private static final SubLSymbol $sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_ = makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-CONDITION-PASSES?");

    private static final SubLSymbol $sym17$STATISTICS_VAR = makeUninternedSymbol("STATISTICS-VAR");



    private static final SubLList $list19 = list(makeSymbol("TRANSFORMATION-RULE-STATISTICS-TABLE"));



    private static final SubLSymbol TRANSFORMATION_RULE_STATISTICS_TABLE = makeSymbol("TRANSFORMATION-RULE-STATISTICS-TABLE");

    private static final SubLSymbol DO_TRANSFORMATION_RULES_WITH_STATISTICS = makeSymbol("DO-TRANSFORMATION-RULES-WITH-STATISTICS");

    private static final SubLSymbol TRANSFORMATION_RULES_WITH_STATISTICS_HELPER = makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-HELPER");







    private static final SubLSymbol $sym27$_ = makeSymbol(">");

    private static final SubLSymbol TRANSFORMATION_RULE_SUCCESS_COUNT = makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT");

    private static final SubLSymbol TRANSFORMATION_RULE_CONSIDERED_COUNT = makeSymbol("TRANSFORMATION-RULE-CONSIDERED-COUNT");



    private static final SubLSymbol $sym31$_ = makeSymbol("<");



    private static final SubLSymbol TRANSFORMATION_RULE_SUCCESS_PROBABILITY = makeSymbol("TRANSFORMATION-RULE-SUCCESS-PROBABILITY");



    private static final SubLSymbol TRANSFORMATION_RULE_HISTORICAL_UTILITY = makeSymbol("TRANSFORMATION-RULE-HISTORICAL-UTILITY");





    private static final SubLString $str38$Incrementing_transformation_rule_ = makeString("Incrementing transformation rule considered count by zero; this is is vacuous and suspicious");

    private static final SubLInteger $int$_100 = makeInteger(-100);





    private static final SubLSymbol $sym42$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");



    private static final SubLString $str44$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLString $str46$Transformation_rule_statistics_up = makeString("Transformation rule statistics updating is not enabled.");

    private static final SubLString $str47$_________________________________ = makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

    private static final SubLString $str48$______S_rules__sorted_by__A = makeString("~%;; ~S rules, sorted by ~A");

    private static final SubLString $str49$________S__S___S_____utility____S = makeString("~%~%;; ~S/~S (~S %)  utility : ~S~%~S");

    private static final SubLString $$$Save_recent_experience_lock = makeString("Save recent experience lock");

    private static final SubLString $$$experience = makeString("experience");

    private static final SubLString $str52$_TS = makeString(".TS");

    private static final SubLString $str53$_CFASL = makeString(".CFASL");

    private static final SubLString $str54$_ts = makeString(".ts");

    private static final SubLString $str55$_cfasl = makeString(".cfasl");





    private static final SubLString $str58$Loading_transformation_rule_stati = makeString("Loading transformation rule statistics");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str60$_experience_cfasl = makeString("-experience.cfasl");

    private static final SubLSymbol $sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list62 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);



    private static final SubLString $str64$_A = makeString("~A");

    private static final SubLFloat $float$0_02939361143247565 = makeDouble(0.02939361143247565);

    private static final SubLString $str66$Repairing_transformation_rule_sta = makeString("Repairing transformation rule statistics");

    private static final SubLString $str67$Repairing__a_spurious_zeroes_in__ = makeString("Repairing ~a spurious zeroes in ~a~%");

    private static final SubLString $str68$_bloated_cfasl = makeString("-bloated.cfasl");

    private static final SubLString $str69$Could_not_load__a = makeString("Could not load ~a");



    private static final SubLList $list71 = cons(makeSymbol("RULE"), makeSymbol("VECTOR"));

    private static final SubLSymbol $transformation_rule_historical_connectivity_graph$ = makeSymbol("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH*");



    private static final SubLSymbol $transformation_rule_historical_connectivity_graph_lock$ = makeSymbol("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH-LOCK*");

    private static final SubLString $str75$Rule_Historical_Connectivity_Grap = makeString("Rule Historical Connectivity Graph Lock");

    private static final SubLSymbol SET_CONTENTS_P = makeSymbol("SET-CONTENTS-P");

    private static final SubLString $str77$Got_a_directed_instead_of_undirec = makeString("Got a directed instead of undirected link in the rule historical connectedness graph while trying to compute the ratio for ~s");

    private static final SubLString $str78$____Rule_____S__Connected_Rules__ = makeString("~%~%Rule :~%~S~%Connected Rules :");

    private static final SubLString $str79$___S = makeString("~%~S");

    private static final SubLString $str80$Rule__ = makeString("Rule :");

    private static final SubLString $str81$Connected_Rules__ = makeString("Connected Rules :");



    public static final SubLList $list83 = list(list(makeSymbol("*HL-MODULE-EXPAND-COUNTS-ENABLED?*"), T), list(makeSymbol("*HL-MODULE-EXPAND-COUNTS*"), list(makeSymbol("NEW-DICTIONARY"))));



    private static final SubLList $list85 = cons(makeSymbol("HL-MODULE"), makeSymbol("COUNT"));

    private static final SubLString $str86$___4_D__S__ = makeString("~&~4,D ~S~%");

    private static final SubLSymbol $asked_queries_queue$ = makeSymbol("*ASKED-QUERIES-QUEUE*");

    private static final SubLString $$$Query_logging_lock = makeString("Query logging lock");

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLList $list90 = list(makeKeyword("PROBLEM-STORE"));

    private static final SubLString $str91$Read_invalid_query_info__s = makeString("Read invalid query info ~s");

    private static final SubLList $list92 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    private static final SubLString $str93$asked_queries = makeString("asked-queries");



    private static final SubLSymbol QUERY_INFO_P = makeSymbol("QUERY-INFO-P");

    private static final SubLSymbol $sym96$ASKED_QUERIES_FILENAME_ = makeSymbol("ASKED-QUERIES-FILENAME?");

    private static final SubLSymbol DO_ASKED_QUERIES_IN_DIRECTORY = makeSymbol("DO-ASKED-QUERIES-IN-DIRECTORY");

    private static final SubLString $str98$local_asked_queries_cfasl = makeString("local-asked-queries.cfasl");

    private static final SubLSymbol $asked_query_common_symbols$ = makeSymbol("*ASKED-QUERY-COMMON-SYMBOLS*");

    private static final SubLSymbol $asked_query_common_symbols_simple$ = makeSymbol("*ASKED-QUERY-COMMON-SYMBOLS-SIMPLE*");



    private static final SubLString $str102$Entering__s__ = makeString("Entering ~s~%");



    private static final SubLString $str104$_ = makeString(".");

    private static final SubLString $str105$__Number_of_saved_queries_per_dir = makeString("~%Number of saved queries per directory:~%");

    private static final SubLString $str106$__Histogram_of_saved_queries_per_ = makeString("~%Histogram of saved queries per file:~%");

    private static final SubLString $str107$__Total_number_of_saved_queries__ = makeString("~%Total number of saved queries: ~s~%");

    private static final SubLString $str108$__Total_number_of_unique_saved_qu = makeString("~%Total number of unique saved queries: ~s~%~%");

    private static final SubLSymbol $sym109$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLSymbol $sym113$SINGLETON_ = makeSymbol("SINGLETON?");



    private static final SubLString $str115$non_singleton_max_floor_mts_of_si = makeString("non-singleton max-floor-mts-of-singletons: ~s ~s");

    private static final SubLString $str116$multiple_justifications___s__S = makeString("multiple justifications: ~s ~S");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLList $list119 = list(makeSymbol("CONCLUDED-MTS"), makeSymbol("SUPPORT-COMBINATION"));

    private static final SubLSymbol $sym120$HLMT_EQUAL_ = makeSymbol("HLMT-EQUAL?");

    

    public static SubLObject problem_store_estimated_problem_reuses_count(final SubLObject store) {
        return subtract(inference_datastructures_problem_store.problem_store_dependent_link_count(store), inference_datastructures_problem_store.problem_store_problem_count(store));
    }

    public static SubLObject problem_store_estimated_reuse_ratio(final SubLObject store) {
        final SubLObject problem_count = inference_datastructures_problem_store.problem_store_problem_count(store);
        return problem_count.isZero() ? ZERO_INTEGER : divide(problem_store_estimated_problem_reuses_count(store), problem_count);
    }

    public static SubLObject clear_transformation_rule_statistics_filename_load_history() {
        $transformation_rule_statistics_filename_load_history$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject clear_transformation_rule_statistics_received_filename_load_history() {
        $transformation_rule_statistics_received_filename_load_history$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject add_to_transformation_rule_statistics_filename_load_history(final SubLObject filename, final SubLObject receivedP) {
        if (NIL != receivedP) {
            final SubLObject new_cons = cons(filename, NIL);
            final SubLObject list = $transformation_rule_statistics_received_filename_load_history$.getGlobalValue();
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                $transformation_rule_statistics_received_filename_load_history$.setGlobalValue(new_cons);
            }
        } else {
            final SubLObject new_cons = cons(filename, NIL);
            final SubLObject list = $transformation_rule_statistics_filename_load_history$.getGlobalValue();
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                $transformation_rule_statistics_filename_load_history$.setGlobalValue(new_cons);
            }
        }
        return filename;
    }

    public static SubLObject transformation_rule_statistics_filename_load_history() {
        return $transformation_rule_statistics_filename_load_history$.getGlobalValue();
    }

    public static SubLObject transformation_rule_statistics_received_filename_load_history() {
        return $transformation_rule_statistics_received_filename_load_history$.getGlobalValue();
    }

    public static SubLObject transformation_rule_statistics_update_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread);
    }

    public static SubLObject enable_transformation_rule_statistics_update() {
        $transformation_rule_statistics_update_enabledP$.setDynamicValue(T);
        return T;
    }

    public static SubLObject disable_transformation_rule_statistics_update() {
        $transformation_rule_statistics_update_enabledP$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject do_transformation_rules_with_statistics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_var = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        rule_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list6);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list6);
            if (NIL == member(current_$1, $list7, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list6);
        }
        final SubLObject recentP_tail = property_list_member($RECENT_, current);
        final SubLObject recentP = (NIL != recentP_tail) ? cadr(recentP_tail) : NIL;
        final SubLObject receivedP_tail = property_list_member($RECEIVED_, current);
        final SubLObject receivedP = (NIL != receivedP_tail) ? cadr(receivedP_tail) : NIL;
        final SubLObject copyP_tail = property_list_member($COPY_, current);
        final SubLObject copyP = (NIL != copyP_tail) ? cadr(copyP_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != copyP) {
            return list(DO_LIST, list(rule_var, $list14, $DONE, done), listS(PWHEN, list($sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, rule_var, recentP, receivedP), append(body, NIL)));
        }
        final SubLObject statistics_var = $sym17$STATISTICS_VAR;
        return list(DO_HASH_TABLE, list(rule_var, statistics_var, $list19, $DONE, done), list(IGNORE, statistics_var), listS(PWHEN, list($sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, rule_var, recentP, receivedP), append(body, NIL)));
    }

    public static SubLObject transformation_rule_statistics_table() {
        return $transformation_rule_statistics_table$.getGlobalValue();
    }

    public static SubLObject transformation_rules_with_statistics_helper() {
        SubLObject rules = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
            rules = hash_table_utilities.hash_table_keys(transformation_rule_statistics_table());
        } finally {
            if (NIL != release) {
                release_lock($transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return rules;
    }

    public static SubLObject transformation_rules_with_statistics_condition_passesP(final SubLObject rule, final SubLObject recentP, final SubLObject receivedP) {
        return makeBoolean(((NIL != assertion_handles.valid_assertionP(rule, UNPROVIDED)) && ((NIL == recentP) || (NIL != transformation_rule_has_recent_statisticsP(rule)))) && ((NIL == receivedP) || (NIL != transformation_rule_has_received_statisticsP(rule))));
    }

    public static SubLObject new_transformation_rule_statistics() {
        return make_vector(SIX_INTEGER, ZERO_INTEGER);
    }

    public static SubLObject clear_all_transformation_rule_statistics() {
        SubLObject release = NIL;
        try {
            release = seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
            clrhash($transformation_rule_statistics_table$.getGlobalValue());
            clear_transformation_rule_statistics_filename_load_history();
        } finally {
            if (NIL != release) {
                release_lock($transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject clear_transformation_rule_statistics(final SubLObject rule) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
            result = remhash(rule, $transformation_rule_statistics_table$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject transformation_rules_with_statistics_count() {
        return hash_table_count($transformation_rule_statistics_table$.getGlobalValue());
    }

    public static SubLObject get_transformation_rule_statistics(final SubLObject rule) {
        return gethash_without_values(rule, $transformation_rule_statistics_table$.getGlobalValue(), $UNINITIALIZED);
    }

    public static SubLObject ensure_transformation_rule_statistics(final SubLObject rule) {
        SubLObject statistics = get_transformation_rule_statistics(rule);
        if ($UNINITIALIZED == statistics) {
            statistics = new_transformation_rule_statistics();
            SubLObject release = NIL;
            try {
                release = seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
                sethash(rule, $transformation_rule_statistics_table$.getGlobalValue(), statistics);
            } finally {
                if (NIL != release) {
                    release_lock($transformation_rule_statistics_lock$.getGlobalValue());
                }
            }
        }
        return statistics;
    }

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
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, recentP, receivedP)) {
                    rules = cons(rule, rules);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject pcase_var = order;
        if (pcase_var.eql($CONSIDERED)) {
            rules = Sort.sort(rules, symbol_function($sym27$_), TRANSFORMATION_RULE_SUCCESS_COUNT);
            rules = Sort.stable_sort(rules, symbol_function($sym27$_), TRANSFORMATION_RULE_CONSIDERED_COUNT);
        } else
            if (pcase_var.eql($SUCCESS)) {
                rules = Sort.sort(rules, symbol_function($sym31$_), TRANSFORMATION_RULE_CONSIDERED_COUNT);
                rules = Sort.stable_sort(rules, symbol_function($sym27$_), TRANSFORMATION_RULE_SUCCESS_COUNT);
            } else
                if (pcase_var.eql($SUCCESS_PROBABILITY)) {
                    rules = Sort.sort(rules, symbol_function($sym27$_), TRANSFORMATION_RULE_SUCCESS_COUNT);
                    rules = Sort.stable_sort(rules, symbol_function($sym27$_), TRANSFORMATION_RULE_SUCCESS_PROBABILITY);
                } else
                    if (pcase_var.eql($HISTORICAL_UTILITY)) {
                        rules = Sort.sort(rules, symbol_function($sym31$_), TRANSFORMATION_RULE_CONSIDERED_COUNT);
                        rules = Sort.stable_sort(rules, symbol_function($sym27$_), TRANSFORMATION_RULE_SUCCESS_COUNT);
                        rules = Sort.stable_sort(rules, symbol_function($sym27$_), TRANSFORMATION_RULE_HISTORICAL_UTILITY);
                    }



        return rules;
    }

    public static SubLObject transformation_rules_with_recent_statistics() {
        SubLObject rules = NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    rules = cons(rule, rules);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return nreverse(rules);
    }

    public static SubLObject transformation_rules_with_received_statistics() {
        SubLObject rules = NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    rules = cons(rule, rules);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return nreverse(rules);
    }

    public static SubLObject transformation_rules_with_recent_statistics_count() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    count = add(count, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    public static SubLObject transformation_rules_with_received_statistics_count() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    count = add(count, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    public static SubLObject any_recent_experienceP() {
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    return T;
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject any_received_experienceP() {
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    return T;
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject total_transformation_rule_considered_count() {
        SubLObject total = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    total = add(total, transformation_rule_considered_count(rule));
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static SubLObject total_transformation_rule_recent_considered_count() {
        SubLObject total = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    total = add(total, transformation_rule_considered_count(rule));
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static SubLObject total_transformation_rule_received_considered_count() {
        SubLObject total = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    total = add(total, transformation_rule_considered_count(rule));
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static SubLObject transformation_rule_considered_count(final SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return $UNINITIALIZED == statistics ? ZERO_INTEGER : add(aref(statistics, ZERO_INTEGER), aref(statistics, FOUR_INTEGER));
    }

    public static SubLObject transformation_rule_recent_considered_count(final SubLObject rule) {
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return $UNINITIALIZED == statistics ? ZERO_INTEGER : aref(statistics, TWO_INTEGER);
    }

    public static SubLObject transformation_rule_received_considered_count(final SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return $UNINITIALIZED == statistics ? ZERO_INTEGER : aref(statistics, FOUR_INTEGER);
    }

    public static SubLObject transformation_rule_has_recent_statisticsP(final SubLObject rule) {
        return plusp(transformation_rule_recent_considered_count(rule));
    }

    public static SubLObject transformation_rule_has_received_statisticsP(final SubLObject rule) {
        return plusp(transformation_rule_received_considered_count(rule));
    }

    public static SubLObject total_transformation_rule_success_count() {
        SubLObject total = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    total = add(total, transformation_rule_success_count(rule));
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static SubLObject total_transformation_rule_recent_success_count() {
        SubLObject total = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    total = add(total, transformation_rule_success_count(rule));
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static SubLObject total_transformation_rule_received_success_count() {
        SubLObject total = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    total = add(total, transformation_rule_success_count(rule));
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static SubLObject transformation_rule_success_count(final SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return $UNINITIALIZED == statistics ? ZERO_INTEGER : add(aref(statistics, ONE_INTEGER), aref(statistics, FIVE_INTEGER));
    }

    public static SubLObject transformation_rule_recent_success_count(final SubLObject rule) {
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return $UNINITIALIZED == statistics ? ZERO_INTEGER : aref(statistics, THREE_INTEGER);
    }

    public static SubLObject transformation_rule_received_success_count(final SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return $UNINITIALIZED == statistics ? ZERO_INTEGER : aref(statistics, FIVE_INTEGER);
    }

    public static SubLObject transformation_rule_success_probability(final SubLObject rule, SubLObject unused_probability) {
        if (unused_probability == UNPROVIDED) {
            unused_probability = ZERO_INTEGER;
        }
        final SubLObject considered = transformation_rule_considered_count(rule);
        if (!considered.isPositive()) {
            return unused_probability;
        }
        final SubLObject success = transformation_rule_success_count(rule);
        return divide(success, considered);
    }

    public static SubLObject increment_transformation_rule_considered_count(final SubLObject rule, final SubLObject recentP, SubLObject count, SubLObject receivedP) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(rule) : "assertion_handles.assertion_p(rule) " + "CommonSymbols.NIL != assertion_handles.assertion_p(rule) " + rule;
        assert NIL != integerp(count) : "Types.integerp(count) " + "CommonSymbols.NIL != Types.integerp(count) " + count;
        if (NIL == subl_promotions.positive_integer_p(count)) {
            Errors.warn($str38$Incrementing_transformation_rule_);
        }
        final SubLObject statistics = ensure_transformation_rule_statistics(rule);
        if (NIL != $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread)) {
            if (NIL == receivedP) {
                set_aref(statistics, ZERO_INTEGER, add(aref(statistics, ZERO_INTEGER), count));
            }
            if (NIL != recentP) {
                set_aref(statistics, TWO_INTEGER, add(aref(statistics, TWO_INTEGER), count));
            }
            if (NIL != receivedP) {
                set_aref(statistics, FOUR_INTEGER, add(aref(statistics, FOUR_INTEGER), count));
            }
        }
        return aref(statistics, ZERO_INTEGER);
    }

    public static SubLObject increment_transformation_rule_success_count(final SubLObject rule, final SubLObject recentP, SubLObject count, SubLObject receivedP) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(rule) : "assertion_handles.assertion_p(rule) " + "CommonSymbols.NIL != assertion_handles.assertion_p(rule) " + rule;
        assert NIL != integerp(count) : "Types.integerp(count) " + "CommonSymbols.NIL != Types.integerp(count) " + count;
        final SubLObject statistics = ensure_transformation_rule_statistics(rule);
        if (NIL != $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread)) {
            if (NIL == receivedP) {
                set_aref(statistics, ONE_INTEGER, add(aref(statistics, ONE_INTEGER), count));
            }
            if (NIL != recentP) {
                set_aref(statistics, THREE_INTEGER, add(aref(statistics, THREE_INTEGER), count));
            }
            if (NIL != receivedP) {
                set_aref(statistics, FIVE_INTEGER, add(aref(statistics, FIVE_INTEGER), count));
            }
        }
        return aref(statistics, ONE_INTEGER);
    }

    public static SubLObject clear_all_recent_transformation_rule_statistics() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    clear_transformation_rule_recent_counts(rule);
                    count = add(count, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    public static SubLObject clear_all_received_transformation_rule_statistics() {
        SubLObject count = ZERO_INTEGER;
        clear_transformation_rule_statistics_received_filename_load_history();
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    clear_transformation_rule_received_counts(rule);
                    count = add(count, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    public static SubLObject clear_transformation_rule_recent_counts(final SubLObject rule) {
        assert NIL != assertion_handles.assertion_p(rule) : "assertion_handles.assertion_p(rule) " + "CommonSymbols.NIL != assertion_handles.assertion_p(rule) " + rule;
        final SubLObject statistics = ensure_transformation_rule_statistics(rule);
        set_aref(statistics, TWO_INTEGER, ZERO_INTEGER);
        set_aref(statistics, THREE_INTEGER, ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    public static SubLObject clear_transformation_rule_received_counts(final SubLObject rule) {
        assert NIL != assertion_handles.assertion_p(rule) : "assertion_handles.assertion_p(rule) " + "CommonSymbols.NIL != assertion_handles.assertion_p(rule) " + rule;
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = ensure_transformation_rule_statistics(rule);
        set_aref(statistics, FOUR_INTEGER, ZERO_INTEGER);
        set_aref(statistics, FIVE_INTEGER, ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    public static SubLObject clean_transformation_rule_statistics() {
        SubLObject count = ZERO_INTEGER;
        SubLObject dirty_rules = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($transformation_rule_statistics_lock$.getGlobalValue());
            hash_table_utilities.rehash($transformation_rule_statistics_table$.getGlobalValue());
            SubLObject rule = NIL;
            SubLObject statistics = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator($transformation_rule_statistics_table$.getGlobalValue());
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    rule = getEntryKey(cdohash_entry);
                    statistics = getEntryValue(cdohash_entry);
                    if (((NIL == assertion_handles.valid_assertionP(rule, UNPROVIDED)) || (NIL == assertions_high.rule_assertionP(rule))) || aref(statistics, ZERO_INTEGER).isZero()) {
                        dirty_rules = cons(rule, dirty_rules);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            SubLObject cdolist_list_var = dirty_rules;
            SubLObject rule2 = NIL;
            rule2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                clear_transformation_rule_statistics(rule2);
                count = add(count, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                rule2 = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return count;
    }

    public static SubLObject rule_utility_p(final SubLObject v_object) {
        return makeBoolean((v_object.isInteger() && v_object.numGE($int$_100)) && v_object.numLE($int$100));
    }

    public static SubLObject transformation_rule_has_insufficient_historical_utilityP(final SubLObject rule, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject min_rule_utility = inference_datastructures_inference.inference_min_rule_utility(inference);
        if (ZERO_INTEGER.numE($transformation_rule_historical_success_pruning_threshold$.getDynamicValue(thread)) && $int$_100.numE(min_rule_utility)) {
            return NIL;
        }
        return makeBoolean(transformation_rule_success_count(rule).numL($transformation_rule_historical_success_pruning_threshold$.getDynamicValue(thread)) || transformation_rule_historical_utility(rule).numL(min_rule_utility));
    }

    public static SubLObject rule_historical_utility_success_threshold(SubLObject success_fraction) {
        if (success_fraction == UNPROVIDED) {
            success_fraction = ONE_INTEGER;
        }
        final SubLObject rules = transformation_rules_with_statistics($HISTORICAL_UTILITY, UNPROVIDED, UNPROVIDED);
        final SubLObject total_successes = total_transformation_rule_success_count();
        final SubLObject success_threshold = ceiling(multiply(success_fraction, total_successes), UNPROVIDED);
        SubLObject sofar = ZERO_INTEGER;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject successes = transformation_rule_success_count(rule);
            sofar = add(sofar, successes);
            if (sofar.numGE(success_threshold)) {
                return transformation_rule_historical_utility(rule);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return $int$_100;
    }

    public static SubLObject rule_historical_utility_saved_considerations(SubLObject utility_threshold) {
        if (utility_threshold == UNPROVIDED) {
            utility_threshold = ZERO_INTEGER;
        }
        final SubLObject rules = transformation_rules_with_statistics($HISTORICAL_UTILITY, UNPROVIDED, UNPROVIDED);
        SubLObject saved_considerations = ZERO_INTEGER;
        SubLObject lost_successes = ZERO_INTEGER;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!transformation_rule_historical_utility(rule).numGE(utility_threshold)) {
                final SubLObject considered_count = transformation_rule_considered_count(rule);
                final SubLObject success_count = transformation_rule_success_count(rule);
                saved_considerations = add(saved_considerations, considered_count);
                lost_successes = add(lost_successes, success_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return values(saved_considerations, lost_successes);
    }

    public static SubLObject transformation_rules_considered_with_success(SubLObject recentP, SubLObject receivedP) {
        if (recentP == UNPROVIDED) {
            recentP = NIL;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        SubLObject rules = NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if ((NIL != transformation_rules_with_statistics_condition_passesP(rule, recentP, receivedP)) && transformation_rule_success_count(rule).isPositive()) {
                    rules = cons(rule, rules);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(rules, symbol_function($sym27$_), symbol_function(TRANSFORMATION_RULE_SUCCESS_COUNT));
    }

    public static SubLObject transformation_rules_considered_with_no_success() {
        SubLObject rules = NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if ((NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) && (!transformation_rule_success_count(rule).isPositive())) {
                    rules = cons(rule, rules);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(rules, symbol_function($sym27$_), symbol_function(TRANSFORMATION_RULE_CONSIDERED_COUNT));
    }

    public static SubLObject transformation_rules_considered_with_success_from_mt(final SubLObject mt) {
        final SubLObject rules = transformation_rules_considered_with_success(UNPROVIDED, UNPROVIDED);
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
        return nreverse(filtered_rules);
    }

    public static SubLObject transformation_rules_considered_with_no_success_from_mt(final SubLObject mt) {
        final SubLObject rules = transformation_rules_considered_with_no_success();
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
        return nreverse(filtered_rules);
    }

    public static SubLObject transformation_rules_considered_with_no_success_not_in_mts(final SubLObject mts) {
        final SubLObject rules = transformation_rules_considered_with_no_success();
        SubLObject filtered_rules = NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(assertions_high.assertion_mt(rule), mts, symbol_function(HLMT_EQUAL), UNPROVIDED)) {
                filtered_rules = cons(rule, filtered_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return nreverse(filtered_rules);
    }

    public static SubLObject transformation_rule_mts_considered_with_success() {
        final SubLObject success_mts = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if ((NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) && transformation_rule_success_count(rule).isPositive()) {
                    final SubLObject mt = assertions_high.assertion_mt(rule);
                    set.set_add(mt, success_mts);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return set.set_element_list(success_mts);
    }

    public static SubLObject transformation_rule_mts_considered_with_no_success() {
        final SubLObject success_mts = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject considered_mts = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    final SubLObject mt = assertions_high.assertion_mt(rule);
                    set.set_add(mt, considered_mts);
                    if (!transformation_rule_success_count(rule).isPositive()) {
                        continue;
                    }
                    set.set_add(mt, success_mts);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject useless_mts = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(considered_mts);
        SubLObject basis_object;
        SubLObject state;
        SubLObject mt2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            mt2 = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, mt2)) && (NIL == set.set_memberP(mt2, success_mts))) {
                set.set_add(mt2, useless_mts);
            }
        }
        return set.set_element_list(useless_mts);
    }

    public static SubLObject transformation_rules_considered_with_success_proving_predicate(final SubLObject predicate) {
        SubLObject success_rules = NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if ((NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) && transformation_rule_success_count(rule).isPositive()) {
                    SubLObject successP;
                    SubLObject rest;
                    SubLObject asent;
                    for (successP = NIL, rest = NIL, rest = clauses.neg_lits(assertions_high.assertion_cnf(rule)); (NIL == successP) && (NIL != rest); rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = T;
                        }
                    }
                    for (rest = NIL, rest = clauses.pos_lits(assertions_high.assertion_cnf(rule)); (NIL == successP) && (NIL != rest); rest = rest.rest()) {
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
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(success_rules, symbol_function($sym27$_), symbol_function(TRANSFORMATION_RULE_SUCCESS_COUNT));
    }

    public static SubLObject transformation_rules_considered_with_no_success_proving_predicate(final SubLObject predicate) {
        SubLObject failure_rules = NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if ((NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) && (!transformation_rule_success_count(rule).isPositive())) {
                    SubLObject successP;
                    SubLObject rest;
                    SubLObject asent;
                    for (successP = NIL, rest = NIL, rest = clauses.neg_lits(assertions_high.assertion_cnf(rule)); (NIL == successP) && (NIL != rest); rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = T;
                        }
                    }
                    for (rest = NIL, rest = clauses.pos_lits(assertions_high.assertion_cnf(rule)); (NIL == successP) && (NIL != rest); rest = rest.rest()) {
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
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(failure_rules, symbol_function($sym27$_), symbol_function(TRANSFORMATION_RULE_CONSIDERED_COUNT));
    }

    public static SubLObject transformation_rule_predicates_considered_with_success() {
        final SubLObject success_predicates = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    final SubLObject successP = plusp(transformation_rule_success_count(rule));
                    SubLObject cdolist_list_var = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                    SubLObject asent = NIL;
                    asent = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if ((NIL != forts.fort_p(predicate)) && (NIL != successP)) {
                            set.set_add(predicate, success_predicates);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    } 
                    cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(rule));
                    asent = NIL;
                    asent = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if ((NIL != forts.fort_p(predicate)) && (NIL != successP)) {
                            set.set_add(predicate, success_predicates);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    } 
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return set.set_element_list(success_predicates);
    }

    public static SubLObject transformation_rule_predicates_considered_with_no_success() {
        final SubLObject success_predicates = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject considered_predicates = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    final SubLObject successP = plusp(transformation_rule_success_count(rule));
                    SubLObject cdolist_list_var = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                    SubLObject asent = NIL;
                    asent = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
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
                        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
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
            releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject useless_predicates = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(considered_predicates);
        SubLObject basis_object;
        SubLObject state;
        SubLObject predicate2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            predicate2 = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, predicate2)) && (NIL == set.set_memberP(predicate2, success_predicates))) {
                set.set_add(predicate2, useless_predicates);
            }
        }
        return set.set_element_list(useless_predicates);
    }

    public static SubLObject reinforce_transformation_rule(final SubLObject rule, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        increment_transformation_rule_considered_count(rule, T, n, UNPROVIDED);
        increment_transformation_rule_success_count(rule, T, n, UNPROVIDED);
        return rule;
    }

    public static SubLObject reinforce_inference_transformation_rules_in_answers(final SubLObject inference, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        SubLObject cdolist_list_var;
        final SubLObject rules = cdolist_list_var = inference_datastructures_inference.inference_transformation_rules_in_answers(inference);
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            reinforce_transformation_rule(rule, n);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return length(rules);
    }

    public static SubLObject reinforce_inference_transformation_rules(final SubLObject inference, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject considered_rules = inference_datastructures_problem_store.problem_store_transformation_rules(store);
        final SubLObject success_rules = inference_datastructures_inference.inference_transformation_rules_in_answers(inference);
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
        return values(length(success_rules), length(considered_rules));
    }

    public static SubLObject save_transformation_rule_statistics(final SubLObject filename, SubLObject internalP) {
        if (internalP == UNPROVIDED) {
            internalP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clean_transformation_rule_statistics();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$2 = stream;
            final SubLObject count = transformation_rules_with_statistics_count();
            cfasl_output(count, stream_$2);
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
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject load_transformation_rule_statistics(final SubLObject filename, SubLObject mergeP, SubLObject receivedP) {
        if (mergeP == UNPROVIDED) {
            mergeP = T;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        return load_transformation_rule_statistics_int(filename, mergeP, NIL, receivedP);
    }

    public static SubLObject load_transformation_rule_statistics_except_for_rules(final SubLObject filename, final SubLObject rules, SubLObject mergeP, SubLObject receivedP) {
        if (mergeP == UNPROVIDED) {
            mergeP = T;
        }
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        return load_transformation_rule_statistics_int(filename, mergeP, rules, receivedP);
    }

    public static SubLObject load_transformation_rule_statistics_int(final SubLObject filename, final SubLObject mergeP, final SubLObject exclude_rules, final SubLObject receivedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exclude_rule_set = (NIL != exclude_rules) ? set_utilities.construct_set_from_list(exclude_rules, UNPROVIDED, UNPROVIDED) : NIL;
        load_transformation_rule_statistics_bookkeeping(filename, mergeP, receivedP);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$3 = stream;
            SubLObject count;
            SubLObject i;
            for (count = cfasl_input(stream_$3, UNPROVIDED, UNPROVIDED), i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                load_transformation_rule_statistics_for_rule(stream_$3, exclude_rule_set, receivedP);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject load_transformation_rule_statistics_bookkeeping(final SubLObject filename, final SubLObject mergeP, final SubLObject receivedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread))) {
            Errors.error($str46$Transformation_rule_statistics_up);
        }
        if (NIL == mergeP) {
            clear_all_transformation_rule_statistics();
        }
        add_to_transformation_rule_statistics_filename_load_history(filename, receivedP);
        return NIL;
    }

    public static SubLObject save_recent_transformation_rule_statistics(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            final SubLObject count = transformation_rules_with_recent_statistics_count();
            cfasl_output(count, stream_$4);
            SubLObject cdolist_list_var = transformation_rules_with_statistics_helper();
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, T, NIL)) {
                    final SubLObject internalP = NIL;
                    save_transformation_rule_statistics_for_rule(stream_$4, rule, T, NIL, internalP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject save_received_experience(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$5 = stream;
            final SubLObject count = transformation_rules_with_received_statistics_count();
            cfasl_output(count, stream_$5);
            SubLObject cdolist_list_var = transformation_rules_with_statistics_helper();
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, T)) {
                    final SubLObject internalP = NIL;
                    save_transformation_rule_statistics_for_rule(stream_$5, rule, NIL, T, internalP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject save_transformation_rule_statistics_for_rule(final SubLObject stream, final SubLObject rule, final SubLObject recentP, final SubLObject receivedP, final SubLObject internalP) {
        if (NIL != internalP) {
            cfasl_output(rule, stream);
        } else {
            cfasl_output_externalized(rule, stream);
        }
        final SubLObject considered = transformation_rule_something_considered_count(rule, recentP, receivedP);
        final SubLObject success = transformation_rule_something_success_count(rule, recentP, receivedP);
        cfasl_output(considered, stream);
        cfasl_output(success, stream);
        return rule;
    }

    public static SubLObject transformation_rule_something_considered_count(final SubLObject rule, final SubLObject recentP, final SubLObject receivedP) {
        if (NIL != recentP) {
            return transformation_rule_recent_considered_count(rule);
        }
        if (NIL != receivedP) {
            return transformation_rule_received_considered_count(rule);
        }
        return transformation_rule_considered_count(rule);
    }

    public static SubLObject transformation_rule_something_success_count(final SubLObject rule, final SubLObject recentP, final SubLObject receivedP) {
        if (NIL != recentP) {
            return transformation_rule_recent_success_count(rule);
        }
        if (NIL != receivedP) {
            return transformation_rule_received_success_count(rule);
        }
        return transformation_rule_success_count(rule);
    }

    public static SubLObject load_transformation_rule_statistics_for_rule(final SubLObject stream, final SubLObject exclude_rule_set, final SubLObject receivedP) {
        final SubLObject rule = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject considered = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject success = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if ((((NIL != subl_promotions.non_negative_integer_p(considered)) && (NIL != subl_promotions.non_negative_integer_p(success))) && (NIL != assertion_handles.valid_assertionP(rule, UNPROVIDED))) && ((NIL == exclude_rule_set) || (NIL == set.set_memberP(rule, exclude_rule_set)))) {
            increment_transformation_rule_considered_count(rule, NIL, considered, receivedP);
            increment_transformation_rule_success_count(rule, NIL, success, receivedP);
        }
        return rule;
    }

    public static SubLObject show_transformation_rule_statistics(SubLObject stream, SubLObject order) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (order == UNPROVIDED) {
            order = $HISTORICAL_UTILITY;
        }
        final SubLObject rules = transformation_rules_with_statistics(order, UNPROVIDED, UNPROVIDED);
        format(stream, $str47$_________________________________);
        format(stream, $str48$______S_rules__sorted_by__A, length(rules), order);
        format(stream, $str47$_________________________________);
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject considered = transformation_rule_considered_count(rule);
            final SubLObject success = transformation_rule_success_count(rule);
            final SubLObject probability = transformation_rule_success_probability(rule, UNPROVIDED);
            final SubLObject utility = transformation_rule_historical_utility(rule);
            format(stream, $str49$________S__S___S_____utility____S, new SubLObject[]{ success, considered, number_utilities.significant_digits(multiply($int$100, probability), FOUR_INTEGER), utility, rule });
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return length(rules);
    }

    public static SubLObject possibly_save_recent_experience() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != lock_idle_p($save_recent_experience_lock$.getDynamicValue(thread))) {
            return save_recent_experience();
        }
        return NIL;
    }

    public static SubLObject save_recent_experience() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != any_recent_experienceP()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($save_recent_experience_lock$.getDynamicValue(thread));
                save_recent_experience_internal();
            } finally {
                if (NIL != release) {
                    release_lock($save_recent_experience_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject local_experience_transcript() {
        return string_utilities.replace_substring(string_utilities.replace_substring(transcript_utilities.construct_transcript_filename(transcript_utilities.make_local_transcript_filename($$$experience)), $str52$_TS, $str53$_CFASL), $str54$_ts, $str55$_cfasl);
    }

    public static SubLObject save_recent_experience_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject local_experience_transcript = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    local_experience_transcript = local_experience_transcript();
                    if (((NIL != local_experience_transcript) && (NIL != save_recent_transformation_rule_statistics(local_experience_transcript))) && (NIL == error)) {
                        successP = T;
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return successP;
    }

    public static SubLObject replace_and_collate_experience(final SubLObject old_experience_file, final SubLObject new_experience_directory) {
        load_transformation_rule_statistics(old_experience_file, NIL, UNPROVIDED);
        return collate_experience(new_experience_directory);
    }

    public static SubLObject collate_experience(final SubLObject new_experience_directory) {
        return load_all_experience_transcripts_from_directory(new_experience_directory, UNPROVIDED);
    }

    public static SubLObject receive_experience() {
        clear_all_received_transformation_rule_statistics();
        return load_all_experience_transcripts_from_directory(transcript_utilities.transcript_directory(), T);
    }

    public static SubLObject load_received_experience(final SubLObject filename) {
        clear_all_received_transformation_rule_statistics();
        return load_experience_transcript(filename, T);
    }

    public static SubLObject load_all_experience_transcripts_from_directory(final SubLObject directory, SubLObject receivedP) {
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        final SubLObject progress_message_var = $str58$Loading_transformation_rule_stati;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$6 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject filename = NIL;
                    filename = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != transformation_rule_utility_experience_filenameP(filename)) {
                            load_experience_transcript(filename, receivedP);
                            count = add(count, ONE_INTEGER);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        filename = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject transformation_rule_utility_experience_filenameP(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL != string_utilities.ends_with(v_object, $str60$_experience_cfasl, UNPROVIDED)));
    }

    public static SubLObject load_experience_transcript(final SubLObject filename, SubLObject receivedP) {
        if (receivedP == UNPROVIDED) {
            receivedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject message_var = NIL;
        final SubLObject was_appendingP = eval($sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        eval($list62);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        result = load_transformation_rule_statistics(filename, T, receivedP);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                eval(list(CSETQ, $sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str64$_A, message_var);
        }
        return result;
    }

    public static SubLObject transformation_rule_historical_utility(final SubLObject rule) {
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        return rule_historical_utility_from_observations(transformation_rule_success_count(rule), transformation_rule_considered_count(rule));
    }

    public static SubLObject transformation_rule_historical_utility_G(final SubLObject rule1, final SubLObject rule2) {
        return numG(transformation_rule_historical_utility(rule1), transformation_rule_historical_utility(rule2));
    }

    public static SubLObject current_average_rule_historical_success_probability(SubLObject unused_probability) {
        if (unused_probability == UNPROVIDED) {
            unused_probability = ZERO_INTEGER;
        }
        SubLObject success = ZERO_INTEGER;
        SubLObject considered = ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = NIL;
        SubLObject statistics_var = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                rule = getEntryKey(cdohash_entry);
                statistics_var = getEntryValue(cdohash_entry);
                if (NIL != transformation_rules_with_statistics_condition_passesP(rule, NIL, NIL)) {
                    success = add(success, transformation_rule_success_count(rule));
                    considered = add(considered, transformation_rule_considered_count(rule));
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        if (!considered.isPositive()) {
            return unused_probability;
        }
        return divide(success, considered);
    }

    public static SubLObject rule_historical_utility_from_observations(final SubLObject success, final SubLObject considered) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return historical_utility_from_observations(success, considered, $average_rule_historical_success_probability$.getDynamicValue(thread), $rule_historical_success_happiness_scaling_factor$.getDynamicValue(thread));
    }

    public static SubLObject historical_utility_from_observations(final SubLObject success, final SubLObject considered, final SubLObject average_historical_probability, final SubLObject utility_scaling_factor) {
        if (!considered.isPositive()) {
            return ZERO_INTEGER;
        }
        final SubLObject probability = divide(success, considered);
        if (probability.numG(average_historical_probability)) {
            final SubLObject raw_utility = multiply(utility_scaling_factor, divide(subtract(probability, average_historical_probability), subtract(ONE_INTEGER, average_historical_probability)), integer_length(considered));
            final SubLObject utility = truncate(min($int$100, raw_utility), UNPROVIDED);
            return utility;
        }
        if (probability.numL(average_historical_probability)) {
            final SubLObject raw_utility = multiply(utility_scaling_factor, divide(subtract(probability, average_historical_probability), average_historical_probability), integer_length(considered));
            final SubLObject utility = truncate(max($int$_100, raw_utility), UNPROVIDED);
            return utility;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject repair_all_experience_files_in_directory(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        final SubLObject progress_message_var = $str66$Repairing_transformation_rule_sta;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$8 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject filename = NIL;
                    filename = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != transformation_rule_utility_experience_filenameP(filename)) {
                            count = add(count, repair_experience_file(filename));
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        filename = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$8, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject repair_experience_file(final SubLObject filename) {
        SubLObject repaired_rule_count = ZERO_INTEGER;
        final SubLObject load_successP = load_transformation_rule_statistics_ignoring_header(filename, NIL);
        if (NIL != load_successP) {
            repaired_rule_count = clean_transformation_rule_statistics();
            if (NIL != subl_promotions.positive_integer_p(repaired_rule_count)) {
                format_nil.force_format(T, $str67$Repairing__a_spurious_zeroes_in__, repaired_rule_count, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject new_filename = string_utilities.string_subst($str68$_bloated_cfasl, $str55$_cfasl, filename, UNPROVIDED);
                Filesys.rename_file(filename, new_filename);
                save_transformation_rule_statistics(filename, NIL);
            }
        } else {
            Errors.warn($str69$Could_not_load__a, filename);
        }
        return repaired_rule_count;
    }

    public static SubLObject load_transformation_rule_statistics_ignoring_header(final SubLObject filename, final SubLObject mergeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject message_var = NIL;
        final SubLObject was_appendingP = eval($sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        eval($list62);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        load_transformation_rule_statistics_bookkeeping(filename, mergeP, NIL);
                        final SubLObject _prev_bind_0_$10 = $cfasl_stream_extensions_enabled$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = $cfasl_unread_byte$.currentBinding(thread);
                        try {
                            $cfasl_stream_extensions_enabled$.bind(T, thread);
                            $cfasl_unread_byte$.bind(NIL, thread);
                            SubLObject stream = NIL;
                            try {
                                final SubLObject _prev_bind_0_$11 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_binary(filename, $INPUT);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$11, thread);
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str44$Unable_to_open__S, filename);
                                }
                                final SubLObject stream_$12 = stream;
                                final SubLObject count = cfasl_input(stream_$12, UNPROVIDED, UNPROVIDED);
                                for (SubLObject eofP = eq($EOF, cfasl_opcode_peek(stream_$12, NIL, $EOF)); NIL == eofP; eofP = eq($EOF, cfasl_opcode_peek(stream_$12, NIL, $EOF))) {
                                    load_transformation_rule_statistics_for_rule(stream_$12, NIL, NIL);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        } finally {
                            $cfasl_unread_byte$.rebind(_prev_bind_2, thread);
                            $cfasl_stream_extensions_enabled$.rebind(_prev_bind_0_$10, thread);
                        }
                        successP = T;
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                eval(list(CSETQ, $sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str64$_A, message_var);
        }
        return successP;
    }

    public static SubLObject possibly_extend_transformation_rule_utility_table() {
        if (NIL != rule_utility_table_uses_new_formatP()) {
            return NIL;
        }
        SubLObject cdolist_list_var = hash_table_utilities.hash_table_to_alist($transformation_rule_statistics_table$.getGlobalValue());
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject rule = NIL;
            SubLObject vector = NIL;
            destructuring_bind_must_consp(current, datum, $list71);
            rule = current.first();
            current = vector = current.rest();
            final SubLObject new_vector = vector_utilities.extend_vector(vector, TWO_INTEGER, ZERO_INTEGER);
            sethash(rule, $transformation_rule_statistics_table$.getGlobalValue(), new_vector);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject rule_utility_table_uses_new_formatP() {
        final SubLObject vector = hash_table_utilities.hash_table_arbitrary_value($transformation_rule_statistics_table$.getGlobalValue());
        return numE(SIX_INTEGER, length(vector));
    }

    public static SubLObject historically_connected_rules_set_contents(final SubLObject rule) {
        assert NIL != assertion_handles.assertion_p(rule) : "assertion_handles.assertion_p(rule) " + "CommonSymbols.NIL != assertion_handles.assertion_p(rule) " + rule;
        return gethash_without_values(rule, $transformation_rule_historical_connectivity_graph$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject set_historically_connected_rules_set_contents(final SubLObject rule, final SubLObject rule_set_contents) {
        assert NIL != assertion_handles.assertion_p(rule) : "assertion_handles.assertion_p(rule) " + "CommonSymbols.NIL != assertion_handles.assertion_p(rule) " + rule;
        assert NIL != set_contents.set_contents_p(rule_set_contents) : "set_contents.set_contents_p(rule_set_contents) " + "CommonSymbols.NIL != set_contents.set_contents_p(rule_set_contents) " + rule_set_contents;
        return sethash(rule, $transformation_rule_historical_connectivity_graph$.getGlobalValue(), rule_set_contents);
    }

    public static SubLObject rules_historically_connectedP(final SubLObject rule1, final SubLObject rule2) {
        return set_contents.set_contents_memberP(rule2, historically_connected_rules_set_contents(rule1), symbol_function(EQL));
    }

    public static SubLObject historically_connected_rules(final SubLObject rule) {
        return set_contents.set_contents_element_list(historically_connected_rules_set_contents(rule));
    }

    public static SubLObject rule_historical_connectedness_ratio(final SubLObject rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject n = length(rules);
        if (n.numL(TWO_INTEGER)) {
            return ZERO_INTEGER;
        }
        final SubLObject max = number_utilities.choose(n, TWO_INTEGER);
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = rules;
            SubLObject other_rule = NIL;
            other_rule = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                if ((!rule.eql(other_rule)) && (NIL != rules_historically_connectedP(rule, other_rule))) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                other_rule = cdolist_list_var_$14.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == evenp(count))) {
            Errors.error($str77$Got_a_directed_instead_of_undirec, rules);
        }
        count = integerDivide(count, TWO_INTEGER);
        return divide(count, max);
    }

    public static SubLObject rule_historical_connectedness_percentage(final SubLObject rules) {
        return round(multiply($int$100, rule_historical_connectedness_ratio(rules)), UNPROVIDED);
    }

    public static SubLObject note_rules_historically_connected(final SubLObject from_rule, final SubLObject to_rule) {
        if (!from_rule.eql(to_rule)) {
            SubLObject release = NIL;
            try {
                release = seize_lock($transformation_rule_historical_connectivity_graph_lock$.getGlobalValue());
                SubLObject v_set_contents = historically_connected_rules_set_contents(from_rule);
                v_set_contents = set_contents.set_contents_add(to_rule, v_set_contents, symbol_function(EQL));
                set_historically_connected_rules_set_contents(from_rule, v_set_contents);
            } finally {
                if (NIL != release) {
                    release_lock($transformation_rule_historical_connectivity_graph_lock$.getGlobalValue());
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject note_inference_answer_proof_rules(final SubLObject rules) {
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

    public static SubLObject show_transformation_rule_historical_connectivity_graph(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject rules = hash_table_utilities.hash_table_keys($transformation_rule_historical_connectivity_graph$.getGlobalValue());
        SubLObject cdolist_list_var;
        rules = cdolist_list_var = Sort.sort(rules, symbol_function($sym27$_), symbol_function(TRANSFORMATION_RULE_HISTORICAL_UTILITY));
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject connected_rules = historically_connected_rules(rule);
            if (NIL != connected_rules) {
                connected_rules = Sort.sort(connected_rules, symbol_function($sym27$_), symbol_function(TRANSFORMATION_RULE_HISTORICAL_UTILITY));
                format(stream, $str78$____Rule_____S__Connected_Rules__, rule);
                SubLObject cdolist_list_var_$16 = connected_rules;
                SubLObject connected_rule = NIL;
                connected_rule = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    format(stream, $str79$___S, connected_rule);
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    connected_rule = cdolist_list_var_$16.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_show_transformation_rule_historical_connectivity_graph() {
        SubLObject rules = hash_table_utilities.hash_table_keys($transformation_rule_historical_connectivity_graph$.getGlobalValue());
        SubLObject cdolist_list_var;
        rules = cdolist_list_var = Sort.sort(rules, symbol_function($sym27$_), symbol_function(TRANSFORMATION_RULE_HISTORICAL_UTILITY));
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject connected_rules = historically_connected_rules(rule);
            if (NIL != connected_rules) {
                connected_rules = Sort.sort(connected_rules, symbol_function($sym27$_), symbol_function(TRANSFORMATION_RULE_HISTORICAL_UTILITY));
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str80$Rule__);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                cb_form(rule, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str81$Connected_Rules__);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                SubLObject cdolist_list_var_$17 = connected_rules;
                SubLObject connected_rule = NIL;
                connected_rule = cdolist_list_var_$17.first();
                while (NIL != cdolist_list_var_$17) {
                    cb_form(connected_rule, UNPROVIDED, UNPROVIDED);
                    html_newline(UNPROVIDED);
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    connected_rule = cdolist_list_var_$17.first();
                } 
                html_newline(UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject save_transformation_rule_historical_connectivity_graph(final SubLObject filename, SubLObject externalizedP) {
        if (externalizedP == UNPROVIDED) {
            externalizedP = NIL;
        }
        if (NIL != externalizedP) {
            return cfasl_utilities.cfasl_save_externalized($transformation_rule_historical_connectivity_graph$.getGlobalValue(), filename);
        }
        return cfasl_utilities.cfasl_save($transformation_rule_historical_connectivity_graph$.getGlobalValue(), filename);
    }

    public static SubLObject load_transformation_rule_historical_connectivity_graph(final SubLObject filename) {
        $transformation_rule_historical_connectivity_graph$.setGlobalValue(cfasl_utilities.cfasl_load(filename));
        return hash_table_size($transformation_rule_historical_connectivity_graph$.getGlobalValue());
    }

    public static SubLObject clear_hl_module_expand_counts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary($hl_module_expand_counts$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject noting_hl_module_expand_counts(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list83, append(body, NIL));
    }

    public static SubLObject hl_module_expand_count(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($hl_module_expand_counts$.getDynamicValue(thread), hl_module, ZERO_INTEGER);
    }

    public static SubLObject all_hl_module_expand_counts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module_expand_counts = dictionary_utilities.dictionary_to_alist($hl_module_expand_counts$.getDynamicValue(thread));
        return Sort.sort(hl_module_expand_counts, symbol_function($sym27$_), symbol_function(CDR));
    }

    public static SubLObject cinc_hl_module_expand_count(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $hl_module_expand_counts_enabledP$.getDynamicValue(thread)) {
            SubLObject count = dictionary.dictionary_lookup($hl_module_expand_counts$.getDynamicValue(thread), hl_module, ZERO_INTEGER);
            count = add(count, ONE_INTEGER);
            dictionary.dictionary_enter($hl_module_expand_counts$.getDynamicValue(thread), hl_module, count);
        }
        return NIL;
    }

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
            final SubLObject datum = current = hl_module_expand_count_info;
            SubLObject hl_module = NIL;
            SubLObject count = NIL;
            destructuring_bind_must_consp(current, datum, $list85);
            hl_module = current.first();
            current = count = current.rest();
            format(stream, $str86$___4_D__S__, count, hl_module);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module_expand_count_info = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cinc_module_expand_count(final SubLObject name) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        return cinc_hl_module_expand_count(hl_module);
    }

    public static SubLObject clear_asked_query_queue() {
        queues.clear_queue($asked_queries_queue$.getGlobalValue());
        return NIL;
    }

    public static SubLObject possibly_enqueue_asked_query(final SubLObject query_sentence, final SubLObject query_mt, final SubLObject query_properties) {
        SubLObject result = NIL;
        if ((NIL != save_asked_queriesP()) && (NIL == operation_queues.within_a_remote_opP())) {
            result = enqueue_asked_query(query_sentence, query_mt, query_properties);
        }
        return result;
    }

    public static SubLObject enqueue_asked_query(final SubLObject query_sentence, final SubLObject query_mt, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_info = list(query_sentence, query_mt, list_utilities.plist_except(query_properties, $list90));
        SubLObject release = NIL;
        try {
            release = seize_lock($save_recent_asked_queries_lock$.getDynamicValue(thread));
            queues.enqueue(query_info, $asked_queries_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($save_recent_asked_queries_lock$.getDynamicValue(thread));
            }
        }
        if (queues.queue_size($asked_queries_queue$.getGlobalValue()).numGE($asked_queries_queue_limit$.getGlobalValue())) {
            save_recent_asked_queries();
        }
        return query_info;
    }

    public static SubLObject possibly_enqueue_asked_query_from_inference(final SubLObject inference) {
        SubLObject result = NIL;
        if ((NIL != save_asked_queriesP()) && (NIL == operation_queues.within_a_remote_opP())) {
            result = enqueue_asked_query_from_inference(inference);
        }
        return result;
    }

    public static SubLObject enqueue_asked_query_from_inference(final SubLObject inference) {
        final SubLObject el_query_sentence = inference_datastructures_inference.inference_el_query(inference);
        final SubLObject query_sentence = (NIL != el_query_sentence) ? el_query_sentence : inference_datastructures_inference.inference_hl_query(inference);
        final SubLObject query_mt = inference_datastructures_inference.inference_mt(inference);
        final SubLObject query_properties = inference_datastructures_inference.inference_input_query_properties(inference);
        return enqueue_asked_query(query_sentence, query_mt, query_properties);
    }

    public static SubLObject possibly_save_recent_asked_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != lock_idle_p($save_recent_asked_queries_lock$.getDynamicValue(thread)) ? save_recent_asked_queries() : NIL;
    }

    public static SubLObject load_asked_queries(final SubLObject filename, SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == subl_promotions.positive_integer_p(n)) {
            n = number_utilities.positive_infinity();
        }
        SubLObject query_infos = NIL;
        SubLObject doneP = NIL;
        SubLObject done_varP = NIL;
        SubLObject i = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            final SubLObject input_stream = stream;
            final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
            try {
                $cfasl_common_symbols$.bind(NIL, thread);
                cfasl_set_common_symbols(asked_query_common_symbols());
                while (NIL == done_varP) {
                    final SubLObject query_info = load_asked_query_from_stream(input_stream);
                    if ($EOF == query_info) {
                        done_varP = T;
                    } else
                        if (query_info.isString()) {
                            Errors.warn($str91$Read_invalid_query_info__s, query_info);
                        } else {
                            final SubLObject i_$18 = i;
                            if (NIL != number_utilities.potentially_infinite_integer_GE(i_$18, n)) {
                                doneP = T;
                            }
                            if (NIL == doneP) {
                                query_infos = cons(query_info, query_infos);
                            }
                            i = add(i, ONE_INTEGER);
                        }

                    if (NIL != doneP) {
                        done_varP = doneP;
                    }
                } 
            } finally {
                $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return nreverse(query_infos);
    }

    public static SubLObject query_info_p(final SubLObject v_object) {
        if (NIL != list_utilities.tripleP(v_object)) {
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            SubLObject query_properties = NIL;
            destructuring_bind_must_consp(v_object, v_object, $list92);
            sentence = v_object.first();
            SubLObject current = v_object.rest();
            destructuring_bind_must_consp(current, v_object, $list92);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list92);
            query_properties = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(((NIL != possibly_cycl_sentence_p(sentence)) && ((NIL == mt) || (NIL != hlmt.possibly_mt_p(mt)))) && (NIL != list_utilities.property_list_p(query_properties)));
            }
            cdestructuring_bind_error(v_object, $list92);
        }
        return NIL;
    }

    public static SubLObject valid_query_infoP(final SubLObject v_object) {
        if (((NIL != query_info_p(v_object)) && (NIL == list_utilities.tree_find(cfasl_kb_methods.cfasl_invalid_constant(), v_object, UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.tree_find(cfasl_kb_methods.cfasl_invalid_nart(), v_object, UNPROVIDED, UNPROVIDED))) {
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            SubLObject query_properties = NIL;
            destructuring_bind_must_consp(v_object, v_object, $list92);
            sentence = v_object.first();
            SubLObject current = v_object.rest();
            destructuring_bind_must_consp(current, v_object, $list92);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list92);
            query_properties = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((((NIL != clauses.dnf_clauses_p(sentence)) || (NIL != cycl_grammar.cycl_sentence_p(sentence))) && ((NIL == mt) || (NIL != hlmt.hlmt_p(mt)))) && (NIL != inference_datastructures_enumerated_types.query_properties_p(query_properties))) {
                    return T;
                }
            } else {
                cdestructuring_bind_error(v_object, $list92);
            }
        }
        return NIL;
    }

    public static SubLObject load_asked_query(final SubLObject filename) {
        return load_asked_queries(filename, ONE_INTEGER).first();
    }

    public static SubLObject save_recent_asked_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject any_savedP = NIL;
        if (NIL != any_recent_asked_queriesP()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($save_recent_asked_queries_lock$.getDynamicValue(thread));
                any_savedP = save_recent_asked_queries_int();
            } finally {
                if (NIL != release) {
                    release_lock($save_recent_asked_queries_lock$.getDynamicValue(thread));
                }
            }
        }
        return any_savedP;
    }

    public static SubLObject any_recent_asked_queriesP() {
        return makeBoolean(NIL == queues.queue_empty_p($asked_queries_queue$.getGlobalValue()));
    }

    public static SubLObject local_asked_queries_transcript() {
        return string_utilities.replace_substring(string_utilities.replace_substring(transcript_utilities.construct_transcript_filename(transcript_utilities.make_local_transcript_filename($str93$asked_queries)), $str52$_TS, $str53$_CFASL), $str54$_ts, $str55$_cfasl);
    }

    public static SubLObject save_recent_asked_queries_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject error = NIL;
        SubLObject local_asked_queries_transcript = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    local_asked_queries_transcript = local_asked_queries_transcript();
                    if (NIL != local_asked_queries_transcript) {
                        successP = save_recent_asked_queries_to_file(local_asked_queries_transcript);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return makeBoolean((NIL != successP) && (NIL == error));
    }

    public static SubLObject save_recent_asked_queries_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $APPEND);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$19 = stream;
            for (SubLObject q = $asked_queries_queue$.getGlobalValue(), done_var = queues.queue_empty_p(q); NIL == done_var; done_var = queues.queue_empty_p(q)) {
                final SubLObject query = queues.dequeue(q);
                write_asked_query_to_stream(stream_$19, query, T);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return T;
    }

    public static SubLObject write_asked_query_to_stream(final SubLObject stream, final SubLObject query_info, final SubLObject externalizedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(asked_query_common_symbols_simple());
            cfasl_output_maybe_externalized(query_info, stream, externalizedP);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return query_info;
    }

    public static SubLObject load_asked_query_from_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_info = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    query_info = cfasl_input(stream, NIL, UNPROVIDED);
                    if ((($EOF != query_info) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == query_info_p(query_info))) {
                        throw new AssertionError(query_info);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            query_info = error;
        }
        return query_info;
    }

    public static SubLObject asked_queries_filenameP(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL != string_utilities.ends_with(v_object, $str98$local_asked_queries_cfasl, UNPROVIDED)));
    }

    public static SubLObject asked_query_common_symbols() {
        if (NIL == $asked_query_common_symbols$.getGlobalValue()) {
            $asked_query_common_symbols$.setGlobalValue(inference_datastructures_enumerated_types.all_query_properties());
        }
        return $asked_query_common_symbols$.getGlobalValue();
    }

    public static SubLObject asked_query_common_symbols_simple() {
        if (!$asked_query_common_symbols_simple$.getGlobalValue().isVector()) {
            $asked_query_common_symbols_simple$.setGlobalValue(apply(VECTOR, asked_query_common_symbols()));
        }
        return $asked_query_common_symbols_simple$.getGlobalValue();
    }

    public static SubLObject show_asked_query_statistics(final SubLObject directories) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject directory_stats = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject filename_stats = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject query_info_stats = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject dot_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = directories;
        SubLObject directory = NIL;
        directory = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format_nil.force_format(T, $str102$Entering__s__, directory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
            SubLObject directory_contents_var = Filesys.directory(directory, T);
            final SubLObject progress_message_var = NIL;
            final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                if (NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$20 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject filename = NIL;
                        filename = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL != asked_queries_filenameP(filename)) {
                                SubLObject done_varP = NIL;
                                SubLObject i = ZERO_INTEGER;
                                SubLObject stream = NIL;
                                try {
                                    final SubLObject _prev_bind_0_$21 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_binary(filename, $INPUT);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$21, thread);
                                    }
                                    if (!stream.isStream()) {
                                        Errors.error($str44$Unable_to_open__S, filename);
                                    }
                                    final SubLObject input_stream = stream;
                                    final SubLObject _prev_bind_0_$22 = $cfasl_common_symbols$.currentBinding(thread);
                                    try {
                                        $cfasl_common_symbols$.bind(NIL, thread);
                                        cfasl_set_common_symbols(asked_query_common_symbols());
                                        while (NIL == done_varP) {
                                            final SubLObject query_info = load_asked_query_from_stream(input_stream);
                                            if ($EOF == query_info) {
                                                done_varP = T;
                                            } else
                                                if (query_info.isString()) {
                                                    Errors.warn($str91$Read_invalid_query_info__s, query_info);
                                                } else {
                                                    dot_count = add(dot_count, ONE_INTEGER);
                                                    if (dot_count.numE($int$1000)) {
                                                        format_nil.force_format(T, $str104$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        dot_count = ZERO_INTEGER;
                                                    }
                                                    dictionary_utilities.dictionary_increment(directory_stats, directory, UNPROVIDED);
                                                    dictionary_utilities.dictionary_increment(filename_stats, filename, UNPROVIDED);
                                                    dictionary_utilities.dictionary_increment(query_info_stats, query_info, UNPROVIDED);
                                                    i = add(i, ONE_INTEGER);
                                                }

                                        } 
                                    } finally {
                                        $cfasl_common_symbols$.rebind(_prev_bind_0_$22, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                    }
                                }
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            filename = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$20, thread);
                }
            } finally {
                $silent_progressP$.rebind(_prev_bind_0, thread);
            }
            show_asked_query_statistics_int(directory_stats, filename_stats, query_info_stats);
            cdolist_list_var = cdolist_list_var.rest();
            directory = cdolist_list_var.first();
        } 
        return list(directory_stats, filename_stats, query_info_stats);
    }

    public static SubLObject show_asked_query_statistics_int(final SubLObject directory_stats, final SubLObject filename_stats, final SubLObject query_info_stats) {
        format_nil.force_format(T, $str105$__Number_of_saved_queries_per_dir, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        dictionary_utilities.print_dictionary_contents(directory_stats, UNPROVIDED);
        format_nil.force_format(T, $str106$__Histogram_of_saved_queries_per_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        list_utilities.pretty_print_histogram(list_utilities.histogram(dictionary.dictionary_values(filename_stats), symbol_function($sym31$_), symbol_function(EQL), symbol_function($sym31$_)));
        format_nil.force_format(T, $str107$__Total_number_of_saved_queries__, number_utilities.summation(dictionary.dictionary_values(query_info_stats)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(T, $str108$__Total_number_of_unique_saved_qu, dictionary.dictionary_length(query_info_stats), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject mts_of_inference_answer(final SubLObject v_answer) {
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$25 = mts_of_inference_answer_justification(justification);
            SubLObject mt = NIL;
            mt = cdolist_list_var_$25.first();
            while (NIL != cdolist_list_var_$25) {
                final SubLObject item_var = mt;
                if (NIL == member(item_var, mts, EQUAL, symbol_function(IDENTITY))) {
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

    public static SubLObject mts_of_inference_answer_justification(final SubLObject justification) {
        final SubLObject supports = append(inference_datastructures_inference.inference_answer_justification_supports(justification), inference_datastructures_inference.inference_answer_justification_pragmatic_supports(justification));
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = Mapping.mapcar(SUPPORT_MT, supports);
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = mt;
            if (NIL == member(item_var, mts, EQUAL, symbol_function(IDENTITY))) {
                mts = cons(item_var, mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        mts = remove($$InferencePSC, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return mts;
    }

    public static SubLObject max_floor_mts_of_inference(final SubLObject inference, SubLObject preserve_multiple_justificationsP) {
        if (preserve_multiple_justificationsP == UNPROVIDED) {
            preserve_multiple_justificationsP = NIL;
        }
        SubLObject mt_tuples = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$26 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$26);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject item_var;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        item_var = max_floor_mts_of_inference_answer(v_answer, preserve_multiple_justificationsP);
                        if (NIL == member(item_var, mt_tuples, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            mt_tuples = cons(item_var, mt_tuples);
                        }
                    }
                }
            }
            final SubLObject idx_$27 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$27)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$27);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        final SubLObject item_var2 = max_floor_mts_of_inference_answer(v_answer2, preserve_multiple_justificationsP);
                        if (NIL == member(item_var2, mt_tuples, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            mt_tuples = cons(item_var2, mt_tuples);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return conjoin_mt_tuples(mt_tuples);
    }

    public static SubLObject max_floor_mts_of_inference_answer(final SubLObject v_answer, SubLObject preserve_multiple_justificationsP) {
        if (preserve_multiple_justificationsP == UNPROVIDED) {
            preserve_multiple_justificationsP = NIL;
        }
        SubLObject mt_tuples = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = max_floor_mts_of_inference_answer_justification(justification);
            if (NIL == member(item_var, mt_tuples, symbol_function(EQUAL), symbol_function(IDENTITY))) {
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

    public static SubLObject conjoin_mt_tuples(final SubLObject mt_tuples) {
        SubLObject mts = NIL;
        if (NIL != list_utilities.singletonP(mt_tuples)) {
            mts = mt_tuples.first();
        } else
            if (NIL != list_utilities.every_in_list($sym113$SINGLETON_, mt_tuples, UNPROVIDED)) {
                final SubLObject justification_mts = Mapping.mapcar(FIRST, mt_tuples);
                mts = genl_mts.max_floor_mts(justification_mts, UNPROVIDED, UNPROVIDED);
            } else {
                final SubLObject singletons = list_utilities.flatten(list_utilities.remove_if_not($sym113$SINGLETON_, mt_tuples, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                final SubLObject max_floor_mts_of_singletons = genl_mts.max_floor_mts(singletons, UNPROVIDED, UNPROVIDED);
                final SubLObject remaining_tuples = remove_if($sym113$SINGLETON_, mt_tuples, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject unsubsumed_tuples = NIL;
                if (NIL == list_utilities.singletonP(max_floor_mts_of_singletons)) {
                    Errors.warn($str115$non_singleton_max_floor_mts_of_si, max_floor_mts_of_singletons, singletons);
                    return NIL;
                }
                final SubLObject max_floor_of_singletons = max_floor_mts_of_singletons.first();
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
                    final SubLObject var = unsubsumed_tuple;
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

    public static SubLObject disjoin_mt_tuples(final SubLObject mt_tuples) {
        return genl_mts.max_mts(apply(APPEND, mt_tuples), UNPROVIDED);
    }

    public static SubLObject max_floor_mts_of_inference_answer_justification(final SubLObject justification) {
        SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
        supports = cycl_utilities.expression_subst($$InferencePSC, $$EverythingPSC, supports, UNPROVIDED, UNPROVIDED);
        return max_floor_mts_of_supports(supports);
    }

    public static SubLObject max_floor_mts_of_supports(final SubLObject supports) {
        SubLObject mts = NIL;
        SubLObject cdolist_list_var;
        final SubLObject mt_support_combinations = cdolist_list_var = forward.compute_all_mt_and_support_combinations(supports, UNPROVIDED);
        SubLObject mt_support_combination = NIL;
        mt_support_combination = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = mt_support_combination;
            SubLObject concluded_mts = NIL;
            SubLObject support_combination = NIL;
            destructuring_bind_must_consp(current, datum, $list119);
            concluded_mts = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list119);
            support_combination = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$29 = concluded_mts;
                SubLObject concluded_mt = NIL;
                concluded_mt = cdolist_list_var_$29.first();
                while (NIL != cdolist_list_var_$29) {
                    final SubLObject item_var = concluded_mt;
                    if (NIL == member(item_var, mts, symbol_function($sym120$HLMT_EQUAL_), symbol_function(IDENTITY))) {
                        mts = cons(item_var, mts);
                    }
                    cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                    concluded_mt = cdolist_list_var_$29.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list119);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_support_combination = cdolist_list_var.first();
        } 
        return nreverse(mts);
    }

    public static SubLObject declare_inference_analysis_file() {
        declareFunction(me, "problem_store_estimated_problem_reuses_count", "PROBLEM-STORE-ESTIMATED-PROBLEM-REUSES-COUNT", 1, 0, false);
        declareFunction(me, "problem_store_estimated_reuse_ratio", "PROBLEM-STORE-ESTIMATED-REUSE-RATIO", 1, 0, false);
        declareFunction(me, "clear_transformation_rule_statistics_filename_load_history", "CLEAR-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 0, 0, false);
        declareFunction(me, "clear_transformation_rule_statistics_received_filename_load_history", "CLEAR-TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY", 0, 0, false);
        declareFunction(me, "add_to_transformation_rule_statistics_filename_load_history", "ADD-TO-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 2, 0, false);
        declareFunction(me, "transformation_rule_statistics_filename_load_history", "TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 0, 0, false);
        declareFunction(me, "transformation_rule_statistics_received_filename_load_history", "TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY", 0, 0, false);
        declareFunction(me, "transformation_rule_statistics_update_enabledP", "TRANSFORMATION-RULE-STATISTICS-UPDATE-ENABLED?", 0, 0, false);
        declareFunction(me, "enable_transformation_rule_statistics_update", "ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 0, false);
        declareFunction(me, "disable_transformation_rule_statistics_update", "DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 0, false);
        declareMacro(me, "do_transformation_rules_with_statistics", "DO-TRANSFORMATION-RULES-WITH-STATISTICS");
        declareFunction(me, "transformation_rule_statistics_table", "TRANSFORMATION-RULE-STATISTICS-TABLE", 0, 0, false);
        declareFunction(me, "transformation_rules_with_statistics_helper", "TRANSFORMATION-RULES-WITH-STATISTICS-HELPER", 0, 0, false);
        declareFunction(me, "transformation_rules_with_statistics_condition_passesP", "TRANSFORMATION-RULES-WITH-STATISTICS-CONDITION-PASSES?", 3, 0, false);
        declareFunction(me, "new_transformation_rule_statistics", "NEW-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction(me, "clear_all_transformation_rule_statistics", "CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction(me, "clear_transformation_rule_statistics", "CLEAR-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction(me, "transformation_rules_with_statistics_count", "TRANSFORMATION-RULES-WITH-STATISTICS-COUNT", 0, 0, false);
        declareFunction(me, "get_transformation_rule_statistics", "GET-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction(me, "ensure_transformation_rule_statistics", "ENSURE-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction(me, "transformation_rules_with_statistics", "TRANSFORMATION-RULES-WITH-STATISTICS", 0, 3, false);
        declareFunction(me, "transformation_rules_with_recent_statistics", "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS", 0, 0, false);
        declareFunction(me, "transformation_rules_with_received_statistics", "TRANSFORMATION-RULES-WITH-RECEIVED-STATISTICS", 0, 0, false);
        declareFunction(me, "transformation_rules_with_recent_statistics_count", "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS-COUNT", 0, 0, false);
        declareFunction(me, "transformation_rules_with_received_statistics_count", "TRANSFORMATION-RULES-WITH-RECEIVED-STATISTICS-COUNT", 0, 0, false);
        declareFunction(me, "any_recent_experienceP", "ANY-RECENT-EXPERIENCE?", 0, 0, false);
        declareFunction(me, "any_received_experienceP", "ANY-RECEIVED-EXPERIENCE?", 0, 0, false);
        declareFunction(me, "total_transformation_rule_considered_count", "TOTAL-TRANSFORMATION-RULE-CONSIDERED-COUNT", 0, 0, false);
        declareFunction(me, "total_transformation_rule_recent_considered_count", "TOTAL-TRANSFORMATION-RULE-RECENT-CONSIDERED-COUNT", 0, 0, false);
        declareFunction(me, "total_transformation_rule_received_considered_count", "TOTAL-TRANSFORMATION-RULE-RECEIVED-CONSIDERED-COUNT", 0, 0, false);
        declareFunction(me, "transformation_rule_considered_count", "TRANSFORMATION-RULE-CONSIDERED-COUNT", 1, 0, false);
        declareFunction(me, "transformation_rule_recent_considered_count", "TRANSFORMATION-RULE-RECENT-CONSIDERED-COUNT", 1, 0, false);
        declareFunction(me, "transformation_rule_received_considered_count", "TRANSFORMATION-RULE-RECEIVED-CONSIDERED-COUNT", 1, 0, false);
        declareFunction(me, "transformation_rule_has_recent_statisticsP", "TRANSFORMATION-RULE-HAS-RECENT-STATISTICS?", 1, 0, false);
        declareFunction(me, "transformation_rule_has_received_statisticsP", "TRANSFORMATION-RULE-HAS-RECEIVED-STATISTICS?", 1, 0, false);
        declareFunction(me, "total_transformation_rule_success_count", "TOTAL-TRANSFORMATION-RULE-SUCCESS-COUNT", 0, 0, false);
        declareFunction(me, "total_transformation_rule_recent_success_count", "TOTAL-TRANSFORMATION-RULE-RECENT-SUCCESS-COUNT", 0, 0, false);
        declareFunction(me, "total_transformation_rule_received_success_count", "TOTAL-TRANSFORMATION-RULE-RECEIVED-SUCCESS-COUNT", 0, 0, false);
        declareFunction(me, "transformation_rule_success_count", "TRANSFORMATION-RULE-SUCCESS-COUNT", 1, 0, false);
        declareFunction(me, "transformation_rule_recent_success_count", "TRANSFORMATION-RULE-RECENT-SUCCESS-COUNT", 1, 0, false);
        declareFunction(me, "transformation_rule_received_success_count", "TRANSFORMATION-RULE-RECEIVED-SUCCESS-COUNT", 1, 0, false);
        declareFunction(me, "transformation_rule_success_probability", "TRANSFORMATION-RULE-SUCCESS-PROBABILITY", 1, 1, false);
        declareFunction(me, "increment_transformation_rule_considered_count", "INCREMENT-TRANSFORMATION-RULE-CONSIDERED-COUNT", 2, 2, false);
        declareFunction(me, "increment_transformation_rule_success_count", "INCREMENT-TRANSFORMATION-RULE-SUCCESS-COUNT", 2, 2, false);
        declareFunction(me, "clear_all_recent_transformation_rule_statistics", "CLEAR-ALL-RECENT-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction(me, "clear_all_received_transformation_rule_statistics", "CLEAR-ALL-RECEIVED-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction(me, "clear_transformation_rule_recent_counts", "CLEAR-TRANSFORMATION-RULE-RECENT-COUNTS", 1, 0, false);
        declareFunction(me, "clear_transformation_rule_received_counts", "CLEAR-TRANSFORMATION-RULE-RECEIVED-COUNTS", 1, 0, false);
        declareFunction(me, "clean_transformation_rule_statistics", "CLEAN-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        declareFunction(me, "rule_utility_p", "RULE-UTILITY-P", 1, 0, false);
        declareFunction(me, "transformation_rule_has_insufficient_historical_utilityP", "TRANSFORMATION-RULE-HAS-INSUFFICIENT-HISTORICAL-UTILITY?", 2, 0, false);
        declareFunction(me, "rule_historical_utility_success_threshold", "RULE-HISTORICAL-UTILITY-SUCCESS-THRESHOLD", 0, 1, false);
        declareFunction(me, "rule_historical_utility_saved_considerations", "RULE-HISTORICAL-UTILITY-SAVED-CONSIDERATIONS", 0, 1, false);
        declareFunction(me, "transformation_rules_considered_with_success", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS", 0, 2, false);
        declareFunction(me, "transformation_rules_considered_with_no_success", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
        declareFunction(me, "transformation_rules_considered_with_success_from_mt", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS-FROM-MT", 1, 0, false);
        declareFunction(me, "transformation_rules_considered_with_no_success_from_mt", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-FROM-MT", 1, 0, false);
        declareFunction(me, "transformation_rules_considered_with_no_success_not_in_mts", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-NOT-IN-MTS", 1, 0, false);
        declareFunction(me, "transformation_rule_mts_considered_with_success", "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-SUCCESS", 0, 0, false);
        declareFunction(me, "transformation_rule_mts_considered_with_no_success", "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
        declareFunction(me, "transformation_rules_considered_with_success_proving_predicate", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS-PROVING-PREDICATE", 1, 0, false);
        declareFunction(me, "transformation_rules_considered_with_no_success_proving_predicate", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-PROVING-PREDICATE", 1, 0, false);
        declareFunction(me, "transformation_rule_predicates_considered_with_success", "TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-SUCCESS", 0, 0, false);
        declareFunction(me, "transformation_rule_predicates_considered_with_no_success", "TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
        declareFunction(me, "reinforce_transformation_rule", "REINFORCE-TRANSFORMATION-RULE", 1, 1, false);
        declareFunction(me, "reinforce_inference_transformation_rules_in_answers", "REINFORCE-INFERENCE-TRANSFORMATION-RULES-IN-ANSWERS", 1, 1, false);
        declareFunction(me, "reinforce_inference_transformation_rules", "REINFORCE-INFERENCE-TRANSFORMATION-RULES", 1, 1, false);
        declareFunction(me, "save_transformation_rule_statistics", "SAVE-TRANSFORMATION-RULE-STATISTICS", 1, 1, false);
        declareFunction(me, "load_transformation_rule_statistics", "LOAD-TRANSFORMATION-RULE-STATISTICS", 1, 2, false);
        declareFunction(me, "load_transformation_rule_statistics_except_for_rules", "LOAD-TRANSFORMATION-RULE-STATISTICS-EXCEPT-FOR-RULES", 2, 2, false);
        declareFunction(me, "load_transformation_rule_statistics_int", "LOAD-TRANSFORMATION-RULE-STATISTICS-INT", 4, 0, false);
        declareFunction(me, "load_transformation_rule_statistics_bookkeeping", "LOAD-TRANSFORMATION-RULE-STATISTICS-BOOKKEEPING", 3, 0, false);
        declareFunction(me, "save_recent_transformation_rule_statistics", "SAVE-RECENT-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction(me, "save_received_experience", "SAVE-RECEIVED-EXPERIENCE", 1, 0, false);
        declareFunction(me, "save_transformation_rule_statistics_for_rule", "SAVE-TRANSFORMATION-RULE-STATISTICS-FOR-RULE", 5, 0, false);
        declareFunction(me, "transformation_rule_something_considered_count", "TRANSFORMATION-RULE-SOMETHING-CONSIDERED-COUNT", 3, 0, false);
        declareFunction(me, "transformation_rule_something_success_count", "TRANSFORMATION-RULE-SOMETHING-SUCCESS-COUNT", 3, 0, false);
        declareFunction(me, "load_transformation_rule_statistics_for_rule", "LOAD-TRANSFORMATION-RULE-STATISTICS-FOR-RULE", 3, 0, false);
        declareFunction(me, "show_transformation_rule_statistics", "SHOW-TRANSFORMATION-RULE-STATISTICS", 0, 2, false);
        declareFunction(me, "possibly_save_recent_experience", "POSSIBLY-SAVE-RECENT-EXPERIENCE", 0, 0, false);
        declareFunction(me, "save_recent_experience", "SAVE-RECENT-EXPERIENCE", 0, 0, false);
        declareFunction(me, "local_experience_transcript", "LOCAL-EXPERIENCE-TRANSCRIPT", 0, 0, false);
        declareFunction(me, "save_recent_experience_internal", "SAVE-RECENT-EXPERIENCE-INTERNAL", 0, 0, false);
        declareFunction(me, "replace_and_collate_experience", "REPLACE-AND-COLLATE-EXPERIENCE", 2, 0, false);
        declareFunction(me, "collate_experience", "COLLATE-EXPERIENCE", 1, 0, false);
        declareFunction(me, "receive_experience", "RECEIVE-EXPERIENCE", 0, 0, false);
        declareFunction(me, "load_received_experience", "LOAD-RECEIVED-EXPERIENCE", 1, 0, false);
        declareFunction(me, "load_all_experience_transcripts_from_directory", "LOAD-ALL-EXPERIENCE-TRANSCRIPTS-FROM-DIRECTORY", 1, 1, false);
        declareFunction(me, "transformation_rule_utility_experience_filenameP", "TRANSFORMATION-RULE-UTILITY-EXPERIENCE-FILENAME?", 1, 0, false);
        declareFunction(me, "load_experience_transcript", "LOAD-EXPERIENCE-TRANSCRIPT", 1, 1, false);
        declareFunction(me, "transformation_rule_historical_utility", "TRANSFORMATION-RULE-HISTORICAL-UTILITY", 1, 0, false);
        declareFunction(me, "transformation_rule_historical_utility_G", "TRANSFORMATION-RULE-HISTORICAL-UTILITY->", 2, 0, false);
        declareFunction(me, "current_average_rule_historical_success_probability", "CURRENT-AVERAGE-RULE-HISTORICAL-SUCCESS-PROBABILITY", 0, 1, false);
        declareFunction(me, "rule_historical_utility_from_observations", "RULE-HISTORICAL-UTILITY-FROM-OBSERVATIONS", 2, 0, false);
        declareFunction(me, "historical_utility_from_observations", "HISTORICAL-UTILITY-FROM-OBSERVATIONS", 4, 0, false);
        declareFunction(me, "repair_all_experience_files_in_directory", "REPAIR-ALL-EXPERIENCE-FILES-IN-DIRECTORY", 1, 0, false);
        declareFunction(me, "repair_experience_file", "REPAIR-EXPERIENCE-FILE", 1, 0, false);
        declareFunction(me, "load_transformation_rule_statistics_ignoring_header", "LOAD-TRANSFORMATION-RULE-STATISTICS-IGNORING-HEADER", 2, 0, false);
        declareFunction(me, "possibly_extend_transformation_rule_utility_table", "POSSIBLY-EXTEND-TRANSFORMATION-RULE-UTILITY-TABLE", 0, 0, false);
        declareFunction(me, "rule_utility_table_uses_new_formatP", "RULE-UTILITY-TABLE-USES-NEW-FORMAT?", 0, 0, false);
        declareFunction(me, "historically_connected_rules_set_contents", "HISTORICALLY-CONNECTED-RULES-SET-CONTENTS", 1, 0, false);
        declareFunction(me, "set_historically_connected_rules_set_contents", "SET-HISTORICALLY-CONNECTED-RULES-SET-CONTENTS", 2, 0, false);
        declareFunction(me, "rules_historically_connectedP", "RULES-HISTORICALLY-CONNECTED?", 2, 0, false);
        declareFunction(me, "historically_connected_rules", "HISTORICALLY-CONNECTED-RULES", 1, 0, false);
        declareFunction(me, "rule_historical_connectedness_ratio", "RULE-HISTORICAL-CONNECTEDNESS-RATIO", 1, 0, false);
        declareFunction(me, "rule_historical_connectedness_percentage", "RULE-HISTORICAL-CONNECTEDNESS-PERCENTAGE", 1, 0, false);
        declareFunction(me, "note_rules_historically_connected", "NOTE-RULES-HISTORICALLY-CONNECTED", 2, 0, false);
        declareFunction(me, "note_inference_answer_proof_rules", "NOTE-INFERENCE-ANSWER-PROOF-RULES", 1, 0, false);
        declareFunction(me, "show_transformation_rule_historical_connectivity_graph", "SHOW-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 0, 1, false);
        declareFunction(me, "cb_show_transformation_rule_historical_connectivity_graph", "CB-SHOW-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 0, 0, false);
        declareFunction(me, "save_transformation_rule_historical_connectivity_graph", "SAVE-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 1, 1, false);
        declareFunction(me, "load_transformation_rule_historical_connectivity_graph", "LOAD-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 1, 0, false);
        declareFunction(me, "clear_hl_module_expand_counts", "CLEAR-HL-MODULE-EXPAND-COUNTS", 0, 0, false);
        declareMacro(me, "noting_hl_module_expand_counts", "NOTING-HL-MODULE-EXPAND-COUNTS");
        declareFunction(me, "hl_module_expand_count", "HL-MODULE-EXPAND-COUNT", 1, 0, false);
        declareFunction(me, "all_hl_module_expand_counts", "ALL-HL-MODULE-EXPAND-COUNTS", 0, 0, false);
        declareFunction(me, "cinc_hl_module_expand_count", "CINC-HL-MODULE-EXPAND-COUNT", 1, 0, false);
        declareFunction(me, "show_hl_module_expand_counts", "SHOW-HL-MODULE-EXPAND-COUNTS", 0, 2, false);
        declareFunction(me, "cinc_module_expand_count", "CINC-MODULE-EXPAND-COUNT", 1, 0, false);
        declareFunction(me, "clear_asked_query_queue", "CLEAR-ASKED-QUERY-QUEUE", 0, 0, false);
        declareFunction(me, "possibly_enqueue_asked_query", "POSSIBLY-ENQUEUE-ASKED-QUERY", 3, 0, false);
        declareFunction(me, "enqueue_asked_query", "ENQUEUE-ASKED-QUERY", 3, 0, false);
        declareFunction(me, "possibly_enqueue_asked_query_from_inference", "POSSIBLY-ENQUEUE-ASKED-QUERY-FROM-INFERENCE", 1, 0, false);
        declareFunction(me, "enqueue_asked_query_from_inference", "ENQUEUE-ASKED-QUERY-FROM-INFERENCE", 1, 0, false);
        declareFunction(me, "possibly_save_recent_asked_queries", "POSSIBLY-SAVE-RECENT-ASKED-QUERIES", 0, 0, false);
        declareFunction(me, "load_asked_queries", "LOAD-ASKED-QUERIES", 1, 1, false);
        declareFunction(me, "query_info_p", "QUERY-INFO-P", 1, 0, false);
        declareFunction(me, "valid_query_infoP", "VALID-QUERY-INFO?", 1, 0, false);
        declareFunction(me, "load_asked_query", "LOAD-ASKED-QUERY", 1, 0, false);
        declareFunction(me, "save_recent_asked_queries", "SAVE-RECENT-ASKED-QUERIES", 0, 0, false);
        declareFunction(me, "any_recent_asked_queriesP", "ANY-RECENT-ASKED-QUERIES?", 0, 0, false);
        declareFunction(me, "local_asked_queries_transcript", "LOCAL-ASKED-QUERIES-TRANSCRIPT", 0, 0, false);
        declareFunction(me, "save_recent_asked_queries_int", "SAVE-RECENT-ASKED-QUERIES-INT", 0, 0, false);
        declareFunction(me, "save_recent_asked_queries_to_file", "SAVE-RECENT-ASKED-QUERIES-TO-FILE", 1, 0, false);
        declareFunction(me, "write_asked_query_to_stream", "WRITE-ASKED-QUERY-TO-STREAM", 3, 0, false);
        declareFunction(me, "load_asked_query_from_stream", "LOAD-ASKED-QUERY-FROM-STREAM", 1, 0, false);
        declareFunction(me, "asked_queries_filenameP", "ASKED-QUERIES-FILENAME?", 1, 0, false);
        declareFunction(me, "asked_query_common_symbols", "ASKED-QUERY-COMMON-SYMBOLS", 0, 0, false);
        declareFunction(me, "asked_query_common_symbols_simple", "ASKED-QUERY-COMMON-SYMBOLS-SIMPLE", 0, 0, false);
        declareFunction(me, "show_asked_query_statistics", "SHOW-ASKED-QUERY-STATISTICS", 1, 0, false);
        declareFunction(me, "show_asked_query_statistics_int", "SHOW-ASKED-QUERY-STATISTICS-INT", 3, 0, false);
        declareFunction(me, "mts_of_inference_answer", "MTS-OF-INFERENCE-ANSWER", 1, 0, false);
        declareFunction(me, "mts_of_inference_answer_justification", "MTS-OF-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "max_floor_mts_of_inference", "MAX-FLOOR-MTS-OF-INFERENCE", 1, 1, false);
        declareFunction(me, "max_floor_mts_of_inference_answer", "MAX-FLOOR-MTS-OF-INFERENCE-ANSWER", 1, 1, false);
        declareFunction(me, "conjoin_mt_tuples", "CONJOIN-MT-TUPLES", 1, 0, false);
        declareFunction(me, "disjoin_mt_tuples", "DISJOIN-MT-TUPLES", 1, 0, false);
        declareFunction(me, "max_floor_mts_of_inference_answer_justification", "MAX-FLOOR-MTS-OF-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "max_floor_mts_of_supports", "MAX-FLOOR-MTS-OF-SUPPORTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_analysis_file() {
        deflexical("*TRANSFORMATION-RULE-STATISTICS-TABLE*", SubLTrampolineFile.maybeDefault($transformation_rule_statistics_table$, $transformation_rule_statistics_table$, () -> make_hash_table($int$64, symbol_function(EQL), UNPROVIDED)));
        deflexical("*TRANSFORMATION-RULE-STATISTICS-LOCK*", SubLTrampolineFile.maybeDefault($transformation_rule_statistics_lock$, $transformation_rule_statistics_lock$, () -> make_lock($str3$Transformation_Rule_Statistics_Lo)));
        deflexical("*TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY*", SubLTrampolineFile.maybeDefault($transformation_rule_statistics_filename_load_history$, $transformation_rule_statistics_filename_load_history$, NIL));
        deflexical("*TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY*", SubLTrampolineFile.maybeDefault($transformation_rule_statistics_received_filename_load_history$, $transformation_rule_statistics_received_filename_load_history$, NIL));
        defvar("*TRANSFORMATION-RULE-STATISTICS-UPDATE-ENABLED?*", T);
        defvar("*TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING-THRESHOLD*", ZERO_INTEGER);
        defparameter("*SAVE-RECENT-EXPERIENCE-LOCK*", make_lock($$$Save_recent_experience_lock));
        defparameter("*AVERAGE-RULE-HISTORICAL-SUCCESS-PROBABILITY*", $float$0_02939361143247565);
        defparameter("*RULE-HISTORICAL-SUCCESS-HAPPINESS-SCALING-FACTOR*", TEN_INTEGER);
        deflexical("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH*", SubLTrampolineFile.maybeDefault($transformation_rule_historical_connectivity_graph$, $transformation_rule_historical_connectivity_graph$, () -> make_hash_table($int$256, symbol_function(EQL), UNPROVIDED)));
        deflexical("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH-LOCK*", SubLTrampolineFile.maybeDefault($transformation_rule_historical_connectivity_graph_lock$, $transformation_rule_historical_connectivity_graph_lock$, () -> make_lock($str75$Rule_Historical_Connectivity_Grap)));
        defvar("*HL-MODULE-EXPAND-COUNTS-ENABLED?*", NIL);
        defvar("*HL-MODULE-EXPAND-COUNTS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*ASKED-QUERIES-QUEUE*", SubLTrampolineFile.maybeDefault($asked_queries_queue$, $asked_queries_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*SAVE-RECENT-ASKED-QUERIES-LOCK*", make_lock($$$Query_logging_lock));
        deflexical("*ASKED-QUERIES-QUEUE-LIMIT*", $int$300);
        deflexical("*ASKED-QUERY-COMMON-SYMBOLS*", SubLTrampolineFile.maybeDefault($asked_query_common_symbols$, $asked_query_common_symbols$, NIL));
        deflexical("*ASKED-QUERY-COMMON-SYMBOLS-SIMPLE*", SubLTrampolineFile.maybeDefault($asked_query_common_symbols_simple$, $asked_query_common_symbols_simple$, NIL));
        return NIL;
    }

    public static SubLObject setup_inference_analysis_file() {
        declare_defglobal($transformation_rule_statistics_table$);
        declare_defglobal($transformation_rule_statistics_lock$);
        declare_defglobal($transformation_rule_statistics_filename_load_history$);
        declare_defglobal($transformation_rule_statistics_received_filename_load_history$);
        register_macro_helper(TRANSFORMATION_RULE_STATISTICS_TABLE, DO_TRANSFORMATION_RULES_WITH_STATISTICS);
        register_macro_helper(TRANSFORMATION_RULES_WITH_STATISTICS_HELPER, DO_TRANSFORMATION_RULES_WITH_STATISTICS);
        register_macro_helper($sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, DO_TRANSFORMATION_RULES_WITH_STATISTICS);
        declare_defglobal($transformation_rule_historical_connectivity_graph$);
        declare_defglobal($transformation_rule_historical_connectivity_graph_lock$);
        register_global_lock($transformation_rule_historical_connectivity_graph_lock$, $str75$Rule_Historical_Connectivity_Grap);
        declare_defglobal($asked_queries_queue$);
        register_macro_helper($sym96$ASKED_QUERIES_FILENAME_, DO_ASKED_QUERIES_IN_DIRECTORY);
        declare_defglobal($asked_query_common_symbols$);
        declare_defglobal($asked_query_common_symbols_simple$);
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

/**
 * Total time: 1158 ms synthetic
 */
