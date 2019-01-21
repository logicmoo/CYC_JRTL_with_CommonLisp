package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class missing_knowledge_discovery_events extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.missing_knowledge_discovery_events";
    public static final String myFingerPrint = "ae9c837e6a8379f5eddeaccdd4066d1148a7ea7dd38a5a9c532d598c873b5947";
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 1340L)
    public static SubLSymbol $unlexified_term_discovery_logging$;
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2612L)
    private static SubLSymbol $missing_knowledge_discovery_event_dispatcher_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2612L)
    private static SubLSymbol $missing_knowledge_discovery_event_dispatcher_listeners$;
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 3894L)
    private static SubLSymbol $unlexified_term_discovery_event_listener$;
    private static final SubLSymbol $kw0$MISSING_KNOWLEDGE_DISCOVERY_EVENT;
    private static final SubLSymbol $kw1$CYC_APPLICATION_EVENT;
    private static final SubLSymbol $kw2$UNLEXIFIED_TERM_DISCOVERY_EVENT;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLString $str6$MISSING_KNOWLEDGE_DISCOVERY_EVENT;
    private static final SubLSymbol $sym7$_MISSING_KNOWLEDGE_DISCOVERY_EVENT_DISPATCHER_LISTENERS_;
    private static final SubLSymbol $sym8$UNLEXIFIED_TERM_DISCOVERY_EVENT_ACTION;
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 1600L)
    public static SubLObject log_unlexified_term_discovery() {
        missing_knowledge_discovery_events.$unlexified_term_discovery_logging$.setDynamicValue((SubLObject)missing_knowledge_discovery_events.T);
        return unlexified_term_discovery_logging_requestedP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 1793L)
    public static SubLObject dont_log_unlexified_term_discovery() {
        missing_knowledge_discovery_events.$unlexified_term_discovery_logging$.setDynamicValue((SubLObject)missing_knowledge_discovery_events.NIL);
        return unlexified_term_discovery_logging_requestedP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 1994L)
    public static SubLObject unlexified_term_discovery_logging_requestedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return missing_knowledge_discovery_events.$unlexified_term_discovery_logging$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2168L)
    public static SubLObject with_unlexified_term_discovery_logging(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)missing_knowledge_discovery_events.$sym3$CLET, (SubLObject)missing_knowledge_discovery_events.$list4, ConsesLow.append(body, (SubLObject)missing_knowledge_discovery_events.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2384L)
    public static SubLObject without_unlexified_term_discovery_logging(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)missing_knowledge_discovery_events.$sym3$CLET, (SubLObject)missing_knowledge_discovery_events.$list5, ConsesLow.append(body, (SubLObject)missing_knowledge_discovery_events.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2612L)
    public static SubLObject missing_knowledge_discovery_event_dispatcher_runningP() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p((SubLObject)missing_knowledge_discovery_events.$sym7$_MISSING_KNOWLEDGE_DISCOVERY_EVENT_DISPATCHER_LISTENERS_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2612L)
    public static SubLObject ensure_missing_knowledge_discovery_event_dispatcher_running() {
        if (missing_knowledge_discovery_events.NIL == missing_knowledge_discovery_event_dispatcher_runningP()) {
            start_missing_knowledge_discovery_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2612L)
    public static SubLObject register_listener_with_missing_knowledge_discovery_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = (SubLObject)missing_knowledge_discovery_events.NIL;
        try {
            release = Locks.seize_lock(missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue());
            if (missing_knowledge_discovery_events.NIL == Sequences.find(listener_var, missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue(), (SubLObject)missing_knowledge_discovery_events.EQUALP, (SubLObject)missing_knowledge_discovery_events.UNPROVIDED, (SubLObject)missing_knowledge_discovery_events.UNPROVIDED, (SubLObject)missing_knowledge_discovery_events.UNPROVIDED)) {
                missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_listeners$.setGlobalValue((SubLObject)ConsesLow.cons(listener_var, missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue()));
                if (missing_knowledge_discovery_events.NIL != missing_knowledge_discovery_event_dispatcher_runningP()) {
                    event_broker.register_event_listener(listener_var, (SubLObject)missing_knowledge_discovery_events.NIL);
                }
            }
        }
        finally {
            if (missing_knowledge_discovery_events.NIL != release) {
                Locks.release_lock(missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2612L)
    public static SubLObject deregister_listener_with_missing_knowledge_discovery_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = (SubLObject)missing_knowledge_discovery_events.NIL;
        try {
            release = Locks.seize_lock(missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue());
            missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_listeners$.setGlobalValue(Sequences.remove(listener_var, missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue(), (SubLObject)missing_knowledge_discovery_events.EQUALP, (SubLObject)missing_knowledge_discovery_events.UNPROVIDED, (SubLObject)missing_knowledge_discovery_events.UNPROVIDED, (SubLObject)missing_knowledge_discovery_events.UNPROVIDED, (SubLObject)missing_knowledge_discovery_events.UNPROVIDED));
            if (missing_knowledge_discovery_events.NIL != missing_knowledge_discovery_event_dispatcher_runningP()) {
                event_broker.deregister_event_listener(listener_var, (SubLObject)missing_knowledge_discovery_events.NIL);
            }
        }
        finally {
            if (missing_knowledge_discovery_events.NIL != release) {
                Locks.release_lock(missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2612L)
    public static SubLObject stop_missing_knowledge_discovery_event_dispatcher() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application((SubLObject)missing_knowledge_discovery_events.$sym7$_MISSING_KNOWLEDGE_DISCOVERY_EVENT_DISPATCHER_LISTENERS_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 2612L)
    public static SubLObject start_missing_knowledge_discovery_event_dispatcher() {
        return event_utilities.start_generic_event_dispatcher_process_for_application((SubLObject)missing_knowledge_discovery_events.$sym7$_MISSING_KNOWLEDGE_DISCOVERY_EVENT_DISPATCHER_LISTENERS_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 3003L)
    public static SubLObject post_unlexified_term_discovery_event(final SubLObject v_term, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject predicates) {
        if (missing_knowledge_discovery_events.NIL != unlexified_term_discovery_event_posting_requestedP()) {
            event_broker.post_event(new_unlexified_term_discovery_event((SubLObject)ConsesLow.list(v_term, language_mt, domain_mt, predicates)), missing_knowledge_discovery_event_broker());
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 3327L)
    public static SubLObject new_unlexified_term_discovery_event(final SubLObject v_term) {
        return event_model.new_event((SubLObject)missing_knowledge_discovery_events.$kw2$UNLEXIFIED_TERM_DISCOVERY_EVENT, v_term, html_kernel.http_state_key_for_request());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 3493L)
    public static SubLObject missing_knowledge_discovery_event_broker() {
        return event_broker.core_event_broker();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/missing-knowledge-discovery-events.lisp", position = 3583L)
    public static SubLObject unlexified_term_discovery_event_posting_requestedP() {
        if (missing_knowledge_discovery_events.NIL != system_info.cycorp_execution_context_p() && missing_knowledge_discovery_events.NIL != control_vars.lexicon_initialized_p() && missing_knowledge_discovery_events.NIL != unlexified_term_discovery_logging_requestedP()) {
            ensure_missing_knowledge_discovery_event_dispatcher_running();
            return (SubLObject)missing_knowledge_discovery_events.T;
        }
        return (SubLObject)missing_knowledge_discovery_events.NIL;
    }
    
    public static SubLObject declare_missing_knowledge_discovery_events_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "log_unlexified_term_discovery", "LOG-UNLEXIFIED-TERM-DISCOVERY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "dont_log_unlexified_term_discovery", "DONT-LOG-UNLEXIFIED-TERM-DISCOVERY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "unlexified_term_discovery_logging_requestedP", "UNLEXIFIED-TERM-DISCOVERY-LOGGING-REQUESTED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "with_unlexified_term_discovery_logging", "WITH-UNLEXIFIED-TERM-DISCOVERY-LOGGING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "without_unlexified_term_discovery_logging", "WITHOUT-UNLEXIFIED-TERM-DISCOVERY-LOGGING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "missing_knowledge_discovery_event_dispatcher_runningP", "MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-RUNNING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "ensure_missing_knowledge_discovery_event_dispatcher_running", "ENSURE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "register_listener_with_missing_knowledge_discovery_event_dispatcher", "REGISTER-LISTENER-WITH-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "deregister_listener_with_missing_knowledge_discovery_event_dispatcher", "DEREGISTER-LISTENER-WITH-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "stop_missing_knowledge_discovery_event_dispatcher", "STOP-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "start_missing_knowledge_discovery_event_dispatcher", "START-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "post_unlexified_term_discovery_event", "POST-UNLEXIFIED-TERM-DISCOVERY-EVENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "new_unlexified_term_discovery_event", "NEW-UNLEXIFIED-TERM-DISCOVERY-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "missing_knowledge_discovery_event_broker", "MISSING-KNOWLEDGE-DISCOVERY-EVENT-BROKER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.missing_knowledge_discovery_events", "unlexified_term_discovery_event_posting_requestedP", "UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING-REQUESTED?", 0, 0, false);
        return (SubLObject)missing_knowledge_discovery_events.NIL;
    }
    
    public static SubLObject init_missing_knowledge_discovery_events_file() {
        missing_knowledge_discovery_events.$unlexified_term_discovery_logging$ = SubLFiles.defparameter("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*", (SubLObject)missing_knowledge_discovery_events.NIL);
        missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_lock$ = SubLFiles.deflexical("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LOCK*", Locks.make_lock((SubLObject)missing_knowledge_discovery_events.$str6$MISSING_KNOWLEDGE_DISCOVERY_EVENT));
        missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_listeners$ = SubLFiles.deflexical("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LISTENERS*", (SubLObject)((missing_knowledge_discovery_events.NIL != Symbols.boundp((SubLObject)missing_knowledge_discovery_events.$sym7$_MISSING_KNOWLEDGE_DISCOVERY_EVENT_DISPATCHER_LISTENERS_)) ? missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue() : missing_knowledge_discovery_events.NIL));
        missing_knowledge_discovery_events.$unlexified_term_discovery_event_listener$ = SubLFiles.deflexical("*UNLEXIFIED-TERM-DISCOVERY-EVENT-LISTENER*", event_broker.describe_funcall_listener((SubLObject)missing_knowledge_discovery_events.$kw2$UNLEXIFIED_TERM_DISCOVERY_EVENT, (SubLObject)missing_knowledge_discovery_events.$sym8$UNLEXIFIED_TERM_DISCOVERY_EVENT_ACTION, (SubLObject)missing_knowledge_discovery_events.UNPROVIDED, (SubLObject)missing_knowledge_discovery_events.UNPROVIDED));
        return (SubLObject)missing_knowledge_discovery_events.NIL;
    }
    
    public static SubLObject setup_missing_knowledge_discovery_events_file() {
        event_model.register_event_class((SubLObject)missing_knowledge_discovery_events.$kw0$MISSING_KNOWLEDGE_DISCOVERY_EVENT, (SubLObject)missing_knowledge_discovery_events.$kw1$CYC_APPLICATION_EVENT, (SubLObject)missing_knowledge_discovery_events.NIL);
        event_model.register_event_class((SubLObject)missing_knowledge_discovery_events.$kw2$UNLEXIFIED_TERM_DISCOVERY_EVENT, (SubLObject)missing_knowledge_discovery_events.$kw0$MISSING_KNOWLEDGE_DISCOVERY_EVENT, (SubLObject)missing_knowledge_discovery_events.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)missing_knowledge_discovery_events.$sym7$_MISSING_KNOWLEDGE_DISCOVERY_EVENT_DISPATCHER_LISTENERS_);
        register_listener_with_missing_knowledge_discovery_event_dispatcher(missing_knowledge_discovery_events.$unlexified_term_discovery_event_listener$.getGlobalValue());
        return (SubLObject)missing_knowledge_discovery_events.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_missing_knowledge_discovery_events_file();
    }
    
    @Override
	public void initializeVariables() {
        init_missing_knowledge_discovery_events_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_missing_knowledge_discovery_events_file();
    }
    
    static {
        me = (SubLFile)new missing_knowledge_discovery_events();
        missing_knowledge_discovery_events.$unlexified_term_discovery_logging$ = null;
        missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_lock$ = null;
        missing_knowledge_discovery_events.$missing_knowledge_discovery_event_dispatcher_listeners$ = null;
        missing_knowledge_discovery_events.$unlexified_term_discovery_event_listener$ = null;
        $kw0$MISSING_KNOWLEDGE_DISCOVERY_EVENT = SubLObjectFactory.makeKeyword("MISSING-KNOWLEDGE-DISCOVERY-EVENT");
        $kw1$CYC_APPLICATION_EVENT = SubLObjectFactory.makeKeyword("CYC-APPLICATION-EVENT");
        $kw2$UNLEXIFIED_TERM_DISCOVERY_EVENT = SubLObjectFactory.makeKeyword("UNLEXIFIED-TERM-DISCOVERY-EVENT");
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*"), (SubLObject)missing_knowledge_discovery_events.T));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*"), (SubLObject)missing_knowledge_discovery_events.NIL));
        $str6$MISSING_KNOWLEDGE_DISCOVERY_EVENT = SubLObjectFactory.makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER Lock");
        $sym7$_MISSING_KNOWLEDGE_DISCOVERY_EVENT_DISPATCHER_LISTENERS_ = SubLObjectFactory.makeSymbol("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LISTENERS*");
        $sym8$UNLEXIFIED_TERM_DISCOVERY_EVENT_ACTION = SubLObjectFactory.makeSymbol("UNLEXIFIED-TERM-DISCOVERY-EVENT-ACTION");
    }
}

/*

	Total time: 83 ms
	
*/