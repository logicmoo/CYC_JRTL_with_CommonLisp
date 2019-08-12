/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class shallow_parser extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new shallow_parser();

 public static final String myName = "com.cyc.cycjava.cycl.shallow_parser";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SHALLOW_PARSER = makeSymbol("SHALLOW-PARSER");

    static private final SubLList $list2 = list(list(makeSymbol("ERROR-HANDLING"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TIME"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE"), list(makeSymbol("TEXT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HANDLE-ERROR"), list(makeSymbol("ERROR")), makeKeyword("PRIVATE")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-INSTANCE");

    static private final SubLList $list11 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list12 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ERROR-HANDLING"), makeKeyword("THROW")), list(makeSymbol("CSETQ"), makeSymbol("TIME"), FIVE_INTEGER), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHALLOW-PARSER-METHOD");

    private static final SubLSymbol SHALLOW_PARSER_INITIALIZE_METHOD = makeSymbol("SHALLOW-PARSER-INITIALIZE-METHOD");

    static private final SubLList $list16 = list(makeKeyword("THROW"), $WARN, makeKeyword("IGNORE"));

    static private final SubLString $str17$Invalid_error_handling_tag__a = makeString("Invalid error-handling tag ~a");

    static private final SubLString $str18$Invalid_timeout__a = makeString("Invalid timeout ~a");

    private static final SubLFloat $float$3_4028232e37 = makeDouble(3.4028232E37);

    static private final SubLList $list21 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list22 = list(makeSymbol("TEXT"));

    static private final SubLList $list23 = list(makeString("@param TEXT stringp; one or more English sentences\n   @return listp; a list of shallow parses for TEXT, one for each sentence"), list(makeSymbol("CLET"), list(makeSymbol("PARSES"), makeSymbol("ERROR"), makeSymbol("TIMEOUT?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("WITH-TIMEOUT"), list(makeSymbol("TIME"), makeSymbol("TIMEOUT?")), list(makeSymbol("CSETQ"), makeSymbol("PARSES"), list(makeSymbol("SHALLOW-PARSE"), makeSymbol("TEXT")))), list(makeSymbol("PWHEN"), makeSymbol("TIMEOUT?"), list(makeSymbol("ERROR"), makeString("Shallow Parser timed out after ~a seconds"), makeSymbol("TIME")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("HANDLE-ERROR"), makeSymbol("SELF"), makeSymbol("ERROR"))), list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("NEW-PARSE-TREE")), makeSymbol("PARSES")))));

    static private final SubLSymbol $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHALLOW-PARSER-METHOD");

    static private final SubLString $str26$Shallow_Parser_timed_out_after__a = makeString("Shallow Parser timed out after ~a seconds");

    private static final SubLSymbol SHALLOW_PARSER_PARSE_METHOD = makeSymbol("SHALLOW-PARSER-PARSE-METHOD");

    static private final SubLList $list30 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list31 = list(makeSymbol("ERROR"));

    static private final SubLList $list32 = list(list(makeSymbol("PCASE"), makeSymbol("ERROR-HANDLING"), list(makeKeyword("THROW"), list(makeSymbol("ERROR"), makeSymbol("ERROR"))), list($WARN, list(makeSymbol("WARN"), makeSymbol("ERROR")))));

    static private final SubLSymbol $sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHALLOW-PARSER-METHOD");

    private static final SubLSymbol SHALLOW_PARSER_HANDLE_ERROR_METHOD = makeSymbol("SHALLOW-PARSER-HANDLE-ERROR-METHOD");

    // Definitions
    public static final SubLObject get_shallow_parser_time_alt(SubLObject v_shallow_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_shallow_parser, TWO_INTEGER, TIME);
    }

    // Definitions
    public static SubLObject get_shallow_parser_time(final SubLObject v_shallow_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_shallow_parser, TWO_INTEGER, TIME);
    }

    public static final SubLObject set_shallow_parser_time_alt(SubLObject v_shallow_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shallow_parser, value, TWO_INTEGER, TIME);
    }

    public static SubLObject set_shallow_parser_time(final SubLObject v_shallow_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shallow_parser, value, TWO_INTEGER, TIME);
    }

    public static final SubLObject get_shallow_parser_error_handling_alt(SubLObject v_shallow_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_shallow_parser, ONE_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject get_shallow_parser_error_handling(final SubLObject v_shallow_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_shallow_parser, ONE_INTEGER, ERROR_HANDLING);
    }

    public static final SubLObject set_shallow_parser_error_handling_alt(SubLObject v_shallow_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shallow_parser, value, ONE_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject set_shallow_parser_error_handling(final SubLObject v_shallow_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shallow_parser, value, ONE_INTEGER, ERROR_HANDLING);
    }

    public static final SubLObject subloop_reserved_initialize_shallow_parser_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shallow_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_shallow_parser_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHALLOW_PARSER, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, SHALLOW_PARSER, TIME, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shallow_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHALLOW_PARSER, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, SHALLOW_PARSER, TIME, NIL);
        return NIL;
    }

    public static final SubLObject shallow_parser_p_alt(SubLObject v_shallow_parser) {
        return classes.subloop_instanceof_class(v_shallow_parser, SHALLOW_PARSER);
    }

    public static SubLObject shallow_parser_p(final SubLObject v_shallow_parser) {
        return classes.subloop_instanceof_class(v_shallow_parser, SHALLOW_PARSER);
    }

    public static final SubLObject shallow_parser_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shallow_parser_method = NIL;
            SubLObject time = com.cyc.cycjava.cycl.shallow_parser.get_shallow_parser_time(self);
            SubLObject error_handling = com.cyc.cycjava.cycl.shallow_parser.get_shallow_parser_error_handling(self);
            try {
                try {
                    object.object_initialize_method(self);
                    error_handling = $THROW;
                    time = FIVE_INTEGER;
                    sublisp_throw($sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shallow_parser.set_shallow_parser_time(self, time);
                            com.cyc.cycjava.cycl.shallow_parser.set_shallow_parser_error_handling(self, error_handling);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shallow_parser_method = Errors.handleThrowable(ccatch_env_var, $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
            }
            return catch_var_for_shallow_parser_method;
        }
    }

    public static SubLObject shallow_parser_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shallow_parser_method = NIL;
        SubLObject time = get_shallow_parser_time(self);
        SubLObject error_handling = get_shallow_parser_error_handling(self);
        try {
            thread.throwStack.push($sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
            try {
                object.object_initialize_method(self);
                error_handling = $THROW;
                time = FIVE_INTEGER;
                sublisp_throw($sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shallow_parser_time(self, time);
                    set_shallow_parser_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shallow_parser_method = Errors.handleThrowable(ccatch_env_var, $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shallow_parser_method;
    }

    /**
     *
     *
     * @param ERROR-HANDLING
     * 		keywordp; :throw, :warn, or :ignore
     * @param TIMEOUT
     * 		non-negative-integerp or nil;
     * @return shallow-parser-p; a new shallow parser with the specified error-handling
    and timeout
     */
    @LispMethod(comment = "@param ERROR-HANDLING\r\n\t\tkeywordp; :throw, :warn, or :ignore\r\n@param TIMEOUT\r\n\t\tnon-negative-integerp or nil;\r\n@return shallow-parser-p; a new shallow parser with the specified error-handling\r\nand timeout")
    public static final SubLObject new_shallow_parser_alt(SubLObject error_handling, SubLObject timeout) {
        if (error_handling == UNPROVIDED) {
            error_handling = $THROW;
        }
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == member(error_handling, $list_alt16, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt17$Invalid_error_handling_tag__a, error_handling);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != subl_promotions.non_negative_integer_p(timeout)) || (NIL == timeout))) {
                    Errors.error($str_alt18$Invalid_timeout__a, timeout);
                }
            }
            {
                SubLObject v_parser = object.new_class_instance(SHALLOW_PARSER);
                com.cyc.cycjava.cycl.shallow_parser.set_shallow_parser_error_handling(v_parser, error_handling);
                if (NIL == timeout) {
                    com.cyc.cycjava.cycl.shallow_parser.set_shallow_parser_time(v_parser, $float$3_4028232e_37);
                } else {
                    com.cyc.cycjava.cycl.shallow_parser.set_shallow_parser_time(v_parser, timeout);
                }
                return v_parser;
            }
        }
    }

    /**
     *
     *
     * @param ERROR-HANDLING
     * 		keywordp; :throw, :warn, or :ignore
     * @param TIMEOUT
     * 		non-negative-integerp or nil;
     * @return shallow-parser-p; a new shallow parser with the specified error-handling
    and timeout
     */
    @LispMethod(comment = "@param ERROR-HANDLING\r\n\t\tkeywordp; :throw, :warn, or :ignore\r\n@param TIMEOUT\r\n\t\tnon-negative-integerp or nil;\r\n@return shallow-parser-p; a new shallow parser with the specified error-handling\r\nand timeout")
    public static SubLObject new_shallow_parser(SubLObject error_handling, SubLObject timeout) {
        if (error_handling == UNPROVIDED) {
            error_handling = $THROW;
        }
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(error_handling, $list16, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str17$Invalid_error_handling_tag__a, error_handling);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(timeout))) && (NIL != timeout)) {
            Errors.error($str18$Invalid_timeout__a, timeout);
        }
        final SubLObject v_parser = object.new_class_instance(SHALLOW_PARSER);
        set_shallow_parser_error_handling(v_parser, error_handling);
        if (NIL == timeout) {
            set_shallow_parser_time(v_parser, $float$3_4028232e37);
        } else {
            set_shallow_parser_time(v_parser, timeout);
        }
        return v_parser;
    }

    /**
     *
     *
     * @param TEXT
     * 		stringp; one or more English sentences
     * @return listp; a list of shallow parses for TEXT, one for each sentence
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; one or more English sentences\r\n@return listp; a list of shallow parses for TEXT, one for each sentence")
    public static final SubLObject shallow_parser_parse_method_alt(SubLObject self, SubLObject text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shallow_parser_method = NIL;
                SubLObject time = com.cyc.cycjava.cycl.shallow_parser.get_shallow_parser_time(self);
                try {
                    try {
                        {
                            SubLObject parses = NIL;
                            SubLObject error = NIL;
                            SubLObject timeoutP = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            {
                                                SubLObject tag = with_timeout_make_tag();
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_1 = $within_with_timeout$.currentBinding(thread);
                                                        try {
                                                            $within_with_timeout$.bind(T, thread);
                                                            {
                                                                SubLObject timer = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_2 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                        try {
                                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                            timer = with_timeout_start_timer(time, tag);
                                                                            parses = external_interfaces.shallow_parse(text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } finally {
                                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_2, thread);
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
                                                            $within_with_timeout$.rebind(_prev_bind_0_1, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    timeoutP = Errors.handleThrowable(ccatch_env_var, tag);
                                                }
                                            }
                                            if (NIL != timeoutP) {
                                                Errors.error($str_alt26$Shallow_Parser_timed_out_after__a, time);
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            }
                            if (NIL != error) {
                                com.cyc.cycjava.cycl.shallow_parser.shallow_parser_handle_error_method(self, error);
                            }
                            sublisp_throw($sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD, Mapping.mapcar(NEW_PARSE_TREE, parses));
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shallow_parser.set_shallow_parser_time(self, time);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shallow_parser_method = Errors.handleThrowable(ccatch_env_var, $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
                }
                return catch_var_for_shallow_parser_method;
            }
        }
    }

    /**
     *
     *
     * @param TEXT
     * 		stringp; one or more English sentences
     * @return listp; a list of shallow parses for TEXT, one for each sentence
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; one or more English sentences\r\n@return listp; a list of shallow parses for TEXT, one for each sentence")
    public static SubLObject shallow_parser_parse_method(final SubLObject self, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shallow_parser_method = NIL;
        final SubLObject time = get_shallow_parser_time(self);
        try {
            thread.throwStack.push($sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
            try {
                SubLObject parses = NIL;
                SubLObject error = NIL;
                SubLObject timeoutP = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$1 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$2 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(time, tag);
                                            parses = external_interfaces.shallow_parse(text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$1, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                timeoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != timeoutP) {
                                Errors.error($str26$Shallow_Parser_timed_out_after__a, time);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    error = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    shallow_parser_handle_error_method(self, error);
                }
                sublisp_throw($sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD, Mapping.mapcar(NEW_PARSE_TREE, parses));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    set_shallow_parser_time(self, time);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var3) {
            catch_var_for_shallow_parser_method = Errors.handleThrowable(ccatch_env_var3, $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shallow_parser_method;
    }

    public static final SubLObject shallow_parser_handle_error_method_alt(SubLObject self, SubLObject error) {
        {
            SubLObject catch_var_for_shallow_parser_method = NIL;
            SubLObject error_handling = com.cyc.cycjava.cycl.shallow_parser.get_shallow_parser_error_handling(self);
            try {
                try {
                    {
                        SubLObject pcase_var = error_handling;
                        if (pcase_var.eql($THROW)) {
                            Errors.error(error);
                        } else {
                            if (pcase_var.eql($WARN)) {
                                Errors.warn(error);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shallow_parser.set_shallow_parser_error_handling(self, error_handling);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shallow_parser_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
            }
            return catch_var_for_shallow_parser_method;
        }
    }

    public static SubLObject shallow_parser_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shallow_parser_method = NIL;
        final SubLObject error_handling = get_shallow_parser_error_handling(self);
        try {
            thread.throwStack.push($sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql($THROW)) {
                    Errors.error(error);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(error);
                    }

            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shallow_parser_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shallow_parser_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shallow_parser_method;
    }

    public static SubLObject declare_shallow_parser_file() {
        declareFunction("get_shallow_parser_time", "GET-SHALLOW-PARSER-TIME", 1, 0, false);
        declareFunction("set_shallow_parser_time", "SET-SHALLOW-PARSER-TIME", 2, 0, false);
        declareFunction("get_shallow_parser_error_handling", "GET-SHALLOW-PARSER-ERROR-HANDLING", 1, 0, false);
        declareFunction("set_shallow_parser_error_handling", "SET-SHALLOW-PARSER-ERROR-HANDLING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_shallow_parser_class", "SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_shallow_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-INSTANCE", 1, 0, false);
        declareFunction("shallow_parser_p", "SHALLOW-PARSER-P", 1, 0, false);
        declareFunction("shallow_parser_initialize_method", "SHALLOW-PARSER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("new_shallow_parser", "NEW-SHALLOW-PARSER", 0, 2, false);
        declareFunction("shallow_parser_parse_method", "SHALLOW-PARSER-PARSE-METHOD", 2, 0, false);
        declareFunction("shallow_parser_handle_error_method", "SHALLOW-PARSER-HANDLE-ERROR-METHOD", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("ERROR-HANDLING"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TIME"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE"), list(makeSymbol("TEXT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HANDLE-ERROR"), list(makeSymbol("ERROR")), makeKeyword("PRIVATE")));

    public static SubLObject init_shallow_parser_file() {
        return NIL;
    }

    public static SubLObject setup_shallow_parser_file() {
        classes.subloop_new_class(SHALLOW_PARSER, OBJECT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(SHALLOW_PARSER, NIL);
        classes.subloop_note_class_initialization_function(SHALLOW_PARSER, SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function(SHALLOW_PARSER, SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_INSTANCE);
        subloop_reserved_initialize_shallow_parser_class(SHALLOW_PARSER);
        methods.methods_incorporate_instance_method(INITIALIZE, SHALLOW_PARSER, $list11, NIL, $list12);
        methods.subloop_register_instance_method(SHALLOW_PARSER, INITIALIZE, SHALLOW_PARSER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PARSE, SHALLOW_PARSER, $list21, $list22, $list23);
        methods.subloop_register_instance_method(SHALLOW_PARSER, PARSE, SHALLOW_PARSER_PARSE_METHOD);
        methods.methods_incorporate_instance_method(HANDLE_ERROR, SHALLOW_PARSER, $list30, $list31, $list32);
        methods.subloop_register_instance_method(SHALLOW_PARSER, HANDLE_ERROR, SHALLOW_PARSER_HANDLE_ERROR_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt11 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt12 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ERROR-HANDLING"), makeKeyword("THROW")), list(makeSymbol("CSETQ"), makeSymbol("TIME"), FIVE_INTEGER), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt16 = list(makeKeyword("THROW"), $WARN, makeKeyword("IGNORE"));

    static private final SubLString $str_alt17$Invalid_error_handling_tag__a = makeString("Invalid error-handling tag ~a");

    static private final SubLString $str_alt18$Invalid_timeout__a = makeString("Invalid timeout ~a");

    public static final SubLFloat $float$3_4028232e_37 = makeDouble(3.4028232E37);

    static private final SubLList $list_alt21 = list(makeKeyword("PUBLIC"));

    @Override
    public void declareFunctions() {
        declare_shallow_parser_file();
    }

    static private final SubLList $list_alt22 = list(makeSymbol("TEXT"));

    static private final SubLList $list_alt23 = list(makeString("@param TEXT stringp; one or more English sentences\n   @return listp; a list of shallow parses for TEXT, one for each sentence"), list(makeSymbol("CLET"), list(makeSymbol("PARSES"), makeSymbol("ERROR"), makeSymbol("TIMEOUT?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("WITH-TIMEOUT"), list(makeSymbol("TIME"), makeSymbol("TIMEOUT?")), list(makeSymbol("CSETQ"), makeSymbol("PARSES"), list(makeSymbol("SHALLOW-PARSE"), makeSymbol("TEXT")))), list(makeSymbol("PWHEN"), makeSymbol("TIMEOUT?"), list(makeSymbol("ERROR"), makeString("Shallow Parser timed out after ~a seconds"), makeSymbol("TIME")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("HANDLE-ERROR"), makeSymbol("SELF"), makeSymbol("ERROR"))), list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("NEW-PARSE-TREE")), makeSymbol("PARSES")))));

    @Override
    public void initializeVariables() {
        init_shallow_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shallow_parser_file();
    }

    static {
    }

    static private final SubLString $str_alt26$Shallow_Parser_timed_out_after__a = makeString("Shallow Parser timed out after ~a seconds");

    static private final SubLList $list_alt30 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list_alt31 = list(makeSymbol("ERROR"));

    static private final SubLList $list_alt32 = list(list(makeSymbol("PCASE"), makeSymbol("ERROR-HANDLING"), list(makeKeyword("THROW"), list(makeSymbol("ERROR"), makeSymbol("ERROR"))), list($WARN, list(makeSymbol("WARN"), makeSymbol("ERROR")))));
}

/**
 * Total time: 118 ms
 */
