package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.event_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.event_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class event_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new event_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.event_utilities";

    public static final String myFingerPrint = "3b30838fbe1de9ef766645eb900981ff4d9f27bb6cfaa17c7a4fd3228b7e3b0f";







    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    public static final SubLString $str6$Must_specify_a_parent_class_ = makeString("Must specify a parent class.");

    public static final SubLSymbol REGISTER_EVENT_CLASS = makeSymbol("REGISTER-EVENT-CLASS");

    public static final SubLSymbol $generic_event_dispatcher_lock$ = makeSymbol("*GENERIC-EVENT-DISPATCHER-LOCK*");

    public static final SubLString $str9$Generic_Event_Dispatcher_Process_ = makeString("Generic Event Dispatcher Process Lock");

    public static final SubLSymbol $generic_event_dispatcher_applications$ = makeSymbol("*GENERIC-EVENT-DISPATCHER-APPLICATIONS*");

    public static final SubLSymbol $generic_event_dispatcher_process$ = makeSymbol("*GENERIC-EVENT-DISPATCHER-PROCESS*");

    public static final SubLString $$$Generic_Event_Dispatcher_Process = makeString("Generic Event Dispatcher Process");

    public static final SubLSymbol DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER = makeSymbol("DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER");



    public static final SubLList $list15 = list(list(makeSymbol("PREFIX"), makeSymbol("&KEY"), makeSymbol("BROKER"), makeSymbol("DOCSTRING"), list(makeSymbol("POSTFIX"), makeString("-EVENT-DISPATCHER"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list16 = list(makeKeyword("BROKER"), makeKeyword("DOCSTRING"), makeKeyword("POSTFIX"));





    public static final SubLString $str19$_EVENT_DISPATCHER = makeString("-EVENT-DISPATCHER");

    public static final SubLString $str20$ = makeString("");

    public static final SubLString $str21$_LOCK = makeString("-LOCK");

    public static final SubLString $$$_Lock = makeString(" Lock");

    public static final SubLString $str23$START_ = makeString("START-");

    public static final SubLString $str24$STOP_ = makeString("STOP-");

    public static final SubLString $str25$_RUNNING_ = makeString("-RUNNING?");

    public static final SubLString $str26$ENSURE_ = makeString("ENSURE-");

    public static final SubLString $str27$_RUNNING = makeString("-RUNNING");

    public static final SubLString $str28$_LISTENERS = makeString("-LISTENERS");

    public static final SubLString $str29$REGISTER_LISTENER_WITH_ = makeString("REGISTER-LISTENER-WITH-");

    public static final SubLString $str30$DEREGISTER_LISTENER_WITH_ = makeString("DEREGISTER-LISTENER-WITH-");







    public static final SubLSymbol DEFGLOBAL_PRIVATE = makeSymbol("DEFGLOBAL-PRIVATE");





    public static final SubLSymbol START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION = makeSymbol("START-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION");



    public static final SubLSymbol STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION = makeSymbol("STOP-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION");

    public static final SubLSymbol GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P = makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION-P");



    public static final SubLList $list42 = list(list(makeSymbol("RET"), list(makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS"))));

    public static final SubLSymbol $sym43$LISTENER_VAR = makeUninternedSymbol("LISTENER-VAR");





    public static final SubLList $list46 = list(list(makeSymbol("QUOTE"), EQUALP));





    public static final SubLSymbol REGISTER_EVENT_LISTENER = makeSymbol("REGISTER-EVENT-LISTENER");

    public static final SubLSymbol $sym50$LISTENER_VAR = makeUninternedSymbol("LISTENER-VAR");





    public static final SubLSymbol DEREGISTER_EVENT_LISTENER = makeSymbol("DEREGISTER-EVENT-LISTENER");

    public static final SubLString $str54$_ = makeString("*");











    public static final SubLString $str60$Unknown_privacy_level__S____not_o = makeString("Unknown privacy level ~S -- not one of :protected, :public, :private.");

    public static final SubLString $str61$_RETRIEVE_ = makeString("-RETRIEVE-");

    private static final SubLSymbol $EVENT_HANDLER_REGISTERED = makeKeyword("EVENT-HANDLER-REGISTERED");

    private static final SubLSymbol $EVENT_HANDLER_DEREGISTERED = makeKeyword("EVENT-HANDLER-DEREGISTERED");

    public static final SubLList $list64 = list(list(makeSymbol("EVENT"), makeSymbol("EVENT-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list66 = list(makeSymbol("EVENT-P"));

    public static final SubLSymbol EVENT_CLASS = makeSymbol("EVENT-CLASS");

    public static final SubLSymbol $sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_ = makeSymbol("EVENT-IS-HANDLER-REGISTRATION-EVENT?");



    public static final SubLString $str70$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");

    public static final SubLList $list71 = list(list(makeSymbol("EVENT-TYPE"), makeSymbol("SLOT-LIST"), makeSymbol("&KEY"), list(makeSymbol("PRIVACY-LEVEL"), makeKeyword("PROTECTED"))));

    public static final SubLList $list72 = list(makeKeyword("PRIVACY-LEVEL"));



    public static final SubLSymbol $sym74$EVENT = makeUninternedSymbol("EVENT");

    public static final SubLSymbol WITH_VALIDATED_EVENT_TYPE = makeSymbol("WITH-VALIDATED-EVENT-TYPE");



    public static final SubLSymbol EVENT_MESSAGE = makeSymbol("EVENT-MESSAGE");

    public static SubLObject declare_event_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_key = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        class_key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject parent_tail = property_list_member($PARENT, current);
        final SubLObject parent = (NIL != parent_tail) ? cadr(parent_tail) : NIL;
        final SubLObject docstring_tail = property_list_member($DOCSTRING, current);
        final SubLObject docstring = (NIL != docstring_tail) ? cadr(docstring_tail) : NIL;
        final SubLObject hierarchy_tail = property_list_member($HIERARCHY, current);
        final SubLObject hierarchy = (NIL != hierarchy_tail) ? cadr(hierarchy_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == parent) {
            Errors.error($str6$Must_specify_a_parent_class_);
        }
        return list(REGISTER_EVENT_CLASS, class_key, parent, hierarchy);
    }

    public static SubLObject generic_event_dispatcher_process_running_for_application_p(final SubLObject app_symbol) {
        if (NIL != generic_event_dispatcher_process_running_p()) {
            SubLObject known_applicationP = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock($generic_event_dispatcher_lock$.getGlobalValue());
                known_applicationP = bag.bag_memberP(app_symbol, $generic_event_dispatcher_applications$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock($generic_event_dispatcher_lock$.getGlobalValue());
                }
            }
            return known_applicationP;
        }
        return NIL;
    }

    public static SubLObject generic_event_dispatcher_process() {
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject start_generic_event_dispatcher_process_for_application(final SubLObject app_symbol) {
        SubLObject release = NIL;
        try {
            release = seize_lock($generic_event_dispatcher_lock$.getGlobalValue());
            if (NIL == bag.bag_add(app_symbol, $generic_event_dispatcher_applications$.getGlobalValue())) {
                generic_event_dispatcher_register_application_listeners(symbol_value(app_symbol), event_broker.core_event_broker());
            }
            if (NIL == generic_event_dispatcher_process_running_p()) {
                start_generic_event_dispatcher_process();
            }
        } finally {
            if (NIL != release) {
                release_lock($generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject stop_generic_event_dispatcher_process_for_application(final SubLObject app_symbol) {
        SubLObject release = NIL;
        try {
            release = seize_lock($generic_event_dispatcher_lock$.getGlobalValue());
            bag.bag_remove(app_symbol, $generic_event_dispatcher_applications$.getGlobalValue());
            if (NIL == bag.bag_memberP(app_symbol, $generic_event_dispatcher_applications$.getGlobalValue())) {
                generic_event_dispatcher_deregister_application_listeners(symbol_value(app_symbol), event_broker.core_event_broker());
            }
            if (NIL != bag.bag_emptyP($generic_event_dispatcher_applications$.getGlobalValue())) {
                stop_generic_event_dispatcher_process();
            }
        } finally {
            if (NIL != release) {
                release_lock($generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject ensure_generic_event_dispatcher_process_running_for_application(final SubLObject app_symbol) {
        if (NIL == generic_event_dispatcher_process_running_for_application_p(app_symbol)) {
            start_generic_event_dispatcher_process_for_application(app_symbol);
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject generic_event_dispatcher_process_running_p() {
        return makeBoolean((NIL != $generic_event_dispatcher_process$.getGlobalValue()) && (NIL != valid_process_p($generic_event_dispatcher_process$.getGlobalValue())));
    }

    public static SubLObject start_generic_event_dispatcher_process() {
        SubLObject release = NIL;
        try {
            release = seize_lock($generic_event_dispatcher_lock$.getGlobalValue());
            if (NIL != generic_event_dispatcher_process_running_p()) {
                stop_generic_event_dispatcher_process();
            }
            $generic_event_dispatcher_process$.setGlobalValue(process_utilities.make_cyc_server_process($$$Generic_Event_Dispatcher_Process, DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER));
        } finally {
            if (NIL != release) {
                release_lock($generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject stop_generic_event_dispatcher_process() {
        SubLObject release = NIL;
        try {
            release = seize_lock($generic_event_dispatcher_lock$.getGlobalValue());
            if (NIL != generic_event_dispatcher_process_running_p()) {
                kill_process($generic_event_dispatcher_process$.getGlobalValue());
                $generic_event_dispatcher_process$.setGlobalValue(NIL);
            }
        } finally {
            if (NIL != release) {
                release_lock($generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject ensure_generic_event_dispatcher_process_running() {
        if (NIL == generic_event_dispatcher_process_running_p()) {
            start_generic_event_dispatcher_process();
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject dispatch_events_for_generic_event_dispatcher() {
        final SubLObject lock = $generic_event_dispatcher_lock$.getGlobalValue();
        final SubLObject broker = event_broker.core_event_broker();
        SubLObject release = NIL;
        Label_0114 : {
            try {
                release = seize_lock(lock);
                SubLObject cdolist_list_var = bag.bag_unique_element_list($generic_event_dispatcher_applications$.getGlobalValue());
                SubLObject app_symbol = NIL;
                app_symbol = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    generic_event_dispatcher_register_application_listeners(symbol_value(app_symbol), broker);
                    cdolist_list_var = cdolist_list_var.rest();
                    app_symbol = cdolist_list_var.first();
                } 
                break Label_0114;
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        try {
            while (true) {
                event_broker.receive_event(broker);
            } 
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                SubLObject release_$2 = NIL;
                try {
                    release_$2 = seize_lock(lock);
                    SubLObject cdolist_list_var2 = bag.bag_unique_element_list($generic_event_dispatcher_applications$.getGlobalValue());
                    SubLObject app_symbol2 = NIL;
                    app_symbol2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        generic_event_dispatcher_deregister_application_listeners(symbol_value(app_symbol2), broker);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        app_symbol2 = cdolist_list_var2.first();
                    } 
                } finally {
                    if (NIL != release_$2) {
                        release_lock(lock);
                    }
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
    }

    public static SubLObject generic_event_dispatcher_register_application_listeners(final SubLObject listeners, final SubLObject broker) {
        SubLObject cdolist_list_var = listeners;
        SubLObject listener = NIL;
        listener = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            event_broker.register_event_listener(listener, broker);
            cdolist_list_var = cdolist_list_var.rest();
            listener = cdolist_list_var.first();
        } 
        return broker;
    }

    public static SubLObject generic_event_dispatcher_deregister_application_listeners(final SubLObject listeners, final SubLObject broker) {
        SubLObject cdolist_list_var = listeners;
        SubLObject listener = NIL;
        listener = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            event_broker.deregister_event_listener(listener, broker);
            cdolist_list_var = cdolist_list_var.rest();
            listener = cdolist_list_var.first();
        } 
        return broker;
    }

    public static SubLObject declare_simple_event_dispatcher_process(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefix = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        prefix = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list15);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list15);
            if (NIL == member(current_$3, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list15);
        }
        final SubLObject broker_tail = property_list_member($BROKER, current);
        final SubLObject broker = (NIL != broker_tail) ? cadr(broker_tail) : NIL;
        final SubLObject docstring_tail = property_list_member($DOCSTRING, current);
        final SubLObject docstring = (NIL != docstring_tail) ? cadr(docstring_tail) : NIL;
        final SubLObject postfix_tail = property_list_member($POSTFIX, current);
        final SubLObject postfix = (NIL != postfix_tail) ? cadr(postfix_tail) : $str19$_EVENT_DISPATCHER;
        final SubLObject body;
        current = body = temp;
        return declare_simple_event_dispatcher_process_internal(prefix, postfix, broker, body);
    }

    public static SubLObject declare_simple_event_dispatcher_process_internal(final SubLObject prefix, final SubLObject postfix, final SubLObject broker, final SubLObject body) {
        final SubLObject lock = event_build_variable_symbol($str20$, prefix, postfix, $str21$_LOCK);
        final SubLObject lockname = event_build_string_label($str20$, prefix, postfix, $$$_Lock);
        final SubLObject starter = event_build_function_symbol($str23$START_, prefix, postfix, UNPROVIDED);
        final SubLObject stopper = event_build_function_symbol($str24$STOP_, prefix, postfix, UNPROVIDED);
        final SubLObject running_p = event_build_function_symbol($str20$, prefix, postfix, $str25$_RUNNING_);
        final SubLObject ensure_running = event_build_function_symbol($str26$ENSURE_, prefix, postfix, $str27$_RUNNING);
        final SubLObject listeners = event_build_variable_symbol($str20$, prefix, postfix, $str28$_LISTENERS);
        final SubLObject register = event_build_function_symbol($str29$REGISTER_LISTENER_WITH_, prefix, postfix, UNPROVIDED);
        final SubLObject deregister = event_build_function_symbol($str30$DEREGISTER_LISTENER_WITH_, prefix, postfix, UNPROVIDED);
        return construct_event_dispatcher_process_declaration(lock, lockname, starter, stopper, running_p, ensure_running, listeners, register, deregister, broker, body);
    }

    public static SubLObject construct_event_dispatcher_process_declaration(final SubLObject lock, final SubLObject lockname, final SubLObject starter, final SubLObject stopper, final SubLObject running_p, final SubLObject ensure_running, final SubLObject listeners, final SubLObject register, final SubLObject deregister, final SubLObject broker, final SubLObject body) {
        return listS(PROGN, new SubLObject[]{ declare_event_lock(lock, lockname), declare_event_code_running_p(running_p, listeners), declare_event_code_ensure_running(ensure_running, starter, running_p), declare_event_global(listeners, NIL), declare_event_code_register(register, lock, listeners, broker, running_p), declare_event_code_deregister(deregister, lock, listeners, broker, running_p), declare_event_code_stopper(stopper, listeners), declare_event_code_starter(starter, listeners), append(body, NIL) });
    }

    public static SubLObject declare_event_lexical(final SubLObject var, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        return list(DEFLEXICAL_PRIVATE, var, initial_value);
    }

    public static SubLObject declare_event_lock(final SubLObject lockvar, final SubLObject lockname) {
        return declare_event_lexical(lockvar, list(MAKE_LOCK, lockname));
    }

    public static SubLObject declare_event_global(final SubLObject var, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        return list(DEFGLOBAL_PRIVATE, var, initial_value);
    }

    public static SubLObject declare_event_code_starter(final SubLObject starter, final SubLObject listeners) {
        return list(DEFINE_PUBLIC, starter, NIL, list(RET, list(START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, list(QUOTE, listeners))));
    }

    public static SubLObject declare_event_code_stopper(final SubLObject stopper, final SubLObject listeners) {
        return list(DEFINE_PUBLIC, stopper, NIL, list(RET, list(STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, list(QUOTE, listeners))));
    }

    public static SubLObject declare_event_code_running_p(final SubLObject running_p, final SubLObject listeners) {
        return list(DEFINE_PUBLIC, running_p, NIL, list(RET, list(GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P, list(QUOTE, listeners))));
    }

    public static SubLObject declare_event_code_ensure_running(final SubLObject ensure_running, final SubLObject starter, final SubLObject running_p) {
        return listS(DEFINE_PUBLIC, ensure_running, NIL, list(PUNLESS, list(running_p), list(starter)), $list42);
    }

    public static SubLObject declare_event_code_register(final SubLObject register, final SubLObject lock, final SubLObject listeners, final SubLObject broker, final SubLObject running_p) {
        final SubLObject listener_var = $sym43$LISTENER_VAR;
        return list(DEFINE_PUBLIC, register, list(listener_var), list(WITH_LOCK_HELD, list(lock), list(PUNLESS, listS(FIND, listener_var, listeners, $list46), list(CPUSH, listener_var, listeners), list(PWHEN, list(running_p), list(REGISTER_EVENT_LISTENER, listener_var, broker)))), list(RET, listener_var));
    }

    public static SubLObject declare_event_code_deregister(final SubLObject deregister, final SubLObject lock, final SubLObject listeners, final SubLObject broker, final SubLObject running_p) {
        final SubLObject listener_var = $sym50$LISTENER_VAR;
        return list(DEFINE_PUBLIC, deregister, list(listener_var), list(WITH_LOCK_HELD, list(lock), list(CSETQ, listeners, listS(REMOVE, listener_var, listeners, $list46)), list(PWHEN, list(running_p), list(DEREGISTER_EVENT_LISTENER, listener_var, broker))), list(RET, listener_var));
    }

    public static SubLObject event_build_function_symbol(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail) {
        if (tail == UNPROVIDED) {
            tail = $str20$;
        }
        return intern(cconcatenate(head, new SubLObject[]{ prefix, postfix, tail }), UNPROVIDED);
    }

    public static SubLObject event_build_variable_symbol(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail) {
        if (tail == UNPROVIDED) {
            tail = $str20$;
        }
        return intern(cconcatenate($str54$_, new SubLObject[]{ head, prefix, postfix, tail, $str54$_ }), UNPROVIDED);
    }

    public static SubLObject event_build_string_label(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail) {
        if (tail == UNPROVIDED) {
            tail = $str20$;
        }
        return cconcatenate(head, new SubLObject[]{ prefix, postfix, tail });
    }

    public static SubLObject event_message_cracker_privacy(final SubLObject privacy_level) {
        if (privacy_level.eql($PROTECTED)) {
            return DEFINE_PROTECTED;
        }
        if (privacy_level.eql($PUBLIC)) {
            return DEFINE_PUBLIC;
        }
        if (privacy_level.eql($PRIVATE)) {
            return DEFINE_PRIVATE;
        }
        Errors.error($str60$Unknown_privacy_level__S____not_o, privacy_level);
        return NIL;
    }

    public static SubLObject event_construct_message_cracker_symbol(final SubLObject type, final SubLObject slot) {
        return intern(cconcatenate(symbol_name(type), new SubLObject[]{ $str61$_RETRIEVE_, symbol_name(slot) }), UNPROVIDED);
    }

    public static SubLObject event_is_handler_registration_eventP(final SubLObject event) {
        return makeBoolean((event_model.event_class(event) == $EVENT_HANDLER_REGISTERED) || (event_model.event_class(event) == $EVENT_HANDLER_DEREGISTERED));
    }

    public static SubLObject with_validated_event_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject event = NIL;
        SubLObject event_type = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        event = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        event_type = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(CHECK_TYPE, event, $list66), list(PUNLESS, list(EQ, list(EVENT_CLASS, event), event_type), list(PUNLESS, list($sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_, event), list(ERROR, $str70$Event__S_is_of_type__S__not__S_, event, list(EVENT_CLASS, event), event_type))), bq_cons(PROGN, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static SubLObject define_event_message_crackers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject event_type = NIL;
        SubLObject slot_list = NIL;
        destructuring_bind_must_consp(current, datum, $list71);
        event_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        slot_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list71);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list71);
            if (NIL == member(current_$4, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list71);
        }
        final SubLObject privacy_level_tail = property_list_member($PRIVACY_LEVEL, current);
        final SubLObject privacy_level = (NIL != privacy_level_tail) ? cadr(privacy_level_tail) : $PROTECTED;
        current = temp;
        if (NIL == current) {
            SubLObject expansions = NIL;
            final SubLObject event = $sym74$EVENT;
            SubLObject cdolist_list_var = slot_list;
            SubLObject slot = NIL;
            slot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject define_privacy = event_message_cracker_privacy(privacy_level);
                final SubLObject expansion = list(define_privacy, event_construct_message_cracker_symbol(event_type, slot), list(event), list(WITH_VALIDATED_EVENT_TYPE, list(event, event_type), list(RET, list(GETF, list(EVENT_MESSAGE, event), slot))));
                expansions = cons(expansion, expansions);
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            } 
            return bq_cons(PROGN, append(expansions, NIL));
        }
        cdestructuring_bind_error(datum, $list71);
        return NIL;
    }

    public static SubLObject declare_event_utilities_file() {
        declareMacro(me, "declare_event_class", "DECLARE-EVENT-CLASS");
        declareFunction(me, "generic_event_dispatcher_process_running_for_application_p", "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION-P", 1, 0, false);
        declareFunction(me, "generic_event_dispatcher_process", "GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false);
        declareFunction(me, "start_generic_event_dispatcher_process_for_application", "START-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION", 1, 0, false);
        declareFunction(me, "stop_generic_event_dispatcher_process_for_application", "STOP-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION", 1, 0, false);
        declareFunction(me, "ensure_generic_event_dispatcher_process_running_for_application", "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION", 1, 0, false);
        declareFunction(me, "generic_event_dispatcher_process_running_p", "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-P", 0, 0, false);
        declareFunction(me, "start_generic_event_dispatcher_process", "START-GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false);
        declareFunction(me, "stop_generic_event_dispatcher_process", "STOP-GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false);
        declareFunction(me, "ensure_generic_event_dispatcher_process_running", "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING", 0, 0, false);
        declareFunction(me, "dispatch_events_for_generic_event_dispatcher", "DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER", 0, 0, false);
        declareFunction(me, "generic_event_dispatcher_register_application_listeners", "GENERIC-EVENT-DISPATCHER-REGISTER-APPLICATION-LISTENERS", 2, 0, false);
        declareFunction(me, "generic_event_dispatcher_deregister_application_listeners", "GENERIC-EVENT-DISPATCHER-DEREGISTER-APPLICATION-LISTENERS", 2, 0, false);
        declareMacro(me, "declare_simple_event_dispatcher_process", "DECLARE-SIMPLE-EVENT-DISPATCHER-PROCESS");
        declareFunction(me, "declare_simple_event_dispatcher_process_internal", "DECLARE-SIMPLE-EVENT-DISPATCHER-PROCESS-INTERNAL", 4, 0, false);
        declareFunction(me, "construct_event_dispatcher_process_declaration", "CONSTRUCT-EVENT-DISPATCHER-PROCESS-DECLARATION", 11, 0, false);
        declareFunction(me, "declare_event_lexical", "DECLARE-EVENT-LEXICAL", 1, 1, false);
        declareFunction(me, "declare_event_lock", "DECLARE-EVENT-LOCK", 2, 0, false);
        declareFunction(me, "declare_event_global", "DECLARE-EVENT-GLOBAL", 1, 1, false);
        declareFunction(me, "declare_event_code_starter", "DECLARE-EVENT-CODE-STARTER", 2, 0, false);
        declareFunction(me, "declare_event_code_stopper", "DECLARE-EVENT-CODE-STOPPER", 2, 0, false);
        declareFunction(me, "declare_event_code_running_p", "DECLARE-EVENT-CODE-RUNNING-P", 2, 0, false);
        declareFunction(me, "declare_event_code_ensure_running", "DECLARE-EVENT-CODE-ENSURE-RUNNING", 3, 0, false);
        declareFunction(me, "declare_event_code_register", "DECLARE-EVENT-CODE-REGISTER", 5, 0, false);
        declareFunction(me, "declare_event_code_deregister", "DECLARE-EVENT-CODE-DEREGISTER", 5, 0, false);
        declareFunction(me, "event_build_function_symbol", "EVENT-BUILD-FUNCTION-SYMBOL", 3, 1, false);
        declareFunction(me, "event_build_variable_symbol", "EVENT-BUILD-VARIABLE-SYMBOL", 3, 1, false);
        declareFunction(me, "event_build_string_label", "EVENT-BUILD-STRING-LABEL", 3, 1, false);
        declareFunction(me, "event_message_cracker_privacy", "EVENT-MESSAGE-CRACKER-PRIVACY", 1, 0, false);
        declareFunction(me, "event_construct_message_cracker_symbol", "EVENT-CONSTRUCT-MESSAGE-CRACKER-SYMBOL", 2, 0, false);
        declareFunction(me, "event_is_handler_registration_eventP", "EVENT-IS-HANDLER-REGISTRATION-EVENT?", 1, 0, false);
        declareMacro(me, "with_validated_event_type", "WITH-VALIDATED-EVENT-TYPE");
        declareMacro(me, "define_event_message_crackers", "DEFINE-EVENT-MESSAGE-CRACKERS");
        return NIL;
    }

    public static SubLObject init_event_utilities_file() {
        deflexical("*GENERIC-EVENT-DISPATCHER-LOCK*", SubLTrampolineFile.maybeDefault($generic_event_dispatcher_lock$, $generic_event_dispatcher_lock$, () -> make_lock($str9$Generic_Event_Dispatcher_Process_)));
        deflexical("*GENERIC-EVENT-DISPATCHER-APPLICATIONS*", SubLTrampolineFile.maybeDefault($generic_event_dispatcher_applications$, $generic_event_dispatcher_applications$, () -> bag.new_bag(UNPROVIDED, UNPROVIDED)));
        deflexical("*GENERIC-EVENT-DISPATCHER-PROCESS*", SubLTrampolineFile.maybeDefault($generic_event_dispatcher_process$, $generic_event_dispatcher_process$, NIL));
        return NIL;
    }

    public static SubLObject setup_event_utilities_file() {
        declare_defglobal($generic_event_dispatcher_lock$);
        declare_defglobal($generic_event_dispatcher_applications$);
        declare_defglobal($generic_event_dispatcher_process$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_event_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_event_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_event_utilities_file();
    }

    static {


















































































    }
}

/**
 * Total time: 122 ms
 */
