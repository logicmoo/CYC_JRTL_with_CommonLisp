/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.JavaLink;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SUBL-PROMOTIONS
 * source file: /cyc/top/cycl/subl-promotions.lisp
 * created:     2019/07/03 17:37:05
 */
public final class subl_promotions extends SubLTranslatedFile implements V12 {
    /**
     * Open a TCP connection to PORT on HOST.
     * Returns a bidirectional TCP stream.
     * If ACCESS-MODE is :PRIVATE, then the stream is assumed to not be shared with anyone.
     */
    @LispMethod(comment = "Open a TCP connection to PORT on HOST.\r\nReturns a bidirectional TCP stream.\r\nIf ACCESS-MODE is :PRIVATE, then the stream is assumed to not be shared with anyone.\nOpen a TCP connection to PORT on HOST.\nReturns a bidirectional TCP stream.\nIf ACCESS-MODE is :PRIVATE, then the stream is assumed to not be shared with anyone.")
    public static final SubLObject open_tcp_stream_with_access(SubLObject host, SubLObject port, SubLObject access_mode) {
        if (access_mode == UNPROVIDED) {
            access_mode = $PUBLIC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(access_mode, STREAM_ACCESS_MODE_P);
            {
                SubLObject v_answer = NIL;
                SubLObject pcase_var = access_mode;
                if (pcase_var.eql($PRIVATE)) {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            v_answer = Tcp.open_tcp_stream(host, port);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    v_answer = Tcp.open_tcp_stream(host, port);
                }
                return v_answer;
            }
        }
    }

    /**
     *
     *
     * @param OLD;
    		stringp
     * 		
     * @param NEW;
     * 		stringp
     * 		Copy file OLD onto file NEW.
     */
    @LispMethod(comment = "@param OLD;\n\t\tstringp\r\n\t\t\r\n@param NEW;\r\n\t\tstringp\r\n\t\tCopy file OLD onto file NEW.")
    public static final SubLObject copy_file(SubLObject old, SubLObject v_new) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(old, STRINGP);
            SubLTrampolineFile.checkType(v_new, STRINGP);
            if (NIL != Processes.external_processes_supportedP()) {
                {
                    SubLObject physical_old = com.cyc.cycjava.cycl.subl_promotions.ensure_physical_pathname(old);
                    SubLObject physical_new = com.cyc.cycjava.cycl.subl_promotions.ensure_physical_pathname(v_new);
                    if (physical_old.isString() && physical_new.isString()) {
                        return os_process_utilities.system_eval_using_make_os_process_successfulP($$$cp, list($str_alt25$_p, physical_old, physical_new), ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(old, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt27$Unable_to_open__S, old);
                    }
                    {
                        SubLObject in_stream = stream;
                        SubLObject stream_4 = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream_4 = compatibility.open_binary(v_new, $OUTPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream_4.isStream()) {
                                Errors.error($str_alt27$Unable_to_open__S, v_new);
                            }
                            {
                                SubLObject out_stream = stream_4;
                                SubLObject v_byte = NIL;
                                for (v_byte = read_byte(in_stream, NIL, $EOF); v_byte != $EOF; v_byte = read_byte(in_stream, NIL, $EOF)) {
                                    write_byte(v_byte, out_stream);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream_4.isStream()) {
                                        close(stream_4, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLFile me = new subl_promotions();

 public static final String myName = "com.cyc.cycjava.cycl.subl_promotions";


    // deflexical
    // Lock controlling access to *MAKE-PROCESS-WITH-ARGS-TABLE*
    /**
     * Lock controlling access to *MAKE-PROCESS-WITH-ARGS-TABLE*
     */
    @LispMethod(comment = "Lock controlling access to *MAKE-PROCESS-WITH-ARGS-TABLE*\ndeflexical")
    private static final SubLSymbol $make_process_with_args_table_lock$ = makeSymbol("*MAKE-PROCESS-WITH-ARGS-TABLE-LOCK*");

    // deflexical
    // Lock controlling access to *INTERRUPT-PROCESS-WITH-ARGS-TABLE*
    /**
     * Lock controlling access to *INTERRUPT-PROCESS-WITH-ARGS-TABLE*
     */
    @LispMethod(comment = "Lock controlling access to *INTERRUPT-PROCESS-WITH-ARGS-TABLE*\ndeflexical")
    private static final SubLSymbol $interrupt_process_with_args_table_lock$ = makeSymbol("*INTERRUPT-PROCESS-WITH-ARGS-TABLE-LOCK*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $make_process_with_args_table$ = makeSymbol("*MAKE-PROCESS-WITH-ARGS-TABLE*");

    static private final SubLString $str1$MAKE_PROCESS_WITH_ARGS_TABLE = makeString("MAKE-PROCESS-WITH-ARGS-TABLE");

    private static final SubLSymbol MAKE_PROCESS_WITH_ARGS_INTERNAL = makeSymbol("MAKE-PROCESS-WITH-ARGS-INTERNAL");

    static private final SubLString $str6$Unable_to_get_make_process_args_f = makeString("Unable to get make-process args for ~S");

    static private final SubLList $list7 = list(makeSymbol("PROCESS"), makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    public static final SubLSymbol $interrupt_process_with_args_table$ = makeSymbol("*INTERRUPT-PROCESS-WITH-ARGS-TABLE*");

    static private final SubLString $str9$INTERRUPT_PROCESS_WITH_ARGS_TABLE = makeString("INTERRUPT-PROCESS-WITH-ARGS-TABLE");

    private static final SubLSymbol INTERRUPT_PROCESS_WITH_ARGS_INTERNAL = makeSymbol("INTERRUPT-PROCESS-WITH-ARGS-INTERNAL");

    static private final SubLString $str12$Unable_to_get_interrupt_process_a = makeString("Unable to get interrupt-process args for ~S");

    private static final SubLSymbol STREAM_ACCESS_MODE_P = makeSymbol("STREAM-ACCESS-MODE-P");

    private static final SubLString $str18$_A = makeString("~A");

    static private final SubLList $list19 = list(makeKeyword("PUBLIC"), makeKeyword("PRIVATE"));

    private static final SubLList $list24 = list(makeSymbol("INLINE"), makeSymbol("MEMBER?"));

    private static final SubLList $list25 = list(makeSymbol("SIGN"), makeSymbol("B0"), makeSymbol("B1"), makeSymbol("B2"), makeSymbol("B3"), makeSymbol("&OPTIONAL"), makeSymbol("B4"), makeSymbol("B5"));

    private static final SubLString $str26$_D__D__D__D__D__D = makeString("~D.~D.~D.~D.~D.~D");

    private static final SubLString $str27$_D__D__D__D = makeString("~D.~D.~D.~D");

    static private final SubLList $list30 = list(makeKeyword("INITIALIZER"), makeKeyword("WORLD"));

    private static final SubLList $list31 = list(makeSymbol("INLINE"), makeSymbol("VALUES2"));

    private static final SubLList $list32 = list(makeSymbol("INLINE"), makeSymbol("VALUES3"));

    private static final SubLList $list33 = list(makeSymbol("INLINE"), makeSymbol("VALUES4"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $$$getProperty = makeString("getProperty");

    private static final SubLString $str37$java_lang_System = makeString("java.lang.System");

    private static final SubLString $str38$java_io_tmpdir = makeString("java.io.tmpdir");

    /**
     * Create a new thread called NAME which applies FUNCTION to ARGS and exits.
     */
    @LispMethod(comment = "Create a new thread called NAME which applies FUNCTION to ARGS and exits.")
    public static final SubLObject make_process_with_args_alt(SubLObject name, SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(args, LISTP);
        if (NIL == args) {
            return make_process(name, function);
        }
        {
            SubLObject new_process = NIL;
            SubLObject lock = $make_process_with_args_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                new_process = make_process(name, MAKE_PROCESS_WITH_ARGS_INTERNAL);
                $make_process_with_args_table$.setGlobalValue(cons(list(new_process, function, args), $make_process_with_args_table$.getGlobalValue()));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return new_process;
        }
    }

    /**
     * Create a new thread called NAME which applies FUNCTION to ARGS and exits.
     */
    @LispMethod(comment = "Create a new thread called NAME which applies FUNCTION to ARGS and exits.")
    public static SubLObject make_process_with_args(final SubLObject name, final SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        if (NIL == args) {
            return make_process(name, function);
        }
        SubLObject new_process = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($make_process_with_args_table_lock$.getGlobalValue());
            new_process = make_process(name, MAKE_PROCESS_WITH_ARGS_INTERNAL);
            $make_process_with_args_table$.setGlobalValue(cons(list(new_process, function, args), $make_process_with_args_table$.getGlobalValue()));
        } finally {
            if (NIL != release) {
                release_lock($make_process_with_args_table_lock$.getGlobalValue());
            }
        }
        return new_process;
    }

    public static final SubLObject make_process_with_args_internal_alt() {
        {
            SubLObject myself = current_process();
            SubLObject process_info = NIL;
            SubLObject lock = $make_process_with_args_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                process_info = assoc(myself, $make_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                if (NIL != process_info) {
                    $make_process_with_args_table$.setGlobalValue(delete(process_info, $make_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL == process_info) {
                return Errors.error($str_alt6$Unable_to_get_make_process_args_f, myself);
            }
            {
                SubLObject datum = process_info;
                SubLObject current = datum;
                SubLObject process = NIL;
                SubLObject function = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt7);
                process = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                function = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                args = current.first();
                current = current.rest();
                if (NIL == current) {
                    return apply(function, args);
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
            }
        }
        return NIL;
    }

    public static SubLObject make_process_with_args_internal() {
        final SubLObject myself = current_process();
        SubLObject process_info = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($make_process_with_args_table_lock$.getGlobalValue());
            process_info = assoc(myself, $make_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != process_info) {
                $make_process_with_args_table$.setGlobalValue(delete(process_info, $make_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        } finally {
            if (NIL != release) {
                release_lock($make_process_with_args_table_lock$.getGlobalValue());
            }
        }
        if (NIL == process_info) {
            return Errors.error($str6$Unable_to_get_make_process_args_f, myself);
        }
        SubLObject current;
        final SubLObject datum = current = process_info;
        SubLObject process = NIL;
        SubLObject function = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        process = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        args = current.first();
        current = current.rest();
        if (NIL == current) {
            return apply(function, args);
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    /**
     * Interrupt PROCESS by applying FUNCTION to ARGS.
     */
    @LispMethod(comment = "Interrupt PROCESS by applying FUNCTION to ARGS.")
    public static final SubLObject interrupt_process_with_args_alt(SubLObject process, SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLTrampolineFile.checkType(process, PROCESSP);
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(args, LISTP);
        if (process == current_process()) {
            apply(function, args);
            return NIL;
        }
        if (NIL == args) {
            return interrupt_process(process, function);
        }
        {
            SubLObject lock = $interrupt_process_with_args_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $interrupt_process_with_args_table$.setGlobalValue(cons(list(process, function, args), $interrupt_process_with_args_table$.getGlobalValue()));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return interrupt_process(process, INTERRUPT_PROCESS_WITH_ARGS_INTERNAL);
    }

    /**
     * Interrupt PROCESS by applying FUNCTION to ARGS.
     */
    @LispMethod(comment = "Interrupt PROCESS by applying FUNCTION to ARGS.")
    public static SubLObject interrupt_process_with_args(final SubLObject process, final SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != processp(process) : "! processp(process) " + ("Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) ") + process;
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        if (process.eql(current_process())) {
            apply(function, args);
            return NIL;
        }
        if (NIL == args) {
            return interrupt_process(process, function);
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($interrupt_process_with_args_table_lock$.getGlobalValue());
            $interrupt_process_with_args_table$.setGlobalValue(cons(list(process, function, args), $interrupt_process_with_args_table$.getGlobalValue()));
        } finally {
            if (NIL != release) {
                release_lock($interrupt_process_with_args_table_lock$.getGlobalValue());
            }
        }
        return interrupt_process(process, INTERRUPT_PROCESS_WITH_ARGS_INTERNAL);
    }

    public static final SubLObject interrupt_process_with_args_internal_alt() {
        {
            SubLObject myself = current_process();
            SubLObject process_info = NIL;
            SubLObject lock = $interrupt_process_with_args_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                process_info = assoc(myself, $interrupt_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                if (NIL != process_info) {
                    $interrupt_process_with_args_table$.setGlobalValue(delete(process_info, $interrupt_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL == process_info) {
                return Errors.error($str_alt12$Unable_to_get_interrupt_process_a, myself);
            }
            {
                SubLObject datum = process_info;
                SubLObject current = datum;
                SubLObject process = NIL;
                SubLObject function = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt7);
                process = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                function = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                args = current.first();
                current = current.rest();
                if (NIL == current) {
                    return apply(function, args);
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
            }
        }
        return NIL;
    }

    public static SubLObject interrupt_process_with_args_internal() {
        final SubLObject myself = current_process();
        SubLObject process_info = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($interrupt_process_with_args_table_lock$.getGlobalValue());
            process_info = assoc(myself, $interrupt_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != process_info) {
                $interrupt_process_with_args_table$.setGlobalValue(delete(process_info, $interrupt_process_with_args_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        } finally {
            if (NIL != release) {
                release_lock($interrupt_process_with_args_table_lock$.getGlobalValue());
            }
        }
        if (NIL == process_info) {
            return Errors.error($str12$Unable_to_get_interrupt_process_a, myself);
        }
        SubLObject current;
        final SubLObject datum = current = process_info;
        SubLObject process = NIL;
        SubLObject function = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        process = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        args = current.first();
        current = current.rest();
        if (NIL == current) {
            return apply(function, args);
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    /**
     * Open a TCP connection to PORT on HOST.
     * TIMEOUT, if non-nil, is an integer connection timeout in seconds.
     * Returns a bidirectional TCP stream, or NIL if it timed out.
     * If ACCESS-MODE is :PRIVATE, then the stream is assumed to not be shared with anyone.
     */
    @LispMethod(comment = "Open a TCP connection to PORT on HOST.\r\nTIMEOUT, if non-nil, is an integer connection timeout in seconds.\r\nReturns a bidirectional TCP stream, or NIL if it timed out.\r\nIf ACCESS-MODE is :PRIVATE, then the stream is assumed to not be shared with anyone.\nOpen a TCP connection to PORT on HOST.\nTIMEOUT, if non-nil, is an integer connection timeout in seconds.\nReturns a bidirectional TCP stream, or NIL if it timed out.\nIf ACCESS-MODE is :PRIVATE, then the stream is assumed to not be shared with anyone.")
    public static final SubLObject open_tcp_stream_with_timeout_alt(SubLObject host, SubLObject port, SubLObject timeout, SubLObject access_mode) {
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        if (access_mode == UNPROVIDED) {
            access_mode = $PUBLIC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == timeout) {
                return com.cyc.cycjava.cycl.subl_promotions.open_tcp_stream_with_access(host, port, access_mode);
            }
            SubLTrampolineFile.checkType(timeout, NON_NEGATIVE_NUMBER_P);
            {
                SubLObject error_message = NIL;
                SubLObject timed_out = NIL;
                SubLObject v_answer = NIL;
                SubLObject tag = with_timeout_make_tag();
                try {
                    {
                        SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                        try {
                            $within_with_timeout$.bind(T, thread);
                            {
                                SubLObject timer = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_1 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(timeout, tag);
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            v_answer = com.cyc.cycjava.cycl.subl_promotions.open_tcp_stream_with_access(host, port, access_mode);
                                                        } catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            with_timeout_stop_timer(timer);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $within_with_timeout$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                }
                if (NIL != error_message) {
                    Errors.error($str_alt16$_A, error_message);
                }
                return v_answer;
            }
        }
    }

    /**
     * Open a TCP connection to PORT on HOST.
     * TIMEOUT, if non-nil, is an integer connection timeout in seconds.
     * Returns a bidirectional TCP stream, or NIL if it timed out.
     * If ACCESS-MODE is :PRIVATE, then the stream is assumed to not be shared with anyone.
     */
    @LispMethod(comment = "Open a TCP connection to PORT on HOST.\r\nTIMEOUT, if non-nil, is an integer connection timeout in seconds.\r\nReturns a bidirectional TCP stream, or NIL if it timed out.\r\nIf ACCESS-MODE is :PRIVATE, then the stream is assumed to not be shared with anyone.\nOpen a TCP connection to PORT on HOST.\nTIMEOUT, if non-nil, is an integer connection timeout in seconds.\nReturns a bidirectional TCP stream, or NIL if it timed out.\nIf ACCESS-MODE is :PRIVATE, then the stream is assumed to not be shared with anyone.")
    public static SubLObject open_tcp_stream_with_timeout(final SubLObject host, final SubLObject port, SubLObject timeout, SubLObject access_mode) {
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        if (access_mode == UNPROVIDED) {
            access_mode = $PUBLIC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stream_access_mode_p(access_mode) : "! subl_promotions.stream_access_mode_p(access_mode) " + ("subl_promotions.stream_access_mode_p(access_mode) " + "CommonSymbols.NIL != subl_promotions.stream_access_mode_p(access_mode) ") + access_mode;
        SubLObject error_message = NIL;
        final SubLObject timed_out = NIL;
        SubLObject v_answer = NIL;
        if (NIL != timeout) {
            assert NIL != number_utilities.non_negative_number_p(timeout) : "! number_utilities.non_negative_number_p(timeout) " + ("number_utilities.non_negative_number_p(timeout) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(timeout) ") + timeout;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (access_mode == $PRIVATE) {
                            final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                v_answer = Tcp.open_tcp_stream(host, port, timeout);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$1, thread);
                            }
                        } else {
                            v_answer = Tcp.open_tcp_stream(host, port, timeout);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (access_mode == $PRIVATE) {
                            final SubLObject _prev_bind_0_$2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                v_answer = Tcp.open_tcp_stream(host, port, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$2, thread);
                            }
                        } else {
                            v_answer = Tcp.open_tcp_stream(host, port, NIL);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        }
        if (NIL != error_message) {
            Errors.error($str18$_A, error_message);
        }
        return v_answer;
    }

    /**
     * Return T iff OBJECT is a valid stream access mode.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid stream access mode.")
    public static final SubLObject stream_access_mode_p_alt(SubLObject v_object) {
        return member(v_object, $list_alt19, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Return T iff OBJECT is a valid stream access mode.")
    public static SubLObject stream_access_mode_p(final SubLObject v_object) {
        return member(v_object, $list19, UNPROVIDED, UNPROVIDED);
    }/**
     * Return T iff OBJECT is a valid stream access mode.
     */


    /**
     * Return the elements of LIST as multiple values.
     */
    @LispMethod(comment = "Return the elements of LIST as multiple values.")
    public static final SubLObject values_list_alt(SubLObject list) {
        return apply(symbol_function(VALUES), list);
    }

    @LispMethod(comment = "Return the elements of LIST as multiple values.")
    public static SubLObject values_list(final SubLObject list) {
        return apply(symbol_function(VALUES), list);
    }/**
     * Return the elements of LIST as multiple values.
     */


    /**
     * Return T iff OBJECT is a symbol with a function definition.
     */
    @LispMethod(comment = "Return T iff OBJECT is a symbol with a function definition.")
    public static final SubLObject function_symbol_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isSymbol() && (NIL != fboundp(v_object))) && symbol_function(v_object).isFunction());
    }

    @LispMethod(comment = "Return T iff OBJECT is a symbol with a function definition.")
    public static SubLObject function_symbol_p(final SubLObject v_object) {
        return makeBoolean((v_object.isSymbol() && (NIL != fboundp(v_object))) && symbol_function(v_object).isFunction());
    }/**
     * Return T iff OBJECT is a symbol with a function definition.
     */


    /**
     * Return the arglist of FUNCTION-SYMBOL
     */
    @LispMethod(comment = "Return the arglist of FUNCTION-SYMBOL")
    public static final SubLObject function_symbol_arglist_alt(SubLObject function_symbol) {
        SubLTrampolineFile.checkType(function_symbol, FUNCTION_SYMBOL_P);
        return funcall(ARGLIST, function_symbol);
    }

    @LispMethod(comment = "Return the arglist of FUNCTION-SYMBOL")
    public static SubLObject function_symbol_arglist(final SubLObject function_symbol) {
        assert NIL != symbolp(function_symbol) : "! symbolp(function_symbol) " + ("Types.symbolp(function_symbol) " + "CommonSymbols.NIL != Types.symbolp(function_symbol) ") + function_symbol;
        return funcall(ARGLIST, function_symbol);
    }/**
     * Return the arglist of FUNCTION-SYMBOL
     */


    /**
     * Like SUBLIS except ALIST is interpreted as (VALUE . KEY) pairs.
     */
    @LispMethod(comment = "Like SUBLIS except ALIST is interpreted as (VALUE . KEY) pairs.")
    public static final SubLObject rsublis_alt(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(test, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(key, FUNCTION_SPEC_P);
        if (symbol_function(IDENTITY) != key) {
            return com.cyc.cycjava.cycl.subl_promotions.rsublis_4(alist, tree, test, key);
        } else {
            if (symbol_function(EQL) != test) {
                return com.cyc.cycjava.cycl.subl_promotions.rsublis_3(alist, tree, test);
            } else {
                return com.cyc.cycjava.cycl.subl_promotions.rsublis_2(alist, tree);
            }
        }
    }

    /**
     * Like SUBLIS except ALIST is interpreted as (VALUE . KEY) pairs.
     */
    @LispMethod(comment = "Like SUBLIS except ALIST is interpreted as (VALUE . KEY) pairs.")
    public static SubLObject rsublis(final SubLObject alist, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != function_spec_p(test) : "! function_spec_p(test) " + ("Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) ") + test;
        assert NIL != function_spec_p(key) : "! function_spec_p(key) " + ("Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) ") + key;
        if (!symbol_function(IDENTITY).eql(key)) {
            return rsublis_4(alist, tree, test, key);
        }
        if (!symbol_function(EQL).eql(test)) {
            return rsublis_3(alist, tree, test);
        }
        return rsublis_2(alist, tree);
    }

    /**
     * Like NSUBLIS except ALIST is interpreted as (VALUE . KEY) pairs.
     */
    @LispMethod(comment = "Like NSUBLIS except ALIST is interpreted as (VALUE . KEY) pairs.")
    public static final SubLObject nrsublis_alt(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(test, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(key, FUNCTION_SPEC_P);
        if (symbol_function(IDENTITY) != key) {
            return com.cyc.cycjava.cycl.subl_promotions.nrsublis_4(alist, tree, test, key);
        } else {
            if (symbol_function(EQL) != test) {
                return com.cyc.cycjava.cycl.subl_promotions.nrsublis_3(alist, tree, test);
            } else {
                return com.cyc.cycjava.cycl.subl_promotions.nrsublis_2(alist, tree);
            }
        }
    }

    /**
     * Like NSUBLIS except ALIST is interpreted as (VALUE . KEY) pairs.
     */
    @LispMethod(comment = "Like NSUBLIS except ALIST is interpreted as (VALUE . KEY) pairs.")
    public static SubLObject nrsublis(final SubLObject alist, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != function_spec_p(test) : "! function_spec_p(test) " + ("Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) ") + test;
        assert NIL != function_spec_p(key) : "! function_spec_p(key) " + ("Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) ") + key;
        if (!symbol_function(IDENTITY).eql(key)) {
            return nrsublis_4(alist, tree, test, key);
        }
        if (!symbol_function(EQL).eql(test)) {
            return nrsublis_3(alist, tree, test);
        }
        return nrsublis_2(alist, tree);
    }

    public static final SubLObject rsublis_2_alt(SubLObject alist, SubLObject tree) {
        {
            SubLObject cdolist_list_var = alist;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (NIL != entry) {
                    if (entry.rest().eql(tree)) {
                        return entry.first();
                    }
                }
            }
        }
        if (tree.isAtom()) {
            return tree;
        } else {
            {
                SubLObject tree_car = tree.first();
                SubLObject tree_cdr = tree.rest();
                SubLObject new_car = com.cyc.cycjava.cycl.subl_promotions.rsublis_2(alist, tree_car);
                SubLObject new_cdr = com.cyc.cycjava.cycl.subl_promotions.rsublis_2(alist, tree_cdr);
                return list_utilities.recons(new_car, new_cdr, tree);
            }
        }
    }

    public static SubLObject rsublis_2(final SubLObject alist, final SubLObject tree) {
        SubLObject cdolist_list_var = alist;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != entry) && entry.rest().eql(tree)) {
                return entry.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        if (tree.isAtom()) {
            return tree;
        }
        final SubLObject tree_car = tree.first();
        final SubLObject tree_cdr = tree.rest();
        final SubLObject new_car = rsublis_2(alist, tree_car);
        final SubLObject new_cdr = rsublis_2(alist, tree_cdr);
        return list_utilities.recons(new_car, new_cdr, tree);
    }

    public static final SubLObject nrsublis_2_alt(SubLObject alist, SubLObject tree) {
        {
            SubLObject cdolist_list_var = alist;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (NIL != entry) {
                    if (entry.rest().eql(tree)) {
                        return entry.first();
                    }
                }
            }
        }
        if (tree.isAtom()) {
            return tree;
        } else {
            {
                SubLObject tree_car = tree.first();
                SubLObject tree_cdr = tree.rest();
                SubLObject new_car = com.cyc.cycjava.cycl.subl_promotions.nrsublis_2(alist, tree_car);
                SubLObject new_cdr = com.cyc.cycjava.cycl.subl_promotions.nrsublis_2(alist, tree_cdr);
                return list_utilities.ncons(new_car, new_cdr, tree);
            }
        }
    }

    public static SubLObject nrsublis_2(final SubLObject alist, final SubLObject tree) {
        SubLObject cdolist_list_var = alist;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != entry) && entry.rest().eql(tree)) {
                return entry.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        if (tree.isAtom()) {
            return tree;
        }
        final SubLObject tree_car = tree.first();
        final SubLObject tree_cdr = tree.rest();
        final SubLObject new_car = nrsublis_2(alist, tree_car);
        final SubLObject new_cdr = nrsublis_2(alist, tree_cdr);
        return list_utilities.ncons(new_car, new_cdr, tree);
    }

    public static final SubLObject rsublis_3_alt(SubLObject alist, SubLObject tree, SubLObject test) {
        {
            SubLObject cdolist_list_var = alist;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (NIL != entry) {
                    if (NIL != funcall(test, entry.rest(), tree)) {
                        return entry.first();
                    }
                }
            }
        }
        if (tree.isAtom()) {
            return tree;
        } else {
            {
                SubLObject tree_car = tree.first();
                SubLObject tree_cdr = tree.rest();
                SubLObject new_car = com.cyc.cycjava.cycl.subl_promotions.rsublis_3(alist, tree_car, test);
                SubLObject new_cdr = com.cyc.cycjava.cycl.subl_promotions.rsublis_3(alist, tree_cdr, test);
                return list_utilities.recons(new_car, new_cdr, tree);
            }
        }
    }

    public static SubLObject rsublis_3(final SubLObject alist, final SubLObject tree, final SubLObject test) {
        SubLObject cdolist_list_var = alist;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != entry) && (NIL != funcall(test, entry.rest(), tree))) {
                return entry.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        if (tree.isAtom()) {
            return tree;
        }
        final SubLObject tree_car = tree.first();
        final SubLObject tree_cdr = tree.rest();
        final SubLObject new_car = rsublis_3(alist, tree_car, test);
        final SubLObject new_cdr = rsublis_3(alist, tree_cdr, test);
        return list_utilities.recons(new_car, new_cdr, tree);
    }

    public static final SubLObject nrsublis_3_alt(SubLObject alist, SubLObject tree, SubLObject test) {
        {
            SubLObject cdolist_list_var = alist;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (NIL != entry) {
                    if (NIL != funcall(test, entry.rest(), tree)) {
                        return entry.first();
                    }
                }
            }
        }
        if (tree.isAtom()) {
            return tree;
        } else {
            {
                SubLObject tree_car = tree.first();
                SubLObject tree_cdr = tree.rest();
                SubLObject new_car = com.cyc.cycjava.cycl.subl_promotions.nrsublis_3(alist, tree_car, test);
                SubLObject new_cdr = com.cyc.cycjava.cycl.subl_promotions.nrsublis_3(alist, tree_cdr, test);
                return list_utilities.ncons(new_car, new_cdr, tree);
            }
        }
    }

    public static SubLObject nrsublis_3(final SubLObject alist, final SubLObject tree, final SubLObject test) {
        SubLObject cdolist_list_var = alist;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != entry) && (NIL != funcall(test, entry.rest(), tree))) {
                return entry.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        if (tree.isAtom()) {
            return tree;
        }
        final SubLObject tree_car = tree.first();
        final SubLObject tree_cdr = tree.rest();
        final SubLObject new_car = nrsublis_3(alist, tree_car, test);
        final SubLObject new_cdr = nrsublis_3(alist, tree_cdr, test);
        return list_utilities.ncons(new_car, new_cdr, tree);
    }

    public static final SubLObject rsublis_4_alt(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
        {
            SubLObject tree_key = funcall(key, tree);
            SubLObject cdolist_list_var = alist;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (NIL != entry) {
                    if (NIL != funcall(test, entry.rest(), tree_key)) {
                        return entry.first();
                    }
                }
            }
        }
        if (tree.isAtom()) {
            return tree;
        } else {
            {
                SubLObject tree_car = tree.first();
                SubLObject tree_cdr = tree.rest();
                SubLObject new_car = com.cyc.cycjava.cycl.subl_promotions.rsublis_4(alist, tree_car, test, key);
                SubLObject new_cdr = com.cyc.cycjava.cycl.subl_promotions.rsublis_4(alist, tree_cdr, test, key);
                return list_utilities.recons(new_car, new_cdr, tree);
            }
        }
    }

    public static SubLObject rsublis_4(final SubLObject alist, final SubLObject tree, final SubLObject test, final SubLObject key) {
        final SubLObject tree_key = funcall(key, tree);
        SubLObject cdolist_list_var = alist;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != entry) && (NIL != funcall(test, entry.rest(), tree_key))) {
                return entry.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        if (tree.isAtom()) {
            return tree;
        }
        final SubLObject tree_car = tree.first();
        final SubLObject tree_cdr = tree.rest();
        final SubLObject new_car = rsublis_4(alist, tree_car, test, key);
        final SubLObject new_cdr = rsublis_4(alist, tree_cdr, test, key);
        return list_utilities.recons(new_car, new_cdr, tree);
    }

    public static final SubLObject nrsublis_4_alt(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
        {
            SubLObject tree_key = funcall(key, tree);
            SubLObject cdolist_list_var = alist;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (NIL != entry) {
                    if (NIL != funcall(test, entry.rest(), tree_key)) {
                        return entry.first();
                    }
                }
            }
        }
        if (tree.isAtom()) {
            return tree;
        } else {
            {
                SubLObject tree_car = tree.first();
                SubLObject tree_cdr = tree.rest();
                SubLObject new_car = com.cyc.cycjava.cycl.subl_promotions.nrsublis_4(alist, tree_car, test, key);
                SubLObject new_cdr = com.cyc.cycjava.cycl.subl_promotions.nrsublis_4(alist, tree_cdr, test, key);
                return list_utilities.ncons(new_car, new_cdr, tree);
            }
        }
    }

    public static SubLObject nrsublis_4(final SubLObject alist, final SubLObject tree, final SubLObject test, final SubLObject key) {
        final SubLObject tree_key = funcall(key, tree);
        SubLObject cdolist_list_var = alist;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != entry) && (NIL != funcall(test, entry.rest(), tree_key))) {
                return entry.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        if (tree.isAtom()) {
            return tree;
        }
        final SubLObject tree_car = tree.first();
        final SubLObject tree_cdr = tree.rest();
        final SubLObject new_car = nrsublis_4(alist, tree_car, test, key);
        final SubLObject new_cdr = nrsublis_4(alist, tree_cdr, test, key);
        return list_utilities.ncons(new_car, new_cdr, tree);
    }

    /**
     * Return the initial process, or NIL if there is no equivalent.
     * The initial process sometimes must be treated differently, since it
     * may be acting as the scheduler for the other processes.
     */
    @LispMethod(comment = "Return the initial process, or NIL if there is no equivalent.\r\nThe initial process sometimes must be treated differently, since it\r\nmay be acting as the scheduler for the other processes.\nReturn the initial process, or NIL if there is no equivalent.\nThe initial process sometimes must be treated differently, since it\nmay be acting as the scheduler for the other processes.")
    public static final SubLObject initial_process_alt() {
        {
            SubLObject all_processes = all_processes();
            if (NIL != all_processes) {
                return last(all_processes, UNPROVIDED).first();
            }
            {
                SubLObject current_process = current_process();
                if (NIL != current_process) {
                    return current_process;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return the initial process, or NIL if there is no equivalent.\r\nThe initial process sometimes must be treated differently, since it\r\nmay be acting as the scheduler for the other processes.\nReturn the initial process, or NIL if there is no equivalent.\nThe initial process sometimes must be treated differently, since it\nmay be acting as the scheduler for the other processes.")
    public static SubLObject initial_process() {
        final SubLObject all_processes = all_processes();
        if (NIL != all_processes) {
            return last(all_processes, UNPROVIDED).first();
        }
        final SubLObject current_process = current_process();
        if (NIL != current_process) {
            return current_process;
        }
        return NIL;
    }/**
     * Return the initial process, or NIL if there is no equivalent.
     * The initial process sometimes must be treated differently, since it
     * may be acting as the scheduler for the other processes.
     */


    /**
     * Change the INDEX item in SEQUENCE to VALUE
     */
    @LispMethod(comment = "Change the INDEX item in SEQUENCE to VALUE")
    public static final SubLObject set_elt_alt(SubLObject sequence, SubLObject index, SubLObject value) {
        SubLTrampolineFile.checkType(sequence, SEQUENCEP);
        if (sequence.isList()) {
            set_nth(index, sequence, value);
        } else {
            if (sequence.isVector()) {
                set_aref(sequence, index, value);
            } else {
                if (sequence.isString()) {
                    Strings.set_char(sequence, index, value);
                }
            }
        }
        return sequence;
    }

    @LispMethod(comment = "Change the INDEX item in SEQUENCE to VALUE")
    public static SubLObject set_elt(final SubLObject sequence, final SubLObject index, final SubLObject value) {
        assert NIL != sequencep(sequence) : "! sequencep(sequence) " + ("Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) ") + sequence;
        if (sequence.isList()) {
            set_nth(index, sequence, value);
        } else
            if (sequence.isVector()) {
                set_aref(sequence, index, value);
            } else
                if (sequence.isString()) {
                    Strings.set_char(sequence, index, value);
                }


        return sequence;
    }/**
     * Change the INDEX item in SEQUENCE to VALUE
     */


    /**
     * Funcall FUNC.
     * FUNC must specify a function that takes exactly 0 arguments.
     */
    @LispMethod(comment = "Funcall FUNC.\r\nFUNC must specify a function that takes exactly 0 arguments.\nFuncall FUNC.\nFUNC must specify a function that takes exactly 0 arguments.")
    public static final SubLObject funcall_0_alt(SubLObject func) {
        return funcall(func);
    }

    @LispMethod(comment = "Funcall FUNC.\r\nFUNC must specify a function that takes exactly 0 arguments.\nFuncall FUNC.\nFUNC must specify a function that takes exactly 0 arguments.")
    public static SubLObject funcall_0(final SubLObject func) {
        return funcall(func);
    }/**
     * Funcall FUNC.
     * FUNC must specify a function that takes exactly 0 arguments.
     */


    /**
     * Funcall FUNC on ARG1.
     * FUNC must specify a function that takes exactly 1 argument.
     */
    @LispMethod(comment = "Funcall FUNC on ARG1.\r\nFUNC must specify a function that takes exactly 1 argument.\nFuncall FUNC on ARG1.\nFUNC must specify a function that takes exactly 1 argument.")
    public static final SubLObject funcall_1_alt(SubLObject func, SubLObject arg1) {
        return funcall(func, arg1);
    }

    @LispMethod(comment = "Funcall FUNC on ARG1.\r\nFUNC must specify a function that takes exactly 1 argument.\nFuncall FUNC on ARG1.\nFUNC must specify a function that takes exactly 1 argument.")
    public static SubLObject funcall_1(final SubLObject func, final SubLObject arg1) {
        return funcall(func, arg1);
    }/**
     * Funcall FUNC on ARG1.
     * FUNC must specify a function that takes exactly 1 argument.
     */


    /**
     * Funcall FUNC on ARG1 and ARG2.
     * FUNC must specify a function that takes exactly 2 arguments.
     */
    @LispMethod(comment = "Funcall FUNC on ARG1 and ARG2.\r\nFUNC must specify a function that takes exactly 2 arguments.\nFuncall FUNC on ARG1 and ARG2.\nFUNC must specify a function that takes exactly 2 arguments.")
    public static final SubLObject funcall_2_alt(SubLObject func, SubLObject arg1, SubLObject arg2) {
        return funcall(func, arg1, arg2);
    }

    @LispMethod(comment = "Funcall FUNC on ARG1 and ARG2.\r\nFUNC must specify a function that takes exactly 2 arguments.\nFuncall FUNC on ARG1 and ARG2.\nFUNC must specify a function that takes exactly 2 arguments.")
    public static SubLObject funcall_2(final SubLObject func, final SubLObject arg1, final SubLObject arg2) {
        return funcall(func, arg1, arg2);
    }/**
     * Funcall FUNC on ARG1 and ARG2.
     * FUNC must specify a function that takes exactly 2 arguments.
     */


    /**
     * Funcall FUNC on ARG1, ARG2, and ARG3.
     * FUNC must specify a function that takes exactly 3 arguments.
     */
    @LispMethod(comment = "Funcall FUNC on ARG1, ARG2, and ARG3.\r\nFUNC must specify a function that takes exactly 3 arguments.\nFuncall FUNC on ARG1, ARG2, and ARG3.\nFUNC must specify a function that takes exactly 3 arguments.")
    public static final SubLObject funcall_3_alt(SubLObject func, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        return funcall(func, arg1, arg2, arg3);
    }

    @LispMethod(comment = "Funcall FUNC on ARG1, ARG2, and ARG3.\r\nFUNC must specify a function that takes exactly 3 arguments.\nFuncall FUNC on ARG1, ARG2, and ARG3.\nFUNC must specify a function that takes exactly 3 arguments.")
    public static SubLObject funcall_3(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        return funcall(func, arg1, arg2, arg3);
    }/**
     * Funcall FUNC on ARG1, ARG2, and ARG3.
     * FUNC must specify a function that takes exactly 3 arguments.
     */


    /**
     * Funcall FUNC on ARG1, ARG2, ARG3, and ARG4.
     * FUNC must specify a function that takes exactly 4 arguments.
     */
    @LispMethod(comment = "Funcall FUNC on ARG1, ARG2, ARG3, and ARG4.\r\nFUNC must specify a function that takes exactly 4 arguments.\nFuncall FUNC on ARG1, ARG2, ARG3, and ARG4.\nFUNC must specify a function that takes exactly 4 arguments.")
    public static final SubLObject funcall_4_alt(SubLObject func, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        return funcall(func, arg1, arg2, arg3, arg4);
    }

    @LispMethod(comment = "Funcall FUNC on ARG1, ARG2, ARG3, and ARG4.\r\nFUNC must specify a function that takes exactly 4 arguments.\nFuncall FUNC on ARG1, ARG2, ARG3, and ARG4.\nFUNC must specify a function that takes exactly 4 arguments.")
    public static SubLObject funcall_4(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        return funcall(func, arg1, arg2, arg3, arg4);
    }/**
     * Funcall FUNC on ARG1, ARG2, ARG3, and ARG4.
     * FUNC must specify a function that takes exactly 4 arguments.
     */


    /**
     * Return the number of elapsed seconds from the current time to PAST-TIME.
     * If non-nil, CURRENT-TIME is used as the current time.
     */
    @LispMethod(comment = "Return the number of elapsed seconds from the current time to PAST-TIME.\r\nIf non-nil, CURRENT-TIME is used as the current time.\nReturn the number of elapsed seconds from the current time to PAST-TIME.\nIf non-nil, CURRENT-TIME is used as the current time.")
    public static final SubLObject elapsed_universal_time_alt(SubLObject past_time, SubLObject current_time) {
        if (current_time == UNPROVIDED) {
            current_time = NIL;
        }
        if (NIL == current_time) {
            current_time = get_universal_time();
        }
        return subtract(current_time, past_time);
    }

    @LispMethod(comment = "Return the number of elapsed seconds from the current time to PAST-TIME.\r\nIf non-nil, CURRENT-TIME is used as the current time.\nReturn the number of elapsed seconds from the current time to PAST-TIME.\nIf non-nil, CURRENT-TIME is used as the current time.")
    public static SubLObject elapsed_universal_time(final SubLObject past_time, SubLObject current_time) {
        if (current_time == UNPROVIDED) {
            current_time = NIL;
        }
        if (NIL == current_time) {
            current_time = get_universal_time();
        }
        return subtract(current_time, past_time);
    }/**
     * Return the number of elapsed seconds from the current time to PAST-TIME.
     * If non-nil, CURRENT-TIME is used as the current time.
     */


    /**
     *
     *
     * @param PATHNAME;
    stringp
     * 		
     * @return stringp
    Convert PATHNAME to a physical pathname (performing any logical pathname translations)
     */
    @LispMethod(comment = "@param PATHNAME;\nstringp\r\n\t\t\r\n@return stringp\r\nConvert PATHNAME to a physical pathname (performing any logical pathname translations)")
    public static final SubLObject ensure_physical_pathname_alt(SubLObject pathname) {
        SubLTrampolineFile.checkType(pathname, STRINGP);
        {
            SubLObject result = pathname;
            return result;
        }
    }

    /**
     *
     *
     * @param PATHNAME;
    stringp
     * 		
     * @return stringp
    Convert PATHNAME to a physical pathname (performing any logical pathname translations)
     */
    @LispMethod(comment = "@param PATHNAME;\nstringp\r\n\t\t\r\n@return stringp\r\nConvert PATHNAME to a physical pathname (performing any logical pathname translations)")
    public static SubLObject ensure_physical_pathname(final SubLObject pathname) {
        assert NIL != stringp(pathname) : "! stringp(pathname) " + ("Types.stringp(pathname) " + "CommonSymbols.NIL != Types.stringp(pathname) ") + pathname;
        return pathname;
    }

    public static final SubLObject memberP_alt(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return makeBoolean(NIL != position(item, list, test, key, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject memberP(final SubLObject item, final SubLObject list, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return makeBoolean(NIL != position(item, list, test, key, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Return T iff OBJECT is an integer > 0
     */
    @LispMethod(comment = "Return T iff OBJECT is an integer > 0")
    public static final SubLObject positive_integer_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && v_object.isPositive());
    }

    @LispMethod(comment = "Return T iff OBJECT is an integer > 0")
    public static SubLObject positive_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && v_object.isPositive());
    }/**
     * Return T iff OBJECT is an integer > 0
     */


    /**
     * Return T iff OBJECT is an integer >= 0
     */
    @LispMethod(comment = "Return T iff OBJECT is an integer >= 0")
    public static final SubLObject non_negative_integer_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (!v_object.isNegative()));
    }

    @LispMethod(comment = "Return T iff OBJECT is an integer >= 0")
    public static SubLObject non_negative_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (!v_object.isNegative()));
    }/**
     * Return T iff OBJECT is an integer >= 0
     */


    /**
     * Return T iff OBJECT is an integer <= 0
     */
    @LispMethod(comment = "Return T iff OBJECT is an integer <= 0")
    public static final SubLObject non_positive_integer_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (!v_object.isPositive()));
    }

    @LispMethod(comment = "Return T iff OBJECT is an integer <= 0")
    public static SubLObject non_positive_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (!v_object.isPositive()));
    }/**
     * Return T iff OBJECT is an integer <= 0
     */


    /**
     * Return T iff OBJECT is an integer < 0
     */
    @LispMethod(comment = "Return T iff OBJECT is an integer < 0")
    public static final SubLObject negative_integer_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && v_object.isNegative());
    }

    @LispMethod(comment = "Return T iff OBJECT is an integer < 0")
    public static SubLObject negative_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && v_object.isNegative());
    }/**
     * Return T iff OBJECT is an integer < 0
     */


    /**
     * Return T iff OBJECT is an integer not equal to 0
     */
    @LispMethod(comment = "Return T iff OBJECT is an integer not equal to 0")
    public static final SubLObject non_zero_integer_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (!v_object.isZero()));
    }

    @LispMethod(comment = "Return T iff OBJECT is an integer not equal to 0")
    public static SubLObject non_zero_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (!v_object.isZero()));
    }/**
     * Return T iff OBJECT is an integer not equal to 0
     */


    public static SubLObject odd_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (NIL != oddp(v_object)));
    }

    public static SubLObject even_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (NIL != evenp(v_object)));
    }

    public static SubLObject number_in_range_p(final SubLObject v_object, final SubLObject low, final SubLObject high) {
        return makeBoolean((v_object.isNumber() && v_object.numGE(low)) && high.numGE(v_object));
    }

    /**
     * Return the hostname of the remote system connected to by the TCP STREAM.
     */
    @LispMethod(comment = "Return the hostname of the remote system connected to by the TCP STREAM.")
    public static final SubLObject tcp_stream_remote_hostname_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return Tcp.$remote_hostname$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Return the hostname of the remote system connected to by the TCP STREAM.")
    public static SubLObject tcp_stream_remote_hostname(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Tcp.$remote_hostname$.getDynamicValue(thread);
    }/**
     * Return the hostname of the remote system connected to by the TCP STREAM.
     */


    /**
     * Return the IP address string of the remote system connected to by the TCP STREAM.
     */
    @LispMethod(comment = "Return the IP address string of the remote system connected to by the TCP STREAM.")
    public static final SubLObject tcp_stream_remote_address_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = disassemble_integer_to_fixnums(Tcp.$remote_address$.getDynamicValue(thread));
                SubLObject current = datum;
                SubLObject sign = NIL;
                SubLObject b0 = NIL;
                SubLObject b1 = NIL;
                SubLObject b2 = NIL;
                SubLObject b3 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt30);
                sign = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt30);
                b0 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt30);
                b1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt30);
                b2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt30);
                b3 = current.first();
                current = current.rest();
                {
                    SubLObject b4 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt30);
                    current = current.rest();
                    {
                        SubLObject b5 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt30);
                        current = current.rest();
                        if (NIL == current) {
                            return NIL != b4 ? ((SubLObject) (format(NIL, $str_alt31$_D__D__D__D__D__D, new SubLObject[]{ b5, b4, b3, b2, b1, b0 }))) : format(NIL, $str_alt32$_D__D__D__D, new SubLObject[]{ b3, b2, b1, b0 });
                        } else {
                            cdestructuring_bind_error(datum, $list_alt30);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Return the IP address string of the remote system connected to by the TCP STREAM.")
    public static SubLObject tcp_stream_remote_address(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = disassemble_integer_to_fixnums(Tcp.$remote_address$.getDynamicValue(thread));
        SubLObject sign = NIL;
        SubLObject b0 = NIL;
        SubLObject b2 = NIL;
        SubLObject b3 = NIL;
        SubLObject b4 = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        sign = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        b0 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        b2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        b3 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        b4 = current.first();
        current = current.rest();
        final SubLObject b5 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list25);
        current = current.rest();
        final SubLObject b6 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list25);
        current = current.rest();
        if (NIL == current) {
            return NIL != b5 ? format(NIL, $str26$_D__D__D__D__D__D, new SubLObject[]{ b6, b5, b4, b3, b2, b0 }) : format(NIL, $str27$_D__D__D__D, new SubLObject[]{ b4, b3, b2, b0 });
        }
        cdestructuring_bind_error(datum, $list25);
        return NIL;
    }/**
     * Return the IP address string of the remote system connected to by the TCP STREAM.
     */


    /**
     * Return the initialization type of GLOBAL, either :INITIALIZATOR or :WORLD.
     * Return :UNSPECIFIED if GLOBAL is not a global variable.
     */
    @LispMethod(comment = "Return the initialization type of GLOBAL, either :INITIALIZATOR or :WORLD.\r\nReturn :UNSPECIFIED if GLOBAL is not a global variable.\nReturn the initialization type of GLOBAL, either :INITIALIZATOR or :WORLD.\nReturn :UNSPECIFIED if GLOBAL is not a global variable.")
    public static final SubLObject global_initialization_type_alt(SubLObject global) {
        return get(global, $INITIALIZATION_TYPE, $UNSPECIFIED);
    }

    @LispMethod(comment = "Return the initialization type of GLOBAL, either :INITIALIZATOR or :WORLD.\r\nReturn :UNSPECIFIED if GLOBAL is not a global variable.\nReturn the initialization type of GLOBAL, either :INITIALIZATOR or :WORLD.\nReturn :UNSPECIFIED if GLOBAL is not a global variable.")
    public static SubLObject global_initialization_type(final SubLObject global) {
        return get(global, $INITIALIZATION_TYPE, $UNSPECIFIED);
    }/**
     * Return the initialization type of GLOBAL, either :INITIALIZATOR or :WORLD.
     * Return :UNSPECIFIED if GLOBAL is not a global variable.
     */


    /**
     * Return T iff OBJECT is a valid global initialization type, either :INITIALIZER or :WORLD
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid global initialization type, either :INITIALIZER or :WORLD")
    public static final SubLObject initialization_type_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list_alt35);
    }

    @LispMethod(comment = "Return T iff OBJECT is a valid global initialization type, either :INITIALIZER or :WORLD")
    public static SubLObject initialization_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list30);
    }/**
     * Return T iff OBJECT is a valid global initialization type, either :INITIALIZER or :WORLD
     */


    public static SubLObject values2(final SubLObject value1, final SubLObject value2) {
        return values(value1, value2);
    }

    public static SubLObject values3(final SubLObject value1, final SubLObject value2, final SubLObject value3) {
        return values(value1, value2, value3);
    }

    public static SubLObject values4(final SubLObject value1, final SubLObject value2, final SubLObject value3, final SubLObject value4) {
        return values(value1, value2, value3, value4);
    }

    public static SubLObject get_temp_directory() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tempdir = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject wjava_static = JavaLink.java_static($$$getProperty, $str37$java_lang_System, new SubLObject[]{ $str38$java_io_tmpdir });
                    tempdir = Strings.string(wjava_static);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return tempdir;
    }

    public static final SubLObject declare_subl_promotions_file_alt() {
        declareFunction("make_process_with_args", "MAKE-PROCESS-WITH-ARGS", 2, 1, false);
        declareFunction("make_process_with_args_internal", "MAKE-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
        declareFunction("interrupt_process_with_args", "INTERRUPT-PROCESS-WITH-ARGS", 2, 1, false);
        declareFunction("interrupt_process_with_args_internal", "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
        declareFunction("open_tcp_stream_with_timeout", "OPEN-TCP-STREAM-WITH-TIMEOUT", 2, 2, false);
        declareFunction("open_tcp_stream_with_access", "OPEN-TCP-STREAM-WITH-ACCESS", 2, 1, false);
        declareFunction("stream_access_mode_p", "STREAM-ACCESS-MODE-P", 1, 0, false);
        declareFunction("values_list", "VALUES-LIST", 1, 0, false);
        declareFunction("function_symbol_p", "FUNCTION-SYMBOL-P", 1, 0, false);
        declareFunction("function_symbol_arglist", "FUNCTION-SYMBOL-ARGLIST", 1, 0, false);
        declareFunction("rsublis", "RSUBLIS", 2, 2, false);
        declareFunction("nrsublis", "NRSUBLIS", 2, 2, false);
        declareFunction("rsublis_2", "RSUBLIS-2", 2, 0, false);
        declareFunction("nrsublis_2", "NRSUBLIS-2", 2, 0, false);
        declareFunction("rsublis_3", "RSUBLIS-3", 3, 0, false);
        declareFunction("nrsublis_3", "NRSUBLIS-3", 3, 0, false);
        declareFunction("rsublis_4", "RSUBLIS-4", 4, 0, false);
        declareFunction("nrsublis_4", "NRSUBLIS-4", 4, 0, false);
        declareFunction("initial_process", "INITIAL-PROCESS", 0, 0, false);
        declareFunction("set_elt", "SET-ELT", 3, 0, false);
        declareFunction("funcall_0", "FUNCALL-0", 1, 0, false);
        declareFunction("funcall_1", "FUNCALL-1", 2, 0, false);
        declareFunction("funcall_2", "FUNCALL-2", 3, 0, false);
        declareFunction("funcall_3", "FUNCALL-3", 4, 0, false);
        declareFunction("funcall_4", "FUNCALL-4", 5, 0, false);
        declareFunction("elapsed_universal_time", "ELAPSED-UNIVERSAL-TIME", 1, 1, false);
        declareFunction("copy_file", "COPY-FILE", 2, 0, false);
        declareFunction("ensure_physical_pathname", "ENSURE-PHYSICAL-PATHNAME", 1, 0, false);
        declareFunction("memberP", "MEMBER?", 2, 2, false);
        declareFunction("positive_integer_p", "POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction("non_negative_integer_p", "NON-NEGATIVE-INTEGER-P", 1, 0, false);
        new com.cyc.cycjava.cycl.subl_promotions.$non_negative_integer_p$UnaryFunction();
        declareFunction("non_positive_integer_p", "NON-POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction("negative_integer_p", "NEGATIVE-INTEGER-P", 1, 0, false);
        declareFunction("non_zero_integer_p", "NON-ZERO-INTEGER-P", 1, 0, false);
        declareFunction("tcp_stream_remote_hostname", "TCP-STREAM-REMOTE-HOSTNAME", 1, 0, false);
        declareFunction("tcp_stream_remote_address", "TCP-STREAM-REMOTE-ADDRESS", 1, 0, false);
        declareFunction("global_initialization_type", "GLOBAL-INITIALIZATION-TYPE", 1, 0, false);
        declareFunction("initialization_type_p", "INITIALIZATION-TYPE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_subl_promotions_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("make_process_with_args", "MAKE-PROCESS-WITH-ARGS", 2, 1, false);
            declareFunction("make_process_with_args_internal", "MAKE-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
            declareFunction("interrupt_process_with_args", "INTERRUPT-PROCESS-WITH-ARGS", 2, 1, false);
            declareFunction("interrupt_process_with_args_internal", "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
            declareFunction("open_tcp_stream_with_timeout", "OPEN-TCP-STREAM-WITH-TIMEOUT", 2, 2, false);
            declareFunction("stream_access_mode_p", "STREAM-ACCESS-MODE-P", 1, 0, false);
            declareFunction("values_list", "VALUES-LIST", 1, 0, false);
            declareFunction("function_symbol_p", "FUNCTION-SYMBOL-P", 1, 0, false);
            declareFunction("function_symbol_arglist", "FUNCTION-SYMBOL-ARGLIST", 1, 0, false);
            declareFunction("rsublis", "RSUBLIS", 2, 2, false);
            declareFunction("nrsublis", "NRSUBLIS", 2, 2, false);
            declareFunction("rsublis_2", "RSUBLIS-2", 2, 0, false);
            declareFunction("nrsublis_2", "NRSUBLIS-2", 2, 0, false);
            declareFunction("rsublis_3", "RSUBLIS-3", 3, 0, false);
            declareFunction("nrsublis_3", "NRSUBLIS-3", 3, 0, false);
            declareFunction("rsublis_4", "RSUBLIS-4", 4, 0, false);
            declareFunction("nrsublis_4", "NRSUBLIS-4", 4, 0, false);
            declareFunction("initial_process", "INITIAL-PROCESS", 0, 0, false);
            declareFunction("set_elt", "SET-ELT", 3, 0, false);
            declareFunction("funcall_0", "FUNCALL-0", 1, 0, false);
            declareFunction("funcall_1", "FUNCALL-1", 2, 0, false);
            declareFunction("funcall_2", "FUNCALL-2", 3, 0, false);
            declareFunction("funcall_3", "FUNCALL-3", 4, 0, false);
            declareFunction("funcall_4", "FUNCALL-4", 5, 0, false);
            declareFunction("elapsed_universal_time", "ELAPSED-UNIVERSAL-TIME", 1, 1, false);
            declareFunction("ensure_physical_pathname", "ENSURE-PHYSICAL-PATHNAME", 1, 0, false);
            declareFunction("memberP", "MEMBER?", 2, 2, false);
            declareFunction("positive_integer_p", "POSITIVE-INTEGER-P", 1, 0, false);
            declareFunction("non_negative_integer_p", "NON-NEGATIVE-INTEGER-P", 1, 0, false);
            new subl_promotions.$non_negative_integer_p$UnaryFunction();
            declareFunction("non_positive_integer_p", "NON-POSITIVE-INTEGER-P", 1, 0, false);
            declareFunction("negative_integer_p", "NEGATIVE-INTEGER-P", 1, 0, false);
            declareFunction("non_zero_integer_p", "NON-ZERO-INTEGER-P", 1, 0, false);
            declareFunction("odd_integer_p", "ODD-INTEGER-P", 1, 0, false);
            declareFunction("even_integer_p", "EVEN-INTEGER-P", 1, 0, false);
            declareFunction("number_in_range_p", "NUMBER-IN-RANGE-P", 3, 0, false);
            declareFunction("tcp_stream_remote_hostname", "TCP-STREAM-REMOTE-HOSTNAME", 1, 0, false);
            declareFunction("tcp_stream_remote_address", "TCP-STREAM-REMOTE-ADDRESS", 1, 0, false);
            declareFunction("global_initialization_type", "GLOBAL-INITIALIZATION-TYPE", 1, 0, false);
            declareFunction("initialization_type_p", "INITIALIZATION-TYPE-P", 1, 0, false);
            declareFunction("values2", "VALUES2", 2, 0, false);
            declareFunction("values3", "VALUES3", 3, 0, false);
            declareFunction("values4", "VALUES4", 4, 0, false);
            declareFunction("get_temp_directory", "GET-TEMP-DIRECTORY", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("open_tcp_stream_with_access", "OPEN-TCP-STREAM-WITH-ACCESS", 2, 1, false);
            declareFunction("copy_file", "COPY-FILE", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_subl_promotions_file_Previous() {
        declareFunction("make_process_with_args", "MAKE-PROCESS-WITH-ARGS", 2, 1, false);
        declareFunction("make_process_with_args_internal", "MAKE-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
        declareFunction("interrupt_process_with_args", "INTERRUPT-PROCESS-WITH-ARGS", 2, 1, false);
        declareFunction("interrupt_process_with_args_internal", "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
        declareFunction("open_tcp_stream_with_timeout", "OPEN-TCP-STREAM-WITH-TIMEOUT", 2, 2, false);
        declareFunction("stream_access_mode_p", "STREAM-ACCESS-MODE-P", 1, 0, false);
        declareFunction("values_list", "VALUES-LIST", 1, 0, false);
        declareFunction("function_symbol_p", "FUNCTION-SYMBOL-P", 1, 0, false);
        declareFunction("function_symbol_arglist", "FUNCTION-SYMBOL-ARGLIST", 1, 0, false);
        declareFunction("rsublis", "RSUBLIS", 2, 2, false);
        declareFunction("nrsublis", "NRSUBLIS", 2, 2, false);
        declareFunction("rsublis_2", "RSUBLIS-2", 2, 0, false);
        declareFunction("nrsublis_2", "NRSUBLIS-2", 2, 0, false);
        declareFunction("rsublis_3", "RSUBLIS-3", 3, 0, false);
        declareFunction("nrsublis_3", "NRSUBLIS-3", 3, 0, false);
        declareFunction("rsublis_4", "RSUBLIS-4", 4, 0, false);
        declareFunction("nrsublis_4", "NRSUBLIS-4", 4, 0, false);
        declareFunction("initial_process", "INITIAL-PROCESS", 0, 0, false);
        declareFunction("set_elt", "SET-ELT", 3, 0, false);
        declareFunction("funcall_0", "FUNCALL-0", 1, 0, false);
        declareFunction("funcall_1", "FUNCALL-1", 2, 0, false);
        declareFunction("funcall_2", "FUNCALL-2", 3, 0, false);
        declareFunction("funcall_3", "FUNCALL-3", 4, 0, false);
        declareFunction("funcall_4", "FUNCALL-4", 5, 0, false);
        declareFunction("elapsed_universal_time", "ELAPSED-UNIVERSAL-TIME", 1, 1, false);
        declareFunction("ensure_physical_pathname", "ENSURE-PHYSICAL-PATHNAME", 1, 0, false);
        declareFunction("memberP", "MEMBER?", 2, 2, false);
        declareFunction("positive_integer_p", "POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction("non_negative_integer_p", "NON-NEGATIVE-INTEGER-P", 1, 0, false);
        new subl_promotions.$non_negative_integer_p$UnaryFunction();
        declareFunction("non_positive_integer_p", "NON-POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction("negative_integer_p", "NEGATIVE-INTEGER-P", 1, 0, false);
        declareFunction("non_zero_integer_p", "NON-ZERO-INTEGER-P", 1, 0, false);
        declareFunction("odd_integer_p", "ODD-INTEGER-P", 1, 0, false);
        declareFunction("even_integer_p", "EVEN-INTEGER-P", 1, 0, false);
        declareFunction("number_in_range_p", "NUMBER-IN-RANGE-P", 3, 0, false);
        declareFunction("tcp_stream_remote_hostname", "TCP-STREAM-REMOTE-HOSTNAME", 1, 0, false);
        declareFunction("tcp_stream_remote_address", "TCP-STREAM-REMOTE-ADDRESS", 1, 0, false);
        declareFunction("global_initialization_type", "GLOBAL-INITIALIZATION-TYPE", 1, 0, false);
        declareFunction("initialization_type_p", "INITIALIZATION-TYPE-P", 1, 0, false);
        declareFunction("values2", "VALUES2", 2, 0, false);
        declareFunction("values3", "VALUES3", 3, 0, false);
        declareFunction("values4", "VALUES4", 4, 0, false);
        declareFunction("get_temp_directory", "GET-TEMP-DIRECTORY", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_subl_promotions_file_alt() {
        deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE*", NIL != boundp($make_process_with_args_table$) ? ((SubLObject) ($make_process_with_args_table$.getGlobalValue())) : NIL);
        deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE-LOCK*", make_lock($str_alt1$MAKE_PROCESS_WITH_ARGS_TABLE));
        deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE*", NIL != boundp($interrupt_process_with_args_table$) ? ((SubLObject) ($interrupt_process_with_args_table$.getGlobalValue())) : NIL);
        deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE-LOCK*", make_lock($str_alt9$INTERRUPT_PROCESS_WITH_ARGS_TABLE));
        return NIL;
    }

    public static SubLObject init_subl_promotions_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE*", SubLTrampolineFile.maybeDefault($make_process_with_args_table$, $make_process_with_args_table$, NIL));
            deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE-LOCK*", make_lock($str1$MAKE_PROCESS_WITH_ARGS_TABLE));
            deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE*", SubLTrampolineFile.maybeDefault($interrupt_process_with_args_table$, $interrupt_process_with_args_table$, NIL));
            deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE-LOCK*", make_lock($str9$INTERRUPT_PROCESS_WITH_ARGS_TABLE));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE*", NIL != boundp($make_process_with_args_table$) ? ((SubLObject) ($make_process_with_args_table$.getGlobalValue())) : NIL);
            deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE*", NIL != boundp($interrupt_process_with_args_table$) ? ((SubLObject) ($interrupt_process_with_args_table$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_subl_promotions_file_Previous() {
        deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE*", SubLTrampolineFile.maybeDefault($make_process_with_args_table$, $make_process_with_args_table$, NIL));
        deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE-LOCK*", make_lock($str1$MAKE_PROCESS_WITH_ARGS_TABLE));
        deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE*", SubLTrampolineFile.maybeDefault($interrupt_process_with_args_table$, $interrupt_process_with_args_table$, NIL));
        deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE-LOCK*", make_lock($str9$INTERRUPT_PROCESS_WITH_ARGS_TABLE));
        return NIL;
    }

    public static SubLObject setup_subl_promotions_file() {
        declare_defglobal($make_process_with_args_table$);
        declare_defglobal($interrupt_process_with_args_table$);
        SubLSpecialOperatorDeclarations.proclaim($list24);
        SubLSpecialOperatorDeclarations.proclaim($list31);
        SubLSpecialOperatorDeclarations.proclaim($list32);
        SubLSpecialOperatorDeclarations.proclaim($list33);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subl_promotions_file();
    }

    @Override
    public void initializeVariables() {
        init_subl_promotions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subl_promotions_file();
    }

    static {
    }

    public static final class $non_negative_integer_p$UnaryFunction extends UnaryFunction {
        public $non_negative_integer_p$UnaryFunction() {
            super(extractFunctionNamed("NON-NEGATIVE-INTEGER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return non_negative_integer_p(arg1);
        }
    }

    static private final SubLString $str_alt1$MAKE_PROCESS_WITH_ARGS_TABLE = makeString("MAKE-PROCESS-WITH-ARGS-TABLE");

    static private final SubLString $str_alt6$Unable_to_get_make_process_args_f = makeString("Unable to get make-process args for ~S");

    static private final SubLList $list_alt7 = list(makeSymbol("PROCESS"), makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    static private final SubLString $str_alt9$INTERRUPT_PROCESS_WITH_ARGS_TABLE = makeString("INTERRUPT-PROCESS-WITH-ARGS-TABLE");

    static private final SubLString $str_alt12$Unable_to_get_interrupt_process_a = makeString("Unable to get interrupt-process args for ~S");

    static private final SubLString $str_alt16$_A = makeString("~A");

    static private final SubLList $list_alt19 = list(makeKeyword("PUBLIC"), makeKeyword("PRIVATE"));

    private static final SubLSymbol FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");

    static private final SubLString $$$cp = makeString("cp");

    static private final SubLString $str_alt25$_p = makeString("-p");

    static private final SubLString $str_alt27$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt30 = list(makeSymbol("SIGN"), makeSymbol("B0"), makeSymbol("B1"), makeSymbol("B2"), makeSymbol("B3"), makeSymbol("&OPTIONAL"), makeSymbol("B4"), makeSymbol("B5"));

    static private final SubLString $str_alt31$_D__D__D__D__D__D = makeString("~D.~D.~D.~D.~D.~D");

    static private final SubLString $str_alt32$_D__D__D__D = makeString("~D.~D.~D.~D");

    static private final SubLList $list_alt35 = list(makeKeyword("INITIALIZER"), makeKeyword("WORLD"));
}

/**
 * Total time: 229 ms
 */
