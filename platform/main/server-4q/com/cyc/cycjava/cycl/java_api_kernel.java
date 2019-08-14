/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.open_cyc_inference_api;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      JAVA-API-KERNEL
 * source file: /cyc/top/cycl/java-api-kernel.lisp
 * created:     2019/07/03 17:37:55
 */
public final class java_api_kernel extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new java_api_kernel();

 public static final String myName = "com.cyc.cycjava.cycl.java_api_kernel";


    // deflexical
    @LispMethod(comment = "The dictionary of java api client leases.  The key is a\r\nUUID string (GUID) provided by the java client, and the value is a timestamp\r\ngiving the lease expiration time.\ndeflexical\nThe dictionary of java api client leases.  The key is a\nUUID string (GUID) provided by the java client, and the value is a timestamp\ngiving the lease expiration time.")
    private static final SubLSymbol $java_api_leases$ = makeSymbol("*JAVA-API-LEASES*");

    // deflexical
    // The process which monitors lease expirations for java api clients.
    /**
     * The process which monitors lease expirations for java api clients.
     */
    @LispMethod(comment = "The process which monitors lease expirations for java api clients.\ndeflexical")
    private static final SubLSymbol $java_api_lease_monitor$ = makeSymbol("*JAVA-API-LEASE-MONITOR*");

    // defconstant
    // The lease monitor will check for invalid leases every this many seconds.
    /**
     * The lease monitor will check for invalid leases every this many seconds.
     */
    @LispMethod(comment = "The lease monitor will check for invalid leases every this many seconds.\ndefconstant")
    private static final SubLSymbol $java_api_lease_monitor_sleep_seconds$ = makeSymbol("*JAVA-API-LEASE-MONITOR-SLEEP-SECONDS*");

    // defconstant
    // the maximum java api services lease duration in milliseconds
    /**
     * the maximum java api services lease duration in milliseconds
     */
    @LispMethod(comment = "the maximum java api services lease duration in milliseconds\ndefconstant")
    private static final SubLSymbol $maximum_api_services_lease_duration_in_milliseconds$ = makeSymbol("*MAXIMUM-API-SERVICES-LEASE-DURATION-IN-MILLISECONDS*");

    // defconstant
    /**
     * the multiplier factor used to calcuate actual lease expiration from the
     * requested duration
     */
    @LispMethod(comment = "the multiplier factor used to calcuate actual lease expiration from the\r\nrequested duration\ndefconstant\nthe multiplier factor used to calcuate actual lease expiration from the\nrequested duration")
    private static final SubLSymbol $lease_timeout_cushion_factor$ = makeSymbol("*LEASE-TIMEOUT-CUSHION-FACTOR*");

    // deflexical
    /**
     * The synchronized dictionary of persistent sockets established to provide
     * outbound cfasl messaging with java api clients. The key is a UUID string
     * (GUID) provided by the java client when the socket is created.
     */
    @LispMethod(comment = "The synchronized dictionary of persistent sockets established to provide\r\noutbound cfasl messaging with java api clients. The key is a UUID string\r\n(GUID) provided by the java client when the socket is created.\ndeflexical\nThe synchronized dictionary of persistent sockets established to provide\noutbound cfasl messaging with java api clients. The key is a UUID string\n(GUID) provided by the java client when the socket is created.")
    private static final SubLSymbol $java_api_sockets$ = makeSymbol("*JAVA-API-SOCKETS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_home_red_key_name$ = makeSymbol("*JAVA-HOME-RED-KEY-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_lib_red_key_name$ = makeSymbol("*JAVA-LIB-RED-KEY-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_vm_red_key_name$ = makeSymbol("*JAVA-VM-RED-KEY-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_re_home_red_key_name$ = makeSymbol("*JAVA-RE-HOME-RED-KEY-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_re_lib_red_key_name$ = makeSymbol("*JAVA-RE-LIB-RED-KEY-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_re_vm_red_key_name$ = makeSymbol("*JAVA-RE-VM-RED-KEY-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_path_separator_red_key_name$ = makeSymbol("*JAVA-PATH-SEPARATOR-RED-KEY-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_red_subtree_name$ = makeSymbol("*JAVA-RED-SUBTREE-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_red_root_key$ = makeSymbol("*JAVA-RED-ROOT-KEY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_default_version_numbers$ = makeSymbol("*JAVA-DEFAULT-VERSION-NUMBERS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_red_key_main_class_key$ = makeSymbol("*JAVA-RED-KEY-MAIN-CLASS-KEY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_red_key_classpath_key$ = makeSymbol("*JAVA-RED-KEY-CLASSPATH-KEY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_red_key_arguments_key$ = makeSymbol("*JAVA-RED-KEY-ARGUMENTS-KEY*");

    static private final SubLString $$$Java_API_lease_monitor = makeString("Java API lease monitor");

    private static final SubLSymbol JAVA_API_LEASE_MONITOR = makeSymbol("JAVA-API-LEASE-MONITOR");

    private static final SubLSymbol INITIALIZE_JAVA_API_LEASE_MONITOR = makeSymbol("INITIALIZE-JAVA-API-LEASE-MONITOR");

    static private final SubLString $str4$Initialize_the_process_which_moni = makeString("Initialize the process which monitors lease expirations for java api clients.");

    private static final SubLSymbol HALT_JAVA_API_LEASE_MONITOR = makeSymbol("HALT-JAVA-API-LEASE-MONITOR");

    static private final SubLString $str6$Halt_the_the_process_which_monito = makeString("Halt the the process which monitors lease expirations for java api clients.");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $str11$Releasing_java_API_resources_iden = makeString("Releasing java API resources identified by ~A~%");

    static private final SubLString $str12$__Releasing_java_API_resources_id = makeString("~%Releasing java API resources identified by ~A~%");

    private static final SubLSymbol RELEASE_RESOURCES_FOR_JAVA_API_CLIENT = makeSymbol("RELEASE-RESOURCES-FOR-JAVA-API-CLIENT");

    static private final SubLList $list14 = list(makeSymbol("UUID-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("ABNORMAL?"));

    static private final SubLString $str15$Closes_the_outbound_api_socket_an = makeString("Closes the outbound api socket and kills active api requests identified by the given uuid-string.\n   @param uuid-string ; stringp\n   @param abnormal?   ; boolean Whether or not the release was abnormal or expected");

    static private final SubLList $list16 = list(list(makeSymbol("UUID-STRING"), makeSymbol("STRINGP")));

    static private final SubLList $list17 = list(NIL);

    private static final SubLInteger $int$3600000 = makeInteger(3600000);

    static private final SubLString $str20$_cfasl_kernel_standard_output_ = makeString("*cfasl-kernel-standard-output*");

    static private final SubLString $str21$api_services_lease_denied_for__A_ = makeString("api services lease denied for ~A~%");

    static private final SubLString $$$api_services_lease_denied = makeString("api services lease denied");

    static private final SubLString $$$api_services_lease_granted_by_ = makeString("api services lease granted by ");

    static private final SubLString $$$_to_ = makeString(" to ");

    static private final SubLString $$$_for_ = makeString(" for ");

    static private final SubLString $$$_milliseconds = makeString(" milliseconds");

    static private final SubLString $str27$_A__ = makeString("~A~%");

    private static final SubLSymbol ACQUIRE_API_SERVICES_LEASE = makeSymbol("ACQUIRE-API-SERVICES-LEASE");

    static private final SubLList $list29 = list(makeSymbol("LEASE-DURATION-IN-MILLISECONDS"), makeSymbol("UUID-STRING"));

    static private final SubLString $str30$Requests_an_API_services_lease___ = makeString("Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\n   for a duration longer than one hour is denied.\n   @param lease-duration-in-milliseconds ; integerp, the lease duration in milliseconds\n   @param uuid-string ; stringp, identifies the java api client");

    static private final SubLList $list31 = list(list(makeSymbol("LEASE-DURATION-IN-MILLISECONDS"), makeSymbol("INTEGERP")), list(makeSymbol("UUID-STRING"), makeSymbol("STRINGP")));

    static private final SubLList $list32 = list(makeSymbol("STRINGP"));

    static private final SubLString $str33$There_are_no_Java_API_client_leas = makeString("There are no Java API client leases.~%");

    static private final SubLString $str34$Java_API_client__A_lease_expires_ = makeString("Java API client ~A lease expires in ~A seconds~%");

    private static final SubLSymbol SHOW_JAVA_API_SERVICE_LEASES = makeSymbol("SHOW-JAVA-API-SERVICE-LEASES");

    static private final SubLString $str36$Displays_the_current_java_api_lea = makeString("Displays the current java api leases.");

    static private final SubLString $$$Java_API_stream_lock = makeString("Java API stream lock");

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

    /**
     * Return the java api lease expiration time corresponding to the given UUID key.
     */
    @LispMethod(comment = "Return the java api lease expiration time corresponding to the given UUID key.")
    public static final SubLObject java_api_lease_expiration_time_alt(SubLObject uuid_string) {
        SubLTrampolineFile.checkType(uuid_string, STRINGP);
        return dictionary_utilities.synchronized_dictionary_lookup($java_api_leases$.getGlobalValue(), uuid_string, UNPROVIDED);
    }

    /**
     * Return the java api lease expiration time corresponding to the given UUID key.
     */
    @LispMethod(comment = "Return the java api lease expiration time corresponding to the given UUID key.")
    public static SubLObject java_api_lease_expiration_time(final SubLObject uuid_string) {
        assert NIL != stringp(uuid_string) : "! stringp(uuid_string) " + ("Types.stringp(uuid_string) " + "CommonSymbols.NIL != Types.stringp(uuid_string) ") + uuid_string;
        return dictionary_utilities.synchronized_dictionary_lookup($java_api_leases$.getGlobalValue(), uuid_string, UNPROVIDED);
    }

    /**
     * Initialize the process which monitors lease expirations for java api clients.
     */
    @LispMethod(comment = "Initialize the process which monitors lease expirations for java api clients.")
    public static final SubLObject initialize_java_api_lease_monitor_alt() {
        com.cyc.cycjava.cycl.java_api_kernel.halt_java_api_lease_monitor();
        $java_api_lease_monitor$.setGlobalValue(make_process($$$Java_API_lease_monitor, symbol_function(JAVA_API_LEASE_MONITOR)));
        return NIL;
    }

    /**
     * Initialize the process which monitors lease expirations for java api clients.
     */
    @LispMethod(comment = "Initialize the process which monitors lease expirations for java api clients.")
    public static SubLObject initialize_java_api_lease_monitor() {
        halt_java_api_lease_monitor();
        $java_api_lease_monitor$.setGlobalValue(make_process($$$Java_API_lease_monitor, symbol_function(JAVA_API_LEASE_MONITOR)));
        return NIL;
    }

    /**
     * Halt the the process which monitors lease expirations for java api clients.
     */
    @LispMethod(comment = "Halt the the process which monitors lease expirations for java api clients.")
    public static final SubLObject halt_java_api_lease_monitor_alt() {
        if (NIL != $java_api_lease_monitor$.getGlobalValue()) {
            kill_process($java_api_lease_monitor$.getGlobalValue());
            $java_api_lease_monitor$.setGlobalValue(NIL);
        }
        return NIL;
    }

    /**
     * Halt the the process which monitors lease expirations for java api clients.
     */
    @LispMethod(comment = "Halt the the process which monitors lease expirations for java api clients.")
    public static SubLObject halt_java_api_lease_monitor() {
        if (NIL != $java_api_lease_monitor$.getGlobalValue()) {
            kill_process($java_api_lease_monitor$.getGlobalValue());
            $java_api_lease_monitor$.setGlobalValue(NIL);
        }
        return NIL;
    }

    /**
     * Periodically monitors java api client leases, closing sockets and killing active api requests belonging
     * to clients having expired leases.
     */
    @LispMethod(comment = "Periodically monitors java api client leases, closing sockets and killing active api requests belonging\r\nto clients having expired leases.\nPeriodically monitors java api client leases, closing sockets and killing active api requests belonging\nto clients having expired leases.")
    public static final SubLObject java_api_lease_monitor_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current_utc_time_with_milliseconds = NIL;
                SubLObject uuid_strings_to_remove = NIL;
                while (true) {
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        if (NIL != $java_api_leases$.getGlobalValue()) {
                                            uuid_strings_to_remove = NIL;
                                            current_utc_time_with_milliseconds = numeric_date_utilities.get_utc_time_with_milliseconds();
                                            {
                                                SubLObject lock = dictionary_utilities.synchronized_dictionary_lock($java_api_leases$.getGlobalValue());
                                                SubLObject release = NIL;
                                                try {
                                                    release = seize_lock(lock);
                                                    {
                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_utilities.synchronized_dictionary_dictionary($java_api_leases$.getGlobalValue())));
                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject uuid_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject lease_expiration_time = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject error_message = NIL;
                                                                    SubLObject seconds_yet_to_wait = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                                                            try {
                                                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                                try {
                                                                                    seconds_yet_to_wait = divide(subtract(lease_expiration_time, current_utc_time_with_milliseconds), $int$1000);
                                                                                    if (seconds_yet_to_wait.numL(ZERO_INTEGER)) {
                                                                                        uuid_strings_to_remove = cons(uuid_string, uuid_strings_to_remove);
                                                                                        com.cyc.cycjava.cycl.java_api_kernel.release_resources_for_java_api_client(uuid_string, T);
                                                                                    }
                                                                                } catch (Throwable catch_var) {
                                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                                }
                                                                            } finally {
                                                                                Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                                                            }
                                                                        }
                                                                    } catch (Throwable ccatch_env_var) {
                                                                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                                    }
                                                                    if (NIL != error_message) {
                                                                        Errors.warn(error_message);
                                                                    }
                                                                }
                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                } finally {
                                                    if (NIL != release) {
                                                        release_lock(lock);
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = uuid_strings_to_remove;
                                                SubLObject uuid_string_to_remove = NIL;
                                                for (uuid_string_to_remove = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , uuid_string_to_remove = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject error_message = NIL;
                                                        try {
                                                            {
                                                                SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                                                try {
                                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                    try {
                                                                        dictionary_utilities.synchronized_dictionary_remove($java_api_leases$.getGlobalValue(), uuid_string_to_remove);
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
                                                        if (NIL != error_message) {
                                                            Errors.warn(error_message);
                                                        }
                                                    }
                                                }
                                            }
                                            sleep($java_api_lease_monitor_sleep_seconds$.getGlobalValue());
                                        }
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                } 
            }
        }
    }

    /**
     * Periodically monitors java api client leases, closing sockets and killing active api requests belonging
     * to clients having expired leases.
     */
    @LispMethod(comment = "Periodically monitors java api client leases, closing sockets and killing active api requests belonging\r\nto clients having expired leases.\nPeriodically monitors java api client leases, closing sockets and killing active api requests belonging\nto clients having expired leases.")
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

    /**
     * Closes the outbound api socket and kills active api requests identified by the given uuid-string.
     *
     * @param uuid-string
     * 		; stringp
     * @param abnormal?
     * 		; boolean Whether or not the release was abnormal or expected
     */
    @LispMethod(comment = "Closes the outbound api socket and kills active api requests identified by the given uuid-string.\r\n\r\n@param uuid-string\r\n\t\t; stringp\r\n@param abnormal?\r\n\t\t; boolean Whether or not the release was abnormal or expected")
    public static final SubLObject release_resources_for_java_api_client_alt(SubLObject uuid_string, SubLObject abnormalP) {
        if (abnormalP == UNPROVIDED) {
            abnormalP = NIL;
        }
        SubLTrampolineFile.checkType(uuid_string, STRINGP);
        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, $str_alt11$Releasing_java_API_resources_iden, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
        }
        if (NIL != abnormalP) {
            Errors.warn($str_alt12$__Releasing_java_API_resources_id, uuid_string);
        }
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            api_widgets.release_widget_resources_for_client(uuid_string);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            {
                SubLObject ignore_errors_tag_3 = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                            try {
                                com.cyc.cycjava.cycl.java_api_kernel.close_java_api_socket(uuid_string);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag_3 = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            {
                SubLObject ignore_errors_tag_4 = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                            try {
                                if (NIL == abnormalP) {
                                    dictionary_utilities.synchronized_dictionary_remove($java_api_leases$.getGlobalValue(), uuid_string);
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag_4 = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
        }
        task_processor.terminate_active_task_processes(uuid_string);
        return NIL;
    }

    /**
     * Closes the outbound api socket and kills active api requests identified by the given uuid-string.
     *
     * @param uuid-string
     * 		; stringp
     * @param abnormal?
     * 		; boolean Whether or not the release was abnormal or expected
     */
    @LispMethod(comment = "Closes the outbound api socket and kills active api requests identified by the given uuid-string.\r\n\r\n@param uuid-string\r\n\t\t; stringp\r\n@param abnormal?\r\n\t\t; boolean Whether or not the release was abnormal or expected")
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

    /**
     * Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request
     * for a duration longer than one hour is denied.
     *
     * @param lease-duration-in-milliseconds
     * 		; integerp, the lease duration in milliseconds
     * @param uuid-string
     * 		; stringp, identifies the java api client
     */
    @LispMethod(comment = "Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\r\nfor a duration longer than one hour is denied.\r\n\r\n@param lease-duration-in-milliseconds\r\n\t\t; integerp, the lease duration in milliseconds\r\n@param uuid-string\r\n\t\t; stringp, identifies the java api client\nRequests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\nfor a duration longer than one hour is denied.")
    public static final SubLObject acquire_api_services_lease_alt(SubLObject lease_duration_in_milliseconds, SubLObject uuid_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(lease_duration_in_milliseconds, INTEGERP);
            SubLTrampolineFile.checkType(uuid_string, STRINGP);
            if (lease_duration_in_milliseconds.numG($maximum_api_services_lease_duration_in_milliseconds$.getGlobalValue())) {
                dictionary_utilities.synchronized_dictionary_remove($java_api_leases$.getGlobalValue(), uuid_string);
                if (NIL != task_processor.java_api_lease_activity_display()) {
                    eval_in_api.trace_me($str_alt20$_cfasl_kernel_standard_output_, cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), $str_alt21$api_services_lease_denied_for__A_, uuid_string);
                    force_output(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread));
                }
                return $$$api_services_lease_denied;
            }
            if (NIL == $java_api_lease_monitor$.getGlobalValue()) {
                com.cyc.cycjava.cycl.java_api_kernel.initialize_java_api_lease_monitor();
            }
            {
                SubLObject lease_expiration_time = add(numeric_date_utilities.get_utc_time_with_milliseconds(), multiply(lease_duration_in_milliseconds, $lease_timeout_cushion_factor$.getGlobalValue()));
                SubLObject renewal_msg = cconcatenate($str_alt23$api_services_lease_granted_by_, new SubLObject[]{ cyc_image_id(), $str_alt24$_to_, uuid_string, $str_alt25$_for_, string_utilities.to_string(lease_duration_in_milliseconds), $str_alt26$_milliseconds });
                dictionary_utilities.synchronized_dictionary_enter($java_api_leases$.getGlobalValue(), uuid_string, lease_expiration_time);
                if (NIL != task_processor.java_api_lease_activity_display()) {
                    format(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), $str_alt27$_A__, renewal_msg);
                    force_output(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread));
                }
                return renewal_msg;
            }
        }
    }

    /**
     * Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request
     * for a duration longer than one hour is denied.
     *
     * @param lease-duration-in-milliseconds
     * 		; integerp, the lease duration in milliseconds
     * @param uuid-string
     * 		; stringp, identifies the java api client
     */
    @LispMethod(comment = "Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\r\nfor a duration longer than one hour is denied.\r\n\r\n@param lease-duration-in-milliseconds\r\n\t\t; integerp, the lease duration in milliseconds\r\n@param uuid-string\r\n\t\t; stringp, identifies the java api client\nRequests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\nfor a duration longer than one hour is denied.")
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

    /**
     * Displays the current java api leases.
     */
    @LispMethod(comment = "Displays the current java api leases.")
    public static final SubLObject show_java_api_service_leases_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $java_api_leases$.getGlobalValue()) {
                format(T, $str_alt33$There_are_no_Java_API_client_leas);
                return NIL;
            }
            {
                SubLObject current_utc_time_with_milliseconds = numeric_date_utilities.get_utc_time_with_milliseconds();
                SubLObject lock = dictionary_utilities.synchronized_dictionary_lock($java_api_leases$.getGlobalValue());
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_utilities.synchronized_dictionary_dictionary($java_api_leases$.getGlobalValue())));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject uuid_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject lease_expiration_time = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                format(T, $str_alt34$Java_API_client__A_lease_expires_, uuid_string, divide(subtract(lease_expiration_time, current_utc_time_with_milliseconds), $int$1000));
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Displays the current java api leases.
     */
    @LispMethod(comment = "Displays the current java api leases.")
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

    public static final SubLObject get_current_api_socket_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list(api_kernel.$api_in_stream$.getDynamicValue(thread), api_kernel.$api_out_stream$.getDynamicValue(thread), make_lock($$$Java_API_stream_lock));
        }
    }

    public static SubLObject get_current_api_socket() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(api_kernel.$api_in_stream$.getDynamicValue(thread), api_kernel.$api_out_stream$.getDynamicValue(thread), make_lock($$$Java_API_stream_lock));
    }

    public static final SubLObject api_socket_in_stream_alt(SubLObject api_socket) {
        return api_socket.first();
    }

    public static SubLObject api_socket_in_stream(final SubLObject api_socket) {
        return api_socket.first();
    }

    public static final SubLObject api_socket_out_stream_alt(SubLObject api_socket) {
        return second(api_socket);
    }

    public static SubLObject api_socket_out_stream(final SubLObject api_socket) {
        return second(api_socket);
    }

    public static final SubLObject api_socket_lock_alt(SubLObject api_socket) {
        return third(api_socket);
    }

    public static SubLObject api_socket_lock(final SubLObject api_socket) {
        return third(api_socket);
    }

    public static SubLObject register_java_api_passive_socket(final SubLObject uuid_string, final SubLObject in_stream, final SubLObject out_stream) {
        dictionary_utilities.synchronized_dictionary_enter($java_api_sockets$.getGlobalValue(), uuid_string, list(in_stream, out_stream, make_lock($$$Java_API_stream_lock)));
        return uuid_string;
    }

    /**
     * Associates the current socket with the given UUID-STRING, then ends this server process
     * that currently uses the socket.
     */
    @LispMethod(comment = "Associates the current socket with the given UUID-STRING, then ends this server process\r\nthat currently uses the socket.\nAssociates the current socket with the given UUID-STRING, then ends this server process\nthat currently uses the socket.")
    public static final SubLObject initialize_java_api_passive_socket_alt(SubLObject uuid_string) {
        SubLTrampolineFile.checkType(uuid_string, STRINGP);
        {
            SubLObject api_socket = com.cyc.cycjava.cycl.java_api_kernel.get_current_api_socket();
            if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                task_processor.push_tpool_background_msg(format(NIL, $str_alt38$Initializing_java_client_socket__, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
            }
            com.cyc.cycjava.cycl.java_api_kernel.cleanup_broken_java_api_sockets();
            if (com.cyc.cycjava.cycl.java_api_kernel.api_socket_out_stream(api_socket).isStream()) {
                dictionary_utilities.synchronized_dictionary_enter($java_api_sockets$.getGlobalValue(), uuid_string, api_socket);
                {
                    SubLObject lock = com.cyc.cycjava.cycl.java_api_kernel.api_socket_lock(api_socket);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        cfasl_kernel.send_cfasl_result(com.cyc.cycjava.cycl.java_api_kernel.api_socket_out_stream(api_socket), NIL, UNPROVIDED);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                    task_processor.push_tpool_background_msg(format(NIL, $str_alt39$Initialized_java_client_socket__S, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
                }
            } else {
                if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                    task_processor.push_tpool_background_msg(format(NIL, $str_alt40$Invalid_java_client_socket__S__, api_socket), task_processor.$api_task_process_pool$.getGlobalValue());
                }
            }
            dictionary_utilities.synchronized_dictionary_enter($java_api_leases$.getGlobalValue(), uuid_string, add(numeric_date_utilities.get_utc_time_with_milliseconds(), $maximum_api_services_lease_duration_in_milliseconds$.getGlobalValue()));
            Tcp.$retain_client_socketP$.setDynamicValue(T);
            cfasl_kernel.cfasl_quit();
            return NIL;
        }
    }

    /**
     * Associates the current socket with the given UUID-STRING, then ends this server process
     * that currently uses the socket.
     */
    @LispMethod(comment = "Associates the current socket with the given UUID-STRING, then ends this server process\r\nthat currently uses the socket.\nAssociates the current socket with the given UUID-STRING, then ends this server process\nthat currently uses the socket.")
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

    /**
     * Return the java api socket corresponding to the given UUID key.
     */
    @LispMethod(comment = "Return the java api socket corresponding to the given UUID key.")
    public static final SubLObject java_api_socket_alt(SubLObject uuid_string) {
        SubLTrampolineFile.checkType(uuid_string, STRINGP);
        {
            SubLObject api_socket = NIL;
            api_socket = dictionary_utilities.synchronized_dictionary_lookup($java_api_sockets$.getGlobalValue(), uuid_string, UNPROVIDED);
            if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                task_processor.push_tpool_background_msg(format(NIL, $str_alt44$Looked_up_socket__S_from_dictiona, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
            }
            return api_socket;
        }
    }

    /**
     * Return the java api socket corresponding to the given UUID key.
     */
    @LispMethod(comment = "Return the java api socket corresponding to the given UUID key.")
    public static SubLObject java_api_socket(final SubLObject uuid_string) {
        assert NIL != stringp(uuid_string) : "! stringp(uuid_string) " + ("Types.stringp(uuid_string) " + "CommonSymbols.NIL != Types.stringp(uuid_string) ") + uuid_string;
        SubLObject api_socket = NIL;
        api_socket = dictionary_utilities.synchronized_dictionary_lookup($java_api_sockets$.getGlobalValue(), uuid_string, UNPROVIDED);
        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, $str45$Looked_up_socket__S_from_dictiona, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
        }
        return api_socket;
    }

    /**
     * Return the java api socket output stream corresponding to the given UUID key.
     */
    @LispMethod(comment = "Return the java api socket output stream corresponding to the given UUID key.")
    public static final SubLObject java_api_socket_out_stream_alt(SubLObject uuid_string) {
        return com.cyc.cycjava.cycl.java_api_kernel.api_socket_out_stream(com.cyc.cycjava.cycl.java_api_kernel.java_api_socket(uuid_string));
    }

    /**
     * Return the java api socket output stream corresponding to the given UUID key.
     */
    @LispMethod(comment = "Return the java api socket output stream corresponding to the given UUID key.")
    public static SubLObject java_api_socket_out_stream(final SubLObject uuid_string) {
        return api_socket_out_stream(java_api_socket(uuid_string));
    }

    /**
     * Return the java api socket output stream corresponding to the given UUID key.
     */
    @LispMethod(comment = "Return the java api socket output stream corresponding to the given UUID key.")
    public static final SubLObject java_api_lock_alt(SubLObject uuid_string) {
        return com.cyc.cycjava.cycl.java_api_kernel.api_socket_lock(com.cyc.cycjava.cycl.java_api_kernel.java_api_socket(uuid_string));
    }

    /**
     * Return the java api socket output stream corresponding to the given UUID key.
     */
    @LispMethod(comment = "Return the java api socket output stream corresponding to the given UUID key.")
    public static SubLObject java_api_lock(final SubLObject uuid_string) {
        return api_socket_lock(java_api_socket(uuid_string));
    }

    /**
     * Closes the persistent cfasl socket that is associated with
     * the given UUID-STRING.
     */
    @LispMethod(comment = "Closes the persistent cfasl socket that is associated with\r\nthe given UUID-STRING.\nCloses the persistent cfasl socket that is associated with\nthe given UUID-STRING.")
    public static final SubLObject close_java_api_socket_alt(SubLObject uuid_string) {
        SubLTrampolineFile.checkType(uuid_string, STRINGP);
        if (NIL == $java_api_sockets$.getGlobalValue()) {
            return NIL;
        }
        {
            SubLObject api_socket = com.cyc.cycjava.cycl.java_api_kernel.java_api_socket(uuid_string);
            if (NIL != api_socket) {
                {
                    SubLObject in_stream = com.cyc.cycjava.cycl.java_api_kernel.api_socket_in_stream(api_socket);
                    SubLObject out_stream = com.cyc.cycjava.cycl.java_api_kernel.api_socket_out_stream(api_socket);
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    try {
                                        close(in_stream, UNPROVIDED);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_5 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (in_stream != out_stream) {
                                                    close(out_stream, UNPROVIDED);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0_5);
                                            }
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    }
                }
                dictionary_utilities.synchronized_dictionary_remove($java_api_sockets$.getGlobalValue(), uuid_string);
                if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                    task_processor.push_tpool_background_msg(format(NIL, $str_alt45$Removed_socket__S__from_dictionar, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    /**
     * Closes the persistent cfasl socket that is associated with
     * the given UUID-STRING.
     */
    @LispMethod(comment = "Closes the persistent cfasl socket that is associated with\r\nthe given UUID-STRING.\nCloses the persistent cfasl socket that is associated with\nthe given UUID-STRING.")
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

    /**
     * Displays the java api sockets.
     */
    @LispMethod(comment = "Displays the java api sockets.")
    public static final SubLObject show_java_api_sockets_alt() {
        if (NIL == $java_api_sockets$.getGlobalValue()) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = dictionary_utilities.synchronized_dictionary_keys($java_api_sockets$.getGlobalValue());
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                format(T, $str_alt48$___S______S, key, dictionary_utilities.synchronized_dictionary_lookup($java_api_sockets$.getGlobalValue(), key, UNPROVIDED));
            }
        }
        return NIL;
    }

    /**
     * Displays the java api sockets.
     */
    @LispMethod(comment = "Displays the java api sockets.")
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

    /**
     * Reset this subsystem to an un-initialized state.
     */
    @LispMethod(comment = "Reset this subsystem to an un-initialized state.")
    public static final SubLObject reset_java_api_kernel_alt() {
        task_processor.halt_api_task_processors();
        dictionary_utilities.clear_synchronized_dictionary($java_api_leases$.getGlobalValue());
        dictionary_utilities.clear_synchronized_dictionary($java_api_sockets$.getGlobalValue());
        return NIL;
    }

    /**
     * Reset this subsystem to an un-initialized state.
     */
    @LispMethod(comment = "Reset this subsystem to an un-initialized state.")
    public static SubLObject reset_java_api_kernel() {
        task_processor.halt_api_task_processors();
        dictionary_utilities.clear_synchronized_dictionary($java_api_leases$.getGlobalValue());
        dictionary_utilities.clear_synchronized_dictionary($java_api_sockets$.getGlobalValue());
        return NIL;
    }

    /**
     * Attempt to send an ignorable message to each java api client and
     * when failing, close its socket.
     */
    @LispMethod(comment = "Attempt to send an ignorable message to each java api client and\r\nwhen failing, close its socket.\nAttempt to send an ignorable message to each java api client and\nwhen failing, close its socket.")
    public static final SubLObject cleanup_broken_java_api_sockets_alt() {
        {
            SubLObject close_socketP = NIL;
            SubLObject uuid_strings = NIL;
            if (NIL != $java_api_sockets$.getGlobalValue()) {
                uuid_strings = dictionary_utilities.synchronized_dictionary_keys($java_api_sockets$.getGlobalValue());
                {
                    SubLObject cdolist_list_var = uuid_strings;
                    SubLObject uuid_string = NIL;
                    for (uuid_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , uuid_string = cdolist_list_var.first()) {
                        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                            task_processor.push_tpool_background_msg(format(NIL, $str_alt53$Verifying_java_api_socket_identif, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
                        }
                        {
                            SubLObject lock = com.cyc.cycjava.cycl.java_api_kernel.java_api_lock(uuid_string);
                            SubLObject socket = com.cyc.cycjava.cycl.java_api_kernel.java_api_socket_out_stream(uuid_string);
                            SubLObject ignore_errors_tag = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                    try {
                                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                        try {
                                            try {
                                                close_socketP = T;
                                                {
                                                    SubLObject lock_6 = lock;
                                                    SubLObject release = NIL;
                                                    try {
                                                        release = seize_lock(lock_6);
                                                        cfasl_kernel.send_cfasl_result(socket, $list_alt54, NIL);
                                                    } finally {
                                                        if (NIL != release) {
                                                            release_lock(lock_6);
                                                        }
                                                    }
                                                }
                                                close_socketP = NIL;
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_7 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != close_socketP) {
                                                            if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                                                                task_processor.push_tpool_background_msg(format(NIL, $str_alt55$closing_broken_java_api_socket__A, socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
                                                            }
                                                            com.cyc.cycjava.cycl.java_api_kernel.close_java_api_socket(uuid_string);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0_7);
                                                    }
                                                }
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        rebind(Errors.$error_handler$, _prev_bind_0);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Attempt to send an ignorable message to each java api client and
     * when failing, close its socket.
     */
    @LispMethod(comment = "Attempt to send an ignorable message to each java api client and\r\nwhen failing, close its socket.\nAttempt to send an ignorable message to each java api client and\nwhen failing, close its socket.")
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

    public static final SubLObject launch_java_application_from_red_alt(SubLObject application_name, SubLObject more_args) {
        if (more_args == UNPROVIDED) {
            more_args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject java_vm = com.cyc.cycjava.cycl.java_api_kernel.get_red_value_for_default_java_virtual_machine();
                SubLObject result_code = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject main_class = com.cyc.cycjava.cycl.java_api_kernel.get_java_application_information_from_red(application_name);
                    SubLObject class_path = thread.secondMultipleValue();
                    SubLObject args = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject args_to_java = list($str_alt56$_cp, class_path, main_class);
                        SubLObject final_args = cconcatenate(args_to_java, new SubLObject[]{ args, more_args });
                        result_code = os_process_utilities.system_eval_using_make_os_process(java_vm, final_args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                return result_code;
            }
        }
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

    public static final SubLObject launch_java_application_from_red_in_process_alt(SubLObject application_name, SubLObject more_args) {
        if (more_args == UNPROVIDED) {
            more_args = NIL;
        }
        return subl_promotions.make_process_with_args(cconcatenate($str_alt57$Java_proxy_for_, application_name), LAUNCH_JAVA_APPLICATION_FROM_RED, list(application_name, more_args));
    }

    public static SubLObject launch_java_application_from_red_in_process(final SubLObject application_name, SubLObject more_args) {
        if (more_args == UNPROVIDED) {
            more_args = NIL;
        }
        return subl_promotions.make_process_with_args(cconcatenate($$$Java_proxy_for_, application_name), LAUNCH_JAVA_APPLICATION_FROM_RED, list(application_name, more_args));
    }

    /**
     * Obfuscate the SDK vs RE issue.
     */
    @LispMethod(comment = "Obfuscate the SDK vs RE issue.")
    public static final SubLObject get_red_value_for_default_java_virtual_machine_alt() {
        {
            SubLObject jvm = com.cyc.cycjava.cycl.java_api_kernel.get_red_value_for_default_java_vm();
            if (NIL == jvm) {
                jvm = com.cyc.cycjava.cycl.java_api_kernel.get_red_value_for_default_java_re_vm();
            }
            return jvm;
        }
    }

    /**
     * Obfuscate the SDK vs RE issue.
     */
    @LispMethod(comment = "Obfuscate the SDK vs RE issue.")
    public static SubLObject get_red_value_for_default_java_virtual_machine() {
        SubLObject jvm = get_red_value_for_default_java_vm();
        if (NIL == jvm) {
            jvm = get_red_value_for_default_java_re_vm();
        }
        return jvm;
    }

    public static final SubLObject get_red_value_for_default_java_vm_alt() {
        {
            SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), com.cyc.cycjava.cycl.java_api_kernel.get_red_key_for_default_java_vm());
            if (NIL != element) {
                return red_api.red_element_get_value(element);
            }
        }
        return NIL;
    }

    public static SubLObject get_red_value_for_default_java_vm() {
        final SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), get_red_key_for_default_java_vm());
        if (NIL != element) {
            return red_api.red_element_get_value(element);
        }
        return NIL;
    }

    public static final SubLObject get_red_value_for_default_java_re_vm_alt() {
        {
            SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), com.cyc.cycjava.cycl.java_api_kernel.get_red_key_for_default_java_re_vm());
            if (NIL != element) {
                return red_api.red_element_get_value(element);
            }
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

    public static final SubLObject get_red_value_for_default_java_home_alt() {
        {
            SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), com.cyc.cycjava.cycl.java_api_kernel.get_red_key_for_default_java_home());
            if (NIL != element) {
                return red_api.red_element_get_value(element);
            }
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

    public static final SubLObject get_red_value_for_default_java_re_home_alt() {
        {
            SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), com.cyc.cycjava.cycl.java_api_kernel.get_red_key_for_default_java_re_home());
            if (NIL != element) {
                return red_api.red_element_get_value(element);
            }
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

    public static final SubLObject get_red_value_for_default_java_lib_alt() {
        {
            SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), com.cyc.cycjava.cycl.java_api_kernel.get_red_key_for_default_java_lib());
            if (NIL != element) {
                return red_api.red_element_get_value(element);
            }
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

    public static final SubLObject get_red_value_for_default_java_re_lib_alt() {
        {
            SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), com.cyc.cycjava.cycl.java_api_kernel.get_red_key_for_default_java_re_lib());
            if (NIL != element) {
                return red_api.red_element_get_value(element);
            }
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

    public static final SubLObject get_red_value_for_default_java_path_separator_alt() {
        {
            SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), com.cyc.cycjava.cycl.java_api_kernel.get_red_key_for_default_java_path_separator());
            if (NIL != element) {
                return red_api.red_element_get_value(element);
            }
            return NIL;
        }
    }

    public static SubLObject get_red_value_for_default_java_path_separator() {
        final SubLObject element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), get_red_key_for_default_java_path_separator());
        if (NIL != element) {
            return red_api.red_element_get_value(element);
        }
        return NIL;
    }

    public static final SubLObject get_red_key_for_default_java_home_alt() {
        return cconcatenate(com.cyc.cycjava.cycl.java_api_kernel.get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_home_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_home() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_home_red_key_name$.getGlobalValue() });
    }

    public static final SubLObject get_red_key_for_default_java_re_home_alt() {
        return cconcatenate(com.cyc.cycjava.cycl.java_api_kernel.get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_home_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_re_home() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_home_red_key_name$.getGlobalValue() });
    }

    public static final SubLObject get_red_key_for_default_java_lib_alt() {
        return cconcatenate(com.cyc.cycjava.cycl.java_api_kernel.get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_lib_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_lib() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_lib_red_key_name$.getGlobalValue() });
    }

    public static final SubLObject get_red_key_for_default_java_re_lib_alt() {
        return cconcatenate(com.cyc.cycjava.cycl.java_api_kernel.get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_lib_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_re_lib() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_lib_red_key_name$.getGlobalValue() });
    }

    public static final SubLObject get_red_key_for_default_java_vm_alt() {
        return cconcatenate(com.cyc.cycjava.cycl.java_api_kernel.get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_vm_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_vm() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_vm_red_key_name$.getGlobalValue() });
    }

    public static final SubLObject get_red_key_for_default_java_re_vm_alt() {
        return cconcatenate(com.cyc.cycjava.cycl.java_api_kernel.get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_vm_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_re_vm() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_vm_red_key_name$.getGlobalValue() });
    }

    public static final SubLObject get_red_key_for_default_java_path_separator_alt() {
        return cconcatenate(com.cyc.cycjava.cycl.java_api_kernel.get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_path_separator_red_key_name$.getGlobalValue() });
    }

    public static SubLObject get_red_key_for_default_java_path_separator() {
        return cconcatenate(get_java_red_root_key_for_default_version(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), $java_path_separator_red_key_name$.getGlobalValue() });
    }

    /**
     * This should really be elsewhere.
     */
    @LispMethod(comment = "This should really be elsewhere.")
    public static final SubLObject get_software_type_as_red_key_name_alt() {
        return string_utilities.split_string(Environment.software_type(), UNPROVIDED).first();
    }

    /**
     * This should really be elsewhere.
     */
    @LispMethod(comment = "This should really be elsewhere.")
    public static SubLObject get_software_type_as_red_key_name() {
        return string_utilities.split_string(Environment.software_type(), UNPROVIDED).first();
    }

    public static final SubLObject get_java_red_root_key_alt() {
        if (NIL == $java_red_root_key$.getGlobalValue()) {
            $java_red_root_key$.setGlobalValue(cconcatenate(red_utilities.$red_root_key_os$.getGlobalValue(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), com.cyc.cycjava.cycl.java_api_kernel.get_software_type_as_red_key_name(), red_utilities.$red_key_name_separator$.getGlobalValue(), $java_red_subtree_name$.getGlobalValue() }));
        }
        return $java_red_root_key$.getGlobalValue();
    }

    public static SubLObject get_java_red_root_key() {
        if (NIL == $java_red_root_key$.getGlobalValue()) {
            $java_red_root_key$.setGlobalValue(cconcatenate(red_utilities.$red_root_key_os$.getGlobalValue(), new SubLObject[]{ red_utilities.$red_key_name_separator$.getGlobalValue(), get_software_type_as_red_key_name(), red_utilities.$red_key_name_separator$.getGlobalValue(), $java_red_subtree_name$.getGlobalValue() }));
        }
        return $java_red_root_key$.getGlobalValue();
    }

    public static final SubLObject get_java_red_root_key_for_version_alt(SubLObject version_numbers) {
        SubLTrampolineFile.checkType(version_numbers, LISTP);
        {
            SubLObject key = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                write_string(com.cyc.cycjava.cycl.java_api_kernel.get_java_red_root_key(), stream, UNPROVIDED, UNPROVIDED);
                write_string(red_utilities.$red_key_name_separator$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject list_var = NIL;
                    SubLObject version_number = NIL;
                    SubLObject counter = NIL;
                    for (list_var = version_numbers, version_number = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , version_number = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                        if (!counter.isZero()) {
                            write_string(red_utilities.$red_key_name_separator$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
                        }
                        princ(version_number, stream);
                    }
                }
                key = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return key;
        }
    }

    public static SubLObject get_java_red_root_key_for_version(final SubLObject version_numbers) {
        assert NIL != listp(version_numbers) : "! listp(version_numbers) " + ("Types.listp(version_numbers) " + "CommonSymbols.NIL != Types.listp(version_numbers) ") + version_numbers;
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

    public static final SubLObject get_java_red_root_key_for_default_version_alt() {
        return com.cyc.cycjava.cycl.java_api_kernel.get_java_red_root_key_for_version($java_default_version_numbers$.getGlobalValue());
    }

    public static SubLObject get_java_red_root_key_for_default_version() {
        return get_java_red_root_key_for_version($java_default_version_numbers$.getGlobalValue());
    }

    public static final SubLObject get_java_application_information_from_red_alt(SubLObject application_name) {
        {
            SubLObject application = red_utilities.get_red_root_element_for_application(application_name);
            SubLObject main_class = red_api.red_get_element_get_sub_element_by_key(application, $java_red_key_main_class_key$.getGlobalValue());
            SubLObject class_path_description = red_api.red_get_element_get_sub_element_by_key(application, $java_red_key_classpath_key$.getGlobalValue());
            SubLObject arguments_description = red_api.red_get_element_get_sub_element_by_key(application, $java_red_key_arguments_key$.getGlobalValue());
            SubLObject path_separator = com.cyc.cycjava.cycl.java_api_kernel.get_red_value_for_default_java_path_separator();
            SubLObject class_path_elements = red_utilities.interpret_red_element_subtree(class_path_description);
            return values(red_api.red_element_get_value(main_class), com.cyc.cycjava.cycl.java_api_kernel.get_java_classpath_from_elments(class_path_elements, path_separator), red_utilities.interpret_red_element_subtree(arguments_description));
        }
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

    public static final SubLObject get_java_classpath_from_elments_alt(SubLObject class_path_elements, SubLObject path_separator) {
        {
            SubLObject items = NIL;
            SubLObject list_var = NIL;
            SubLObject element = NIL;
            SubLObject counter = NIL;
            for (list_var = class_path_elements, element = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , element = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                if (!counter.isZero()) {
                    items = cons(path_separator, items);
                }
                items = cons(element, items);
            }
            return apply(symbol_function(CCONCATENATE), nreverse(items));
        }
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
        declareFunction("java_api_lease_expiration_time", "JAVA-API-LEASE-EXPIRATION-TIME", 1, 0, false);
        declareFunction("initialize_java_api_lease_monitor", "INITIALIZE-JAVA-API-LEASE-MONITOR", 0, 0, false);
        declareFunction("halt_java_api_lease_monitor", "HALT-JAVA-API-LEASE-MONITOR", 0, 0, false);
        declareFunction("java_api_lease_monitor", "JAVA-API-LEASE-MONITOR", 0, 0, false);
        declareFunction("release_resources_for_java_api_client", "RELEASE-RESOURCES-FOR-JAVA-API-CLIENT", 1, 1, false);
        declareFunction("acquire_api_services_lease", "ACQUIRE-API-SERVICES-LEASE", 2, 0, false);
        declareFunction("show_java_api_service_leases", "SHOW-JAVA-API-SERVICE-LEASES", 0, 0, false);
        declareFunction("get_current_api_socket", "GET-CURRENT-API-SOCKET", 0, 0, false);
        declareFunction("api_socket_in_stream", "API-SOCKET-IN-STREAM", 1, 0, false);
        declareFunction("api_socket_out_stream", "API-SOCKET-OUT-STREAM", 1, 0, false);
        declareFunction("api_socket_lock", "API-SOCKET-LOCK", 1, 0, false);
        declareFunction("register_java_api_passive_socket", "REGISTER-JAVA-API-PASSIVE-SOCKET", 3, 0, false);
        declareFunction("initialize_java_api_passive_socket", "INITIALIZE-JAVA-API-PASSIVE-SOCKET", 1, 0, false);
        declareFunction("java_api_socket", "JAVA-API-SOCKET", 1, 0, false);
        declareFunction("java_api_socket_out_stream", "JAVA-API-SOCKET-OUT-STREAM", 1, 0, false);
        declareFunction("java_api_lock", "JAVA-API-LOCK", 1, 0, false);
        declareFunction("close_java_api_socket", "CLOSE-JAVA-API-SOCKET", 1, 0, false);
        declareFunction("show_java_api_sockets", "SHOW-JAVA-API-SOCKETS", 0, 0, false);
        declareFunction("reset_java_api_kernel", "RESET-JAVA-API-KERNEL", 0, 0, false);
        declareFunction("cleanup_broken_java_api_sockets", "CLEANUP-BROKEN-JAVA-API-SOCKETS", 0, 0, false);
        declareFunction("launch_java_application_from_red", "LAUNCH-JAVA-APPLICATION-FROM-RED", 1, 1, false);
        declareFunction("launch_java_application_from_red_in_process", "LAUNCH-JAVA-APPLICATION-FROM-RED-IN-PROCESS", 1, 1, false);
        declareFunction("get_red_value_for_default_java_virtual_machine", "GET-RED-VALUE-FOR-DEFAULT-JAVA-VIRTUAL-MACHINE", 0, 0, false);
        declareFunction("get_red_value_for_default_java_vm", "GET-RED-VALUE-FOR-DEFAULT-JAVA-VM", 0, 0, false);
        declareFunction("get_red_value_for_default_java_re_vm", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-VM", 0, 0, false);
        declareFunction("get_red_value_for_default_java_home", "GET-RED-VALUE-FOR-DEFAULT-JAVA-HOME", 0, 0, false);
        declareFunction("get_red_value_for_default_java_re_home", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-HOME", 0, 0, false);
        declareFunction("get_red_value_for_default_java_lib", "GET-RED-VALUE-FOR-DEFAULT-JAVA-LIB", 0, 0, false);
        declareFunction("get_red_value_for_default_java_re_lib", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-LIB", 0, 0, false);
        declareFunction("get_red_value_for_default_java_path_separator", "GET-RED-VALUE-FOR-DEFAULT-JAVA-PATH-SEPARATOR", 0, 0, false);
        declareFunction("get_red_key_for_default_java_home", "GET-RED-KEY-FOR-DEFAULT-JAVA-HOME", 0, 0, false);
        declareFunction("get_red_key_for_default_java_re_home", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-HOME", 0, 0, false);
        declareFunction("get_red_key_for_default_java_lib", "GET-RED-KEY-FOR-DEFAULT-JAVA-LIB", 0, 0, false);
        declareFunction("get_red_key_for_default_java_re_lib", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-LIB", 0, 0, false);
        declareFunction("get_red_key_for_default_java_vm", "GET-RED-KEY-FOR-DEFAULT-JAVA-VM", 0, 0, false);
        declareFunction("get_red_key_for_default_java_re_vm", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-VM", 0, 0, false);
        declareFunction("get_red_key_for_default_java_path_separator", "GET-RED-KEY-FOR-DEFAULT-JAVA-PATH-SEPARATOR", 0, 0, false);
        declareFunction("get_software_type_as_red_key_name", "GET-SOFTWARE-TYPE-AS-RED-KEY-NAME", 0, 0, false);
        declareFunction("get_java_red_root_key", "GET-JAVA-RED-ROOT-KEY", 0, 0, false);
        declareFunction("get_java_red_root_key_for_version", "GET-JAVA-RED-ROOT-KEY-FOR-VERSION", 1, 0, false);
        declareFunction("get_java_red_root_key_for_default_version", "GET-JAVA-RED-ROOT-KEY-FOR-DEFAULT-VERSION", 0, 0, false);
        declareFunction("get_java_application_information_from_red", "GET-JAVA-APPLICATION-INFORMATION-FROM-RED", 1, 0, false);
        declareFunction("get_java_classpath_from_elments", "GET-JAVA-CLASSPATH-FROM-ELMENTS", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_java_api_kernel_file_alt() {
        deflexical("*JAVA-API-LEASES*", dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        deflexical("*JAVA-API-LEASE-MONITOR*", NIL);
        defconstant("*JAVA-API-LEASE-MONITOR-SLEEP-SECONDS*", TWO_INTEGER);
        defconstant("*MAXIMUM-API-SERVICES-LEASE-DURATION-IN-MILLISECONDS*", $int$3600000);
        defconstant("*LEASE-TIMEOUT-CUSHION-FACTOR*", THREE_INTEGER);
        deflexical("*JAVA-API-SOCKETS*", dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        deflexical("*JAVA-HOME-RED-KEY-NAME*", $str_alt60$JAVA_HOME);
        deflexical("*JAVA-LIB-RED-KEY-NAME*", $str_alt61$JAVA_LIB);
        deflexical("*JAVA-VM-RED-KEY-NAME*", $str_alt62$JAVA_VM);
        deflexical("*JAVA-RE-HOME-RED-KEY-NAME*", $str_alt63$JAVA_RE_HOME);
        deflexical("*JAVA-RE-LIB-RED-KEY-NAME*", $str_alt64$JAVA_RE_LIB);
        deflexical("*JAVA-RE-VM-RED-KEY-NAME*", $str_alt65$JAVA_RE_VM);
        deflexical("*JAVA-PATH-SEPARATOR-RED-KEY-NAME*", $str_alt66$path_separator);
        deflexical("*JAVA-RED-SUBTREE-NAME*", $$$java);
        deflexical("*JAVA-RED-ROOT-KEY*", NIL);
        deflexical("*JAVA-DEFAULT-VERSION-NUMBERS*", $list_alt68);
        deflexical("*JAVA-RED-KEY-MAIN-CLASS-KEY*", $str_alt70$java_main_class);
        deflexical("*JAVA-RED-KEY-CLASSPATH-KEY*", $str_alt71$java_classpath);
        deflexical("*JAVA-RED-KEY-ARGUMENTS-KEY*", $str_alt72$java_arguments);
        return NIL;
    }

    public static SubLObject init_java_api_kernel_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*JAVA-HOME-RED-KEY-NAME*", $str_alt60$JAVA_HOME);
            deflexical("*JAVA-LIB-RED-KEY-NAME*", $str_alt61$JAVA_LIB);
            deflexical("*JAVA-VM-RED-KEY-NAME*", $str_alt62$JAVA_VM);
            deflexical("*JAVA-RE-HOME-RED-KEY-NAME*", $str_alt63$JAVA_RE_HOME);
            deflexical("*JAVA-RE-LIB-RED-KEY-NAME*", $str_alt64$JAVA_RE_LIB);
            deflexical("*JAVA-RE-VM-RED-KEY-NAME*", $str_alt65$JAVA_RE_VM);
            deflexical("*JAVA-PATH-SEPARATOR-RED-KEY-NAME*", $str_alt66$path_separator);
            deflexical("*JAVA-DEFAULT-VERSION-NUMBERS*", $list_alt68);
            deflexical("*JAVA-RED-KEY-MAIN-CLASS-KEY*", $str_alt70$java_main_class);
            deflexical("*JAVA-RED-KEY-CLASSPATH-KEY*", $str_alt71$java_classpath);
            deflexical("*JAVA-RED-KEY-ARGUMENTS-KEY*", $str_alt72$java_arguments);
        }
        return NIL;
    }

    public static SubLObject init_java_api_kernel_file_Previous() {
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

    static private final SubLString $str_alt4$Initialize_the_process_which_moni = makeString("Initialize the process which monitors lease expirations for java api clients.");

    public static final SubLObject setup_java_api_kernel_file_alt() {
        register_cyc_api_function(INITIALIZE_JAVA_API_LEASE_MONITOR, NIL, $str_alt4$Initialize_the_process_which_moni, NIL, NIL);
        register_cyc_api_function(HALT_JAVA_API_LEASE_MONITOR, NIL, $str_alt6$Halt_the_the_process_which_monito, NIL, NIL);
        register_cyc_api_function(RELEASE_RESOURCES_FOR_JAVA_API_CLIENT, $list_alt14, $str_alt15$Closes_the_outbound_api_socket_an, $list_alt16, $list_alt17);
        register_cyc_api_function(ACQUIRE_API_SERVICES_LEASE, $list_alt29, $str_alt30$Requests_an_API_services_lease___, $list_alt31, $list_alt32);
        register_cyc_api_function(SHOW_JAVA_API_SERVICE_LEASES, NIL, $str_alt36$Displays_the_current_java_api_lea, NIL, $list_alt17);
        register_cyc_api_function(INITIALIZE_JAVA_API_PASSIVE_SOCKET, $list_alt42, $str_alt43$Associates_the_current_socket_wit, $list_alt16, $list_alt17);
        register_cyc_api_function(CLOSE_JAVA_API_SOCKET, $list_alt42, $str_alt47$Closes_the_persistent_cfasl_socke, $list_alt16, $list_alt17);
        register_cyc_api_function(SHOW_JAVA_API_SOCKETS, NIL, $str_alt50$Displays_the_java_api_sockets_, NIL, $list_alt17);
        register_cyc_api_function(RESET_JAVA_API_KERNEL, NIL, $str_alt52$Reset_this_subsystem_to_an_un_ini, NIL, NIL);
        return NIL;
    }

    public static SubLObject setup_java_api_kernel_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(INITIALIZE_JAVA_API_PASSIVE_SOCKET, $list_alt42, $str_alt43$Associates_the_current_socket_wit, $list_alt16, $list_alt17);
            register_cyc_api_function(CLOSE_JAVA_API_SOCKET, $list_alt42, $str_alt47$Closes_the_persistent_cfasl_socke, $list_alt16, $list_alt17);
            register_cyc_api_function(SHOW_JAVA_API_SOCKETS, NIL, $str_alt50$Displays_the_java_api_sockets_, NIL, $list_alt17);
            register_cyc_api_function(RESET_JAVA_API_KERNEL, NIL, $str_alt52$Reset_this_subsystem_to_an_un_ini, NIL, NIL);
        }
        return NIL;
    }

    public static SubLObject setup_java_api_kernel_file_Previous() {
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

    static private final SubLString $str_alt6$Halt_the_the_process_which_monito = makeString("Halt the the process which monitors lease expirations for java api clients.");

    static private final SubLString $str_alt11$Releasing_java_API_resources_iden = makeString("Releasing java API resources identified by ~A~%");

    static private final SubLString $str_alt12$__Releasing_java_API_resources_id = makeString("~%Releasing java API resources identified by ~A~%");

    static private final SubLList $list_alt14 = list(makeSymbol("UUID-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("ABNORMAL?"));

    static private final SubLString $str_alt15$Closes_the_outbound_api_socket_an = makeString("Closes the outbound api socket and kills active api requests identified by the given uuid-string.\n   @param uuid-string ; stringp\n   @param abnormal?   ; boolean Whether or not the release was abnormal or expected");

    @Override
    public void declareFunctions() {
        declare_java_api_kernel_file();
    }

    @Override
    public void initializeVariables() {
        init_java_api_kernel_file();
    }

    static private final SubLList $list_alt16 = list(list(makeSymbol("UUID-STRING"), makeSymbol("STRINGP")));

    @Override
    public void runTopLevelForms() {
        setup_java_api_kernel_file();
    }

    static private final SubLList $list_alt17 = list(NIL);

    static {
    }

    static private final SubLString $str_alt20$_cfasl_kernel_standard_output_ = makeString("*cfasl-kernel-standard-output*");

    static private final SubLString $str_alt21$api_services_lease_denied_for__A_ = makeString("api services lease denied for ~A~%");

    static private final SubLString $str_alt23$api_services_lease_granted_by_ = makeString("api services lease granted by ");

    static private final SubLString $str_alt24$_to_ = makeString(" to ");

    static private final SubLString $str_alt25$_for_ = makeString(" for ");

    static private final SubLString $str_alt26$_milliseconds = makeString(" milliseconds");

    static private final SubLString $str_alt27$_A__ = makeString("~A~%");

    static private final SubLList $list_alt29 = list(makeSymbol("LEASE-DURATION-IN-MILLISECONDS"), makeSymbol("UUID-STRING"));

    static private final SubLString $str_alt30$Requests_an_API_services_lease___ = makeString("Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\n   for a duration longer than one hour is denied.\n   @param lease-duration-in-milliseconds ; integerp, the lease duration in milliseconds\n   @param uuid-string ; stringp, identifies the java api client");

    static private final SubLList $list_alt31 = list(list(makeSymbol("LEASE-DURATION-IN-MILLISECONDS"), makeSymbol("INTEGERP")), list(makeSymbol("UUID-STRING"), makeSymbol("STRINGP")));

    static private final SubLList $list_alt32 = list(makeSymbol("STRINGP"));

    static private final SubLString $str_alt33$There_are_no_Java_API_client_leas = makeString("There are no Java API client leases.~%");

    static private final SubLString $str_alt34$Java_API_client__A_lease_expires_ = makeString("Java API client ~A lease expires in ~A seconds~%");

    static private final SubLString $str_alt36$Displays_the_current_java_api_lea = makeString("Displays the current java api leases.");

    static private final SubLString $str_alt38$Initializing_java_client_socket__ = makeString("Initializing java client socket ~S~%identified by ~A~%");

    static private final SubLString $str_alt39$Initialized_java_client_socket__S = makeString("Initialized java client socket ~S~%identified by ~A~%");

    static private final SubLString $str_alt40$Invalid_java_client_socket__S__ = makeString("Invalid java client socket ~S~%");

    static private final SubLList $list_alt42 = list(makeSymbol("UUID-STRING"));

    static private final SubLString $str_alt43$Associates_the_current_socket_wit = makeString("Associates the current socket with the given UUID-STRING, then ends this server process\nthat currently uses the socket.");

    static private final SubLString $str_alt44$Looked_up_socket__S_from_dictiona = makeString("Looked up socket ~S from dictionary~%identifed by ~A~%");

    static private final SubLString $str_alt45$Removed_socket__S__from_dictionar = makeString("Removed socket ~S~ from dictionary%identifed by ~A~%");

    static private final SubLString $str_alt47$Closes_the_persistent_cfasl_socke = makeString("Closes the persistent cfasl socket that is associated with \nthe given UUID-STRING.");

    static private final SubLString $str_alt48$___S______S = makeString("~%~S ==> ~S");

    static private final SubLString $str_alt50$Displays_the_java_api_sockets_ = makeString("Displays the java api sockets.");

    static private final SubLString $str_alt52$Reset_this_subsystem_to_an_un_ini = makeString("Reset this subsystem to an un-initialized state.");

    static private final SubLString $str_alt53$Verifying_java_api_socket_identif = makeString("Verifying java api socket identified by ~A~%");

    static private final SubLList $list_alt54 = list(makeSymbol("IGNORE"));

    static private final SubLString $str_alt55$closing_broken_java_api_socket__A = makeString("closing broken java api socket ~A~%identified by ~A~%");

    static private final SubLString $str_alt56$_cp = makeString("-cp");

    static private final SubLString $str_alt57$Java_proxy_for_ = makeString("Java proxy for ");

    static private final SubLString $str_alt60$JAVA_HOME = makeString("JAVA_HOME");

    static private final SubLString $str_alt61$JAVA_LIB = makeString("JAVA_LIB");

    static private final SubLString $str_alt62$JAVA_VM = makeString("JAVA_VM");

    static private final SubLString $str_alt63$JAVA_RE_HOME = makeString("JAVA_RE_HOME");

    static private final SubLString $str_alt64$JAVA_RE_LIB = makeString("JAVA_RE_LIB");

    static private final SubLString $str_alt65$JAVA_RE_VM = makeString("JAVA_RE_VM");

    static private final SubLString $str_alt66$path_separator = makeString("path_separator");

    static private final SubLList $list_alt68 = list(ONE_INTEGER, FOUR_INTEGER, TWO_INTEGER);

    static private final SubLString $str_alt70$java_main_class = makeString("java-main-class");

    static private final SubLString $str_alt71$java_classpath = makeString("java-classpath");

    static private final SubLString $str_alt72$java_arguments = makeString("java-arguments");
}

/**
 * Total time: 412 ms
 */
