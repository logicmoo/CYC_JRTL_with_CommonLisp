package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.all_processes;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class system_administration_utilities extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new system_administration_utilities();

    public static final String myName = "com.cyc.cycjava_2.cycl.system_administration_utilities";




    private static final SubLSymbol PROCESSES_WITH_SUBSTRING = makeSymbol("PROCESSES-WITH-SUBSTRING");

    private static final SubLSymbol KILL_PROCESSES_WITH_SUBSTRING = makeSymbol("KILL-PROCESSES-WITH-SUBSTRING");





    private static final SubLString $$$jstack = makeString("jstack");

    private static final SubLSymbol GET_PROCESS_ID_IN_JRTL = makeSymbol("GET-PROCESS-ID-IN-JRTL");

    private static final SubLString $$$readlink = makeString("readlink");

    private static final SubLList $list7 = list(makeString("/proc/self"));

    private static final SubLString $$$ps = makeString("ps");

    private static final SubLString $str9$_o = makeString("-o");

    private static final SubLString $str10$ppid_ = makeString("ppid=");

    private static final SubLSymbol $get_process_id_in_jrtl_caching_state$ = makeSymbol("*GET-PROCESS-ID-IN-JRTL-CACHING-STATE*");

    public static SubLObject processes_with_substring(final SubLObject string) {
        SubLObject processes = NIL;
        SubLObject cdolist_list_var = all_processes();
        SubLObject proc = NIL;
        proc = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.substringP(string, process_name(proc), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                processes = cons(proc, processes);
            }
            cdolist_list_var = cdolist_list_var.rest();
            proc = cdolist_list_var.first();
        } 
        return nreverse(processes);
    }

    public static SubLObject kill_processes_with_substring(final SubLObject string) {
        final SubLObject processes = processes_with_substring(string);
        Mapping.mapc(KILL_PROCESS, processes, EMPTY_SUBL_OBJECT_ARRAY);
        return processes;
    }

    public static SubLObject jstack_trace(SubLObject pid) {
        if (pid == UNPROVIDED) {
            pid = NIL;
        }
        if (NIL == pid) {
            pid = get_process_id_in_jrtl();
        }
        assert NIL != subl_promotions.non_negative_integer_p(pid) : "subl_promotions.non_negative_integer_p(pid) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(pid) " + pid;
        return os_process_utilities.os_process_evaluation_output_strings($$$jstack, list(format_nil.format_nil_s(pid)), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject print_jstack_trace(SubLObject pid, SubLObject stream) {
        if (pid == UNPROVIDED) {
            pid = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject list_var = NIL;
        SubLObject line = NIL;
        SubLObject index = NIL;
        list_var = jstack_trace(UNPROVIDED);
        line = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , line = list_var.first() , index = add(ONE_INTEGER, index)) {
            if (!index.isZero()) {
                terpri(stream);
            }
            write_string(line, stream, UNPROVIDED, UNPROVIDED);
        }
        return pid;
    }

    public static SubLObject clear_get_process_id_in_jrtl() {
        final SubLObject cs = $get_process_id_in_jrtl_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_process_id_in_jrtl() {
        return memoization_state.caching_state_remove_function_results_with_args($get_process_id_in_jrtl_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_process_id_in_jrtl_internal() {
        final SubLObject self_pid_string = os_process_utilities.os_process_evaluation_output_strings($$$readlink, $list7, UNPROVIDED, UNPROVIDED).first();
        if (NIL != number_utilities.number_string_p(self_pid_string)) {
            final SubLObject ps_strings = os_process_utilities.os_process_evaluation_output_strings($$$ps, list($str9$_o, cconcatenate($str10$ppid_, format_nil.format_nil_a_no_copy(self_pid_string))), UNPROVIDED, UNPROVIDED);
            final SubLObject jvm_pid_string = string_utilities.trim_whitespace(nreverse(ps_strings).first());
            if (NIL != number_utilities.number_string_p(jvm_pid_string)) {
                return values(parse_integer(jvm_pid_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject get_process_id_in_jrtl() {
        SubLObject caching_state = $get_process_id_in_jrtl_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_PROCESS_ID_IN_JRTL, $get_process_id_in_jrtl_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_process_id_in_jrtl_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_system_administration_utilities_file() {
        declareFunction("processes_with_substring", "PROCESSES-WITH-SUBSTRING", 1, 0, false);
        declareFunction("kill_processes_with_substring", "KILL-PROCESSES-WITH-SUBSTRING", 1, 0, false);
        declareFunction("jstack_trace", "JSTACK-TRACE", 0, 1, false);
        declareFunction("print_jstack_trace", "PRINT-JSTACK-TRACE", 0, 2, false);
        declareFunction("clear_get_process_id_in_jrtl", "CLEAR-GET-PROCESS-ID-IN-JRTL", 0, 0, false);
        declareFunction("remove_get_process_id_in_jrtl", "REMOVE-GET-PROCESS-ID-IN-JRTL", 0, 0, false);
        declareFunction("get_process_id_in_jrtl_internal", "GET-PROCESS-ID-IN-JRTL-INTERNAL", 0, 0, false);
        declareFunction("get_process_id_in_jrtl", "GET-PROCESS-ID-IN-JRTL", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_system_administration_utilities_file() {
        deflexical("*GET-PROCESS-ID-IN-JRTL-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_system_administration_utilities_file() {
        register_external_symbol(PROCESSES_WITH_SUBSTRING);
        register_external_symbol(KILL_PROCESSES_WITH_SUBSTRING);
        memoization_state.note_globally_cached_function(GET_PROCESS_ID_IN_JRTL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_system_administration_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_system_administration_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_system_administration_utilities_file();
    }

    static {














    }
}

/**
 * Total time: 67 ms
 */
