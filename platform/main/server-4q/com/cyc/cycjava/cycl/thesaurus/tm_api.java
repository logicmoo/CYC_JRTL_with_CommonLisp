/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sunit_macros;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.tcp_server_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TM-API
 *  source file: /cyc/top/cycl/thesaurus/tm-api.lisp
 *  created:     2019/07/03 17:38:30
 */
public final class tm_api extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_api() {
    }

    public static final SubLFile me = new tm_api();


    // // Definitions
    /**
     * Command list follows.
     */
    // defparameter
    private static final SubLSymbol $command_list_follows$ = makeSymbol("*COMMAND-LIST-FOLLOWS*");

    /**
     * Server ready.
     */
    // defparameter
    private static final SubLSymbol $ready$ = makeSymbol("*READY*");

    /**
     * Connection closing.
     */
    // defparameter
    private static final SubLSymbol $goodbye$ = makeSymbol("*GOODBYE*");

    /**
     * Authorization accepted.
     */
    // defparameter
    private static final SubLSymbol $accepted$ = makeSymbol("*ACCEPTED*");

    /**
     * The term was found as a preferred term in the thesaurus.
     */
    // defparameter
    private static final SubLSymbol $preferred_term$ = makeSymbol("*PREFERRED-TERM*");

    /**
     * The term was found as a use-for term in the thesaurus.
     */
    // defparameter
    private static final SubLSymbol $use_for$ = makeSymbol("*USE-FOR*");

    /**
     * The request completed successfully, and a list of terms follows.
     */
    // defparameter
    private static final SubLSymbol $terms_follow$ = makeSymbol("*TERMS-FOLLOW*");

    /**
     * The request completed successfully, and a list of thesauri follows.
     */
    // defparameter
    private static final SubLSymbol $thesauri_follow$ = makeSymbol("*THESAURI-FOLLOW*");

    /**
     * The request completed successfully, and a list of relations follows.
     */
    // defparameter
    private static final SubLSymbol $relations_follow$ = makeSymbol("*RELATIONS-FOLLOW*");

    /**
     * A term argument required to be a preferred term was not found as one.
     */
    // defparameter
    private static final SubLSymbol $not_a_preferred_term$ = makeSymbol("*NOT-A-PREFERRED-TERM*");

    /**
     * A term was not found.
     */
    // defparameter
    private static final SubLSymbol $not_found$ = makeSymbol("*NOT-FOUND*");

    /**
     * A thesaurus argument was not found.
     */
    // defparameter
    private static final SubLSymbol $unknown_thesaurus$ = makeSymbol("*UNKNOWN-THESAURUS*");

    /**
     * A relation argument was not found.
     */
    // defparameter
    private static final SubLSymbol $unknown_relation$ = makeSymbol("*UNKNOWN-RELATION*");

    /**
     * A thesaurus was not accessible to the user or group.
     */
    // defparameter
    private static final SubLSymbol $inaccessible_thesaurus$ = makeSymbol("*INACCESSIBLE-THESAURUS*");

    /**
     * The server is currently unable to handle the request due to a temporary
     * overloading or maintenance of the server. The implication is that this
     * is a temporary condition which will be alleviated after some delay.
     */
    // defparameter
    private static final SubLSymbol $service_unavailable$ = makeSymbol("*SERVICE-UNAVAILABLE*");

    /**
     * The server has no thesauri available.
     */
    // defparameter
    private static final SubLSymbol $no_thesauri$ = makeSymbol("*NO-THESAURI*");

    /**
     * The server does not implement the command.
     */
    // defparameter
    private static final SubLSymbol $not_implemented$ = makeSymbol("*NOT-IMPLEMENTED*");

    /**
     * The command was not recognized
     */
    // defparameter
    private static final SubLSymbol $unknown_command$ = makeSymbol("*UNKNOWN-COMMAND*");

    /**
     * The command could not be parsed.
     */
    // defparameter
    private static final SubLSymbol $unreadable_command$ = makeSymbol("*UNREADABLE-COMMAND*");

    /**
     * Program fault.
     */
    // defparameter
    private static final SubLSymbol $internal_error$ = makeSymbol("*INTERNAL-ERROR*");

    /**
     * One of the arguments to the command could not be parsed.
     */
    // defparameter
    private static final SubLSymbol $unreadable_argument$ = makeSymbol("*UNREADABLE-ARGUMENT*");

    /**
     * One of the arguments was an empty string.
     */
    // defparameter
    private static final SubLSymbol $empty_string_error$ = makeSymbol("*EMPTY-STRING-ERROR*");

    /**
     * One of the arguments was not in string format as required.
     */
    // defparameter
    private static final SubLSymbol $not_a_string$ = makeSymbol("*NOT-A-STRING*");

    /**
     * The wrong number of arguments was given.
     */
    // defparameter
    private static final SubLSymbol $bad_arguments$ = makeSymbol("*BAD-ARGUMENTS*");

    /**
     * One of the arguments had an incorrect value.
     */
    // defparameter
    private static final SubLSymbol $bogus_argument$ = makeSymbol("*BOGUS-ARGUMENT*");

    /**
     * User/password/group unknown.
     */
    // defparameter
    private static final SubLSymbol $unknown$ = makeSymbol("*UNKNOWN*");

    /**
     * User must be supplied.
     */
    // defparameter
    private static final SubLSymbol $user_required$ = makeSymbol("*USER-REQUIRED*");

    /**
     * Group must be supplied.
     */
    // defparameter
    private static final SubLSymbol $group_required$ = makeSymbol("*GROUP-REQUIRED*");

    /**
     * Password must be supplied.
     */
    // defparameter
    private static final SubLSymbol $password_required$ = makeSymbol("*PASSWORD-REQUIRED*");

    /**
     * User not authorized for command.
     */
    // defparameter
    private static final SubLSymbol $user_not_authorized$ = makeSymbol("*USER-NOT-AUTHORIZED*");

    /**
     * Group not authorized for command.
     */
    // defparameter
    private static final SubLSymbol $group_not_authorized$ = makeSymbol("*GROUP-NOT-AUTHORIZED*");

    public static final SubLObject tmap_result(SubLObject code, SubLObject stream, SubLObject format_control, SubLObject format_arguments) {
        format(stream, $str_alt31$_D_, code);
        apply(symbol_function(FORMAT), stream, new SubLObject[]{ format_control, format_arguments });
        string_utilities.network_terpri(stream);
        return NIL;
    }

    public static final SubLObject tmap_random_results(SubLObject code, SubLObject stream, SubLObject results) {
        format(stream, $str_alt33$_D__D_Data_follows_, code, length(results));
        string_utilities.network_terpri(stream);
        {
            SubLObject cdolist_list_var = results;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                princ(result, stream);
                string_utilities.network_terpri(stream);
            }
        }
        write_char(CHAR_period, stream);
        string_utilities.network_terpri(stream);
        return NIL;
    }

    public static final SubLObject tmap_string_results(SubLObject code, SubLObject stream, SubLObject results) {
        format(stream, $str_alt33$_D__D_Data_follows_, code, length(results));
        string_utilities.network_terpri(stream);
        {
            SubLObject cdolist_list_var = results;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                if (!result.isString()) {
                    result = princ_to_string(result);
                }
                prin1(result, stream);
                string_utilities.network_terpri(stream);
            }
        }
        write_char(CHAR_period, stream);
        string_utilities.network_terpri(stream);
        return NIL;
    }

    // defvar
    public static final SubLSymbol $tmap_commands$ = makeSymbol("*TMAP-COMMANDS*");

    public static final SubLObject define_tmap_command(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt34);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject command_name = symbol_name(name);
                SubLObject function_name = intern(format(NIL, $str_alt35$TMAP__A, name), UNPROVIDED);
                return list(PROGN, listS(CPUSHNEW, list(CONS, command_name, list(QUOTE, function_name)), $list_alt40), listS(DEFINE_PRIVATE, function_name, arglist, append(body, NIL)));
            }
        }
    }

    // defparameter
    private static final SubLSymbol $tmap_version$ = makeSymbol("*TMAP-VERSION*");

    // defparameter
    public static final SubLSymbol $tmap_user_required$ = makeSymbol("*TMAP-USER-REQUIRED*");

    // defparameter
    public static final SubLSymbol $tmap_password_required$ = makeSymbol("*TMAP-PASSWORD-REQUIRED*");

    // defparameter
    public static final SubLSymbol $tmap_group_required$ = makeSymbol("*TMAP-GROUP-REQUIRED*");

    // defparameter
    public static final SubLSymbol $log_tmap_commands$ = makeSymbol("*LOG-TMAP-COMMANDS*");

    // defparameter
    public static final SubLSymbol $log_tmap_sessions$ = makeSymbol("*LOG-TMAP-SESSIONS*");

    // defvar
    private static final SubLSymbol $tmap_user$ = makeSymbol("*TMAP-USER*");

    // defvar
    private static final SubLSymbol $tmap_group$ = makeSymbol("*TMAP-GROUP*");

    // defvar
    private static final SubLSymbol $tmap_passwordp$ = makeSymbol("*TMAP-PASSWORDP*");

    // defvar
    private static final SubLSymbol $tmap_session_noted$ = makeSymbol("*TMAP-SESSION-NOTED*");

    public static final SubLObject tmap_server_handler(SubLObject in_stream, SubLObject out_stream) {
        return thesaurus_manager_access_protocol_server_top_level(in_stream, out_stream);
    }

    public static final SubLObject thesaurus_manager_access_protocol_server_top_level(SubLObject in, SubLObject out) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                try {
                    $package$.bind(find_package($$$CYC), thread);
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    $print_readably$.bind(NIL, thread);
                    $read_eval$.bind(NIL, thread);
                    {
                        SubLObject old_priority = process_priority(current_process());
                        try {
                            set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                            {
                                SubLObject normal_exit = NIL;
                                SubLObject closed = NIL;
                                {
                                    SubLObject _prev_bind_0_1 = $tmap_user$.currentBinding(thread);
                                    SubLObject _prev_bind_1_2 = $tmap_group$.currentBinding(thread);
                                    SubLObject _prev_bind_2_3 = $tmap_passwordp$.currentBinding(thread);
                                    SubLObject _prev_bind_3_4 = control_vars.$cyc_image_id$.currentBinding(thread);
                                    SubLObject _prev_bind_4 = tm_datastructures.$tm_user$.currentBinding(thread);
                                    SubLObject _prev_bind_5 = $tmap_session_noted$.currentBinding(thread);
                                    try {
                                        $tmap_user$.bind(NIL, thread);
                                        $tmap_group$.bind(NIL, thread);
                                        $tmap_passwordp$.bind(NIL, thread);
                                        control_vars.$cyc_image_id$.bind(NIL, thread);
                                        tm_datastructures.$tm_user$.bind(NIL, thread);
                                        $tmap_session_noted$.bind(NIL, thread);
                                        control_vars.set_cyc_image_id();
                                        try {
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_5 = $package$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_6 = $print_readably$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_7 = $read_eval$.currentBinding(thread);
                                                    try {
                                                        $package$.bind(find_package($$$CYC), thread);
                                                        $print_readably$.bind(NIL, thread);
                                                        $read_eval$.bind(NIL, thread);
                                                        tmap_result($ready$.getDynamicValue(thread), out, $str_alt49$TMAP__A_server_ready, list($tmap_version$.getDynamicValue(thread)));
                                                        force_output(out);
                                                        while (NIL == closed) {
                                                            {
                                                                SubLObject error = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_8 = Errors.$error_handler$.currentBinding(thread);
                                                                        try {
                                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                            try {
                                                                                {
                                                                                    SubLObject line = string_utilities.read_possibly_continued_line(in, NIL, NIL);
                                                                                    if (NIL != line) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject command = read_from_string_ignoring_errors(line, NIL, line, UNPROVIDED, UNPROVIDED);
                                                                                            SubLObject idx = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject command_fun = (command.isSymbol()) ? ((SubLObject) (assoc(symbol_name(command), $tmap_commands$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED).rest())) : NIL;
                                                                                                if (NIL != command_fun) {
                                                                                                    {
                                                                                                        SubLObject args = NIL;
                                                                                                        SubLObject ok = T;
                                                                                                        SubLObject done = makeBoolean(NIL == idx);
                                                                                                        while (NIL == done) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            {
                                                                                                                SubLObject arg = read_from_string_ignoring_errors(line, NIL, line, idx, UNPROVIDED);
                                                                                                                SubLObject new_idx = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (arg == line) {
                                                                                                                    done = T;
                                                                                                                } else
                                                                                                                    if (new_idx == $ERROR) {
                                                                                                                        tmap_result($unreadable_argument$.getDynamicValue(thread), out, $str_alt52$Could_not_parse_argument_at_index, list(idx));
                                                                                                                        done = T;
                                                                                                                        ok = NIL;
                                                                                                                    } else {
                                                                                                                        args = cons(arg, args);
                                                                                                                        idx = new_idx;
                                                                                                                    }

                                                                                                            }
                                                                                                        } 
                                                                                                        if (NIL != ok) {
                                                                                                            funcall(command_fun, out, nreverse(args));
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    tmap_result($unknown_command$.getDynamicValue(thread), out, $str_alt53$Unrecognized_command__S_, list(command));
                                                                                                }
                                                                                            }
                                                                                            force_output(out);
                                                                                        }
                                                                                    } else {
                                                                                        closed = T;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable catch_var) {
                                                                                Errors.handleThrowable(catch_var, NIL);
                                                                            }
                                                                        } finally {
                                                                            Errors.$error_handler$.rebind(_prev_bind_0_8, thread);
                                                                        }
                                                                    }
                                                                } catch (Throwable ccatch_env_var) {
                                                                    error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                                }
                                                                if (NIL != error) {
                                                                    tmap_result($internal_error$.getDynamicValue(thread), out, substitute(CHAR_space, CHAR_newline, princ_to_string(error), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL);
                                                                    force_output(out);
                                                                }
                                                            }
                                                        } 
                                                    } finally {
                                                        $read_eval$.rebind(_prev_bind_2_7, thread);
                                                        $print_readably$.rebind(_prev_bind_1_6, thread);
                                                        $package$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                normal_exit = Errors.handleThrowable(ccatch_env_var, TMAP_QUIT);
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    tm_logging.log_tmap_events();
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        $tmap_session_noted$.rebind(_prev_bind_5, thread);
                                        tm_datastructures.$tm_user$.rebind(_prev_bind_4, thread);
                                        control_vars.$cyc_image_id$.rebind(_prev_bind_3_4, thread);
                                        $tmap_passwordp$.rebind(_prev_bind_2_3, thread);
                                        $tmap_group$.rebind(_prev_bind_1_2, thread);
                                        $tmap_user$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    set_process_priority(current_process(), old_priority);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $read_eval$.rebind(_prev_bind_3, thread);
                    $print_readably$.rebind(_prev_bind_2, thread);
                    $read_default_float_format$.rebind(_prev_bind_1, thread);
                    $package$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_thesauri() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != $tmap_user_required$.getDynamicValue(thread)) && (NIL == $tmap_user$.getDynamicValue(thread))) || ((NIL != $tmap_group_required$.getDynamicValue(thread)) && (NIL == $tmap_group$.getDynamicValue(thread)))) {
                return NIL;
            } else
                if ((NIL != $tmap_user$.getDynamicValue(thread)) && (NIL != $tmap_group$.getDynamicValue(thread))) {
                    return intersection(tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED), tm_internals.declarative_browsable_thesauri($tmap_group$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                } else
                    if (NIL != $tmap_user$.getDynamicValue(thread)) {
                        return tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                    } else
                        if (NIL != $tmap_group$.getDynamicValue(thread)) {
                            return tm_internals.declarative_browsable_thesauri($tmap_group$.getDynamicValue(thread));
                        } else {
                            return tm_internals.all_thesauri();
                        }



        }
    }

    public static final SubLObject log_tmap_command(SubLObject name, SubLObject thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $log_tmap_commands$.getDynamicValue(thread)) {
                tm_logging.tm_update_tmap_log_table(name, thesauri.isCons() ? ((SubLObject) (thesauri)) : list(thesauri), $tmap_user$.getDynamicValue(thread), $tmap_group$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static final SubLObject check_non_empty_string(SubLObject stream, SubLObject arg, SubLObject description) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!arg.isString()) {
                return tmap_result($not_a_string$.getDynamicValue(thread), stream, $str_alt54$The__A_argument___S__is_not_a_str, list(description, arg));
            } else
                if (NIL != Strings.stringE(arg, $str_alt55$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return tmap_result($empty_string_error$.getDynamicValue(thread), stream, $str_alt56$The__A_argument_is_empty_, list(description));
                } else {
                    return T;
                }

        }
    }

    public static final SubLObject check_thesaurus(SubLObject stream, SubLObject thesaurus_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_non_empty_string(stream, thesaurus_name, $$$thesaurus)) {
                {
                    SubLObject thesaurus = tm_internals.thesaurus_constant_from_string(thesaurus_name);
                    if (NIL == thesaurus) {
                        return tmap_result($unknown_thesaurus$.getDynamicValue(thread), stream, $str_alt58$The_thesaurus_named__S_was_not_fo, list(thesaurus_name));
                    } else
                        if (NIL == subl_promotions.memberP(thesaurus, tmap_thesauri(), UNPROVIDED, UNPROVIDED)) {
                            return tmap_result($inaccessible_thesaurus$.getDynamicValue(thread), stream, $str_alt59$The_thesaurus_named__S_is_not_acc, list(thesaurus_name));
                        } else {
                            return thesaurus;
                        }

                }
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject check_thesauri(SubLObject stream, SubLObject thesaurus_names) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesauri = NIL;
                SubLObject cdolist_list_var = thesaurus_names;
                SubLObject thesaurus_name = NIL;
                for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                    {
                        SubLObject thesaurus = check_thesaurus(stream, thesaurus_name);
                        if (NIL != thesaurus) {
                            thesauri = cons(thesaurus, thesauri);
                        } else {
                            return NIL;
                        }
                    }
                }
                if (NIL == thesauri) {
                    thesauri = tmap_thesauri();
                }
                if (NIL != thesauri) {
                    return remove_duplicates(thesauri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    return tmap_result($no_thesauri$.getDynamicValue(thread), stream, $str_alt60$No_thesauri_are_available_, NIL);
                }
            }
        }
    }

    public static final SubLObject check_relation(SubLObject stream, SubLObject relation_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_non_empty_string(stream, relation_name, $$$relation)) {
                if (NIL != tm_internals.relation_constant_from_abbreviation(relation_name)) {
                    return relation_name;
                } else {
                    return tmap_result($unknown_relation$.getDynamicValue(thread), stream, $str_alt62$The_relation_named__S_was_not_fou, list(relation_name));
                }
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject check_arg_count(SubLObject stream, SubLObject args, SubLObject min, SubLObject max) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject length = length(args);
                if (length.numL(min)) {
                    tmap_result($bad_arguments$.getDynamicValue(thread), stream, $str_alt63$Expected_at_least__D_arguments__g, list(min, length));
                } else {
                    if ((NIL != max) && length.numG(max)) {
                        return tmap_result($bad_arguments$.getDynamicValue(thread), stream, $str_alt64$Expected_at_most__D_arguments__go, list(max, length));
                    } else {
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_preferred_signs(SubLObject stream, SubLObject v_term, SubLObject thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preferred_signs = tm_datastructures.tm_alpha_complete_in_thesauri(v_term, thesauri, T, UNPROVIDED, UNPROVIDED);
                if (NIL != preferred_signs) {
                    return remove_duplicates(preferred_signs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    return tmap_result($not_a_preferred_term$.getDynamicValue(thread), stream, NIL != thesauri.rest() ? ((SubLObject) ($str_alt65$_S_is_not_a_preferred_term_in_any)) : $str_alt66$_S_is_not_a_preferred_term_in__A_, list(v_term, list_utilities.format_item_list(Mapping.mapcar(symbol_function(THESAURUS_NAME), thesauri))));
                }
            }
        }
    }

    public static final SubLObject check_authentication(SubLObject stream, SubLObject command) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $tmap_user_required$.getDynamicValue(thread)) && (NIL == $tmap_user$.getDynamicValue(thread))) {
                return tmap_result($user_required$.getDynamicValue(thread), stream, $str_alt68$Please_specify_a_user_with_the_US, NIL);
            } else
                if ((NIL != $tmap_password_required$.getDynamicValue(thread)) && (NIL == $tmap_passwordp$.getDynamicValue(thread))) {
                    return tmap_result($password_required$.getDynamicValue(thread), stream, $str_alt69$Please_specify_a_password_with_th, NIL);
                } else
                    if ((NIL != $tmap_group_required$.getDynamicValue(thread)) && (NIL == $tmap_group$.getDynamicValue(thread))) {
                        return tmap_result($group_required$.getDynamicValue(thread), stream, $str_alt70$Please_specify_a_group_with_the_G, NIL);
                    } else {
                        if ((NIL != $log_tmap_sessions$.getDynamicValue(thread)) && (NIL == $tmap_session_noted$.getDynamicValue(thread))) {
                            $tmap_session_noted$.setDynamicValue(T, thread);
                            tm_logging.tm_update_tmap_log_table($$$TMAP_login, tmap_thesauri(), $tmap_user$.getDynamicValue(thread), $tmap_group$.getDynamicValue(thread));
                        }
                        return T;
                    }


        }
    }

    public static final SubLObject with_preferred_signs_and_thesauri(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream = NIL;
                    SubLObject args = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    stream = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    args = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        destructuring_bind_must_consp(current, datum, $list_alt72);
                        {
                            SubLObject temp_11 = current.rest();
                            current = current.first();
                            {
                                SubLObject preferred_signs = NIL;
                                SubLObject thesauri = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt72);
                                preferred_signs = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt72);
                                thesauri = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp_11;
                                    {
                                        SubLObject body = current;
                                        SubLObject evalled_stream = $sym73$EVALLED_STREAM;
                                        SubLObject evalled_args = $sym74$EVALLED_ARGS;
                                        SubLObject v_term = $sym75$TERM;
                                        SubLObject thesaurus_names = $sym76$THESAURUS_NAMES;
                                        return list(CLET, list(list(evalled_stream, stream), list(evalled_args, args), preferred_signs, thesauri), list(PWHEN, listS(CHECK_ARG_COUNT, evalled_stream, evalled_args, $list_alt80), list(CDESTRUCTURING_BIND, list(v_term, $sym82$_REST, thesaurus_names), evalled_args, list(PWHEN, listS(CHECK_NON_EMPTY_STRING, evalled_stream, v_term, $list_alt84), list(CSETF, thesauri, list(CHECK_THESAURI, evalled_stream, thesaurus_names)), list(PWHEN, thesauri, list(CSETF, preferred_signs, list(CHECK_PREFERRED_SIGNS, evalled_stream, v_term, thesauri)), listS(PWHEN, preferred_signs, append(body, NIL)))))));
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt72);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt72);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tmap_help(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tmap_random_results($command_list_follows$.getDynamicValue(thread), stream, Mapping.mapcar(symbol_function(CAR), $tmap_commands$.getDynamicValue(thread)));
            return NIL;
        }
    }

    public static final SubLObject tmap_quit(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tmap_result($goodbye$.getDynamicValue(thread), stream, $str_alt92$BCNU_, NIL);
            sublisp_throw(TMAP_QUIT, T);
            return NIL;
        }
    }

    public static final SubLObject tmap_user(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_arg_count(stream, args, ONE_INTEGER, ONE_INTEGER)) {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject username = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt95);
                    username = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != $tmap_user_required$.getDynamicValue(thread)) {
                            {
                                SubLObject user = tm_internals.tm_recognized_userP(username);
                                if (NIL != user) {
                                    if (user != $tmap_user$.getDynamicValue(thread)) {
                                        tm_datastructures.$tm_user$.setDynamicValue(tm_internals.user_name(user), thread);
                                        $tmap_user$.setDynamicValue(user, thread);
                                        $tmap_passwordp$.setDynamicValue(NIL, thread);
                                    }
                                    tmap_result($accepted$.getDynamicValue(thread), stream, $str_alt96$User__S_accepted_, list(username));
                                } else {
                                    tmap_result($unknown$.getDynamicValue(thread), stream, $str_alt97$User__S_unknown_, list(username));
                                }
                            }
                        } else {
                            tmap_result($accepted$.getDynamicValue(thread), stream, $str_alt98$User_authentication_is_not_requir, NIL);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt95);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_password(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_arg_count(stream, args, ONE_INTEGER, ONE_INTEGER)) {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject password = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt101);
                    password = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == $tmap_password_required$.getDynamicValue(thread)) {
                            tmap_result($accepted$.getDynamicValue(thread), stream, $str_alt102$Password_authentication_is_not_re, NIL);
                        } else
                            if (NIL == $tmap_user$.getDynamicValue(thread)) {
                                tmap_result($user_required$.getDynamicValue(thread), stream, $str_alt68$Please_specify_a_user_with_the_US, NIL);
                            } else
                                if (NIL == tm_internals.user_password($tmap_user$.getDynamicValue(thread))) {
                                    tmap_result($unknown$.getDynamicValue(thread), stream, $str_alt103$No_password_information_found___C, NIL);
                                } else
                                    if (tm_internals.user_password($tmap_user$.getDynamicValue(thread)).equal(password)) {
                                        $tmap_passwordp$.setDynamicValue(T, thread);
                                        tmap_result($accepted$.getDynamicValue(thread), stream, $str_alt104$Password_accepted_, NIL);
                                    } else {
                                        tmap_result($unknown$.getDynamicValue(thread), stream, $str_alt105$Incorrect_password_, NIL);
                                    }



                    } else {
                        cdestructuring_bind_error(datum, $list_alt101);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_group(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_arg_count(stream, args, ONE_INTEGER, ONE_INTEGER)) {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject groupname = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    groupname = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == $tmap_group_required$.getDynamicValue(thread)) {
                            tmap_result($accepted$.getDynamicValue(thread), stream, $str_alt109$Group_authentication_is_not_requi, NIL);
                        } else
                            if ((NIL != $tmap_user_required$.getDynamicValue(thread)) && (NIL == $tmap_user$.getDynamicValue(thread))) {
                                tmap_result($user_required$.getDynamicValue(thread), stream, $str_alt68$Please_specify_a_user_with_the_US, NIL);
                            } else {
                                {
                                    SubLObject group = tm_internals.tm_recognized_appP(groupname);
                                    if (NIL != group) {
                                        if (NIL == tm_datastructures.$tm_user$.getDynamicValue(thread)) {
                                            tm_datastructures.$tm_user$.setDynamicValue(tm_internals.user_name(group), thread);
                                        }
                                        $tmap_group$.setDynamicValue(group, thread);
                                        tmap_result($accepted$.getDynamicValue(thread), stream, $str_alt110$Group__S_accepted_, list(groupname));
                                    } else {
                                        tmap_result($unknown$.getDynamicValue(thread), stream, $str_alt111$Group__S_unknown_, list(groupname));
                                    }
                                }
                            }

                    } else {
                        cdestructuring_bind_error(datum, $list_alt108);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_term(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_TERM)) {
                if (NIL != check_arg_count(stream, args, TWO_INTEGER, TWO_INTEGER)) {
                    {
                        SubLObject datum = args;
                        SubLObject current = datum;
                        SubLObject v_term = NIL;
                        SubLObject thesaurus_name = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt115);
                        v_term = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt115);
                        thesaurus_name = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != check_non_empty_string(stream, v_term, $$$term)) {
                                {
                                    SubLObject thesaurus = check_thesaurus(stream, thesaurus_name);
                                    if (NIL != thesaurus) {
                                        log_tmap_command($str_alt112$GET_TERM, thesaurus);
                                        if (NIL != tm_internals.exact_search_thesauri(v_term, list(thesaurus), UNPROVIDED)) {
                                            tmap_result($preferred_term$.getDynamicValue(thread), stream, $str_alt117$Found_it_as_a_preferred_term_, NIL);
                                        } else
                                            if (NIL != tm_internals.exact_search_thesauri(v_term, list(thesaurus), T)) {
                                                tmap_result($use_for$.getDynamicValue(thread), stream, $str_alt118$Found_it_as_a_use_for_, NIL);
                                            } else {
                                                tmap_result($not_found$.getDynamicValue(thread), stream, $str_alt119$The_term_was_not_found_, NIL);
                                            }

                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt115);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_thesauri_of_term(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_THESAURI_OF_TERM)) {
                if (NIL != check_arg_count(stream, args, ONE_INTEGER, TWO_INTEGER)) {
                    {
                        SubLObject datum = args;
                        SubLObject current = datum;
                        SubLObject v_term = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt123);
                        v_term = current.first();
                        current = current.rest();
                        {
                            SubLObject status = (current.isCons()) ? ((SubLObject) (current.first())) : BOTH;
                            destructuring_bind_must_listp(current, datum, $list_alt123);
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != check_non_empty_string(stream, v_term, $$$term)) {
                                    if (NIL != subl_promotions.memberP(status, $list_alt125, UNPROVIDED, UNPROVIDED)) {
                                        {
                                            SubLObject thesauri = tmap_thesauri();
                                            log_tmap_command($str_alt120$GET_THESAURI_OF_TERM, thesauri);
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject preferred_signs = tm_datastructures.tm_alpha_complete_in_thesauri(v_term, thesauri, T, T, UNPROVIDED);
                                                SubLObject pt_rot = thread.secondMultipleValue();
                                                SubLObject use_for_signs = thread.thirdMultipleValue();
                                                SubLObject uf_rot = thread.fourthMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject signs = NIL;
                                                    SubLObject pcase_var = status;
                                                    if (pcase_var.eql(BOTH)) {
                                                        signs = append(preferred_signs, use_for_signs);
                                                    } else
                                                        if (pcase_var.eql(PREFERRED)) {
                                                            signs = preferred_signs;
                                                        } else
                                                            if (pcase_var.eql(USE_FOR)) {
                                                                signs = use_for_signs;
                                                            }


                                                    if (NIL != signs) {
                                                        tmap_string_results($thesauri_follow$.getDynamicValue(thread), stream, Mapping.mapcar(symbol_function(THESAURUS_NAME), delete_duplicates(Mapping.mapcar(symbol_function(SIGN_THESAURUS), signs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                                                    } else {
                                                        tmap_result($not_found$.getDynamicValue(thread), stream, $str_alt129$The_term__S_was_not_found_, list(v_term));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        tmap_result($bogus_argument$.getDynamicValue(thread), stream, $str_alt130$The_argument__S_was_not_one_of_BO, list(status));
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt123);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_ufs(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_UFS)) {
                {
                    SubLObject evalled_stream = stream;
                    SubLObject evalled_args = args;
                    SubLObject preferred_signs = NIL;
                    SubLObject thesauri = NIL;
                    if (NIL != check_arg_count(evalled_stream, evalled_args, ONE_INTEGER, NIL)) {
                        {
                            SubLObject datum = evalled_args;
                            SubLObject current = datum;
                            SubLObject v_term = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt134);
                            v_term = current.first();
                            current = current.rest();
                            {
                                SubLObject thesaurus_names = current;
                                if (NIL != check_non_empty_string(evalled_stream, v_term, $$$term)) {
                                    thesauri = check_thesauri(evalled_stream, thesaurus_names);
                                    if (NIL != thesauri) {
                                        preferred_signs = check_preferred_signs(evalled_stream, v_term, thesauri);
                                        if (NIL != preferred_signs) {
                                            log_tmap_command($str_alt131$GET_UFS, thesauri);
                                            {
                                                SubLObject use_for_strings = NIL;
                                                SubLObject cdolist_list_var = preferred_signs;
                                                SubLObject preferred_sign = NIL;
                                                for (preferred_sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , preferred_sign = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject concept = tm_datastructures.sign_concept(preferred_sign);
                                                        SubLObject cdolist_list_var_12 = thesauri;
                                                        SubLObject thesaurus = NIL;
                                                        for (thesaurus = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , thesaurus = cdolist_list_var_12.first()) {
                                                            {
                                                                SubLObject cdolist_list_var_13 = tm_internals.use_fors_in_thesaurus(concept, thesaurus);
                                                                SubLObject use_for_string = NIL;
                                                                for (use_for_string = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , use_for_string = cdolist_list_var_13.first()) {
                                                                    use_for_strings = cons(use_for_string, use_for_strings);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                tmap_string_results($terms_follow$.getDynamicValue(thread), stream, delete_duplicates(use_for_strings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_nts(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_NTS)) {
                {
                    SubLObject evalled_stream = stream;
                    SubLObject evalled_args = args;
                    SubLObject preferred_signs = NIL;
                    SubLObject thesauri = NIL;
                    if (NIL != check_arg_count(evalled_stream, evalled_args, ONE_INTEGER, NIL)) {
                        {
                            SubLObject datum = evalled_args;
                            SubLObject current = datum;
                            SubLObject v_term = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt134);
                            v_term = current.first();
                            current = current.rest();
                            {
                                SubLObject thesaurus_names = current;
                                if (NIL != check_non_empty_string(evalled_stream, v_term, $$$term)) {
                                    thesauri = check_thesauri(evalled_stream, thesaurus_names);
                                    if (NIL != thesauri) {
                                        preferred_signs = check_preferred_signs(evalled_stream, v_term, thesauri);
                                        if (NIL != preferred_signs) {
                                            log_tmap_command($str_alt135$GET_NTS, thesauri);
                                            {
                                                SubLObject narrower_signs = NIL;
                                                SubLObject cdolist_list_var = preferred_signs;
                                                SubLObject preferred_sign = NIL;
                                                for (preferred_sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , preferred_sign = cdolist_list_var.first()) {
                                                    narrower_signs = append(tm_internals.narrower_signs(preferred_sign), narrower_signs);
                                                }
                                                tmap_string_results($terms_follow$.getDynamicValue(thread), stream, delete_duplicates(Mapping.mapcar(symbol_function(SIGN_TERM), narrower_signs), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_all_nts(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_ALL_NTS)) {
                {
                    SubLObject evalled_stream = stream;
                    SubLObject evalled_args = args;
                    SubLObject preferred_signs = NIL;
                    SubLObject thesauri = NIL;
                    if (NIL != check_arg_count(evalled_stream, evalled_args, ONE_INTEGER, NIL)) {
                        {
                            SubLObject datum = evalled_args;
                            SubLObject current = datum;
                            SubLObject v_term = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt134);
                            v_term = current.first();
                            current = current.rest();
                            {
                                SubLObject thesaurus_names = current;
                                if (NIL != check_non_empty_string(evalled_stream, v_term, $$$term)) {
                                    thesauri = check_thesauri(evalled_stream, thesaurus_names);
                                    if (NIL != thesauri) {
                                        preferred_signs = check_preferred_signs(evalled_stream, v_term, thesauri);
                                        if (NIL != preferred_signs) {
                                            log_tmap_command($str_alt139$GET_ALL_NTS, thesauri);
                                            {
                                                SubLObject narrower_signs = NIL;
                                                SubLObject cdolist_list_var = preferred_signs;
                                                SubLObject preferred_sign = NIL;
                                                for (preferred_sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , preferred_sign = cdolist_list_var.first()) {
                                                    narrower_signs = append(tm_internals.all_narrower_signs(preferred_sign), narrower_signs);
                                                }
                                                tmap_string_results($terms_follow$.getDynamicValue(thread), stream, delete_duplicates(Mapping.mapcar(symbol_function(SIGN_TERM), narrower_signs), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_ufs_of_nts(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_UFS_OF_NTS)) {
                {
                    SubLObject evalled_stream = stream;
                    SubLObject evalled_args = args;
                    SubLObject preferred_signs = NIL;
                    SubLObject thesauri = NIL;
                    if (NIL != check_arg_count(evalled_stream, evalled_args, ONE_INTEGER, NIL)) {
                        {
                            SubLObject datum = evalled_args;
                            SubLObject current = datum;
                            SubLObject v_term = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt134);
                            v_term = current.first();
                            current = current.rest();
                            {
                                SubLObject thesaurus_names = current;
                                if (NIL != check_non_empty_string(evalled_stream, v_term, $$$term)) {
                                    thesauri = check_thesauri(evalled_stream, thesaurus_names);
                                    if (NIL != thesauri) {
                                        preferred_signs = check_preferred_signs(evalled_stream, v_term, thesauri);
                                        if (NIL != preferred_signs) {
                                            log_tmap_command($str_alt142$GET_UFS_OF_NTS, thesauri);
                                            {
                                                SubLObject use_for_signs = NIL;
                                                SubLObject cdolist_list_var = preferred_signs;
                                                SubLObject preferred_sign = NIL;
                                                for (preferred_sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , preferred_sign = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject cdolist_list_var_14 = tm_internals.all_narrower_signs(preferred_sign);
                                                        SubLObject narrower_sign = NIL;
                                                        for (narrower_sign = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , narrower_sign = cdolist_list_var_14.first()) {
                                                            use_for_signs = append(tm_datastructures.signs_from_concept(tm_datastructures.sign_concept(narrower_sign), $$useFor, tm_datastructures.sign_thesaurus(narrower_sign)), use_for_signs);
                                                        }
                                                    }
                                                }
                                                tmap_string_results($terms_follow$.getDynamicValue(thread), stream, delete_duplicates(Mapping.mapcar(symbol_function(SIGN_TERM), use_for_signs), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_all_equivalent_terms(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_ALL_EQUIVALENT_TERMS)) {
                if (NIL != check_arg_count(stream, args, ONE_INTEGER, NIL)) {
                    {
                        SubLObject datum = args;
                        SubLObject current = datum;
                        SubLObject v_term = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt149);
                        v_term = current.first();
                        current = current.rest();
                        {
                            SubLObject thesaurus_names = current;
                            if (NIL != check_non_empty_string(stream, v_term, $$$term)) {
                                {
                                    SubLObject thesauri = check_thesauri(stream, thesaurus_names);
                                    if (NIL != thesauri) {
                                        log_tmap_command($str_alt146$GET_ALL_EQUIVALENT_TERMS, thesauri);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject preferred_signs = tm_datastructures.tm_alpha_complete_in_thesauri(v_term, thesauri, T, T, UNPROVIDED);
                                            SubLObject pt_rot = thread.secondMultipleValue();
                                            SubLObject use_for_signs = thread.thirdMultipleValue();
                                            SubLObject uf_rot = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject cdolist_list_var = use_for_signs;
                                                SubLObject use_for_sign = NIL;
                                                for (use_for_sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , use_for_sign = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject these_preferred_signs = tm_datastructures.signs_from_concept(tm_datastructures.sign_concept(use_for_sign), $$preferredTerm, tm_datastructures.sign_thesaurus(use_for_sign));
                                                        SubLObject cdolist_list_var_15 = these_preferred_signs;
                                                        SubLObject this_preferred_sign = NIL;
                                                        for (this_preferred_sign = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , this_preferred_sign = cdolist_list_var_15.first()) {
                                                            preferred_signs = cons(this_preferred_sign, preferred_signs);
                                                        }
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject results = NIL;
                                                SubLObject cdolist_list_var = preferred_signs;
                                                SubLObject preferred_sign = NIL;
                                                for (preferred_sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , preferred_sign = cdolist_list_var.first()) {
                                                    results = cons(tm_datastructures.sign_term(preferred_sign), results);
                                                    {
                                                        SubLObject cdolist_list_var_16 = tm_datastructures.signs_from_concept(tm_datastructures.sign_concept(preferred_sign), $$useFor, tm_datastructures.sign_thesaurus(preferred_sign));
                                                        SubLObject use_for_sign = NIL;
                                                        for (use_for_sign = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , use_for_sign = cdolist_list_var_16.first()) {
                                                            results = cons(tm_datastructures.sign_term(use_for_sign), results);
                                                        }
                                                    }
                                                }
                                                if (NIL != results) {
                                                    tmap_string_results($terms_follow$.getDynamicValue(thread), stream, delete(v_term, delete_duplicates(results, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                } else {
                                                    tmap_result($not_found$.getDynamicValue(thread), stream, $str_alt129$The_term__S_was_not_found_, list(v_term));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_all_lexical_equivalents(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_ALL_LEXICAL_EQUIVALENTS)) {
                if (NIL != check_arg_count(stream, args, ONE_INTEGER, NIL)) {
                    {
                        SubLObject datum = args;
                        SubLObject current = datum;
                        SubLObject v_term = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt149);
                        v_term = current.first();
                        current = current.rest();
                        {
                            SubLObject thesaurus_names = current;
                            if (NIL != check_non_empty_string(stream, v_term, $$$term)) {
                                {
                                    SubLObject thesauri = check_thesauri(stream, thesaurus_names);
                                    if (NIL != thesauri) {
                                        log_tmap_command($str_alt151$GET_ALL_LEXICAL_EQUIVALENTS, thesauri);
                                        {
                                            SubLObject lexpreds = tm_lexical_index.all_lexpreds();
                                            SubLObject terms = NIL;
                                            SubLObject cdolist_list_var = thesauri;
                                            SubLObject thesaurus = NIL;
                                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                {
                                                    SubLObject cdolist_list_var_17 = lexpreds;
                                                    SubLObject lookup_lexpred = NIL;
                                                    for (lookup_lexpred = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , lookup_lexpred = cdolist_list_var_17.first()) {
                                                        {
                                                            SubLObject cdolist_list_var_18 = tm_lexical_index.lexical_lookup(v_term, lookup_lexpred, thesaurus, UNPROVIDED, UNPROVIDED);
                                                            SubLObject sign = NIL;
                                                            for (sign = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , sign = cdolist_list_var_18.first()) {
                                                                {
                                                                    SubLObject cdolist_list_var_19 = lexpreds;
                                                                    SubLObject related_lexpred = NIL;
                                                                    for (related_lexpred = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , related_lexpred = cdolist_list_var_19.first()) {
                                                                        {
                                                                            SubLObject cdolist_list_var_20 = tm_datastructures.signs_from_concept(tm_datastructures.sign_concept(sign), related_lexpred, thesaurus);
                                                                            SubLObject related = NIL;
                                                                            for (related = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , related = cdolist_list_var_20.first()) {
                                                                                terms = cons(tm_datastructures.sign_term(related), terms);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL != terms) {
                                                tmap_string_results($terms_follow$.getDynamicValue(thread), stream, delete(v_term, delete_duplicates(terms, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            } else {
                                                tmap_result($not_found$.getDynamicValue(thread), stream, $str_alt129$The_term__S_was_not_found_, list(v_term));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_terms_by_relation(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_TERMS_BY_RELATION)) {
                if (NIL != check_arg_count(stream, args, TWO_INTEGER, NIL)) {
                    {
                        SubLObject relation_name = check_relation(stream, second(args));
                        if (NIL != relation_name) {
                            {
                                SubLObject evalled_stream = stream;
                                SubLObject evalled_args = cons(args.first(), args.rest().rest());
                                SubLObject preferred_signs = NIL;
                                SubLObject thesauri = NIL;
                                if (NIL != check_arg_count(evalled_stream, evalled_args, ONE_INTEGER, NIL)) {
                                    {
                                        SubLObject datum = evalled_args;
                                        SubLObject current = datum;
                                        SubLObject v_term = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt134);
                                        v_term = current.first();
                                        current = current.rest();
                                        {
                                            SubLObject thesaurus_names = current;
                                            if (NIL != check_non_empty_string(evalled_stream, v_term, $$$term)) {
                                                thesauri = check_thesauri(evalled_stream, thesaurus_names);
                                                if (NIL != thesauri) {
                                                    preferred_signs = check_preferred_signs(evalled_stream, v_term, thesauri);
                                                    if (NIL != preferred_signs) {
                                                        log_tmap_command($str_alt154$GET_TERMS_BY_RELATION, thesauri);
                                                        {
                                                            SubLObject results = NIL;
                                                            SubLObject relation = tm_internals.relation_constant_from_abbreviation(relation_name);
                                                            SubLObject term_arg = tm_internals.relation_term_arg_from_abbreviation(relation_name);
                                                            SubLObject value_arg = tm_internals.relation_value_arg_from_abbreviation(relation_name);
                                                            SubLObject cdolist_list_var = preferred_signs;
                                                            SubLObject preferred_sign = NIL;
                                                            for (preferred_sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , preferred_sign = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject concept = tm_datastructures.sign_concept(preferred_sign);
                                                                    SubLObject thesaurus = tm_datastructures.sign_thesaurus(preferred_sign);
                                                                    SubLObject values = kb_mapping_utilities.pred_values_in_mt(concept, relation, thesaurus, term_arg, value_arg, UNPROVIDED);
                                                                    SubLObject more_values = NIL;
                                                                    if (NIL != kb_accessors.symmetric_predicateP(relation)) {
                                                                        more_values = kb_mapping_utilities.pred_values_in_mt(concept, relation, thesaurus, value_arg, term_arg, UNPROVIDED);
                                                                        values = append(values, more_values);
                                                                    }
                                                                    {
                                                                        SubLObject cdolist_list_var_21 = values;
                                                                        SubLObject value = NIL;
                                                                        for (value = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , value = cdolist_list_var_21.first()) {
                                                                            if (NIL != forts.fort_p(value)) {
                                                                                {
                                                                                    SubLObject v_term_22 = tm_datastructures.concept_term(value, thesaurus);
                                                                                    if (NIL != v_term_22) {
                                                                                        results = cons(v_term_22, results);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (value.isString()) {
                                                                                    results = cons(value, results);
                                                                                }

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            tmap_string_results($terms_follow$.getDynamicValue(thread), stream, delete_duplicates(results, symbol_function($sym157$STRING_), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_relations(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_RELATIONS)) {
                if (NIL != check_arg_count(stream, args, ZERO_INTEGER, ZERO_INTEGER)) {
                    tmap_string_results($relations_follow$.getDynamicValue(thread), stream, tm_internals.all_relation_symbols_in_order());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_thesauri(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_THESAURI)) {
                if (NIL != check_arg_count(stream, args, ZERO_INTEGER, ZERO_INTEGER)) {
                    tmap_string_results($thesauri_follow$.getDynamicValue(thread), stream, Mapping.mapcar(symbol_function(THESAURUS_NAME), tmap_thesauri()));
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tmap_get_tops(SubLObject stream, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != check_authentication(stream, GET_TOPS)) {
                if (NIL != check_arg_count(stream, args, ZERO_INTEGER, NIL)) {
                    {
                        SubLObject thesauri = check_thesauri(stream, args);
                        SubLObject terms = NIL;
                        if (NIL != thesauri) {
                            log_tmap_command($str_alt164$GET_TOPS, thesauri);
                            {
                                SubLObject cdolist_list_var = thesauri;
                                SubLObject thesaurus = NIL;
                                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_23 = html_tm_browsing.get_tops_for_thesaurus(thesaurus);
                                        SubLObject item = NIL;
                                        for (item = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , item = cdolist_list_var_23.first()) {
                                            {
                                                SubLObject datum = item;
                                                SubLObject current = datum;
                                                SubLObject concept = NIL;
                                                SubLObject v_term = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt167);
                                                concept = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt167);
                                                v_term = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    terms = cons(v_term, terms);
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt167);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            tmap_string_results($terms_follow$.getDynamicValue(thread), stream, delete_duplicates(terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        }
                    }
                }
            }
            return NIL;
        }
    }



    /**
     * Returns the local tmap-port according to defined system parameters.
     */
    public static final SubLObject tmap_port() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), $tmap_port_offset$.getDynamicValue(thread));
        }
    }

    public static final SubLObject subloop_reserved_initialize_tmap_basic_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_tmap_basic_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject tmap_basic_p(SubLObject tmap_basic) {
        return classes.subloop_instanceof_class(tmap_basic, TMAP_BASIC);
    }

    public static final SubLObject get_tmap_kb_thesaurus(SubLObject tmap_kb) {
        return classes.subloop_get_access_protected_instance_slot(tmap_kb, THREE_INTEGER, THESAURUS);
    }

    public static final SubLObject set_tmap_kb_thesaurus(SubLObject tmap_kb, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(tmap_kb, value, THREE_INTEGER, THESAURUS);
    }

    public static final SubLObject subloop_reserved_initialize_tmap_kb_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_tmap_kb_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, TMAP_KB, THESAURUS, NIL);
        return NIL;
    }

    public static final SubLObject tmap_kb_p(SubLObject tmap_kb) {
        return classes.subloop_instanceof_class(tmap_kb, TMAP_KB);
    }

    public static final SubLObject get_tmap_kb_2_thesaurus2(SubLObject tmap_kb_2) {
        return classes.subloop_get_access_protected_instance_slot(tmap_kb_2, FOUR_INTEGER, THESAURUS2);
    }

    public static final SubLObject set_tmap_kb_2_thesaurus2(SubLObject tmap_kb_2, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(tmap_kb_2, value, FOUR_INTEGER, THESAURUS2);
    }

    public static final SubLObject get_tmap_kb_2_thesaurus1(SubLObject tmap_kb_2) {
        return classes.subloop_get_access_protected_instance_slot(tmap_kb_2, THREE_INTEGER, THESAURUS1);
    }

    public static final SubLObject set_tmap_kb_2_thesaurus1(SubLObject tmap_kb_2, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(tmap_kb_2, value, THREE_INTEGER, THESAURUS1);
    }

    public static final SubLObject subloop_reserved_initialize_tmap_kb_2_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_tmap_kb_2_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, TMAP_KB_2, THESAURUS1, NIL);
        classes.subloop_initialize_slot(new_instance, TMAP_KB_2, THESAURUS2, NIL);
        return NIL;
    }

    public static final SubLObject tmap_kb_2_p(SubLObject tmap_kb_2) {
        return classes.subloop_instanceof_class(tmap_kb_2, TMAP_KB_2);
    }

    public static final SubLObject declare_tm_api_file() {
        declareFunction("tmap_result", "TMAP-RESULT", 4, 0, false);
        declareFunction("tmap_random_results", "TMAP-RANDOM-RESULTS", 3, 0, false);
        declareFunction("tmap_string_results", "TMAP-STRING-RESULTS", 3, 0, false);
        declareMacro("define_tmap_command", "DEFINE-TMAP-COMMAND");
        declareFunction("tmap_server_handler", "TMAP-SERVER-HANDLER", 2, 0, false);
        declareFunction("thesaurus_manager_access_protocol_server_top_level", "THESAURUS-MANAGER-ACCESS-PROTOCOL-SERVER-TOP-LEVEL", 2, 0, false);
        declareFunction("tmap_thesauri", "TMAP-THESAURI", 0, 0, false);
        declareFunction("log_tmap_command", "LOG-TMAP-COMMAND", 2, 0, false);
        declareFunction("check_non_empty_string", "CHECK-NON-EMPTY-STRING", 3, 0, false);
        declareFunction("check_thesaurus", "CHECK-THESAURUS", 2, 0, false);
        declareFunction("check_thesauri", "CHECK-THESAURI", 2, 0, false);
        declareFunction("check_relation", "CHECK-RELATION", 2, 0, false);
        declareFunction("check_arg_count", "CHECK-ARG-COUNT", 4, 0, false);
        declareFunction("check_preferred_signs", "CHECK-PREFERRED-SIGNS", 3, 0, false);
        declareFunction("check_authentication", "CHECK-AUTHENTICATION", 2, 0, false);
        declareMacro("with_preferred_signs_and_thesauri", "WITH-PREFERRED-SIGNS-AND-THESAURI");
        declareFunction("tmap_help", "TMAP-HELP", 2, 0, false);
        declareFunction("tmap_quit", "TMAP-QUIT", 2, 0, false);
        declareFunction("tmap_user", "TMAP-USER", 2, 0, false);
        declareFunction("tmap_password", "TMAP-PASSWORD", 2, 0, false);
        declareFunction("tmap_group", "TMAP-GROUP", 2, 0, false);
        declareFunction("tmap_get_term", "TMAP-GET-TERM", 2, 0, false);
        declareFunction("tmap_get_thesauri_of_term", "TMAP-GET-THESAURI-OF-TERM", 2, 0, false);
        declareFunction("tmap_get_ufs", "TMAP-GET-UFS", 2, 0, false);
        declareFunction("tmap_get_nts", "TMAP-GET-NTS", 2, 0, false);
        declareFunction("tmap_get_all_nts", "TMAP-GET-ALL-NTS", 2, 0, false);
        declareFunction("tmap_get_ufs_of_nts", "TMAP-GET-UFS-OF-NTS", 2, 0, false);
        declareFunction("tmap_get_all_equivalent_terms", "TMAP-GET-ALL-EQUIVALENT-TERMS", 2, 0, false);
        declareFunction("tmap_get_all_lexical_equivalents", "TMAP-GET-ALL-LEXICAL-EQUIVALENTS", 2, 0, false);
        declareFunction("tmap_get_terms_by_relation", "TMAP-GET-TERMS-BY-RELATION", 2, 0, false);
        declareFunction("tmap_get_relations", "TMAP-GET-RELATIONS", 2, 0, false);
        declareFunction("tmap_get_thesauri", "TMAP-GET-THESAURI", 2, 0, false);
        declareFunction("tmap_get_tops", "TMAP-GET-TOPS", 2, 0, false);
        declareFunction("tmap_port", "TMAP-PORT", 0, 0, false);
        declareFunction("subloop_reserved_initialize_tmap_basic_class", "SUBLOOP-RESERVED-INITIALIZE-TMAP-BASIC-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_tmap_basic_instance", "SUBLOOP-RESERVED-INITIALIZE-TMAP-BASIC-INSTANCE", 1, 0, false);
        declareFunction("tmap_basic_p", "TMAP-BASIC-P", 1, 0, false);
        declareFunction("get_tmap_kb_thesaurus", "GET-TMAP-KB-THESAURUS", 1, 0, false);
        declareFunction("set_tmap_kb_thesaurus", "SET-TMAP-KB-THESAURUS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_tmap_kb_class", "SUBLOOP-RESERVED-INITIALIZE-TMAP-KB-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_tmap_kb_instance", "SUBLOOP-RESERVED-INITIALIZE-TMAP-KB-INSTANCE", 1, 0, false);
        declareFunction("tmap_kb_p", "TMAP-KB-P", 1, 0, false);
        declareFunction("get_tmap_kb_2_thesaurus2", "GET-TMAP-KB-2-THESAURUS2", 1, 0, false);
        declareFunction("set_tmap_kb_2_thesaurus2", "SET-TMAP-KB-2-THESAURUS2", 2, 0, false);
        declareFunction("get_tmap_kb_2_thesaurus1", "GET-TMAP-KB-2-THESAURUS1", 1, 0, false);
        declareFunction("set_tmap_kb_2_thesaurus1", "SET-TMAP-KB-2-THESAURUS1", 2, 0, false);
        declareFunction("subloop_reserved_initialize_tmap_kb_2_class", "SUBLOOP-RESERVED-INITIALIZE-TMAP-KB-2-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_tmap_kb_2_instance", "SUBLOOP-RESERVED-INITIALIZE-TMAP-KB-2-INSTANCE", 1, 0, false);
        declareFunction("tmap_kb_2_p", "TMAP-KB-2-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_tm_api_file() {
        defparameter("*COMMAND-LIST-FOLLOWS*", $int$100);
        defparameter("*READY*", $int$200);
        defparameter("*GOODBYE*", $int$201);
        defparameter("*ACCEPTED*", $int$202);
        defparameter("*PREFERRED-TERM*", $int$210);
        defparameter("*USE-FOR*", $int$211);
        defparameter("*TERMS-FOLLOW*", $int$240);
        defparameter("*THESAURI-FOLLOW*", $int$241);
        defparameter("*RELATIONS-FOLLOW*", $int$242);
        defparameter("*NOT-A-PREFERRED-TERM*", $int$400);
        defparameter("*NOT-FOUND*", $int$401);
        defparameter("*UNKNOWN-THESAURUS*", $int$402);
        defparameter("*UNKNOWN-RELATION*", $int$403);
        defparameter("*INACCESSIBLE-THESAURUS*", $int$404);
        defparameter("*SERVICE-UNAVAILABLE*", $int$500);
        defparameter("*NO-THESAURI*", $int$501);
        defparameter("*NOT-IMPLEMENTED*", $int$510);
        defparameter("*UNKNOWN-COMMAND*", $int$511);
        defparameter("*UNREADABLE-COMMAND*", $int$512);
        defparameter("*INTERNAL-ERROR*", $int$513);
        defparameter("*UNREADABLE-ARGUMENT*", $int$520);
        defparameter("*EMPTY-STRING-ERROR*", $int$521);
        defparameter("*NOT-A-STRING*", $int$522);
        defparameter("*BAD-ARGUMENTS*", $int$523);
        defparameter("*BOGUS-ARGUMENT*", $int$524);
        defparameter("*UNKNOWN*", $int$530);
        defparameter("*USER-REQUIRED*", $int$531);
        defparameter("*GROUP-REQUIRED*", $int$532);
        defparameter("*PASSWORD-REQUIRED*", $int$533);
        defparameter("*USER-NOT-AUTHORIZED*", $int$534);
        defparameter("*GROUP-NOT-AUTHORIZED*", $int$535);
        defvar("*TMAP-COMMANDS*", NIL);
        defparameter("*TMAP-VERSION*", $str_alt42$1_3);
        defparameter("*TMAP-USER-REQUIRED*", NIL);
        defparameter("*TMAP-PASSWORD-REQUIRED*", NIL);
        defparameter("*TMAP-GROUP-REQUIRED*", NIL);
        defparameter("*LOG-TMAP-COMMANDS*", T);
        defparameter("*LOG-TMAP-SESSIONS*", T);
        defvar("*TMAP-USER*", NIL);
        defvar("*TMAP-GROUP*", NIL);
        defvar("*TMAP-PASSWORDP*", NIL);
        defvar("*TMAP-SESSION-NOTED*", NIL);
        defvar("*TMAP-PORT-OFFSET*", $UNSET);
        return NIL;
    }

    public static final SubLObject setup_tm_api_file() {
                tcp_server_utilities.register_tcp_server_type($TMAP, TMAP_SERVER_HANDLER, $TEXT);
        {
            SubLObject item_var = cons($$$HELP, TMAP_HELP);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($$$QUIT, TMAP_QUIT);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($$$USER, TMAP_USER);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($$$PASSWORD, TMAP_PASSWORD);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($$$GROUP, TMAP_GROUP);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt112$GET_TERM, TMAP_GET_TERM);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt120$GET_THESAURI_OF_TERM, TMAP_GET_THESAURI_OF_TERM);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt131$GET_UFS, TMAP_GET_UFS);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt135$GET_NTS, TMAP_GET_NTS);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt139$GET_ALL_NTS, TMAP_GET_ALL_NTS);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt142$GET_UFS_OF_NTS, TMAP_GET_UFS_OF_NTS);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt146$GET_ALL_EQUIVALENT_TERMS, TMAP_GET_ALL_EQUIVALENT_TERMS);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt151$GET_ALL_LEXICAL_EQUIVALENTS, TMAP_GET_ALL_LEXICAL_EQUIVALENTS);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt154$GET_TERMS_BY_RELATION, TMAP_GET_TERMS_BY_RELATION);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt158$GET_RELATIONS, TMAP_GET_RELATIONS);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt161$GET_THESAURI, TMAP_GET_THESAURI);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        {
            SubLObject item_var = cons($str_alt164$GET_TOPS, TMAP_GET_TOPS);
            if (NIL == member(item_var, $tmap_commands$.getDynamicValue(), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                $tmap_commands$.setDynamicValue(cons(item_var, $tmap_commands$.getDynamicValue()));
            }
        }
        system_parameters.register_system_parameter($tmap_port_offset$, THIRTEEN_INTEGER, INTEGER, $str_alt170$Possible_values__A_number___This_);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TMAP_BASIC, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(TMAP_BASIC);
        classes.subloop_new_class(TMAP_BASIC, TEST_CASE, NIL, NIL, $list_alt174);
        classes.class_set_implements_slot_listeners(TMAP_BASIC, NIL);
        classes.subloop_note_class_initialization_function(TMAP_BASIC, SUBLOOP_RESERVED_INITIALIZE_TMAP_BASIC_CLASS);
        classes.subloop_note_instance_initialization_function(TMAP_BASIC, SUBLOOP_RESERVED_INITIALIZE_TMAP_BASIC_INSTANCE);
        subloop_reserved_initialize_tmap_basic_class(TMAP_BASIC);
        sunit_macros.define_test_case_postamble(TMAP_BASIC, $str_alt189$tm_api, $$$cycl, NIL);
        sunit_macros.def_test_method_register(TMAP_BASIC, HELP);
        sunit_macros.def_test_method_register(TMAP_BASIC, QUIT);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TMAP_KB, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(TMAP_KB);
        classes.subloop_new_class(TMAP_KB, TEST_CASE, NIL, NIL, $list_alt194);
        classes.class_set_implements_slot_listeners(TMAP_KB, NIL);
        classes.subloop_note_class_initialization_function(TMAP_KB, SUBLOOP_RESERVED_INITIALIZE_TMAP_KB_CLASS);
        classes.subloop_note_instance_initialization_function(TMAP_KB, SUBLOOP_RESERVED_INITIALIZE_TMAP_KB_INSTANCE);
        subloop_reserved_initialize_tmap_kb_class(TMAP_KB);
        sunit_macros.define_test_case_postamble(TMAP_KB, $str_alt189$tm_api, $$$cycl, NIL);
        sunit_macros.def_test_method_register(TMAP_KB, USER);
        sunit_macros.def_test_method_register(TMAP_KB, GET_TERM);
        sunit_macros.def_test_method_register(TMAP_KB, GET_THESAURI);
        sunit_macros.def_test_method_register(TMAP_KB, GET_RELATIONS);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TMAP_KB_2, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(TMAP_KB_2);
        classes.subloop_new_class(TMAP_KB_2, TEST_CASE, NIL, NIL, $list_alt200);
        classes.class_set_implements_slot_listeners(TMAP_KB_2, NIL);
        classes.subloop_note_class_initialization_function(TMAP_KB_2, SUBLOOP_RESERVED_INITIALIZE_TMAP_KB_2_CLASS);
        classes.subloop_note_instance_initialization_function(TMAP_KB_2, SUBLOOP_RESERVED_INITIALIZE_TMAP_KB_2_INSTANCE);
        subloop_reserved_initialize_tmap_kb_2_class(TMAP_KB_2);
        sunit_macros.define_test_case_postamble(TMAP_KB_2, $str_alt189$tm_api, $$$cycl, NIL);
        sunit_macros.def_test_method_register(TMAP_KB_2, GET_THESAURI_OF_TERM);
        sunit_macros.def_test_method_register(TMAP_KB_2, GET_UFS);
        sunit_macros.def_test_method_register(TMAP_KB_2, GET_NTS);
        sunit_macros.def_test_method_register(TMAP_KB_2, GET_ALL_NTS);
        sunit_macros.def_test_method_register(TMAP_KB_2, GET_UFS_OF_NTS);
        sunit_macros.def_test_method_register(TMAP_KB_2, GET_ALL_EQUIVALENT_TERMS);
        sunit_macros.def_test_method_register(TMAP_KB_2, GET_TERMS_BY_RELATION);
        return NIL;
    }



    public static final SubLInteger $int$200 = makeInteger(200);

    public static final SubLInteger $int$201 = makeInteger(201);

    public static final SubLInteger $int$202 = makeInteger(202);

    public static final SubLInteger $int$210 = makeInteger(210);

    public static final SubLInteger $int$211 = makeInteger(211);

    public static final SubLInteger $int$240 = makeInteger(240);

    public static final SubLInteger $int$241 = makeInteger(241);

    public static final SubLInteger $int$242 = makeInteger(242);

    public static final SubLInteger $int$400 = makeInteger(400);

    public static final SubLInteger $int$401 = makeInteger(401);

    public static final SubLInteger $int$402 = makeInteger(402);

    public static final SubLInteger $int$403 = makeInteger(403);

    public static final SubLInteger $int$404 = makeInteger(404);

    public static final SubLInteger $int$500 = makeInteger(500);

    public static final SubLInteger $int$501 = makeInteger(501);

    public static final SubLInteger $int$510 = makeInteger(510);

    public static final SubLInteger $int$511 = makeInteger(511);



    public static final SubLInteger $int$513 = makeInteger(513);

    public static final SubLInteger $int$520 = makeInteger(520);

    public static final SubLInteger $int$521 = makeInteger(521);

    public static final SubLInteger $int$522 = makeInteger(522);

    public static final SubLInteger $int$523 = makeInteger(523);

    public static final SubLInteger $int$524 = makeInteger(524);

    public static final SubLInteger $int$530 = makeInteger(530);

    public static final SubLInteger $int$531 = makeInteger(531);

    public static final SubLInteger $int$532 = makeInteger(532);

    public static final SubLInteger $int$533 = makeInteger(533);

    public static final SubLInteger $int$534 = makeInteger(534);

    public static final SubLInteger $int$535 = makeInteger(535);

    static private final SubLString $str_alt31$_D_ = makeString("~D ");



    static private final SubLString $str_alt33$_D__D_Data_follows_ = makeString("~D ~D Data follows.");

    static private final SubLList $list_alt34 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt35$TMAP__A = makeString("TMAP-~A");









    static private final SubLList $list_alt40 = list(makeSymbol("*TMAP-COMMANDS*"), list(makeSymbol("FUNCTION"), EQUALP));



    static private final SubLString $str_alt42$1_3 = makeString("1.3");

    private static final SubLSymbol $TMAP = makeKeyword("TMAP");

    private static final SubLSymbol TMAP_SERVER_HANDLER = makeSymbol("TMAP-SERVER-HANDLER");



    static private final SubLString $$$CYC = makeString("CYC");



    private static final SubLSymbol TMAP_QUIT = makeSymbol("TMAP-QUIT");

    static private final SubLString $str_alt49$TMAP__A_server_ready = makeString("TMAP ~A server ready");





    static private final SubLString $str_alt52$Could_not_parse_argument_at_index = makeString("Could not parse argument at index ~D.");

    static private final SubLString $str_alt53$Unrecognized_command__S_ = makeString("Unrecognized command ~S.");

    static private final SubLString $str_alt54$The__A_argument___S__is_not_a_str = makeString("The ~A argument \"~S\" is not a string.");

    static private final SubLString $str_alt55$ = makeString("");

    static private final SubLString $str_alt56$The__A_argument_is_empty_ = makeString("The ~A argument is empty.");

    static private final SubLString $$$thesaurus = makeString("thesaurus");

    static private final SubLString $str_alt58$The_thesaurus_named__S_was_not_fo = makeString("The thesaurus named ~S was not found.");

    static private final SubLString $str_alt59$The_thesaurus_named__S_is_not_acc = makeString("The thesaurus named ~S is not accessible.");

    static private final SubLString $str_alt60$No_thesauri_are_available_ = makeString("No thesauri are available.");

    static private final SubLString $$$relation = makeString("relation");

    static private final SubLString $str_alt62$The_relation_named__S_was_not_fou = makeString("The relation named ~S was not found.");

    static private final SubLString $str_alt63$Expected_at_least__D_arguments__g = makeString("Expected at least ~D arguments, got ~D.");

    static private final SubLString $str_alt64$Expected_at_most__D_arguments__go = makeString("Expected at most ~D arguments, got ~D.");

    static private final SubLString $str_alt65$_S_is_not_a_preferred_term_in_any = makeString("~S is not a preferred term in any of ~A.");

    static private final SubLString $str_alt66$_S_is_not_a_preferred_term_in__A_ = makeString("~S is not a preferred term in ~A.");



    static private final SubLString $str_alt68$Please_specify_a_user_with_the_US = makeString("Please specify a user with the USER command.");

    static private final SubLString $str_alt69$Please_specify_a_password_with_th = makeString("Please specify a password with the PASSWORD command.");

    static private final SubLString $str_alt70$Please_specify_a_group_with_the_G = makeString("Please specify a group with the GROUP command.");

    static private final SubLString $$$TMAP_login = makeString("TMAP login");

    static private final SubLList $list_alt72 = list(list(makeSymbol("STREAM"), makeSymbol("ARGS")), list(makeSymbol("PREFERRED-SIGNS"), makeSymbol("THESAURI")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym73$EVALLED_STREAM = makeUninternedSymbol("EVALLED-STREAM");

    static private final SubLSymbol $sym74$EVALLED_ARGS = makeUninternedSymbol("EVALLED-ARGS");

    static private final SubLSymbol $sym75$TERM = makeUninternedSymbol("TERM");

    static private final SubLSymbol $sym76$THESAURUS_NAMES = makeUninternedSymbol("THESAURUS-NAMES");





    private static final SubLSymbol CHECK_ARG_COUNT = makeSymbol("CHECK-ARG-COUNT");

    static private final SubLList $list_alt80 = list(ONE_INTEGER, NIL);



    static private final SubLSymbol $sym82$_REST = makeSymbol("&REST");

    private static final SubLSymbol CHECK_NON_EMPTY_STRING = makeSymbol("CHECK-NON-EMPTY-STRING");

    static private final SubLList $list_alt84 = list(makeString("term"));



    private static final SubLSymbol CHECK_THESAURI = makeSymbol("CHECK-THESAURI");

    private static final SubLSymbol CHECK_PREFERRED_SIGNS = makeSymbol("CHECK-PREFERRED-SIGNS");

    static private final SubLString $$$HELP = makeString("HELP");

    private static final SubLSymbol TMAP_HELP = makeSymbol("TMAP-HELP");



    static private final SubLString $$$QUIT = makeString("QUIT");

    static private final SubLString $str_alt92$BCNU_ = makeString("BCNU.");

    static private final SubLString $$$USER = makeString("USER");

    private static final SubLSymbol TMAP_USER = makeSymbol("TMAP-USER");

    static private final SubLList $list_alt95 = list(makeSymbol("USERNAME"));

    static private final SubLString $str_alt96$User__S_accepted_ = makeString("User ~S accepted.");

    static private final SubLString $str_alt97$User__S_unknown_ = makeString("User ~S unknown.");

    static private final SubLString $str_alt98$User_authentication_is_not_requir = makeString("User authentication is not required.");

    static private final SubLString $$$PASSWORD = makeString("PASSWORD");

    private static final SubLSymbol TMAP_PASSWORD = makeSymbol("TMAP-PASSWORD");

    static private final SubLList $list_alt101 = list(makeSymbol("PASSWORD"));

    static private final SubLString $str_alt102$Password_authentication_is_not_re = makeString("Password authentication is not required.");

    static private final SubLString $str_alt103$No_password_information_found___C = makeString("No password information found.  Contact the administrator.");

    static private final SubLString $str_alt104$Password_accepted_ = makeString("Password accepted.");

    static private final SubLString $str_alt105$Incorrect_password_ = makeString("Incorrect password.");

    static private final SubLString $$$GROUP = makeString("GROUP");

    private static final SubLSymbol TMAP_GROUP = makeSymbol("TMAP-GROUP");

    static private final SubLList $list_alt108 = list(makeSymbol("GROUPNAME"));

    static private final SubLString $str_alt109$Group_authentication_is_not_requi = makeString("Group authentication is not required.");

    static private final SubLString $str_alt110$Group__S_accepted_ = makeString("Group ~S accepted.");

    static private final SubLString $str_alt111$Group__S_unknown_ = makeString("Group ~S unknown.");

    static private final SubLString $str_alt112$GET_TERM = makeString("GET-TERM");

    private static final SubLSymbol TMAP_GET_TERM = makeSymbol("TMAP-GET-TERM");

    private static final SubLSymbol GET_TERM = makeSymbol("GET-TERM");

    static private final SubLList $list_alt115 = list(makeSymbol("TERM"), makeSymbol("THESAURUS-NAME"));

    static private final SubLString $$$term = makeString("term");

    static private final SubLString $str_alt117$Found_it_as_a_preferred_term_ = makeString("Found it as a preferred term.");

    static private final SubLString $str_alt118$Found_it_as_a_use_for_ = makeString("Found it as a use-for.");

    static private final SubLString $str_alt119$The_term_was_not_found_ = makeString("The term was not found.");

    static private final SubLString $str_alt120$GET_THESAURI_OF_TERM = makeString("GET-THESAURI-OF-TERM");

    private static final SubLSymbol TMAP_GET_THESAURI_OF_TERM = makeSymbol("TMAP-GET-THESAURI-OF-TERM");

    private static final SubLSymbol GET_THESAURI_OF_TERM = makeSymbol("GET-THESAURI-OF-TERM");

    static private final SubLList $list_alt123 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), list(makeSymbol("STATUS"), list(QUOTE, makeSymbol("BOTH"))));

    private static final SubLSymbol BOTH = makeSymbol("BOTH");

    static private final SubLList $list_alt125 = list(makeSymbol("BOTH"), makeSymbol("PREFERRED"), makeSymbol("USE-FOR"));

    private static final SubLSymbol PREFERRED = makeSymbol("PREFERRED");

    private static final SubLSymbol USE_FOR = makeSymbol("USE-FOR");

    private static final SubLSymbol SIGN_THESAURUS = makeSymbol("SIGN-THESAURUS");

    static private final SubLString $str_alt129$The_term__S_was_not_found_ = makeString("The term ~S was not found.");

    static private final SubLString $str_alt130$The_argument__S_was_not_one_of_BO = makeString("The argument ~S was not one of BOTH, PREFERRED, or USE-FOR.");

    static private final SubLString $str_alt131$GET_UFS = makeString("GET-UFS");

    private static final SubLSymbol TMAP_GET_UFS = makeSymbol("TMAP-GET-UFS");

    private static final SubLSymbol GET_UFS = makeSymbol("GET-UFS");

    static private final SubLList $list_alt134 = list(makeUninternedSymbol("TERM"), makeSymbol("&REST"), makeUninternedSymbol("THESAURUS-NAMES"));

    static private final SubLString $str_alt135$GET_NTS = makeString("GET-NTS");

    private static final SubLSymbol TMAP_GET_NTS = makeSymbol("TMAP-GET-NTS");

    private static final SubLSymbol GET_NTS = makeSymbol("GET-NTS");

    private static final SubLSymbol SIGN_TERM = makeSymbol("SIGN-TERM");

    static private final SubLString $str_alt139$GET_ALL_NTS = makeString("GET-ALL-NTS");

    private static final SubLSymbol TMAP_GET_ALL_NTS = makeSymbol("TMAP-GET-ALL-NTS");

    private static final SubLSymbol GET_ALL_NTS = makeSymbol("GET-ALL-NTS");

    static private final SubLString $str_alt142$GET_UFS_OF_NTS = makeString("GET-UFS-OF-NTS");

    private static final SubLSymbol TMAP_GET_UFS_OF_NTS = makeSymbol("TMAP-GET-UFS-OF-NTS");

    private static final SubLSymbol GET_UFS_OF_NTS = makeSymbol("GET-UFS-OF-NTS");

    public static final SubLObject $$useFor = constant_handles.reader_make_constant_shell(makeString("useFor"));

    static private final SubLString $str_alt146$GET_ALL_EQUIVALENT_TERMS = makeString("GET-ALL-EQUIVALENT-TERMS");

    private static final SubLSymbol TMAP_GET_ALL_EQUIVALENT_TERMS = makeSymbol("TMAP-GET-ALL-EQUIVALENT-TERMS");

    private static final SubLSymbol GET_ALL_EQUIVALENT_TERMS = makeSymbol("GET-ALL-EQUIVALENT-TERMS");

    static private final SubLList $list_alt149 = list(makeSymbol("TERM"), makeSymbol("&REST"), makeSymbol("THESAURUS-NAMES"));

    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    static private final SubLString $str_alt151$GET_ALL_LEXICAL_EQUIVALENTS = makeString("GET-ALL-LEXICAL-EQUIVALENTS");

    private static final SubLSymbol TMAP_GET_ALL_LEXICAL_EQUIVALENTS = makeSymbol("TMAP-GET-ALL-LEXICAL-EQUIVALENTS");

    private static final SubLSymbol GET_ALL_LEXICAL_EQUIVALENTS = makeSymbol("GET-ALL-LEXICAL-EQUIVALENTS");

    static private final SubLString $str_alt154$GET_TERMS_BY_RELATION = makeString("GET-TERMS-BY-RELATION");

    private static final SubLSymbol TMAP_GET_TERMS_BY_RELATION = makeSymbol("TMAP-GET-TERMS-BY-RELATION");

    private static final SubLSymbol GET_TERMS_BY_RELATION = makeSymbol("GET-TERMS-BY-RELATION");

    static private final SubLSymbol $sym157$STRING_ = makeSymbol("STRING=");

    static private final SubLString $str_alt158$GET_RELATIONS = makeString("GET-RELATIONS");

    private static final SubLSymbol TMAP_GET_RELATIONS = makeSymbol("TMAP-GET-RELATIONS");

    private static final SubLSymbol GET_RELATIONS = makeSymbol("GET-RELATIONS");

    static private final SubLString $str_alt161$GET_THESAURI = makeString("GET-THESAURI");

    private static final SubLSymbol TMAP_GET_THESAURI = makeSymbol("TMAP-GET-THESAURI");

    private static final SubLSymbol GET_THESAURI = makeSymbol("GET-THESAURI");

    static private final SubLString $str_alt164$GET_TOPS = makeString("GET-TOPS");

    private static final SubLSymbol TMAP_GET_TOPS = makeSymbol("TMAP-GET-TOPS");

    private static final SubLSymbol GET_TOPS = makeSymbol("GET-TOPS");

    static private final SubLList $list_alt167 = list(makeSymbol("CONCEPT"), makeSymbol("TERM"));

    public static final SubLSymbol $tmap_port_offset$ = makeSymbol("*TMAP-PORT-OFFSET*");



    static private final SubLString $str_alt170$Possible_values__A_number___This_ = makeString("Possible values: A number.  This parameter specifies the offset of the port number\nfor the Thesaurus Manager Access Protocol.");



    private static final SubLSymbol TMAP_BASIC = makeSymbol("TMAP-BASIC");



    static private final SubLList $list_alt174 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TMAP-READ-AND-VERIFY-READY"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HELP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUIT"), NIL, makeKeyword("PROTECTED")));

















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TMAP_BASIC_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TMAP-BASIC-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TMAP_BASIC_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TMAP-BASIC-INSTANCE");

    static private final SubLString $str_alt189$tm_api = makeString("tm-api");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol HELP = makeSymbol("HELP");



    private static final SubLSymbol TMAP_KB = makeSymbol("TMAP-KB");

    static private final SubLList $list_alt194 = list(list(makeSymbol("THESAURUS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TMAP-READ-AND-VERIFY-READY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("USER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TERM"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-THESAURI"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RELATIONS"), NIL, makeKeyword("PROTECTED")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TMAP_KB_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TMAP-KB-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TMAP_KB_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TMAP-KB-INSTANCE");



    private static final SubLSymbol TMAP_KB_2 = makeSymbol("TMAP-KB-2");

    static private final SubLList $list_alt200 = list(new SubLObject[]{ list(makeSymbol("THESAURUS1"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("THESAURUS2"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TMAP-READ-AND-VERIFY-READY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UFS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-NTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UFS-OF-NTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-EQUIVALENT-TERMS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TERMS-BY-RELATION"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol THESAURUS2 = makeSymbol("THESAURUS2");

    private static final SubLSymbol THESAURUS1 = makeSymbol("THESAURUS1");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TMAP_KB_2_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TMAP-KB-2-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TMAP_KB_2_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TMAP-KB-2-INSTANCE");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_tm_api_file();
    }

    @Override
    public void initializeVariables() {
        init_tm_api_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tm_api_file();
    }
}

