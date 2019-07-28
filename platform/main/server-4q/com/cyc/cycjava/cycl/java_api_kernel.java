package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.open_cyc_inference_api;
import com.cyc.cycjava.cycl.java_api_kernel;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.java_api_kernel.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class java_api_kernel extends SubLTranslatedFile {
    public static final SubLFile me = new java_api_kernel();

    public static final String myName = "com.cyc.cycjava.cycl.java_api_kernel";

    public static final String myFingerPrint = "1553fd9a015f202e7cfa9cf78ab69cfc906c6395e2b1efc2b7fdfca5f804fd3a";

    // deflexical
    private static final SubLSymbol $java_api_leases$ = makeSymbol("*JAVA-API-LEASES*");

    // deflexical
    // The process which monitors lease expirations for java api clients.
    private static final SubLSymbol $java_api_lease_monitor$ = makeSymbol("*JAVA-API-LEASE-MONITOR*");

    // defconstant
    // The lease monitor will check for invalid leases every this many seconds.
    private static final SubLSymbol $java_api_lease_monitor_sleep_seconds$ = makeSymbol("*JAVA-API-LEASE-MONITOR-SLEEP-SECONDS*");

    // defconstant
    // the maximum java api services lease duration in milliseconds
    private static final SubLSymbol $maximum_api_services_lease_duration_in_milliseconds$ = makeSymbol("*MAXIMUM-API-SERVICES-LEASE-DURATION-IN-MILLISECONDS*");

    // defconstant
    /**
     * the multiplier factor used to calcuate actual lease expiration from the
     * requested duration
     */
    private static final SubLSymbol $lease_timeout_cushion_factor$ = makeSymbol("*LEASE-TIMEOUT-CUSHION-FACTOR*");

    // deflexical
    /**
     * The synchronized dictionary of persistent sockets established to provide
     * outbound cfasl messaging with java api clients. The key is a UUID string
     * (GUID) provided by the java client when the socket is created.
     */
    private static final SubLSymbol $java_api_sockets$ = makeSymbol("*JAVA-API-SOCKETS*");

    // deflexical
    private static final SubLSymbol $java_home_red_key_name$ = makeSymbol("*JAVA-HOME-RED-KEY-NAME*");

    // deflexical
    private static final SubLSymbol $java_lib_red_key_name$ = makeSymbol("*JAVA-LIB-RED-KEY-NAME*");

    // deflexical
    private static final SubLSymbol $java_vm_red_key_name$ = makeSymbol("*JAVA-VM-RED-KEY-NAME*");

    // deflexical
    private static final SubLSymbol $java_re_home_red_key_name$ = makeSymbol("*JAVA-RE-HOME-RED-KEY-NAME*");

    // deflexical
    private static final SubLSymbol $java_re_lib_red_key_name$ = makeSymbol("*JAVA-RE-LIB-RED-KEY-NAME*");

    // deflexical
    private static final SubLSymbol $java_re_vm_red_key_name$ = makeSymbol("*JAVA-RE-VM-RED-KEY-NAME*");

    // deflexical
    private static final SubLSymbol $java_path_separator_red_key_name$ = makeSymbol("*JAVA-PATH-SEPARATOR-RED-KEY-NAME*");

    // deflexical
    private static final SubLSymbol $java_red_subtree_name$ = makeSymbol("*JAVA-RED-SUBTREE-NAME*");

    // deflexical
    private static final SubLSymbol $java_red_root_key$ = makeSymbol("*JAVA-RED-ROOT-KEY*");

    // deflexical
    private static final SubLSymbol $java_default_version_numbers$ = makeSymbol("*JAVA-DEFAULT-VERSION-NUMBERS*");

    // deflexical
    private static final SubLSymbol $java_red_key_main_class_key$ = makeSymbol("*JAVA-RED-KEY-MAIN-CLASS-KEY*");

    // deflexical
    private static final SubLSymbol $java_red_key_classpath_key$ = makeSymbol("*JAVA-RED-KEY-CLASSPATH-KEY*");

    // deflexical
    private static final SubLSymbol $java_red_key_arguments_key$ = makeSymbol("*JAVA-RED-KEY-ARGUMENTS-KEY*");



    public static final SubLString $$$Java_API_lease_monitor = makeString("Java API lease monitor");

    public static final SubLSymbol JAVA_API_LEASE_MONITOR = makeSymbol("JAVA-API-LEASE-MONITOR");

    public static final SubLSymbol INITIALIZE_JAVA_API_LEASE_MONITOR = makeSymbol("INITIALIZE-JAVA-API-LEASE-MONITOR");

    public static final SubLString $str4$Initialize_the_process_which_moni = makeString("Initialize the process which monitors lease expirations for java api clients.");

    public static final SubLSymbol HALT_JAVA_API_LEASE_MONITOR = makeSymbol("HALT-JAVA-API-LEASE-MONITOR");

    public static final SubLString $str6$Halt_the_the_process_which_monito = makeString("Halt the the process which monitors lease expirations for java api clients.");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");





    public static final SubLString $str11$Releasing_java_API_resources_iden = makeString("Releasing java API resources identified by ~A~%");

    public static final SubLString $str12$__Releasing_java_API_resources_id = makeString("~%Releasing java API resources identified by ~A~%");

    public static final SubLSymbol RELEASE_RESOURCES_FOR_JAVA_API_CLIENT = makeSymbol("RELEASE-RESOURCES-FOR-JAVA-API-CLIENT");

    public static final SubLList $list14 = list(makeSymbol("UUID-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("ABNORMAL?"));

    public static final SubLString $str15$Closes_the_outbound_api_socket_an = makeString("Closes the outbound api socket and kills active api requests identified by the given uuid-string.\n   @param uuid-string ; stringp\n   @param abnormal?   ; boolean Whether or not the release was abnormal or expected");

    public static final SubLList $list16 = list(list(makeSymbol("UUID-STRING"), makeSymbol("STRINGP")));

    public static final SubLList $list17 = list(NIL);

    private static final SubLInteger $int$3600000 = makeInteger(3600000);



    public static final SubLString $str20$_cfasl_kernel_standard_output_ = makeString("*cfasl-kernel-standard-output*");

    public static final SubLString $str21$api_services_lease_denied_for__A_ = makeString("api services lease denied for ~A~%");

    public static final SubLString $$$api_services_lease_denied = makeString("api services lease denied");

    public static final SubLString $$$api_services_lease_granted_by_ = makeString("api services lease granted by ");

    public static final SubLString $$$_to_ = makeString(" to ");

    public static final SubLString $$$_for_ = makeString(" for ");

    public static final SubLString $$$_milliseconds = makeString(" milliseconds");

    public static final SubLString $str27$_A__ = makeString("~A~%");

    public static final SubLSymbol ACQUIRE_API_SERVICES_LEASE = makeSymbol("ACQUIRE-API-SERVICES-LEASE");

    public static final SubLList $list29 = list(makeSymbol("LEASE-DURATION-IN-MILLISECONDS"), makeSymbol("UUID-STRING"));

    public static final SubLString $str30$Requests_an_API_services_lease___ = makeString("Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\n   for a duration longer than one hour is denied.\n   @param lease-duration-in-milliseconds ; integerp, the lease duration in milliseconds\n   @param uuid-string ; stringp, identifies the java api client");

    public static final SubLList $list31 = list(list(makeSymbol("LEASE-DURATION-IN-MILLISECONDS"), makeSymbol("INTEGERP")), list(makeSymbol("UUID-STRING"), makeSymbol("STRINGP")));

    public static final SubLList $list32 = list(makeSymbol("STRINGP"));

    public static final SubLString $str33$There_are_no_Java_API_client_leas = makeString("There are no Java API client leases.~%");

    public static final SubLString $str34$Java_API_client__A_lease_expires_ = makeString("Java API client ~A lease expires in ~A seconds~%");

    public static final SubLSymbol SHOW_JAVA_API_SERVICE_LEASES = makeSymbol("SHOW-JAVA-API-SERVICE-LEASES");

    public static final SubLString $str36$Displays_the_current_java_api_lea = makeString("Displays the current java api leases.");

    public static final SubLString $$$Java_API_stream_lock = makeString("Java API stream lock");

    private static final SubLSymbol REGISTER_JAVA_API_PASSIVE_SOCKET = makeSymbol("REGISTER-JAVA-API-PASSIVE-SOCKET");

    private static final SubLString $str39$Initializing_java_client_socket__ = makeString("Initializing java client socket ~S~%identified by ~A~%");

    private static final SubLString $str40$Initialized_java_client_socket__S = makeString("Initialized java client socket ~S~%identified by ~A~%");

    private static final SubLString $str41$Invalid_java_client_socket__S__ = makeString("Invalid java client socket ~S~%");

    private static final SubLSymbol INITIALIZE_JAVA_API_PASSIVE_SOCKET = makeSymbol("INITIALIZE-JAVA-API-PASSIVE-SOCKET");

    private static final SubLList $list43 = list(makeSymbol("UUID-STRING"));

    private static final SubLString $str44$Associates_the_current_socket_wit = makeString("Associates the current socket with the given UUID-STRING, then ends this server process\nthat currently uses the socket.");

    private static final SubLString $str45$Looked_up_socket__S_from_dictiona = makeString("Looked up socket ~S from dictionary~%identifed by ~A~%");

    private static final SubLString $str46$Removed_socket__S__from_dictionar = makeString("Removed socket ~S~ from dictionary%identifed by ~A~%");

    private static final SubLSymbol CLOSE_JAVA_API_SOCKET = makeSymbol("CLOSE-JAVA-API-SOCKET");

    private static final SubLString $str48$Closes_the_persistent_cfasl_socke = makeString("Closes the persistent cfasl socket that is associated with \nthe given UUID-STRING.");

    private static final SubLString $str49$___S______S = makeString("~%~S ==> ~S");

    private static final SubLSymbol SHOW_JAVA_API_SOCKETS = makeSymbol("SHOW-JAVA-API-SOCKETS");

    private static final SubLString $str51$Displays_the_java_api_sockets_ = makeString("Displays the java api sockets.");

    private static final SubLSymbol RESET_JAVA_API_KERNEL = makeSymbol("RESET-JAVA-API-KERNEL");

    private static final SubLString $str53$Reset_this_subsystem_to_an_un_ini = makeString("Reset this subsystem to an un-initialized state.");

    private static final SubLString $str54$Verifying_java_api_socket_identif = makeString("Verifying java api socket identified by ~A~%");

    private static final SubLList $list55 = list(makeSymbol("IGNORE"));

    private static final SubLString $str56$closing_broken_java_api_socket__A = makeString("closing broken java api socket ~A~%identified by ~A~%");

    private static final SubLString $str57$_cp = makeString("-cp");

    private static final SubLString $$$Java_proxy_for_ = makeString("Java proxy for ");

    private static final SubLSymbol LAUNCH_JAVA_APPLICATION_FROM_RED = makeSymbol("LAUNCH-JAVA-APPLICATION-FROM-RED");



    private static final SubLString $str61$JAVA_HOME = makeString("JAVA_HOME");

    private static final SubLString $str62$JAVA_LIB = makeString("JAVA_LIB");

    private static final SubLString $str63$JAVA_VM = makeString("JAVA_VM");

    private static final SubLString $str64$JAVA_RE_HOME = makeString("JAVA_RE_HOME");

    private static final SubLString $str65$JAVA_RE_LIB = makeString("JAVA_RE_LIB");

    private static final SubLString $str66$JAVA_RE_VM = makeString("JAVA_RE_VM");

    private static final SubLString $str67$path_separator = makeString("path_separator");

    private static final SubLString $$$java = makeString("java");

    private static final SubLList $list69 = list(ONE_INTEGER, FOUR_INTEGER, TWO_INTEGER);



    private static final SubLString $str71$java_main_class = makeString("java-main-class");

    private static final SubLString $str72$java_classpath = makeString("java-classpath");

    private static final SubLString $str73$java_arguments = makeString("java-arguments");



    public static SubLObject java_api_lease_expiration_time(final SubLObject uuid_string) {
        assert NIL != stringp(uuid_string) : "Types.stringp(uuid_string) " + "CommonSymbols.NIL != Types.stringp(uuid_string) " + uuid_string;
        return dictionary_utilities.synchronized_dictionary_lookup($java_api_leases$.getGlobalValue(), uuid_string, UNPROVIDED);
    }

    public static SubLObject initialize_java_api_lease_monitor() {
        halt_java_api_lease_monitor();
        $java_api_lease_monitor$.setGlobalValue(make_process($$$Java_API_lease_monitor, symbol_function(JAVA_API_LEASE_MONITOR)));
        return NIL;
    }

    public static SubLObject halt_java_api_lease_monitor() {
        if (NIL != $java_api_lease_monitor$.getGlobalValue()) {
            kill_process($java_api_lease_monitor$.getGlobalValue());
            $java_api_lease_monitor$.setGlobalValue(NIL);
        }
        return NIL;
    }

    public static SubLObject java_api_lease_monitor() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_utc_time_with_milliseconds = NIL;
        SubLObject uuid_strings_to_remove = NIL;
        while (true) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        if (NIL == $java_api_leases$.getGlobalValue()) {
                            continue;
                        }
                        uuid_strings_to_remove = NIL;
                        current_utc_time_with_milliseconds = numeric_date_utilities.get_utc_time_with_milliseconds();
                        final SubLObject lock = dictionary_utilities.synchronized_dictionary_lock($java_api_leases$.getGlobalValue());
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_utilities.synchronized_dictionary_dictionary($java_api_leases$.getGlobalValue()))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject uuid_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject lease_expiration_time = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject error_message = NIL;
                                SubLObject seconds_yet_to_wait = NIL;
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            seconds_yet_to_wait = divide(subtract(lease_expiration_time, current_utc_time_with_milliseconds), $int$1000);
                                            if (seconds_yet_to_wait.numL(ZERO_INTEGER)) {
                                                uuid_strings_to_remove = cons(uuid_string, uuid_strings_to_remove);
                                                release_resources_for_java_api_client(uuid_string, T);
                                            }
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (NIL != error_message) {
                                    Errors.warn(error_message);
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                        SubLObject cdolist_list_var = uuid_strings_to_remove;
                        SubLObject uuid_string_to_remove = NIL;
                        uuid_string_to_remove = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject error_message2 = NIL;
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        dictionary_utilities.synchronized_dictionary_remove($java_api_leases$.getGlobalValue(), uuid_string_to_remove);
                                    } catch (final Throwable catch_var2) {
                                        Errors.handleThrowable(catch_var2, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                                }
                            } catch (final Throwable ccatch_env_var2) {
                                error_message2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != error_message2) {
                                Errors.warn(error_message2);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            uuid_string_to_remove = cdolist_list_var.first();
                        } 
                        sleep($java_api_lease_monitor_sleep_seconds$.getGlobalValue());
                    } catch (final Throwable catch_var3) {
                        Errors.handleThrowable(catch_var3, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var3) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var3, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } 
    }

    public static SubLObject release_resources_for_java_api_client(final SubLObject uuid_string, SubLObject abnormalP) {
        if (abnormalP == UNPROVIDED) {
            abnormalP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(uuid_string, STRINGP);
        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, $str11$Releasing_java_API_resources_iden, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
        }
        if (NIL != abnormalP) {
            Errors.warn($str12$__Releasing_java_API_resources_id, uuid_string);
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    open_cyc_inference_api.open_cyc_release_inference_resources_for_client(uuid_string);
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
        SubLObject ignore_errors_tag_$3 = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    api_widgets.release_widget_resources_for_client(uuid_string);
                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag_$3 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        SubLObject ignore_errors_tag_$4 = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    close_java_api_socket(uuid_string);
                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag_$4 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        SubLObject ignore_errors_tag_$5 = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL == abnormalP) {
                        dictionary_utilities.synchronized_dictionary_remove($java_api_leases$.getGlobalValue(), uuid_string);
                    }
                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag_$5 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        task_processor.terminate_active_task_processes(uuid_string);
        return NIL;
    }

    public static SubLObject acquire_api_services_lease(final SubLObject lease_duration_in_milliseconds, final SubLObject uuid_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(lease_duration_in_milliseconds, INTEGERP);
        SubLTrampolineFile.enforceType(uuid_string, STRINGP);
        if (lease_duration_in_milliseconds.numG($maximum_api_services_lease_duration_in_milliseconds$.getGlobalValue())) {
            dictionary_utilities.synchronized_dictionary_remove($java_api_leases$.getGlobalValue(), uuid_string);
            if (NIL != task_processor.java_api_lease_activity_display()) {
                eval_in_api.trace_me($str20$_cfasl_kernel_standard_output_, cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                format(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), $str21$api_services_lease_denied_for__A_, uuid_string);
                force_output(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread));
            }
            return $$$api_services_lease_denied;
        }
        if (NIL == $java_api_lease_monitor$.getGlobalValue()) {
            initialize_java_api_lease_monitor();
        }
        final SubLObject lease_expiration_time = add(numeric_date_utilities.get_utc_time_with_milliseconds(), multiply(lease_duration_in_milliseconds, $lease_timeout_cushion_factor$.getGlobalValue()));
        final SubLObject renewal_msg = cconcatenate($$$api_services_lease_granted_by_, new SubLObject[]{ cyc_image_id(), $$$_to_, uuid_string, $$$_for_, string_utilities.to_string(lease_duration_in_milliseconds), $$$_milliseconds });
        dictionary_utilities.synchronized_dictionary_enter($java_api_leases$.getGlobalValue(), uuid_string, lease_expiration_time);
        if (NIL != task_processor.java_api_lease_activity_display()) {
            format(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), $str27$_A__, renewal_msg);
            force_output(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread));
        }
        return renewal_msg;
    }

    public static SubLObject show_java_api_service_leases() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $java_api_leases$.getGlobalValue()) {
            format(T, $str33$There_are_no_Java_API_client_leas);
            return NIL;
        }
        final SubLObject current_utc_time_with_milliseconds = numeric_date_utilities.get_utc_time_with_milliseconds();
        final SubLObject lock = dictionary_utilities.synchronized_dictionary_lock($java_api_leases$.getGlobalValue());
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_utilities.synchronized_dictionary_dictionary($java_api_leases$.getGlobalValue()))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject uuid_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject lease_expiration_time = thread.secondMultipleValue();
                thread.resetMultipleValues();
                format(T, $str34$Java_API_client__A_lease_expires_, uuid_string, divide(subtract(lease_expiration_time, current_utc_time_with_milliseconds), $int$1000));
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return NIL;
    }

    public static SubLObject get_current_api_socket() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(api_kernel.$api_in_stream$.getDynamicValue(thread), api_kernel.$api_out_stream$.getDynamicValue(thread), make_lock($$$Java_API_stream_lock));
    }

    public static SubLObject api_socket_in_stream(final SubLObject api_socket) {
        return api_socket.first();
    }

    public static SubLObject api_socket_out_stream(final SubLObject api_socket) {
        return second(api_socket);
    }

    public static SubLObject api_socket_lock(final SubLObject api_socket) {
        return third(api_socket);
    }

    public static SubLObject register_java_api_passive_socket(final SubLObject uuid_string, final SubLObject in_stream, final SubLObject out_stream) {
        dictionary_utilities.synchronized_dictionary_enter($java_api_sockets$.getGlobalValue(), uuid_string, list(in_stream, out_stream, make_lock($$$Java_API_stream_lock)));
        return uuid_string;
    }

    public static SubLObject initialize_java_api_passive_socket(final SubLObject uuid_string) {
        SubLTrampolineFile.enforceType(uuid_string, STRINGP);
        final SubLObject api_socket = get_current_api_socket();
        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, $str39$Initializing_java_client_socket__, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
        }
        cleanup_broken_java_api_sockets();
        if (api_socket_out_stream(api_socket).isStream()) {
            dictionary_utilities.synchronized_dictionary_enter($java_api_sockets$.getGlobalValue(), uuid_string, api_socket);
            final SubLObject lock = api_socket_lock(api_socket);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cfasl_kernel.send_cfasl_result(api_socket_out_stream(api_socket), NIL, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                task_processor.push_tpool_background_msg(format(NIL, $str40$Initialized_java_client_socket__S, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
            }
        } else
            if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                task_processor.push_tpool_background_msg(format(NIL, $str41$Invalid_java_client_socket__S__, api_socket), task_processor.$api_task_process_pool$.getGlobalValue());
            }

        dictionary_utilities.synchronized_dictionary_enter($java_api_leases$.getGlobalValue(), uuid_string, add(numeric_date_utilities.get_utc_time_with_milliseconds(), $maximum_api_services_lease_duration_in_milliseconds$.getGlobalValue()));
        Tcp.$retain_client_socketP$.setDynamicValue(T);
        cfasl_kernel.cfasl_quit();
        return NIL;
    }

    public static SubLObject java_api_socket(final SubLObject uuid_string) {
        assert NIL != stringp(uuid_string) : "Types.stringp(uuid_string) " + "CommonSymbols.NIL != Types.stringp(uuid_string) " + uuid_string;
        SubLObject api_socket = NIL;
        api_socket = dictionary_utilities.synchronized_dictionary_lookup($java_api_sockets$.getGlobalValue(), uuid_string, UNPROVIDED);
        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, $str45$Looked_up_socket__S_from_dictiona, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
        }
        return api_socket;
    }

    public static SubLObject java_api_socket_out_stream(final SubLObject uuid_string) {
        return api_socket_out_stream(java_api_socket(uuid_string));
    }

    public static SubLObject java_api_lock(final SubLObject uuid_string) {
        return api_socket_lock(java_api_socket(uuid_string));
    }

    public static SubLObject close_java_api_socket(final SubLObject uuid_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(uuid_string, STRINGP);
        if (NIL == $java_api_sockets$.getGlobalValue()) {
            return NIL;
        }
        final SubLObject api_socket = java_api_socket(uuid_string);
        if (NIL != api_socket) {
            final SubLObject in_stream = api_socket_in_stream(api_socket);
            final SubLObject out_stream = api_socket_out_stream(api_socket);
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        try {
                            close(in_stream, UNPROVIDED);
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (!in_stream.eql(out_stream)) {
                                    close(out_stream, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
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
            dictionary_utilities.synchronized_dictionary_remove($java_api_sockets$.getGlobalValue(), uuid_string);
            if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                task_processor.push_tpool_background_msg(format(NIL, $str46$Removed_socket__S__from_dictionar, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject show_java_api_sockets() {
        if (NIL == $java_api_sockets$.getGlobalValue()) {
            return NIL;
        }
        SubLObject cdolist_list_var = dictionary_utilities.synchronized_dictionary_keys($java_api_sockets$.getGlobalValue());
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str49$___S______S, key, dictionary_utilities.synchronized_dictionary_lookup($java_api_sockets$.getGlobalValue(), key, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_java_api_kernel() {
        task_processor.halt_api_task_processors();
        dictionary_utilities.clear_synchronized_dictionary($java_api_leases$.getGlobalValue());
        dictionary_utilities.clear_synchronized_dictionary($java_api_sockets$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cleanup_broken_java_api_sockets() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject close_socketP = NIL;
        SubLObject uuid_strings = NIL;
        if (NIL != $java_api_sockets$.getGlobalValue()) {
            SubLObject cdolist_list_var;
            uuid_strings = cdolist_list_var = dictionary_utilities.synchronized_dictionary_keys($java_api_sockets$.getGlobalValue());
            SubLObject uuid_string = NIL;
            uuid_string = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                    task_processor.push_tpool_background_msg(format(NIL, $str54$Verifying_java_api_socket_identif, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
                }
                final SubLObject lock = java_api_lock(uuid_string);
                final SubLObject socket = java_api_socket_out_stream(uuid_string);
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            try {
                                close_socketP = T;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    cfasl_kernel.send_cfasl_result(socket, $list55, NIL);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                                close_socketP = NIL;
                            } finally {
                                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != close_socketP) {
                                        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                                            task_processor.push_tpool_background_msg(format(NIL, $str56$closing_broken_java_api_socket__A, socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
                                        }
                                        close_java_api_socket(uuid_string);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
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
                cdolist_list_var = cdolist_list_var.rest();
                uuid_string = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject launch_java_application_from_red(final SubLObject application_name, SubLObject more_args) {
        if (more_args == UNPROVIDED) {
            more_args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject java_vm = get_red_value_for_default_java_virtual_machine();
        SubLObject result_code = NIL;
        thread.resetMultipleValues();
        final SubLObject main_class = get_java_application_information_from_red(application_name);
        final SubLObject class_path = thread.secondMultipleValue();
        final SubLObject args = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject args_to_java = list($str57$_cp, class_path, main_class);
        final SubLObject final_args = cconcatenate(args_to_java, new SubLObject[]{ args, more_args });
        result_code = os_process_utilities.system_eval_using_make_os_process(java_vm, final_args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result_code;
    }

    public static SubLObject launch_java_application_from_red_in_process(final SubLObject application_name, SubLObject more_args) {
        if (more_args == UNPROVIDED) {
            more_args = NIL;
        }
        return subl_promotions.make_process_with_args(cconcatenate($$$Java_proxy_for_, application_name), LAUNCH_JAVA_APPLICATION_FROM_RED, list(application_name, more_args));
    }

    public static SubLObject get_red_value_for_default_java_virtual_machine() {
        SubLObject jvm = get_red_value_for_default_java_vm();
        if (NIL == jvm) {
            jvm = get_red_value_for_default_java_re_vm();
        }
        return jvm;
    }

    public static SubLObject get_red_value_for_default_java_vm() {
        final SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), get_red_key_for_default_java_vm());
        if (NIL != element) {
            return red_api.red_element_get_value(element);
        }
        return NIL;
    }

    public static SubLObject get_red_value_for_default_java_re_vm() {
        final SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), get_red_key_for_default_java_re_vm());
        if (NIL != element) {
            return red_api.red_element_get_value(element);
        }
        return NIL;
    }

    public static SubLObject get_red_value_for_default_java_home() {
        final SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), get_red_key_for_default_java_home());
        if (NIL != element) {
            return red_api.red_element_get_value(element);
        }
        return NIL;
    }

    public static SubLObject get_red_value_for_default_java_re_home() {
        final SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), get_red_key_for_default_java_re_home());
        if (NIL != element) {
            return red_api.red_element_get_value(element);
        }
        return NIL;
    }

    public static SubLObject get_red_value_for_default_java_lib() {
        final SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), get_red_key_for_default_java_lib());
        if (NIL != element) {
            return red_api.red_element_get_value(element);
        }
        return NIL;
    }

    public static SubLObject get_red_value_for_default_java_re_lib() {
        final SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), get_red_key_for_default_java_re_lib());
        if (NIL != element) {
            return red_api.red_element_get_value(element);
        }
        return NIL;
    }

    public static SubLObject get_red_value_for_default_java_path_separator() {
        final SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), get_red_key_for_default_java_path_separator());
        if (NIL != element) {
            return red_api.red_element_get_value(element);
        }
        return NIL;
    }

    public static SubLObject get_red_key_for_default_java_home() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_home_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_re_home() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_home_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_lib() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_lib_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_re_lib() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_lib_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_vm() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_vm_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_re_vm() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_vm_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_path_separator() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_path_separator_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_software_type_as_red_key_name() {
        return string_utilities.split_string(Environment.software_type(), UNPROVIDED).first();
    }

    public static SubLObject get_java_red_root_key() {
        if (NIL == $java_red_root_key$.getGlobalValue()) {
            $java_red_root_key$.setGlobalValue(cconcatenate(red_utilities.$red_root_key_os$.getGlobalValue(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), get_software_type_as_red_key_name(), red_utilities.$red_key_name_separator$.getGlobalValue(), $java_red_subtree_name$.getGlobalValue() }));
        }
        return $java_red_root_key$.getGlobalValue();
    }

    public static SubLObject get_java_red_root_key_for_version(final SubLObject version_numbers) {
        assert NIL != listp(version_numbers) : "Types.listp(version_numbers) " + "CommonSymbols.NIL != Types.listp(version_numbers) " + version_numbers;
        SubLObject key = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            write_string(get_java_red_root_key(), stream, UNPROVIDED, UNPROVIDED);
            write_string(red_utilities.$red_key_name_separator$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject version_number = NIL;
            SubLObject counter = NIL;
            list_var = version_numbers;
            version_number = list_var.first();
            for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , version_number = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                if (!counter.isZero()) {
                    write_string(red_utilities.$red_key_name_separator$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
                }
                princ(version_number, stream);
            }
            key = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return key;
    }

    public static SubLObject get_java_red_root_key_for_default_version() {
        return get_java_red_root_key_for_version($java_default_version_numbers$.getGlobalValue());
    }

    public static SubLObject get_java_application_information_from_red(final SubLObject application_name) {
        final SubLObject application = red_utilities.get_red_root_element_for_application(application_name);
        final SubLObject main_class = red_api.red_get_element_get_sub_element_by_key(application, $java_red_key_main_class_key$.getGlobalValue());
        final SubLObject class_path_description = red_api.red_get_element_get_sub_element_by_key(application, $java_red_key_classpath_key$.getGlobalValue());
        final SubLObject arguments_description = red_api.red_get_element_get_sub_element_by_key(application, $java_red_key_arguments_key$.getGlobalValue());
        final SubLObject path_separator = get_red_value_for_default_java_path_separator();
        final SubLObject class_path_elements = red_utilities.interpret_red_element_subtree(class_path_description);
        return values(red_api.red_element_get_value(main_class), get_java_classpath_from_elments(class_path_elements, path_separator), red_utilities.interpret_red_element_subtree(arguments_description));
    }

    public static SubLObject get_java_classpath_from_elments(final SubLObject class_path_elements, final SubLObject path_separator) {
        SubLObject items = NIL;
        SubLObject list_var = NIL;
        SubLObject element = NIL;
        SubLObject counter = NIL;
        list_var = class_path_elements;
        element = list_var.first();
        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , element = list_var.first() , counter = add(ONE_INTEGER, counter)) {
            if (!counter.isZero()) {
                items = cons(path_separator, items);
            }
            items = cons(element, items);
        }
        return apply(symbol_function(CCONCATENATE), nreverse(items));
    }

    public static SubLObject declare_java_api_kernel_file() {
        declareFunction(me, "java_api_lease_expiration_time", "JAVA-API-LEASE-EXPIRATION-TIME", 1, 0, false);
        declareFunction(me, "initialize_java_api_lease_monitor", "INITIALIZE-JAVA-API-LEASE-MONITOR", 0, 0, false);
        declareFunction(me, "halt_java_api_lease_monitor", "HALT-JAVA-API-LEASE-MONITOR", 0, 0, false);
        declareFunction(me, "java_api_lease_monitor", "JAVA-API-LEASE-MONITOR", 0, 0, false);
        declareFunction(me, "release_resources_for_java_api_client", "RELEASE-RESOURCES-FOR-JAVA-API-CLIENT", 1, 1, false);
        declareFunction(me, "acquire_api_services_lease", "ACQUIRE-API-SERVICES-LEASE", 2, 0, false);
        declareFunction(me, "show_java_api_service_leases", "SHOW-JAVA-API-SERVICE-LEASES", 0, 0, false);
        declareFunction(me, "get_current_api_socket", "GET-CURRENT-API-SOCKET", 0, 0, false);
        declareFunction(me, "api_socket_in_stream", "API-SOCKET-IN-STREAM", 1, 0, false);
        declareFunction(me, "api_socket_out_stream", "API-SOCKET-OUT-STREAM", 1, 0, false);
        declareFunction(me, "api_socket_lock", "API-SOCKET-LOCK", 1, 0, false);
        declareFunction(me, "register_java_api_passive_socket", "REGISTER-JAVA-API-PASSIVE-SOCKET", 3, 0, false);
        declareFunction(me, "initialize_java_api_passive_socket", "INITIALIZE-JAVA-API-PASSIVE-SOCKET", 1, 0, false);
        declareFunction(me, "java_api_socket", "JAVA-API-SOCKET", 1, 0, false);
        declareFunction(me, "java_api_socket_out_stream", "JAVA-API-SOCKET-OUT-STREAM", 1, 0, false);
        declareFunction(me, "java_api_lock", "JAVA-API-LOCK", 1, 0, false);
        declareFunction(me, "close_java_api_socket", "CLOSE-JAVA-API-SOCKET", 1, 0, false);
        declareFunction(me, "show_java_api_sockets", "SHOW-JAVA-API-SOCKETS", 0, 0, false);
        declareFunction(me, "reset_java_api_kernel", "RESET-JAVA-API-KERNEL", 0, 0, false);
        declareFunction(me, "cleanup_broken_java_api_sockets", "CLEANUP-BROKEN-JAVA-API-SOCKETS", 0, 0, false);
        declareFunction(me, "launch_java_application_from_red", "LAUNCH-JAVA-APPLICATION-FROM-RED", 1, 1, false);
        declareFunction(me, "launch_java_application_from_red_in_process", "LAUNCH-JAVA-APPLICATION-FROM-RED-IN-PROCESS", 1, 1, false);
        declareFunction(me, "get_red_value_for_default_java_virtual_machine", "GET-RED-VALUE-FOR-DEFAULT-JAVA-VIRTUAL-MACHINE", 0, 0, false);
        declareFunction(me, "get_red_value_for_default_java_vm", "GET-RED-VALUE-FOR-DEFAULT-JAVA-VM", 0, 0, false);
        declareFunction(me, "get_red_value_for_default_java_re_vm", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-VM", 0, 0, false);
        declareFunction(me, "get_red_value_for_default_java_home", "GET-RED-VALUE-FOR-DEFAULT-JAVA-HOME", 0, 0, false);
        declareFunction(me, "get_red_value_for_default_java_re_home", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-HOME", 0, 0, false);
        declareFunction(me, "get_red_value_for_default_java_lib", "GET-RED-VALUE-FOR-DEFAULT-JAVA-LIB", 0, 0, false);
        declareFunction(me, "get_red_value_for_default_java_re_lib", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-LIB", 0, 0, false);
        declareFunction(me, "get_red_value_for_default_java_path_separator", "GET-RED-VALUE-FOR-DEFAULT-JAVA-PATH-SEPARATOR", 0, 0, false);
        declareFunction(me, "get_red_key_for_default_java_home", "GET-RED-KEY-FOR-DEFAULT-JAVA-HOME", 0, 0, false);
        declareFunction(me, "get_red_key_for_default_java_re_home", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-HOME", 0, 0, false);
        declareFunction(me, "get_red_key_for_default_java_lib", "GET-RED-KEY-FOR-DEFAULT-JAVA-LIB", 0, 0, false);
        declareFunction(me, "get_red_key_for_default_java_re_lib", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-LIB", 0, 0, false);
        declareFunction(me, "get_red_key_for_default_java_vm", "GET-RED-KEY-FOR-DEFAULT-JAVA-VM", 0, 0, false);
        declareFunction(me, "get_red_key_for_default_java_re_vm", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-VM", 0, 0, false);
        declareFunction(me, "get_red_key_for_default_java_path_separator", "GET-RED-KEY-FOR-DEFAULT-JAVA-PATH-SEPARATOR", 0, 0, false);
        declareFunction(me, "get_software_type_as_red_key_name", "GET-SOFTWARE-TYPE-AS-RED-KEY-NAME", 0, 0, false);
        declareFunction(me, "get_java_red_root_key", "GET-JAVA-RED-ROOT-KEY", 0, 0, false);
        declareFunction(me, "get_java_red_root_key_for_version", "GET-JAVA-RED-ROOT-KEY-FOR-VERSION", 1, 0, false);
        declareFunction(me, "get_java_red_root_key_for_default_version", "GET-JAVA-RED-ROOT-KEY-FOR-DEFAULT-VERSION", 0, 0, false);
        declareFunction(me, "get_java_application_information_from_red", "GET-JAVA-APPLICATION-INFORMATION-FROM-RED", 1, 0, false);
        declareFunction(me, "get_java_classpath_from_elments", "GET-JAVA-CLASSPATH-FROM-ELMENTS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_java_api_kernel_file() {
        deflexical("*JAVA-API-LEASES*", dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        deflexical("*JAVA-API-LEASE-MONITOR*", NIL);
        defconstant("*JAVA-API-LEASE-MONITOR-SLEEP-SECONDS*", TWO_INTEGER);
        defconstant("*MAXIMUM-API-SERVICES-LEASE-DURATION-IN-MILLISECONDS*", $int$3600000);
        defconstant("*LEASE-TIMEOUT-CUSHION-FACTOR*", THREE_INTEGER);
        deflexical("*JAVA-API-SOCKETS*", dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        deflexical("*JAVA-HOME-RED-KEY-NAME*", $str61$JAVA_HOME);
        deflexical("*JAVA-LIB-RED-KEY-NAME*", $str62$JAVA_LIB);
        deflexical("*JAVA-VM-RED-KEY-NAME*", $str63$JAVA_VM);
        deflexical("*JAVA-RE-HOME-RED-KEY-NAME*", $str64$JAVA_RE_HOME);
        deflexical("*JAVA-RE-LIB-RED-KEY-NAME*", $str65$JAVA_RE_LIB);
        deflexical("*JAVA-RE-VM-RED-KEY-NAME*", $str66$JAVA_RE_VM);
        deflexical("*JAVA-PATH-SEPARATOR-RED-KEY-NAME*", $str67$path_separator);
        deflexical("*JAVA-RED-SUBTREE-NAME*", $$$java);
        deflexical("*JAVA-RED-ROOT-KEY*", NIL);
        deflexical("*JAVA-DEFAULT-VERSION-NUMBERS*", $list69);
        deflexical("*JAVA-RED-KEY-MAIN-CLASS-KEY*", $str71$java_main_class);
        deflexical("*JAVA-RED-KEY-CLASSPATH-KEY*", $str72$java_classpath);
        deflexical("*JAVA-RED-KEY-ARGUMENTS-KEY*", $str73$java_arguments);
        return NIL;
    }

    public static SubLObject setup_java_api_kernel_file() {
        register_cyc_api_function(INITIALIZE_JAVA_API_LEASE_MONITOR, NIL, $str4$Initialize_the_process_which_moni, NIL, NIL);
        register_cyc_api_function(HALT_JAVA_API_LEASE_MONITOR, NIL, $str6$Halt_the_the_process_which_monito, NIL, NIL);
        register_cyc_api_function(RELEASE_RESOURCES_FOR_JAVA_API_CLIENT, $list14, $str15$Closes_the_outbound_api_socket_an, $list16, $list17);
        register_cyc_api_function(ACQUIRE_API_SERVICES_LEASE, $list29, $str30$Requests_an_API_services_lease___, $list31, $list32);
        register_cyc_api_function(SHOW_JAVA_API_SERVICE_LEASES, NIL, $str36$Displays_the_current_java_api_lea, NIL, $list17);
        register_external_symbol(REGISTER_JAVA_API_PASSIVE_SOCKET);
        register_cyc_api_function(INITIALIZE_JAVA_API_PASSIVE_SOCKET, $list43, $str44$Associates_the_current_socket_wit, $list16, $list17);
        register_cyc_api_function(CLOSE_JAVA_API_SOCKET, $list43, $str48$Closes_the_persistent_cfasl_socke, $list16, $list17);
        register_cyc_api_function(SHOW_JAVA_API_SOCKETS, NIL, $str51$Displays_the_java_api_sockets_, NIL, $list17);
        register_cyc_api_function(RESET_JAVA_API_KERNEL, NIL, $str53$Reset_this_subsystem_to_an_un_ini, NIL, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_java_api_kernel_file();
    }

    @Override
    public void initializeVariables() {
        init_java_api_kernel_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_java_api_kernel_file();
    }

    static {































































































    }
}

/**
 * Total time: 412 ms
 */
