package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class agent_manager extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.agent_manager";
    public static final String myFingerPrint = "53523eb0f25fa74d9327ccbafc2ff75af4e5afdc3db1a1eb662777ccd0db96c1";
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 681L)
    public static SubLSymbol $agent_mgr_host$;
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 865L)
    public static SubLSymbol $agent_mgr_port$;
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 963L)
    public static SubLSymbol $agent_mgr_socket$;
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 1140L)
    public static SubLSymbol $api_service_agent_name$;
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 1275L)
    private static SubLSymbol $agent_received_message_handler$;
    private static final SubLString $str0$localhost;
    private static final SubLInteger $int1$4444;
    private static final SubLSymbol $sym2$_AGENT_RECEIVED_MESSAGE_HANDLER_;
    private static final SubLSymbol $sym3$CYC_TO_AGENT_MANAGER_INIT;
    private static final SubLString $str4$cyc_api_service_;
    private static final SubLString $str5$Agent_received_message_handler;
    private static final SubLSymbol $sym6$AGENT_RECEIVED_MESSSAGE_HANDLER;
    private static final SubLSymbol $kw7$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym8$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str9$fipa_transport_message;
    private static final SubLString $str10$__Received_fipa_transport_message;
    private static final SubLString $str11$Agent_received_message_handler_pr;
    private static final SubLSymbol $sym12$LISTP;
    private static final SubLString $str13$cyc_echo_;
    private static final SubLSymbol $sym14$INFORM;
    private static final SubLSymbol $kw15$SENDER;
    private static final SubLSymbol $sym16$AGENT_IDENTIFIER;
    private static final SubLSymbol $kw17$NAME;
    private static final SubLSymbol $kw18$RECEIVER;
    private static final SubLSymbol $sym19$SET;
    private static final SubLSymbol $kw20$CONTENT;
    private static final SubLSymbol $kw21$LANGUAGE;
    private static final SubLSymbol $kw22$CYCL;
    private static final SubLSymbol $kw23$ONTOLOGY;
    private static final SubLSymbol $kw24$CYC_API_SERVICE_ECHO;
    private static final SubLSymbol $kw25$PROTOCOL;
    private static final SubLSymbol $kw26$FIPA_INFORM;
    private static final SubLSymbol $sym27$ENVELOPE;
    private static final SubLSymbol $kw28$TO;
    private static final SubLSymbol $kw29$FROM;
    private static final SubLSymbol $kw30$DATE;
    private static final SubLSymbol $kw31$X_AGENT_COMMUNITY;
    private static final SubLSymbol $kw32$COABS;
    private static final SubLString $str33$__envelope___S;
    
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 1342L)
    public static SubLObject initialize_agent_manager_connection() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)agent_manager.$sym3$CYC_TO_AGENT_MANAGER_INIT, control_vars.cyc_image_id(), system_parameters.$base_tcp_port$.getDynamicValue(thread));
        agent_manager.$agent_mgr_socket$.setGlobalValue((SubLObject)agent_manager.NIL);
        agent_manager.$agent_mgr_socket$.setGlobalValue(subl_promotions.open_tcp_stream_with_timeout(agent_manager.$agent_mgr_host$.getGlobalValue(), agent_manager.$agent_mgr_port$.getGlobalValue(), (SubLObject)agent_manager.UNPROVIDED, (SubLObject)agent_manager.UNPROVIDED));
        agent_send_message(message);
        agent_manager.$api_service_agent_name$.setGlobalValue(Packages.intern(Sequences.cconcatenate((SubLObject)agent_manager.$str4$cyc_api_service_, control_vars.cyc_image_id()), (SubLObject)agent_manager.UNPROVIDED));
        start_agent_received_message_handler();
        return (SubLObject)agent_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 2011L)
    public static SubLObject agent_send_message(final SubLObject message) {
        cfasl.cfasl_output(message, agent_manager.$agent_mgr_socket$.getGlobalValue());
        streams_high.force_output(agent_manager.$agent_mgr_socket$.getGlobalValue());
        return (SubLObject)agent_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 2211L)
    public static SubLObject start_agent_received_message_handler() {
        if (agent_manager.NIL != agent_manager.$agent_received_message_handler$.getGlobalValue()) {
            halt_agent_received_message_handler();
        }
        agent_manager.$agent_received_message_handler$.setGlobalValue(Threads.make_process((SubLObject)agent_manager.$str5$Agent_received_message_handler, Symbols.symbol_function((SubLObject)agent_manager.$sym6$AGENT_RECEIVED_MESSSAGE_HANDLER)));
        return (SubLObject)agent_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 2493L)
    public static SubLObject halt_agent_received_message_handler() {
        if (agent_manager.NIL != agent_manager.$agent_received_message_handler$.getGlobalValue()) {
            Threads.kill_process(agent_manager.$agent_received_message_handler$.getGlobalValue());
            agent_manager.$agent_received_message_handler$.setGlobalValue((SubLObject)agent_manager.NIL);
        }
        return (SubLObject)agent_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 2706L)
    public static SubLObject agent_received_messsage_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fipa_transport_message = (SubLObject)agent_manager.NIL;
        SubLObject ignore_errors_tag = (SubLObject)agent_manager.NIL;
        try {
            thread.throwStack.push(agent_manager.$kw7$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)agent_manager.$sym8$IGNORE_ERRORS_HANDLER), thread);
                try {
                    try {
                        while (true) {
                            fipa_transport_message = cfasl.cfasl_input(agent_manager.$agent_mgr_socket$.getGlobalValue(), (SubLObject)agent_manager.NIL, (SubLObject)agent_manager.UNPROVIDED);
                            eval_in_api.trace_me((SubLObject)agent_manager.$str9$fipa_transport_message, fipa_transport_message, (SubLObject)agent_manager.UNPROVIDED, (SubLObject)agent_manager.UNPROVIDED);
                            PrintLow.format((SubLObject)agent_manager.NIL, (SubLObject)agent_manager.$str10$__Received_fipa_transport_message, fipa_transport_message);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)agent_manager.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            halt_agent_received_message_handler();
                            PrintLow.format((SubLObject)agent_manager.NIL, (SubLObject)agent_manager.$str11$Agent_received_message_handler_pr);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                }
                catch (Throwable t) {}
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)agent_manager.$kw7$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)agent_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agent-manager.lisp", position = 3342L)
    public static SubLObject agent_echo(final SubLObject content) {
        assert agent_manager.NIL != Types.listp(content) : content;
        SubLObject envelope = (SubLObject)agent_manager.NIL;
        SubLObject payload = (SubLObject)agent_manager.NIL;
        SubLObject amp = (SubLObject)agent_manager.NIL;
        SubLObject fipa_transport_message = (SubLObject)agent_manager.NIL;
        SubLObject echo_agent_name = (SubLObject)agent_manager.NIL;
        echo_agent_name = Packages.intern(Sequences.cconcatenate((SubLObject)agent_manager.$str13$cyc_echo_, control_vars.cyc_image_id()), (SubLObject)agent_manager.UNPROVIDED);
        amp = (SubLObject)ConsesLow.list(new SubLObject[] { agent_manager.$sym14$INFORM, agent_manager.$kw15$SENDER, ConsesLow.list((SubLObject)agent_manager.$sym16$AGENT_IDENTIFIER, (SubLObject)agent_manager.$kw17$NAME, echo_agent_name), agent_manager.$kw18$RECEIVER, ConsesLow.list((SubLObject)agent_manager.$sym19$SET, (SubLObject)ConsesLow.list((SubLObject)agent_manager.$sym16$AGENT_IDENTIFIER, (SubLObject)agent_manager.$kw17$NAME, echo_agent_name)), agent_manager.$kw20$CONTENT, content, agent_manager.$kw21$LANGUAGE, agent_manager.$kw22$CYCL, agent_manager.$kw23$ONTOLOGY, agent_manager.$kw24$CYC_API_SERVICE_ECHO, agent_manager.$kw25$PROTOCOL, agent_manager.$kw26$FIPA_INFORM });
        payload = agent_manager_protocol.create_fipa_payload(amp);
        envelope = (SubLObject)ConsesLow.list(new SubLObject[] { agent_manager.$sym27$ENVELOPE, agent_manager.$kw28$TO, echo_agent_name, agent_manager.$kw29$FROM, echo_agent_name, agent_manager.$kw30$DATE, Time.get_universal_time(), agent_manager.$kw31$X_AGENT_COMMUNITY, agent_manager.$kw32$COABS });
        PrintLow.format((SubLObject)agent_manager.NIL, (SubLObject)agent_manager.$str33$__envelope___S, envelope);
        fipa_transport_message = agent_manager_protocol.create_fipa_transport_message(envelope, payload);
        agent_send_message(fipa_transport_message);
        return (SubLObject)agent_manager.NIL;
    }
    
    public static SubLObject declare_agent_manager_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agent_manager", "initialize_agent_manager_connection", "INITIALIZE-AGENT-MANAGER-CONNECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agent_manager", "agent_send_message", "AGENT-SEND-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agent_manager", "start_agent_received_message_handler", "START-AGENT-RECEIVED-MESSAGE-HANDLER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agent_manager", "halt_agent_received_message_handler", "HALT-AGENT-RECEIVED-MESSAGE-HANDLER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agent_manager", "agent_received_messsage_handler", "AGENT-RECEIVED-MESSSAGE-HANDLER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agent_manager", "agent_echo", "AGENT-ECHO", 1, 0, false);
        return (SubLObject)agent_manager.NIL;
    }
    
    public static SubLObject init_agent_manager_file() {
        agent_manager.$agent_mgr_host$ = SubLFiles.deflexical("*AGENT-MGR-HOST*", (SubLObject)agent_manager.$str0$localhost);
        agent_manager.$agent_mgr_port$ = SubLFiles.deflexical("*AGENT-MGR-PORT*", (SubLObject)agent_manager.$int1$4444);
        agent_manager.$agent_mgr_socket$ = SubLFiles.deflexical("*AGENT-MGR-SOCKET*", (SubLObject)agent_manager.NIL);
        agent_manager.$api_service_agent_name$ = SubLFiles.deflexical("*API-SERVICE-AGENT-NAME*", (SubLObject)agent_manager.NIL);
        agent_manager.$agent_received_message_handler$ = SubLFiles.deflexical("*AGENT-RECEIVED-MESSAGE-HANDLER*", (SubLObject)((agent_manager.NIL != Symbols.boundp((SubLObject)agent_manager.$sym2$_AGENT_RECEIVED_MESSAGE_HANDLER_)) ? agent_manager.$agent_received_message_handler$.getGlobalValue() : agent_manager.NIL));
        return (SubLObject)agent_manager.NIL;
    }
    
    public static SubLObject setup_agent_manager_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)agent_manager.$sym2$_AGENT_RECEIVED_MESSAGE_HANDLER_);
        return (SubLObject)agent_manager.NIL;
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
    
    static {
        me = (SubLFile)new agent_manager();
        agent_manager.$agent_mgr_host$ = null;
        agent_manager.$agent_mgr_port$ = null;
        agent_manager.$agent_mgr_socket$ = null;
        agent_manager.$api_service_agent_name$ = null;
        agent_manager.$agent_received_message_handler$ = null;
        $str0$localhost = SubLObjectFactory.makeString("localhost");
        $int1$4444 = SubLObjectFactory.makeInteger(4444);
        $sym2$_AGENT_RECEIVED_MESSAGE_HANDLER_ = SubLObjectFactory.makeSymbol("*AGENT-RECEIVED-MESSAGE-HANDLER*");
        $sym3$CYC_TO_AGENT_MANAGER_INIT = SubLObjectFactory.makeSymbol("CYC-TO-AGENT-MANAGER-INIT");
        $str4$cyc_api_service_ = SubLObjectFactory.makeString("cyc-api-service-");
        $str5$Agent_received_message_handler = SubLObjectFactory.makeString("Agent received-message handler");
        $sym6$AGENT_RECEIVED_MESSSAGE_HANDLER = SubLObjectFactory.makeSymbol("AGENT-RECEIVED-MESSSAGE-HANDLER");
        $kw7$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym8$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str9$fipa_transport_message = SubLObjectFactory.makeString("fipa-transport-message");
        $str10$__Received_fipa_transport_message = SubLObjectFactory.makeString("~%Received fipa-transport-message~%~S");
        $str11$Agent_received_message_handler_pr = SubLObjectFactory.makeString("Agent received-message handler process ended");
        $sym12$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str13$cyc_echo_ = SubLObjectFactory.makeString("cyc-echo-");
        $sym14$INFORM = SubLObjectFactory.makeSymbol("INFORM");
        $kw15$SENDER = SubLObjectFactory.makeKeyword("SENDER");
        $sym16$AGENT_IDENTIFIER = SubLObjectFactory.makeSymbol("AGENT-IDENTIFIER");
        $kw17$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw18$RECEIVER = SubLObjectFactory.makeKeyword("RECEIVER");
        $sym19$SET = SubLObjectFactory.makeSymbol("SET");
        $kw20$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $kw21$LANGUAGE = SubLObjectFactory.makeKeyword("LANGUAGE");
        $kw22$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw23$ONTOLOGY = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $kw24$CYC_API_SERVICE_ECHO = SubLObjectFactory.makeKeyword("CYC-API-SERVICE-ECHO");
        $kw25$PROTOCOL = SubLObjectFactory.makeKeyword("PROTOCOL");
        $kw26$FIPA_INFORM = SubLObjectFactory.makeKeyword("FIPA-INFORM");
        $sym27$ENVELOPE = SubLObjectFactory.makeSymbol("ENVELOPE");
        $kw28$TO = SubLObjectFactory.makeKeyword("TO");
        $kw29$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw30$DATE = SubLObjectFactory.makeKeyword("DATE");
        $kw31$X_AGENT_COMMUNITY = SubLObjectFactory.makeKeyword("X-AGENT-COMMUNITY");
        $kw32$COABS = SubLObjectFactory.makeKeyword("COABS");
        $str33$__envelope___S = SubLObjectFactory.makeString("~%envelope~%~S");
    }
}

/*

	Total time: 70 ms
	
*/