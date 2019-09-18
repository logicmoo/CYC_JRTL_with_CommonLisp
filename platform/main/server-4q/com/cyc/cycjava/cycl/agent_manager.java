package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class agent_manager extends SubLTranslatedFile {
    public static final SubLFile me = new agent_manager();

    public static final String myName = "com.cyc.cycjava.cycl.agent_manager";

    public static final String myFingerPrint = "53523eb0f25fa74d9327ccbafc2ff75af4e5afdc3db1a1eb662777ccd0db96c1";

    // deflexical
    public static final SubLSymbol $agent_mgr_host$ = makeSymbol("*AGENT-MGR-HOST*");

    // deflexical
    public static final SubLSymbol $agent_mgr_port$ = makeSymbol("*AGENT-MGR-PORT*");

    // deflexical
    /**
     * Persistent bidirectional connection to the agent manager over which
     * fipa-transport-messages are asychronously sent and received.
     */
    public static final SubLSymbol $agent_mgr_socket$ = makeSymbol("*AGENT-MGR-SOCKET*");

    // deflexical
    /**
     * The agent name (as a symbol) of this Cyc api service within the agent
     * community.
     */
    public static final SubLSymbol $api_service_agent_name$ = makeSymbol("*API-SERVICE-AGENT-NAME*");



    // Internal Constants
    public static final SubLString $$$localhost = makeString("localhost");

    private static final SubLInteger $int$4444 = makeInteger(4444);

    public static final SubLSymbol $agent_received_message_handler$ = makeSymbol("*AGENT-RECEIVED-MESSAGE-HANDLER*");

    public static final SubLSymbol CYC_TO_AGENT_MANAGER_INIT = makeSymbol("CYC-TO-AGENT-MANAGER-INIT");

    public static final SubLString $str4$cyc_api_service_ = makeString("cyc-api-service-");

    public static final SubLString $str5$Agent_received_message_handler = makeString("Agent received-message handler");

    public static final SubLSymbol AGENT_RECEIVED_MESSSAGE_HANDLER = makeSymbol("AGENT-RECEIVED-MESSSAGE-HANDLER");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    public static final SubLString $str9$fipa_transport_message = makeString("fipa-transport-message");

    public static final SubLString $str10$__Received_fipa_transport_message = makeString("~%Received fipa-transport-message~%~S");

    public static final SubLString $str11$Agent_received_message_handler_pr = makeString("Agent received-message handler process ended");



    public static final SubLString $str13$cyc_echo_ = makeString("cyc-echo-");

    public static final SubLSymbol INFORM = makeSymbol("INFORM");



    public static final SubLSymbol AGENT_IDENTIFIER = makeSymbol("AGENT-IDENTIFIER");















    private static final SubLSymbol $CYC_API_SERVICE_ECHO = makeKeyword("CYC-API-SERVICE-ECHO");





    public static final SubLSymbol ENVELOPE = makeSymbol("ENVELOPE");







    private static final SubLSymbol $X_AGENT_COMMUNITY = makeKeyword("X-AGENT-COMMUNITY");



    public static final SubLString $str33$__envelope___S = makeString("~%envelope~%~S");

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

    public static SubLObject agent_send_message(final SubLObject message) {
        cfasl_output(message, $agent_mgr_socket$.getGlobalValue());
        force_output($agent_mgr_socket$.getGlobalValue());
        return NIL;
    }

    public static SubLObject start_agent_received_message_handler() {
        if (NIL != $agent_received_message_handler$.getGlobalValue()) {
            halt_agent_received_message_handler();
        }
        $agent_received_message_handler$.setGlobalValue(make_process($str5$Agent_received_message_handler, symbol_function(AGENT_RECEIVED_MESSSAGE_HANDLER)));
        return NIL;
    }

    public static SubLObject halt_agent_received_message_handler() {
        if (NIL != $agent_received_message_handler$.getGlobalValue()) {
            kill_process($agent_received_message_handler$.getGlobalValue());
            $agent_received_message_handler$.setGlobalValue(NIL);
        }
        return NIL;
    }

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

    public static SubLObject agent_echo(final SubLObject content) {
        assert NIL != listp(content) : "Types.listp(content) " + "CommonSymbols.NIL != Types.listp(content) " + content;
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
        declareFunction(me, "initialize_agent_manager_connection", "INITIALIZE-AGENT-MANAGER-CONNECTION", 0, 0, false);
        declareFunction(me, "agent_send_message", "AGENT-SEND-MESSAGE", 1, 0, false);
        declareFunction(me, "start_agent_received_message_handler", "START-AGENT-RECEIVED-MESSAGE-HANDLER", 0, 0, false);
        declareFunction(me, "halt_agent_received_message_handler", "HALT-AGENT-RECEIVED-MESSAGE-HANDLER", 0, 0, false);
        declareFunction(me, "agent_received_messsage_handler", "AGENT-RECEIVED-MESSSAGE-HANDLER", 0, 0, false);
        declareFunction(me, "agent_echo", "AGENT-ECHO", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_agent_manager_file() {
        deflexical("*AGENT-MGR-HOST*", $$$localhost);
        deflexical("*AGENT-MGR-PORT*", $int$4444);
        deflexical("*AGENT-MGR-SOCKET*", NIL);
        deflexical("*API-SERVICE-AGENT-NAME*", NIL);
        deflexical("*AGENT-RECEIVED-MESSAGE-HANDLER*", SubLSystemTrampolineFile.maybeDefault($agent_received_message_handler$, $agent_received_message_handler$, NIL));
        return NIL;
    }

    public static SubLObject setup_agent_manager_file() {
        declare_defglobal($agent_received_message_handler$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_agent_manager_file();
    }

    @Override
    public void initializeVariables() {
        init_agent_manager_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_agent_manager_file();
    }

    
}

/**
 * Total time: 70 ms
 */
