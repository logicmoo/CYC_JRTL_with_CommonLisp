/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
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


public final class agent_manager extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new agent_manager();

 public static final String myName = "com.cyc.cycjava.cycl.agent_manager";


    // deflexical
    @LispMethod(comment = "The host (should be localhost) where the agent manager is listening.\ndeflexical")
    // Definitions
    /**
     * The host (should be localhost) where the agent manager is listening.
     */
    public static final SubLSymbol $agent_mgr_host$ = makeSymbol("*AGENT-MGR-HOST*");

    // deflexical
    @LispMethod(comment = "The tcp port where the agent manager is listening.\ndeflexical")
    /**
     * The tcp port where the agent manager is listening.
     */
    public static final SubLSymbol $agent_mgr_port$ = makeSymbol("*AGENT-MGR-PORT*");

    // deflexical
    /**
     * Persistent bidirectional connection to the agent manager over which
     * fipa-transport-messages are asychronously sent and received.
     */
    @LispMethod(comment = "Persistent bidirectional connection to the agent manager over which\r\nfipa-transport-messages are asychronously sent and received.\ndeflexical\nPersistent bidirectional connection to the agent manager over which\nfipa-transport-messages are asychronously sent and received.")
    public static final SubLSymbol $agent_mgr_socket$ = makeSymbol("*AGENT-MGR-SOCKET*");

    // deflexical
    /**
     * The agent name (as a symbol) of this Cyc api service within the agent
     * community.
     */
    @LispMethod(comment = "The agent name (as a symbol) of this Cyc api service within the agent\r\ncommunity.\ndeflexical\nThe agent name (as a symbol) of this Cyc api service within the agent\ncommunity.")
    public static final SubLSymbol $api_service_agent_name$ = makeSymbol("*API-SERVICE-AGENT-NAME*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$localhost = makeString("localhost");

    private static final SubLInteger $int$4444 = makeInteger(4444);

    public static final SubLSymbol $agent_received_message_handler$ = makeSymbol("*AGENT-RECEIVED-MESSAGE-HANDLER*");

    private static final SubLSymbol CYC_TO_AGENT_MANAGER_INIT = makeSymbol("CYC-TO-AGENT-MANAGER-INIT");

    static private final SubLString $str4$cyc_api_service_ = makeString("cyc-api-service-");

    static private final SubLString $str5$Agent_received_message_handler = makeString("Agent received-message handler");

    private static final SubLSymbol AGENT_RECEIVED_MESSSAGE_HANDLER = makeSymbol("AGENT-RECEIVED-MESSSAGE-HANDLER");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $str9$fipa_transport_message = makeString("fipa-transport-message");

    static private final SubLString $str10$__Received_fipa_transport_message = makeString("~%Received fipa-transport-message~%~S");

    static private final SubLString $str11$Agent_received_message_handler_pr = makeString("Agent received-message handler process ended");

    static private final SubLString $str13$cyc_echo_ = makeString("cyc-echo-");

    private static final SubLSymbol INFORM = makeSymbol("INFORM");

    private static final SubLSymbol AGENT_IDENTIFIER = makeSymbol("AGENT-IDENTIFIER");

    private static final SubLSymbol $CYC_API_SERVICE_ECHO = makeKeyword("CYC-API-SERVICE-ECHO");

    private static final SubLSymbol ENVELOPE = makeSymbol("ENVELOPE");

    private static final SubLSymbol $X_AGENT_COMMUNITY = makeKeyword("X-AGENT-COMMUNITY");

    static private final SubLString $str33$__envelope___S = makeString("~%envelope~%~S");

    /**
     * Establishes a tcp socket connection with the local agent manager, passing
     * as arguments the name of this image and its base tcp port.
     */
    @LispMethod(comment = "Establishes a tcp socket connection with the local agent manager, passing\r\nas arguments the name of this image and its base tcp port.\nEstablishes a tcp socket connection with the local agent manager, passing\nas arguments the name of this image and its base tcp port.")
    public static final SubLObject initialize_agent_manager_connection_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = list(CYC_TO_AGENT_MANAGER_INIT, cyc_image_id(), system_parameters.$base_tcp_port$.getDynamicValue(thread));
                $agent_mgr_socket$.setGlobalValue(NIL);
                $agent_mgr_socket$.setGlobalValue(Tcp.open_tcp_stream($agent_mgr_host$.getGlobalValue(), $agent_mgr_port$.getGlobalValue()));
                com.cyc.cycjava.cycl.agent_manager.agent_send_message(message);
                $api_service_agent_name$.setGlobalValue(intern(cconcatenate($str_alt4$cyc_api_service_, cyc_image_id()), UNPROVIDED));
            }
            com.cyc.cycjava.cycl.agent_manager.start_agent_received_message_handler();
            return NIL;
        }
    }

    /**
     * Establishes a tcp socket connection with the local agent manager, passing
     * as arguments the name of this image and its base tcp port.
     */
    @LispMethod(comment = "Establishes a tcp socket connection with the local agent manager, passing\r\nas arguments the name of this image and its base tcp port.\nEstablishes a tcp socket connection with the local agent manager, passing\nas arguments the name of this image and its base tcp port.")
    public static SubLObject initialize_agent_manager_connection() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(CYC_TO_AGENT_MANAGER_INIT, cyc_image_id(), system_parameters.$base_tcp_port$.getDynamicValue(thread));
        $agent_mgr_socket$.setGlobalValue(NIL);
        $agent_mgr_socket$.setGlobalValue(subl_promotions.open_tcp_stream_with_timeout($agent_mgr_host$.getGlobalValue(), $agent_mgr_port$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        agent_send_message(message);
        $api_service_agent_name$.setGlobalValue(intern(cconcatenate($str4$cyc_api_service_, cyc_image_id()), UNPROVIDED));
        start_agent_received_message_handler();
        return NIL;
    }

    /**
     * Sends an asychronous message to the grid agent interface.
     */
    @LispMethod(comment = "Sends an asychronous message to the grid agent interface.")
    public static final SubLObject agent_send_message_alt(SubLObject message) {
        cfasl_output(message, $agent_mgr_socket$.getGlobalValue());
        force_output($agent_mgr_socket$.getGlobalValue());
        return NIL;
    }

    /**
     * Sends an asychronous message to the grid agent interface.
     */
    @LispMethod(comment = "Sends an asychronous message to the grid agent interface.")
    public static SubLObject agent_send_message(final SubLObject message) {
        cfasl_output(message, $agent_mgr_socket$.getGlobalValue());
        force_output($agent_mgr_socket$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject start_agent_received_message_handler_alt() {
        if (NIL != $agent_received_message_handler$.getGlobalValue()) {
            com.cyc.cycjava.cycl.agent_manager.halt_agent_received_message_handler();
        }
        $agent_received_message_handler$.setGlobalValue(make_process($str_alt5$Agent_received_message_handler, symbol_function(AGENT_RECEIVED_MESSSAGE_HANDLER)));
        return NIL;
    }

    public static SubLObject start_agent_received_message_handler() {
        if (NIL != $agent_received_message_handler$.getGlobalValue()) {
            halt_agent_received_message_handler();
        }
        $agent_received_message_handler$.setGlobalValue(make_process($str5$Agent_received_message_handler, symbol_function(AGENT_RECEIVED_MESSSAGE_HANDLER)));
        return NIL;
    }

    public static final SubLObject halt_agent_received_message_handler_alt() {
        if (NIL != $agent_received_message_handler$.getGlobalValue()) {
            kill_process($agent_received_message_handler$.getGlobalValue());
            $agent_received_message_handler$.setGlobalValue(NIL);
        }
        return NIL;
    }

    public static SubLObject halt_agent_received_message_handler() {
        if (NIL != $agent_received_message_handler$.getGlobalValue()) {
            kill_process($agent_received_message_handler$.getGlobalValue());
            $agent_received_message_handler$.setGlobalValue(NIL);
        }
        return NIL;
    }

    /**
     * Reads the agent manager tcp socket and handles the fipa-transport-message.
     */
    @LispMethod(comment = "Reads the agent manager tcp socket and handles the fipa-transport-message.")
    public static final SubLObject agent_received_messsage_handler_alt() {
        {
            SubLObject fipa_transport_message = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            try {
                                while (true) {
                                    fipa_transport_message = cfasl_input($agent_mgr_socket$.getGlobalValue(), NIL, UNPROVIDED);
                                    eval_in_api.trace_me($str_alt9$fipa_transport_message, fipa_transport_message, UNPROVIDED, UNPROVIDED);
                                    format(NIL, $str_alt10$__Received_fipa_transport_message, fipa_transport_message);
                                } 
                            } finally {
                                {
                                    SubLObject _prev_bind_0_1 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        com.cyc.cycjava.cycl.agent_manager.halt_agent_received_message_handler();
                                        format(NIL, $str_alt11$Agent_received_message_handler_pr);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0_1);
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
        return NIL;
    }

    /**
     * Reads the agent manager tcp socket and handles the fipa-transport-message.
     */
    @LispMethod(comment = "Reads the agent manager tcp socket and handles the fipa-transport-message.")
    public static SubLObject agent_received_messsage_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fipa_transport_message = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    try {
                        while (true) {
                            fipa_transport_message = cfasl_input($agent_mgr_socket$.getGlobalValue(), NIL, UNPROVIDED);
                            eval_in_api.trace_me($str9$fipa_transport_message, fipa_transport_message, UNPROVIDED, UNPROVIDED);
                            format(NIL, $str10$__Received_fipa_transport_message, fipa_transport_message);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            halt_agent_received_message_handler();
                            format(NIL, $str11$Agent_received_message_handler_pr);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } catch (final Throwable t) {
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Sends a message into the agent community which is echoed back here.
     */
    @LispMethod(comment = "Sends a message into the agent community which is echoed back here.")
    public static final SubLObject agent_echo_alt(SubLObject content) {
        SubLTrampolineFile.checkType(content, LISTP);
        {
            SubLObject envelope = NIL;
            SubLObject payload = NIL;
            SubLObject amp = NIL;
            SubLObject fipa_transport_message = NIL;
            SubLObject echo_agent_name = NIL;
            echo_agent_name = intern(cconcatenate($str_alt13$cyc_echo_, cyc_image_id()), UNPROVIDED);
            amp = list(new SubLObject[]{ INFORM, $SENDER, list(AGENT_IDENTIFIER, $NAME, echo_agent_name), $RECEIVER, list(SET, list(AGENT_IDENTIFIER, $NAME, echo_agent_name)), $CONTENT, content, $LANGUAGE, $CYCL, $ONTOLOGY, $CYC_API_SERVICE_ECHO, $PROTOCOL, $FIPA_INFORM });
            payload = agent_manager_protocol.create_fipa_payload(amp);
            envelope = list(new SubLObject[]{ ENVELOPE, $TO, echo_agent_name, $FROM, echo_agent_name, $DATE, get_universal_time(), $X_AGENT_COMMUNITY, $COABS });
            format(NIL, $str_alt33$__envelope___S, envelope);
            fipa_transport_message = agent_manager_protocol.create_fipa_transport_message(envelope, payload);
            com.cyc.cycjava.cycl.agent_manager.agent_send_message(fipa_transport_message);
        }
        return NIL;
    }

    /**
     * Sends a message into the agent community which is echoed back here.
     */
    @LispMethod(comment = "Sends a message into the agent community which is echoed back here.")
    public static SubLObject agent_echo(final SubLObject content) {
        assert NIL != listp(content) : "! listp(content) " + ("Types.listp(content) " + "CommonSymbols.NIL != Types.listp(content) ") + content;
        SubLObject envelope = NIL;
        SubLObject payload = NIL;
        SubLObject amp = NIL;
        SubLObject fipa_transport_message = NIL;
        SubLObject echo_agent_name = NIL;
        echo_agent_name = intern(cconcatenate($str13$cyc_echo_, cyc_image_id()), UNPROVIDED);
        amp = list(new SubLObject[]{ INFORM, $SENDER, list(AGENT_IDENTIFIER, $NAME, echo_agent_name), $RECEIVER, list(SET, list(AGENT_IDENTIFIER, $NAME, echo_agent_name)), $CONTENT, content, $LANGUAGE, $CYCL, $ONTOLOGY, $CYC_API_SERVICE_ECHO, $PROTOCOL, $FIPA_INFORM });
        payload = agent_manager_protocol.create_fipa_payload(amp);
        envelope = list(new SubLObject[]{ ENVELOPE, $TO, echo_agent_name, $FROM, echo_agent_name, $DATE, get_universal_time(), $X_AGENT_COMMUNITY, $COABS });
        format(NIL, $str33$__envelope___S, envelope);
        fipa_transport_message = agent_manager_protocol.create_fipa_transport_message(envelope, payload);
        agent_send_message(fipa_transport_message);
        return NIL;
    }

    public static SubLObject declare_agent_manager_file() {
        declareFunction("initialize_agent_manager_connection", "INITIALIZE-AGENT-MANAGER-CONNECTION", 0, 0, false);
        declareFunction("agent_send_message", "AGENT-SEND-MESSAGE", 1, 0, false);
        declareFunction("start_agent_received_message_handler", "START-AGENT-RECEIVED-MESSAGE-HANDLER", 0, 0, false);
        declareFunction("halt_agent_received_message_handler", "HALT-AGENT-RECEIVED-MESSAGE-HANDLER", 0, 0, false);
        declareFunction("agent_received_messsage_handler", "AGENT-RECEIVED-MESSSAGE-HANDLER", 0, 0, false);
        declareFunction("agent_echo", "AGENT-ECHO", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_agent_manager_file_alt() {
        deflexical("*AGENT-MGR-HOST*", $$$localhost);
        deflexical("*AGENT-MGR-PORT*", $int$4444);
        deflexical("*AGENT-MGR-SOCKET*", NIL);
        deflexical("*API-SERVICE-AGENT-NAME*", NIL);
        deflexical("*AGENT-RECEIVED-MESSAGE-HANDLER*", NIL != boundp($agent_received_message_handler$) ? ((SubLObject) ($agent_received_message_handler$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_agent_manager_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*AGENT-MGR-HOST*", $$$localhost);
            deflexical("*AGENT-MGR-PORT*", $int$4444);
            deflexical("*AGENT-MGR-SOCKET*", NIL);
            deflexical("*API-SERVICE-AGENT-NAME*", NIL);
            deflexical("*AGENT-RECEIVED-MESSAGE-HANDLER*", SubLTrampolineFile.maybeDefault($agent_received_message_handler$, $agent_received_message_handler$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*AGENT-RECEIVED-MESSAGE-HANDLER*", NIL != boundp($agent_received_message_handler$) ? ((SubLObject) ($agent_received_message_handler$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_agent_manager_file_Previous() {
        deflexical("*AGENT-MGR-HOST*", $$$localhost);
        deflexical("*AGENT-MGR-PORT*", $int$4444);
        deflexical("*AGENT-MGR-SOCKET*", NIL);
        deflexical("*API-SERVICE-AGENT-NAME*", NIL);
        deflexical("*AGENT-RECEIVED-MESSAGE-HANDLER*", SubLTrampolineFile.maybeDefault($agent_received_message_handler$, $agent_received_message_handler$, NIL));
        return NIL;
    }

    static private final SubLString $str_alt4$cyc_api_service_ = makeString("cyc-api-service-");

    static private final SubLString $str_alt5$Agent_received_message_handler = makeString("Agent received-message handler");

    public static SubLObject setup_agent_manager_file() {
        declare_defglobal($agent_received_message_handler$);
        return NIL;
    }

    static private final SubLString $str_alt9$fipa_transport_message = makeString("fipa-transport-message");

    @Override
    public void declareFunctions() {
        declare_agent_manager_file();
    }

    static private final SubLString $str_alt10$__Received_fipa_transport_message = makeString("~%Received fipa-transport-message~%~S");

    @Override
    public void initializeVariables() {
        init_agent_manager_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_agent_manager_file();
    }

    static private final SubLString $str_alt11$Agent_received_message_handler_pr = makeString("Agent received-message handler process ended");

    static {
    }

    static private final SubLString $str_alt13$cyc_echo_ = makeString("cyc-echo-");

    static private final SubLString $str_alt33$__envelope___S = makeString("~%envelope~%~S");
}

/**
 * Total time: 70 ms
 */
