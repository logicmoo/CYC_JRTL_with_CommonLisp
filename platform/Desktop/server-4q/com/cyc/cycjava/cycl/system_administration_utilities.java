package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_administration_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.system_administration_utilities";
    public static final String myFingerPrint = "ebd281d28d7edf39d1af7206105af26665534f073f7ef77eb8fc66c25c716a04";
    @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
    private static SubLSymbol $get_process_id_in_jrtl_caching_state$;
    private static final SubLSymbol $sym0$PROCESSES_WITH_SUBSTRING;
    private static final SubLSymbol $sym1$KILL_PROCESSES_WITH_SUBSTRING;
    private static final SubLSymbol $sym2$KILL_PROCESS;
    private static final SubLSymbol $sym3$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str4$jstack;
    private static final SubLSymbol $sym5$GET_PROCESS_ID_IN_JRTL;
    private static final SubLString $str6$readlink;
    private static final SubLList $list7;
    private static final SubLString $str8$ps;
    private static final SubLString $str9$_o;
    private static final SubLString $str10$ppid_;
    private static final SubLSymbol $sym11$_GET_PROCESS_ID_IN_JRTL_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 1001L)
    public static SubLObject processes_with_substring(final SubLObject string) {
        SubLObject processes = (SubLObject)system_administration_utilities.NIL;
        SubLObject cdolist_list_var = Threads.all_processes();
        SubLObject proc = (SubLObject)system_administration_utilities.NIL;
        proc = cdolist_list_var.first();
        while (system_administration_utilities.NIL != cdolist_list_var) {
            if (system_administration_utilities.NIL != string_utilities.substringP(string, Threads.process_name(proc), (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED)) {
                processes = (SubLObject)ConsesLow.cons(proc, processes);
            }
            cdolist_list_var = cdolist_list_var.rest();
            proc = cdolist_list_var.first();
        }
        return Sequences.nreverse(processes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 1349L)
    public static SubLObject kill_processes_with_substring(final SubLObject string) {
        final SubLObject processes = processes_with_substring(string);
        Mapping.mapc((SubLObject)system_administration_utilities.$sym2$KILL_PROCESS, processes, system_administration_utilities.EMPTY_SUBL_OBJECT_ARRAY);
        return processes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 1589L)
    public static SubLObject jstack_trace(SubLObject pid) {
        if (pid == system_administration_utilities.UNPROVIDED) {
            pid = (SubLObject)system_administration_utilities.NIL;
        }
        if (system_administration_utilities.NIL == pid) {
            pid = get_process_id_in_jrtl();
        }
        assert system_administration_utilities.NIL != subl_promotions.non_negative_integer_p(pid) : pid;
        return os_process_utilities.os_process_evaluation_output_strings((SubLObject)system_administration_utilities.$str4$jstack, (SubLObject)ConsesLow.list(format_nil.format_nil_s(pid)), (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2510L)
    public static SubLObject print_jstack_trace(SubLObject pid, SubLObject stream) {
        if (pid == system_administration_utilities.UNPROVIDED) {
            pid = (SubLObject)system_administration_utilities.NIL;
        }
        if (stream == system_administration_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject list_var = (SubLObject)system_administration_utilities.NIL;
        SubLObject line = (SubLObject)system_administration_utilities.NIL;
        SubLObject index = (SubLObject)system_administration_utilities.NIL;
        list_var = jstack_trace((SubLObject)system_administration_utilities.UNPROVIDED);
        line = list_var.first();
        for (index = (SubLObject)system_administration_utilities.ZERO_INTEGER; system_administration_utilities.NIL != list_var; list_var = list_var.rest(), line = list_var.first(), index = Numbers.add((SubLObject)system_administration_utilities.ONE_INTEGER, index)) {
            if (!index.isZero()) {
                streams_high.terpri(stream);
            }
            streams_high.write_string(line, stream, (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED);
        }
        return pid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
    public static SubLObject clear_get_process_id_in_jrtl() {
        final SubLObject cs = system_administration_utilities.$get_process_id_in_jrtl_caching_state$.getGlobalValue();
        if (system_administration_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)system_administration_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
    public static SubLObject remove_get_process_id_in_jrtl() {
        return memoization_state.caching_state_remove_function_results_with_args(system_administration_utilities.$get_process_id_in_jrtl_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(system_administration_utilities.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
    public static SubLObject get_process_id_in_jrtl_internal() {
        final SubLObject self_pid_string = os_process_utilities.os_process_evaluation_output_strings((SubLObject)system_administration_utilities.$str6$readlink, (SubLObject)system_administration_utilities.$list7, (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED).first();
        if (system_administration_utilities.NIL != number_utilities.number_string_p(self_pid_string)) {
            final SubLObject ps_strings = os_process_utilities.os_process_evaluation_output_strings((SubLObject)system_administration_utilities.$str8$ps, (SubLObject)ConsesLow.list((SubLObject)system_administration_utilities.$str9$_o, Sequences.cconcatenate((SubLObject)system_administration_utilities.$str10$ppid_, format_nil.format_nil_a_no_copy(self_pid_string))), (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED);
            final SubLObject jvm_pid_string = string_utilities.trim_whitespace(Sequences.nreverse(ps_strings).first());
            if (system_administration_utilities.NIL != number_utilities.number_string_p(jvm_pid_string)) {
                return Values.values(reader.parse_integer(jvm_pid_string, (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED, (SubLObject)system_administration_utilities.UNPROVIDED));
            }
        }
        return (SubLObject)system_administration_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
    public static SubLObject get_process_id_in_jrtl() {
        SubLObject caching_state = system_administration_utilities.$get_process_id_in_jrtl_caching_state$.getGlobalValue();
        if (system_administration_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)system_administration_utilities.$sym5$GET_PROCESS_ID_IN_JRTL, (SubLObject)system_administration_utilities.$sym11$_GET_PROCESS_ID_IN_JRTL_CACHING_STATE_, (SubLObject)system_administration_utilities.NIL, (SubLObject)system_administration_utilities.EQL, (SubLObject)system_administration_utilities.ZERO_INTEGER, (SubLObject)system_administration_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)system_administration_utilities.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_process_id_in_jrtl_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)system_administration_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_system_administration_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_administration_utilities", "processes_with_substring", "PROCESSES-WITH-SUBSTRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_administration_utilities", "kill_processes_with_substring", "KILL-PROCESSES-WITH-SUBSTRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_administration_utilities", "jstack_trace", "JSTACK-TRACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_administration_utilities", "print_jstack_trace", "PRINT-JSTACK-TRACE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_administration_utilities", "clear_get_process_id_in_jrtl", "CLEAR-GET-PROCESS-ID-IN-JRTL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_administration_utilities", "remove_get_process_id_in_jrtl", "REMOVE-GET-PROCESS-ID-IN-JRTL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_administration_utilities", "get_process_id_in_jrtl_internal", "GET-PROCESS-ID-IN-JRTL-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_administration_utilities", "get_process_id_in_jrtl", "GET-PROCESS-ID-IN-JRTL", 0, 0, false);
        return (SubLObject)system_administration_utilities.NIL;
    }
    
    public static SubLObject init_system_administration_utilities_file() {
        system_administration_utilities.$get_process_id_in_jrtl_caching_state$ = SubLFiles.deflexical("*GET-PROCESS-ID-IN-JRTL-CACHING-STATE*", (SubLObject)system_administration_utilities.NIL);
        return (SubLObject)system_administration_utilities.NIL;
    }
    
    public static SubLObject setup_system_administration_utilities_file() {
        access_macros.register_external_symbol((SubLObject)system_administration_utilities.$sym0$PROCESSES_WITH_SUBSTRING);
        access_macros.register_external_symbol((SubLObject)system_administration_utilities.$sym1$KILL_PROCESSES_WITH_SUBSTRING);
        memoization_state.note_globally_cached_function((SubLObject)system_administration_utilities.$sym5$GET_PROCESS_ID_IN_JRTL);
        return (SubLObject)system_administration_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_system_administration_utilities_file();
    }
    
    public void initializeVariables() {
        init_system_administration_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_system_administration_utilities_file();
    }
    
    static {
        me = (SubLFile)new system_administration_utilities();
        system_administration_utilities.$get_process_id_in_jrtl_caching_state$ = null;
        $sym0$PROCESSES_WITH_SUBSTRING = SubLObjectFactory.makeSymbol("PROCESSES-WITH-SUBSTRING");
        $sym1$KILL_PROCESSES_WITH_SUBSTRING = SubLObjectFactory.makeSymbol("KILL-PROCESSES-WITH-SUBSTRING");
        $sym2$KILL_PROCESS = SubLObjectFactory.makeSymbol("KILL-PROCESS");
        $sym3$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str4$jstack = SubLObjectFactory.makeString("jstack");
        $sym5$GET_PROCESS_ID_IN_JRTL = SubLObjectFactory.makeSymbol("GET-PROCESS-ID-IN-JRTL");
        $str6$readlink = SubLObjectFactory.makeString("readlink");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/proc/self"));
        $str8$ps = SubLObjectFactory.makeString("ps");
        $str9$_o = SubLObjectFactory.makeString("-o");
        $str10$ppid_ = SubLObjectFactory.makeString("ppid=");
        $sym11$_GET_PROCESS_ID_IN_JRTL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-PROCESS-ID-IN-JRTL-CACHING-STATE*");
    }
}

/*

	Total time: 67 ms
	
*/