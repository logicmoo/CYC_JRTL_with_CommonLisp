package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.disassemble_integer_to_fixnums;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.all_processes;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.interrupt_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.processp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sequencep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.JavaLink;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class subl_promotions extends SubLTranslatedFile {
    public static final SubLFile me = new subl_promotions();

    public static final String myName = "com.cyc.cycjava.cycl.subl_promotions";

    public static final String myFingerPrint = "bf44b6091311034e4140c84b59e6c6e60269c2d4a0a5a7ef2187c20d85e6d349";



    // deflexical
    // Lock controlling access to *MAKE-PROCESS-WITH-ARGS-TABLE*
    private static final SubLSymbol $make_process_with_args_table_lock$ = makeSymbol("*MAKE-PROCESS-WITH-ARGS-TABLE-LOCK*");



    // deflexical
    // Lock controlling access to *INTERRUPT-PROCESS-WITH-ARGS-TABLE*
    private static final SubLSymbol $interrupt_process_with_args_table_lock$ = makeSymbol("*INTERRUPT-PROCESS-WITH-ARGS-TABLE-LOCK*");

    // Internal Constants
    public static final SubLSymbol $make_process_with_args_table$ = makeSymbol("*MAKE-PROCESS-WITH-ARGS-TABLE*");

    public static final SubLString $str1$MAKE_PROCESS_WITH_ARGS_TABLE = makeString("MAKE-PROCESS-WITH-ARGS-TABLE");







    public static final SubLSymbol MAKE_PROCESS_WITH_ARGS_INTERNAL = makeSymbol("MAKE-PROCESS-WITH-ARGS-INTERNAL");

    public static final SubLString $str6$Unable_to_get_make_process_args_f = makeString("Unable to get make-process args for ~S");

    public static final SubLList $list7 = list(makeSymbol("PROCESS"), makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    public static final SubLSymbol $interrupt_process_with_args_table$ = makeSymbol("*INTERRUPT-PROCESS-WITH-ARGS-TABLE*");

    public static final SubLString $str9$INTERRUPT_PROCESS_WITH_ARGS_TABLE = makeString("INTERRUPT-PROCESS-WITH-ARGS-TABLE");



    public static final SubLSymbol INTERRUPT_PROCESS_WITH_ARGS_INTERNAL = makeSymbol("INTERRUPT-PROCESS-WITH-ARGS-INTERNAL");

    public static final SubLString $str12$Unable_to_get_interrupt_process_a = makeString("Unable to get interrupt-process args for ~S");



    private static final SubLSymbol STREAM_ACCESS_MODE_P = makeSymbol("STREAM-ACCESS-MODE-P");







    private static final SubLString $str18$_A = makeString("~A");

    public static final SubLList $list19 = list(makeKeyword("PUBLIC"), makeKeyword("PRIVATE"));









    private static final SubLList $list24 = list(makeSymbol("INLINE"), makeSymbol("MEMBER?"));

    private static final SubLList $list25 = list(makeSymbol("SIGN"), makeSymbol("B0"), makeSymbol("B1"), makeSymbol("B2"), makeSymbol("B3"), makeSymbol("&OPTIONAL"), makeSymbol("B4"), makeSymbol("B5"));

    private static final SubLString $str26$_D__D__D__D__D__D = makeString("~D.~D.~D.~D.~D.~D");

    private static final SubLString $str27$_D__D__D__D = makeString("~D.~D.~D.~D");





    public static final SubLList $list30 = list(makeKeyword("INITIALIZER"), makeKeyword("WORLD"));

    private static final SubLList $list31 = list(makeSymbol("INLINE"), makeSymbol("VALUES2"));

    private static final SubLList $list32 = list(makeSymbol("INLINE"), makeSymbol("VALUES3"));

    private static final SubLList $list33 = list(makeSymbol("INLINE"), makeSymbol("VALUES4"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $$$getProperty = makeString("getProperty");

    private static final SubLString $str37$java_lang_System = makeString("java.lang.System");

    private static final SubLString $str38$java_io_tmpdir = makeString("java.io.tmpdir");

    public static SubLObject make_process_with_args(final SubLObject name, final SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
        assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
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

    public static SubLObject interrupt_process_with_args(final SubLObject process, final SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != processp(process) : "Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) " + process;
        assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
        assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
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

    public static SubLObject open_tcp_stream_with_timeout(final SubLObject host, final SubLObject port, SubLObject timeout, SubLObject access_mode) {
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        if (access_mode == UNPROVIDED) {
            access_mode = $PUBLIC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stream_access_mode_p(access_mode) : "subl_promotions.stream_access_mode_p(access_mode) " + "CommonSymbols.NIL != subl_promotions.stream_access_mode_p(access_mode) " + access_mode;
        SubLObject error_message = NIL;
        final SubLObject timed_out = NIL;
        SubLObject v_answer = NIL;
        if (NIL != timeout) {
            assert NIL != number_utilities.non_negative_number_p(timeout) : "number_utilities.non_negative_number_p(timeout) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(timeout) " + timeout;
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

    public static SubLObject stream_access_mode_p(final SubLObject v_object) {
        return member(v_object, $list19, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject values_list(final SubLObject list) {
        return apply(symbol_function(VALUES), list);
    }

    public static SubLObject function_symbol_p(final SubLObject v_object) {
        return makeBoolean((v_object.isSymbol() && (NIL != fboundp(v_object))) && symbol_function(v_object).isFunction());
    }

    public static SubLObject function_symbol_arglist(final SubLObject function_symbol) {
        assert NIL != symbolp(function_symbol) : "Types.symbolp(function_symbol) " + "CommonSymbols.NIL != Types.symbolp(function_symbol) " + function_symbol;
        return funcall(ARGLIST, function_symbol);
    }

    public static SubLObject rsublis(final SubLObject alist, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != function_spec_p(test) : "Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) " + test;
        assert NIL != function_spec_p(key) : "Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) " + key;
        if (!symbol_function(IDENTITY).eql(key)) {
            return rsublis_4(alist, tree, test, key);
        }
        if (!symbol_function(EQL).eql(test)) {
            return rsublis_3(alist, tree, test);
        }
        return rsublis_2(alist, tree);
    }

    public static SubLObject nrsublis(final SubLObject alist, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != function_spec_p(test) : "Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) " + test;
        assert NIL != function_spec_p(key) : "Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) " + key;
        if (!symbol_function(IDENTITY).eql(key)) {
            return nrsublis_4(alist, tree, test, key);
        }
        if (!symbol_function(EQL).eql(test)) {
            return nrsublis_3(alist, tree, test);
        }
        return nrsublis_2(alist, tree);
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
    }

    public static SubLObject set_elt(final SubLObject sequence, final SubLObject index, final SubLObject value) {
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
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
    }

    public static SubLObject funcall_0(final SubLObject func) {
        return funcall(func);
    }

    public static SubLObject funcall_1(final SubLObject func, final SubLObject arg1) {
        return funcall(func, arg1);
    }

    public static SubLObject funcall_2(final SubLObject func, final SubLObject arg1, final SubLObject arg2) {
        return funcall(func, arg1, arg2);
    }

    public static SubLObject funcall_3(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        return funcall(func, arg1, arg2, arg3);
    }

    public static SubLObject funcall_4(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        return funcall(func, arg1, arg2, arg3, arg4);
    }

    public static SubLObject elapsed_universal_time(final SubLObject past_time, SubLObject current_time) {
        if (current_time == UNPROVIDED) {
            current_time = NIL;
        }
        if (NIL == current_time) {
            current_time = get_universal_time();
        }
        return subtract(current_time, past_time);
    }

    public static SubLObject ensure_physical_pathname(final SubLObject pathname) {
        assert NIL != stringp(pathname) : "Types.stringp(pathname) " + "CommonSymbols.NIL != Types.stringp(pathname) " + pathname;
        return pathname;
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

    public static SubLObject positive_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && v_object.isPositive());
    }

    public static SubLObject non_negative_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (!v_object.isNegative()));
    }

    public static SubLObject non_positive_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (!v_object.isPositive()));
    }

    public static SubLObject negative_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && v_object.isNegative());
    }

    public static SubLObject non_zero_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (!v_object.isZero()));
    }

    public static SubLObject odd_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (NIL != oddp(v_object)));
    }

    public static SubLObject even_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && (NIL != evenp(v_object)));
    }

    public static SubLObject number_in_range_p(final SubLObject v_object, final SubLObject low, final SubLObject high) {
        return makeBoolean((v_object.isNumber() && v_object.numGE(low)) && high.numGE(v_object));
    }

    public static SubLObject tcp_stream_remote_hostname(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Tcp.$remote_hostname$.getDynamicValue(thread);
    }

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
    }

    public static SubLObject global_initialization_type(final SubLObject global) {
        return get(global, $INITIALIZATION_TYPE, $UNSPECIFIED);
    }

    public static SubLObject initialization_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list30);
    }

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

    public static SubLObject declare_subl_promotions_file() {
        declareFunction(me, "make_process_with_args", "MAKE-PROCESS-WITH-ARGS", 2, 1, false);
        declareFunction(me, "make_process_with_args_internal", "MAKE-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
        declareFunction(me, "interrupt_process_with_args", "INTERRUPT-PROCESS-WITH-ARGS", 2, 1, false);
        declareFunction(me, "interrupt_process_with_args_internal", "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
        declareFunction(me, "open_tcp_stream_with_timeout", "OPEN-TCP-STREAM-WITH-TIMEOUT", 2, 2, false);
        declareFunction(me, "stream_access_mode_p", "STREAM-ACCESS-MODE-P", 1, 0, false);
        declareFunction(me, "values_list", "VALUES-LIST", 1, 0, false);
        declareFunction(me, "function_symbol_p", "FUNCTION-SYMBOL-P", 1, 0, false);
        declareFunction(me, "function_symbol_arglist", "FUNCTION-SYMBOL-ARGLIST", 1, 0, false);
        declareFunction(me, "rsublis", "RSUBLIS", 2, 2, false);
        declareFunction(me, "nrsublis", "NRSUBLIS", 2, 2, false);
        declareFunction(me, "rsublis_2", "RSUBLIS-2", 2, 0, false);
        declareFunction(me, "nrsublis_2", "NRSUBLIS-2", 2, 0, false);
        declareFunction(me, "rsublis_3", "RSUBLIS-3", 3, 0, false);
        declareFunction(me, "nrsublis_3", "NRSUBLIS-3", 3, 0, false);
        declareFunction(me, "rsublis_4", "RSUBLIS-4", 4, 0, false);
        declareFunction(me, "nrsublis_4", "NRSUBLIS-4", 4, 0, false);
        declareFunction(me, "initial_process", "INITIAL-PROCESS", 0, 0, false);
        declareFunction(me, "set_elt", "SET-ELT", 3, 0, false);
        declareFunction(me, "funcall_0", "FUNCALL-0", 1, 0, false);
        declareFunction(me, "funcall_1", "FUNCALL-1", 2, 0, false);
        declareFunction(me, "funcall_2", "FUNCALL-2", 3, 0, false);
        declareFunction(me, "funcall_3", "FUNCALL-3", 4, 0, false);
        declareFunction(me, "funcall_4", "FUNCALL-4", 5, 0, false);
        declareFunction(me, "elapsed_universal_time", "ELAPSED-UNIVERSAL-TIME", 1, 1, false);
        declareFunction(me, "ensure_physical_pathname", "ENSURE-PHYSICAL-PATHNAME", 1, 0, false);
        declareFunction(me, "memberP", "MEMBER?", 2, 2, false);
        declareFunction(me, "positive_integer_p", "POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction(me, "non_negative_integer_p", "NON-NEGATIVE-INTEGER-P", 1, 0, false);
        new subl_promotions.$non_negative_integer_p$UnaryFunction();
        declareFunction(me, "non_positive_integer_p", "NON-POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction(me, "negative_integer_p", "NEGATIVE-INTEGER-P", 1, 0, false);
        declareFunction(me, "non_zero_integer_p", "NON-ZERO-INTEGER-P", 1, 0, false);
        declareFunction(me, "odd_integer_p", "ODD-INTEGER-P", 1, 0, false);
        declareFunction(me, "even_integer_p", "EVEN-INTEGER-P", 1, 0, false);
        declareFunction(me, "number_in_range_p", "NUMBER-IN-RANGE-P", 3, 0, false);
        declareFunction(me, "tcp_stream_remote_hostname", "TCP-STREAM-REMOTE-HOSTNAME", 1, 0, false);
        declareFunction(me, "tcp_stream_remote_address", "TCP-STREAM-REMOTE-ADDRESS", 1, 0, false);
        declareFunction(me, "global_initialization_type", "GLOBAL-INITIALIZATION-TYPE", 1, 0, false);
        declareFunction(me, "initialization_type_p", "INITIALIZATION-TYPE-P", 1, 0, false);
        declareFunction(me, "values2", "VALUES2", 2, 0, false);
        declareFunction(me, "values3", "VALUES3", 3, 0, false);
        declareFunction(me, "values4", "VALUES4", 4, 0, false);
        declareFunction(me, "get_temp_directory", "GET-TEMP-DIRECTORY", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_subl_promotions_file() {
        deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE*", SubLSystemTrampolineFile.maybeDefault($make_process_with_args_table$, $make_process_with_args_table$, NIL));
        deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE-LOCK*", make_lock($str1$MAKE_PROCESS_WITH_ARGS_TABLE));
        deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE*", SubLSystemTrampolineFile.maybeDefault($interrupt_process_with_args_table$, $interrupt_process_with_args_table$, NIL));
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

    

    public static final class $non_negative_integer_p$UnaryFunction extends UnaryFunction {
        public $non_negative_integer_p$UnaryFunction() {
            super(extractFunctionNamed("NON-NEGATIVE-INTEGER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return non_negative_integer_p(arg1);
        }
    }
}

/**
 * Total time: 229 ms
 */
