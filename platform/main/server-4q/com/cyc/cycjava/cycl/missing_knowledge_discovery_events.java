/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.lexicon_initialized_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class missing_knowledge_discovery_events extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new missing_knowledge_discovery_events();



    // defparameter
    // Definitions
    // Gate variable to control whether unlexified terms get logged.
    /**
     * Gate variable to control whether unlexified terms get logged.
     */
    @LispMethod(comment = "Gate variable to control whether unlexified terms get logged.\ndefparameter")
    public static final SubLSymbol $unlexified_term_discovery_logging$ = makeSymbol("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $missing_knowledge_discovery_event_dispatcher_lock$ = makeSymbol("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $unlexified_term_discovery_event_listener$ = makeSymbol("*UNLEXIFIED-TERM-DISCOVERY-EVENT-LISTENER*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $MISSING_KNOWLEDGE_DISCOVERY_EVENT = makeKeyword("MISSING-KNOWLEDGE-DISCOVERY-EVENT");

    private static final SubLSymbol $CYC_APPLICATION_EVENT = makeKeyword("CYC-APPLICATION-EVENT");

    private static final SubLSymbol $UNLEXIFIED_TERM_DISCOVERY_EVENT = makeKeyword("UNLEXIFIED-TERM-DISCOVERY-EVENT");

    static private final SubLList $list4 = list(list(makeSymbol("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*"), T));

    static private final SubLList $list5 = list(list(makeSymbol("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*"), NIL));

    static private final SubLString $str6$MISSING_KNOWLEDGE_DISCOVERY_EVENT = makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER Lock");

    public static final SubLSymbol $missing_knowledge_discovery_event_dispatcher_listeners$ = makeSymbol("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LISTENERS*");

    private static final SubLSymbol UNLEXIFIED_TERM_DISCOVERY_EVENT_ACTION = makeSymbol("UNLEXIFIED-TERM-DISCOVERY-EVENT-ACTION");

    /**
     * Turn on logging of unlexified terms.
     */
    @LispMethod(comment = "Turn on logging of unlexified terms.")
    public static final SubLObject log_unlexified_term_discovery_alt() {
        $unlexified_term_discovery_logging$.setDynamicValue(T);
        return com.cyc.cycjava.cycl.missing_knowledge_discovery_events.unlexified_term_discovery_logging_requestedP();
    }

    /**
     * Turn on logging of unlexified terms.
     */
    @LispMethod(comment = "Turn on logging of unlexified terms.")
    public static SubLObject log_unlexified_term_discovery() {
        $unlexified_term_discovery_logging$.setDynamicValue(T);
        return unlexified_term_discovery_logging_requestedP();
    }

    /**
     * Turn off logging of unlexified terms.
     */
    @LispMethod(comment = "Turn off logging of unlexified terms.")
    public static final SubLObject dont_log_unlexified_term_discovery_alt() {
        $unlexified_term_discovery_logging$.setDynamicValue(NIL);
        return com.cyc.cycjava.cycl.missing_knowledge_discovery_events.unlexified_term_discovery_logging_requestedP();
    }

    /**
     * Turn off logging of unlexified terms.
     */
    @LispMethod(comment = "Turn off logging of unlexified terms.")
    public static SubLObject dont_log_unlexified_term_discovery() {
        $unlexified_term_discovery_logging$.setDynamicValue(NIL);
        return unlexified_term_discovery_logging_requestedP();
    }

    /**
     *
     *
     * @return BOOLEAN; Are we logging unlexified terms currently?
     */
    @LispMethod(comment = "@return BOOLEAN; Are we logging unlexified terms currently?")
    public static final SubLObject unlexified_term_discovery_logging_requestedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $unlexified_term_discovery_logging$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Are we logging unlexified terms currently?
     */
    @LispMethod(comment = "@return BOOLEAN; Are we logging unlexified terms currently?")
    public static SubLObject unlexified_term_discovery_logging_requestedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $unlexified_term_discovery_logging$.getDynamicValue(thread);
    }

    /**
     * Log any unlexified terms discovered during the execution of BODY.
     */
    @LispMethod(comment = "Log any unlexified terms discovered during the execution of BODY.")
    public static final SubLObject with_unlexified_term_discovery_logging_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt4, append(body, NIL));
        }
    }

    /**
     * Log any unlexified terms discovered during the execution of BODY.
     */
    @LispMethod(comment = "Log any unlexified terms discovered during the execution of BODY.")
    public static SubLObject with_unlexified_term_discovery_logging(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    /**
     * Do not log any unlexified terms discovered during the execution of BODY.
     */
    @LispMethod(comment = "Do not log any unlexified terms discovered during the execution of BODY.")
    public static final SubLObject without_unlexified_term_discovery_logging_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt5, append(body, NIL));
        }
    }

    @LispMethod(comment = "Do not log any unlexified terms discovered during the execution of BODY.")
    public static SubLObject without_unlexified_term_discovery_logging(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list5, append(body, NIL));
    }

    public static final SubLObject missing_knowledge_discovery_event_dispatcher_runningP_alt() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($missing_knowledge_discovery_event_dispatcher_listeners$);
    }

    public static SubLObject missing_knowledge_discovery_event_dispatcher_runningP() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($missing_knowledge_discovery_event_dispatcher_listeners$);
    }

    public static final SubLObject ensure_missing_knowledge_discovery_event_dispatcher_running_alt() {
        if (NIL == com.cyc.cycjava.cycl.missing_knowledge_discovery_events.missing_knowledge_discovery_event_dispatcher_runningP()) {
            com.cyc.cycjava.cycl.missing_knowledge_discovery_events.start_missing_knowledge_discovery_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    public static SubLObject ensure_missing_knowledge_discovery_event_dispatcher_running() {
        if (NIL == missing_knowledge_discovery_event_dispatcher_runningP()) {
            start_missing_knowledge_discovery_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    public static final SubLObject register_listener_with_missing_knowledge_discovery_event_dispatcher_alt(SubLObject listener_var) {
        {
            SubLObject lock = $missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == find(listener_var, $missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    $missing_knowledge_discovery_event_dispatcher_listeners$.setGlobalValue(cons(listener_var, $missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue()));
                    if (NIL != com.cyc.cycjava.cycl.missing_knowledge_discovery_events.missing_knowledge_discovery_event_dispatcher_runningP()) {
                        event_broker.register_event_listener(listener_var, NIL);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return listener_var;
    }

    public static SubLObject register_listener_with_missing_knowledge_discovery_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = seize_lock($missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue());
            if (NIL == find(listener_var, $missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                $missing_knowledge_discovery_event_dispatcher_listeners$.setGlobalValue(cons(listener_var, $missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue()));
                if (NIL != missing_knowledge_discovery_event_dispatcher_runningP()) {
                    event_broker.register_event_listener(listener_var, NIL);
                }
            }
        } finally {
            if (NIL != release) {
                release_lock($missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    public static final SubLObject deregister_listener_with_missing_knowledge_discovery_event_dispatcher_alt(SubLObject listener_var) {
        {
            SubLObject lock = $missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $missing_knowledge_discovery_event_dispatcher_listeners$.setGlobalValue(remove(listener_var, $missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL != com.cyc.cycjava.cycl.missing_knowledge_discovery_events.missing_knowledge_discovery_event_dispatcher_runningP()) {
                    event_broker.deregister_event_listener(listener_var, NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return listener_var;
    }

    public static SubLObject deregister_listener_with_missing_knowledge_discovery_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = seize_lock($missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue());
            $missing_knowledge_discovery_event_dispatcher_listeners$.setGlobalValue(remove(listener_var, $missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != missing_knowledge_discovery_event_dispatcher_runningP()) {
                event_broker.deregister_event_listener(listener_var, NIL);
            }
        } finally {
            if (NIL != release) {
                release_lock($missing_knowledge_discovery_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    public static final SubLObject stop_missing_knowledge_discovery_event_dispatcher_alt() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($missing_knowledge_discovery_event_dispatcher_listeners$);
    }

    public static SubLObject stop_missing_knowledge_discovery_event_dispatcher() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($missing_knowledge_discovery_event_dispatcher_listeners$);
    }

    public static final SubLObject start_missing_knowledge_discovery_event_dispatcher_alt() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($missing_knowledge_discovery_event_dispatcher_listeners$);
    }

    public static SubLObject start_missing_knowledge_discovery_event_dispatcher() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($missing_knowledge_discovery_event_dispatcher_listeners$);
    }

    public static final SubLObject post_unlexified_term_discovery_event_alt(SubLObject v_term, SubLObject language_mt, SubLObject domain_mt, SubLObject predicates) {
        if (NIL != com.cyc.cycjava.cycl.missing_knowledge_discovery_events.unlexified_term_discovery_event_posting_requestedP()) {
            event_broker.post_event(com.cyc.cycjava.cycl.missing_knowledge_discovery_events.new_unlexified_term_discovery_event(list(v_term, language_mt, domain_mt, predicates)), com.cyc.cycjava.cycl.missing_knowledge_discovery_events.missing_knowledge_discovery_event_broker());
        }
        return v_term;
    }

    public static SubLObject post_unlexified_term_discovery_event(final SubLObject v_term, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject predicates) {
        if (NIL != unlexified_term_discovery_event_posting_requestedP()) {
            event_broker.post_event(new_unlexified_term_discovery_event(list(v_term, language_mt, domain_mt, predicates)), missing_knowledge_discovery_event_broker());
        }
        return v_term;
    }

    public static final SubLObject new_unlexified_term_discovery_event_alt(SubLObject v_term) {
        return event_model.new_event($UNLEXIFIED_TERM_DISCOVERY_EVENT, v_term, html_kernel.http_state_key_for_request());
    }

    public static SubLObject new_unlexified_term_discovery_event(final SubLObject v_term) {
        return event_model.new_event($UNLEXIFIED_TERM_DISCOVERY_EVENT, v_term, html_kernel.http_state_key_for_request());
    }

    public static final SubLObject missing_knowledge_discovery_event_broker_alt() {
        return event_broker.core_event_broker();
    }

    public static SubLObject missing_knowledge_discovery_event_broker() {
        return event_broker.core_event_broker();
    }

    public static final SubLObject unlexified_term_discovery_event_posting_requestedP_alt() {
        if (((NIL != system_info.cycorp_execution_context_p()) && (NIL != lexicon_initialized_p())) && (NIL != com.cyc.cycjava.cycl.missing_knowledge_discovery_events.unlexified_term_discovery_logging_requestedP())) {
            com.cyc.cycjava.cycl.missing_knowledge_discovery_events.ensure_missing_knowledge_discovery_event_dispatcher_running();
            return T;
        }
        return NIL;
    }

    public static SubLObject unlexified_term_discovery_event_posting_requestedP() {
        if (((NIL != system_info.cycorp_execution_context_p()) && (NIL != lexicon_initialized_p())) && (NIL != unlexified_term_discovery_logging_requestedP())) {
            ensure_missing_knowledge_discovery_event_dispatcher_running();
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_missing_knowledge_discovery_events_file() {
        declareFunction("log_unlexified_term_discovery", "LOG-UNLEXIFIED-TERM-DISCOVERY", 0, 0, false);
        declareFunction("dont_log_unlexified_term_discovery", "DONT-LOG-UNLEXIFIED-TERM-DISCOVERY", 0, 0, false);
        declareFunction("unlexified_term_discovery_logging_requestedP", "UNLEXIFIED-TERM-DISCOVERY-LOGGING-REQUESTED?", 0, 0, false);
        declareMacro("with_unlexified_term_discovery_logging", "WITH-UNLEXIFIED-TERM-DISCOVERY-LOGGING");
        declareMacro("without_unlexified_term_discovery_logging", "WITHOUT-UNLEXIFIED-TERM-DISCOVERY-LOGGING");
        declareFunction("missing_knowledge_discovery_event_dispatcher_runningP", "MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-RUNNING?", 0, 0, false);
        declareFunction("ensure_missing_knowledge_discovery_event_dispatcher_running", "ENSURE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-RUNNING", 0, 0, false);
        declareFunction("register_listener_with_missing_knowledge_discovery_event_dispatcher", "REGISTER-LISTENER-WITH-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER", 1, 0, false);
        declareFunction("deregister_listener_with_missing_knowledge_discovery_event_dispatcher", "DEREGISTER-LISTENER-WITH-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER", 1, 0, false);
        declareFunction("stop_missing_knowledge_discovery_event_dispatcher", "STOP-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER", 0, 0, false);
        declareFunction("start_missing_knowledge_discovery_event_dispatcher", "START-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER", 0, 0, false);
        declareFunction("post_unlexified_term_discovery_event", "POST-UNLEXIFIED-TERM-DISCOVERY-EVENT", 4, 0, false);
        declareFunction("new_unlexified_term_discovery_event", "NEW-UNLEXIFIED-TERM-DISCOVERY-EVENT", 1, 0, false);
        declareFunction("missing_knowledge_discovery_event_broker", "MISSING-KNOWLEDGE-DISCOVERY-EVENT-BROKER", 0, 0, false);
        declareFunction("unlexified_term_discovery_event_posting_requestedP", "UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING-REQUESTED?", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_missing_knowledge_discovery_events_file_alt() {
        defparameter("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*", NIL);
        deflexical("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LOCK*", make_lock($str_alt6$MISSING_KNOWLEDGE_DISCOVERY_EVENT));
        deflexical("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LISTENERS*", NIL != boundp($missing_knowledge_discovery_event_dispatcher_listeners$) ? ((SubLObject) ($missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue())) : NIL);
        deflexical("*UNLEXIFIED-TERM-DISCOVERY-EVENT-LISTENER*", event_broker.describe_funcall_listener($UNLEXIFIED_TERM_DISCOVERY_EVENT, UNLEXIFIED_TERM_DISCOVERY_EVENT_ACTION, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_missing_knowledge_discovery_events_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*", NIL);
            deflexical("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LOCK*", make_lock($str6$MISSING_KNOWLEDGE_DISCOVERY_EVENT));
            deflexical("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LISTENERS*", SubLTrampolineFile.maybeDefault($missing_knowledge_discovery_event_dispatcher_listeners$, $missing_knowledge_discovery_event_dispatcher_listeners$, NIL));
            deflexical("*UNLEXIFIED-TERM-DISCOVERY-EVENT-LISTENER*", event_broker.describe_funcall_listener($UNLEXIFIED_TERM_DISCOVERY_EVENT, UNLEXIFIED_TERM_DISCOVERY_EVENT_ACTION, UNPROVIDED, UNPROVIDED));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LISTENERS*", NIL != boundp($missing_knowledge_discovery_event_dispatcher_listeners$) ? ((SubLObject) ($missing_knowledge_discovery_event_dispatcher_listeners$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_missing_knowledge_discovery_events_file_Previous() {
        defparameter("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*", NIL);
        deflexical("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LOCK*", make_lock($str6$MISSING_KNOWLEDGE_DISCOVERY_EVENT));
        deflexical("*MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-LISTENERS*", SubLTrampolineFile.maybeDefault($missing_knowledge_discovery_event_dispatcher_listeners$, $missing_knowledge_discovery_event_dispatcher_listeners$, NIL));
        deflexical("*UNLEXIFIED-TERM-DISCOVERY-EVENT-LISTENER*", event_broker.describe_funcall_listener($UNLEXIFIED_TERM_DISCOVERY_EVENT, UNLEXIFIED_TERM_DISCOVERY_EVENT_ACTION, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_missing_knowledge_discovery_events_file() {
        event_model.register_event_class($MISSING_KNOWLEDGE_DISCOVERY_EVENT, $CYC_APPLICATION_EVENT, NIL);
        event_model.register_event_class($UNLEXIFIED_TERM_DISCOVERY_EVENT, $MISSING_KNOWLEDGE_DISCOVERY_EVENT, NIL);
        declare_defglobal($missing_knowledge_discovery_event_dispatcher_listeners$);
        register_listener_with_missing_knowledge_discovery_event_dispatcher($unlexified_term_discovery_event_listener$.getGlobalValue());
        return NIL;
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

    static private final SubLList $list_alt4 = list(list(makeSymbol("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*"), T));

    static {
    }

    static private final SubLList $list_alt5 = list(list(makeSymbol("*UNLEXIFIED-TERM-DISCOVERY-LOGGING*"), NIL));

    static private final SubLString $str_alt6$MISSING_KNOWLEDGE_DISCOVERY_EVENT = makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER Lock");
}

/**
 * Total time: 83 ms
 */
