/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      EVENT-UTILITIES
 * source file: /cyc/top/cycl/event-utilities.lisp
 * created:     2019/07/03 17:37:17
 */
public final class event_utilities extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt20$ = makeString("");

    public static final SubLFile me = new event_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.event_utilities";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $str6$Must_specify_a_parent_class_ = makeString("Must specify a parent class.");

    private static final SubLSymbol REGISTER_EVENT_CLASS = makeSymbol("REGISTER-EVENT-CLASS");

    public static final SubLSymbol $generic_event_dispatcher_lock$ = makeSymbol("*GENERIC-EVENT-DISPATCHER-LOCK*");

    static private final SubLString $str9$Generic_Event_Dispatcher_Process_ = makeString("Generic Event Dispatcher Process Lock");

    public static final SubLSymbol $generic_event_dispatcher_applications$ = makeSymbol("*GENERIC-EVENT-DISPATCHER-APPLICATIONS*");

    public static final SubLSymbol $generic_event_dispatcher_process$ = makeSymbol("*GENERIC-EVENT-DISPATCHER-PROCESS*");

    static private final SubLString $$$Generic_Event_Dispatcher_Process = makeString("Generic Event Dispatcher Process");

    private static final SubLSymbol DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER = makeSymbol("DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER");

    static private final SubLList $list15 = list(list(makeSymbol("PREFIX"), makeSymbol("&KEY"), makeSymbol("BROKER"), makeSymbol("DOCSTRING"), list(makeSymbol("POSTFIX"), makeString("-EVENT-DISPATCHER"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list16 = list(makeKeyword("BROKER"), makeKeyword("DOCSTRING"), makeKeyword("POSTFIX"));

    static private final SubLString $str19$_EVENT_DISPATCHER = makeString("-EVENT-DISPATCHER");

    static private final SubLString $str20$ = makeString("");

    static private final SubLString $str21$_LOCK = makeString("-LOCK");

    static private final SubLString $$$_Lock = makeString(" Lock");

    static private final SubLString $str23$START_ = makeString("START-");

    static private final SubLString $str24$STOP_ = makeString("STOP-");

    static private final SubLString $str25$_RUNNING_ = makeString("-RUNNING?");

    static private final SubLString $str26$ENSURE_ = makeString("ENSURE-");

    static private final SubLString $str27$_RUNNING = makeString("-RUNNING");

    static private final SubLString $str28$_LISTENERS = makeString("-LISTENERS");

    static private final SubLString $str29$REGISTER_LISTENER_WITH_ = makeString("REGISTER-LISTENER-WITH-");

    static private final SubLString $str30$DEREGISTER_LISTENER_WITH_ = makeString("DEREGISTER-LISTENER-WITH-");

    private static final SubLSymbol DEFGLOBAL_PRIVATE = makeSymbol("DEFGLOBAL-PRIVATE");

    private static final SubLSymbol START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION = makeSymbol("START-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION");

    private static final SubLSymbol STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION = makeSymbol("STOP-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION");

    private static final SubLSymbol GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P = makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION-P");

    static private final SubLList $list42 = list(list(RET, list(makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS"))));

    static private final SubLSymbol $sym43$LISTENER_VAR = makeUninternedSymbol("LISTENER-VAR");

    static private final SubLList $list46 = list(list(QUOTE, EQUALP));

    private static final SubLSymbol REGISTER_EVENT_LISTENER = makeSymbol("REGISTER-EVENT-LISTENER");

    static private final SubLSymbol $sym50$LISTENER_VAR = makeUninternedSymbol("LISTENER-VAR");

    private static final SubLSymbol DEREGISTER_EVENT_LISTENER = makeSymbol("DEREGISTER-EVENT-LISTENER");

    static private final SubLString $str54$_ = makeString("*");

    static private final SubLString $str60$Unknown_privacy_level__S____not_o = makeString("Unknown privacy level ~S -- not one of :protected, :public, :private.");

    static private final SubLString $str61$_RETRIEVE_ = makeString("-RETRIEVE-");

    private static final SubLSymbol $EVENT_HANDLER_REGISTERED = makeKeyword("EVENT-HANDLER-REGISTERED");

    private static final SubLSymbol $EVENT_HANDLER_DEREGISTERED = makeKeyword("EVENT-HANDLER-DEREGISTERED");

    static private final SubLList $list64 = list(list(makeSymbol("EVENT"), makeSymbol("EVENT-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list66 = list(makeSymbol("EVENT-P"));

    private static final SubLSymbol EVENT_CLASS = makeSymbol("EVENT-CLASS");

    static private final SubLSymbol $sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_ = makeSymbol("EVENT-IS-HANDLER-REGISTRATION-EVENT?");

    static private final SubLString $str70$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");

    static private final SubLList $list71 = list(list(makeSymbol("EVENT-TYPE"), makeSymbol("SLOT-LIST"), makeSymbol("&KEY"), list(makeSymbol("PRIVACY-LEVEL"), makeKeyword("PROTECTED"))));

    static private final SubLList $list72 = list(makeKeyword("PRIVACY-LEVEL"));

    static private final SubLSymbol $sym74$EVENT = makeUninternedSymbol("EVENT");

    private static final SubLSymbol WITH_VALIDATED_EVENT_TYPE = makeSymbol("WITH-VALIDATED-EVENT-TYPE");

    private static final SubLSymbol EVENT_MESSAGE = makeSymbol("EVENT-MESSAGE");

    // Definitions
    public static final SubLObject declare_event_class_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject class_key = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    class_key = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject parent_tail = property_list_member($PARENT, current);
                            SubLObject parent = (NIL != parent_tail) ? ((SubLObject) (cadr(parent_tail))) : NIL;
                            SubLObject docstring_tail = property_list_member($DOCSTRING, current);
                            SubLObject docstring = (NIL != docstring_tail) ? ((SubLObject) (cadr(docstring_tail))) : NIL;
                            SubLObject hierarchy_tail = property_list_member($HIERARCHY, current);
                            SubLObject hierarchy = (NIL != hierarchy_tail) ? ((SubLObject) (cadr(hierarchy_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL == parent) {
                                    Errors.error($str_alt6$Must_specify_a_parent_class_);
                                }
                                return list(REGISTER_EVENT_CLASS, class_key, parent, hierarchy);
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject declare_event_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, event_utilities.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_key = NIL;
        destructuring_bind_must_consp(current, datum, event_utilities.$list0);
        class_key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, event_utilities.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, event_utilities.$list0);
            if (NIL == member(current_$1, event_utilities.$list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == event_utilities.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, event_utilities.$list0);
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
            Errors.error(event_utilities.$str6$Must_specify_a_parent_class_);
        }
        return list(event_utilities.REGISTER_EVENT_CLASS, class_key, parent, hierarchy);
    }

    public static final SubLObject generic_event_dispatcher_process_running_for_application_p_alt(SubLObject app_symbol) {
        if (NIL != com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_process_running_p()) {
            {
                SubLObject known_applicationP = NIL;
                SubLObject lock = $generic_event_dispatcher_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    known_applicationP = bag.bag_memberP(app_symbol, $generic_event_dispatcher_applications$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return known_applicationP;
            }
        }
        return NIL;
    }

    public static SubLObject generic_event_dispatcher_process_running_for_application_p(final SubLObject app_symbol) {
        if (NIL != event_utilities.generic_event_dispatcher_process_running_p()) {
            SubLObject known_applicationP = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
                known_applicationP = bag.bag_memberP(app_symbol, event_utilities.$generic_event_dispatcher_applications$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
                }
            }
            return known_applicationP;
        }
        return NIL;
    }

    public static final SubLObject generic_event_dispatcher_process_alt() {
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject generic_event_dispatcher_process() {
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }

    public static final SubLObject start_generic_event_dispatcher_process_for_application_alt(SubLObject app_symbol) {
        {
            SubLObject lock = $generic_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == bag.bag_add(app_symbol, $generic_event_dispatcher_applications$.getGlobalValue())) {
                    com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_register_application_listeners(symbol_value(app_symbol), event_broker.core_event_broker());
                }
                if (NIL == com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_process_running_p()) {
                    com.cyc.cycjava.cycl.event_utilities.start_generic_event_dispatcher_process();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject start_generic_event_dispatcher_process_for_application(final SubLObject app_symbol) {
        SubLObject release = NIL;
        try {
            release = seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            if (NIL == bag.bag_add(app_symbol, event_utilities.$generic_event_dispatcher_applications$.getGlobalValue())) {
                event_utilities.generic_event_dispatcher_register_application_listeners(symbol_value(app_symbol), event_broker.core_event_broker());
            }
            if (NIL == event_utilities.generic_event_dispatcher_process_running_p()) {
                event_utilities.start_generic_event_dispatcher_process();
            }
        } finally {
            if (NIL != release) {
                release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }

    public static final SubLObject stop_generic_event_dispatcher_process_for_application_alt(SubLObject app_symbol) {
        {
            SubLObject lock = $generic_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                bag.bag_remove(app_symbol, $generic_event_dispatcher_applications$.getGlobalValue());
                if (NIL == bag.bag_memberP(app_symbol, $generic_event_dispatcher_applications$.getGlobalValue())) {
                    com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_deregister_application_listeners(symbol_value(app_symbol), event_broker.core_event_broker());
                }
                if (NIL != bag.bag_emptyP($generic_event_dispatcher_applications$.getGlobalValue())) {
                    com.cyc.cycjava.cycl.event_utilities.stop_generic_event_dispatcher_process();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject stop_generic_event_dispatcher_process_for_application(final SubLObject app_symbol) {
        SubLObject release = NIL;
        try {
            release = seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            bag.bag_remove(app_symbol, event_utilities.$generic_event_dispatcher_applications$.getGlobalValue());
            if (NIL == bag.bag_memberP(app_symbol, event_utilities.$generic_event_dispatcher_applications$.getGlobalValue())) {
                event_utilities.generic_event_dispatcher_deregister_application_listeners(symbol_value(app_symbol), event_broker.core_event_broker());
            }
            if (NIL != bag.bag_emptyP(event_utilities.$generic_event_dispatcher_applications$.getGlobalValue())) {
                event_utilities.stop_generic_event_dispatcher_process();
            }
        } finally {
            if (NIL != release) {
                release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }

    public static final SubLObject ensure_generic_event_dispatcher_process_running_for_application_alt(SubLObject app_symbol) {
        if (NIL == com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_process_running_for_application_p(app_symbol)) {
            com.cyc.cycjava.cycl.event_utilities.start_generic_event_dispatcher_process_for_application(app_symbol);
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject ensure_generic_event_dispatcher_process_running_for_application(final SubLObject app_symbol) {
        if (NIL == event_utilities.generic_event_dispatcher_process_running_for_application_p(app_symbol)) {
            event_utilities.start_generic_event_dispatcher_process_for_application(app_symbol);
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }

    public static final SubLObject generic_event_dispatcher_process_running_p_alt() {
        return makeBoolean((NIL != $generic_event_dispatcher_process$.getGlobalValue()) && (NIL != valid_process_p($generic_event_dispatcher_process$.getGlobalValue())));
    }

    public static SubLObject generic_event_dispatcher_process_running_p() {
        return makeBoolean((NIL != event_utilities.$generic_event_dispatcher_process$.getGlobalValue()) && (NIL != valid_process_p(event_utilities.$generic_event_dispatcher_process$.getGlobalValue())));
    }

    public static final SubLObject start_generic_event_dispatcher_process_alt() {
        {
            SubLObject lock = $generic_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_process_running_p()) {
                    com.cyc.cycjava.cycl.event_utilities.stop_generic_event_dispatcher_process();
                }
                $generic_event_dispatcher_process$.setGlobalValue(process_utilities.make_cyc_server_process($$$Generic_Event_Dispatcher_Process, DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject start_generic_event_dispatcher_process() {
        SubLObject release = NIL;
        try {
            release = seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            if (NIL != event_utilities.generic_event_dispatcher_process_running_p()) {
                event_utilities.stop_generic_event_dispatcher_process();
            }
            event_utilities.$generic_event_dispatcher_process$.setGlobalValue(process_utilities.make_cyc_server_process(event_utilities.$$$Generic_Event_Dispatcher_Process, event_utilities.DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER));
        } finally {
            if (NIL != release) {
                release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }

    public static final SubLObject stop_generic_event_dispatcher_process_alt() {
        {
            SubLObject lock = $generic_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_process_running_p()) {
                    kill_process($generic_event_dispatcher_process$.getGlobalValue());
                    $generic_event_dispatcher_process$.setGlobalValue(NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject stop_generic_event_dispatcher_process() {
        SubLObject release = NIL;
        try {
            release = seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            if (NIL != event_utilities.generic_event_dispatcher_process_running_p()) {
                kill_process(event_utilities.$generic_event_dispatcher_process$.getGlobalValue());
                event_utilities.$generic_event_dispatcher_process$.setGlobalValue(NIL);
            }
        } finally {
            if (NIL != release) {
                release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }

    public static final SubLObject ensure_generic_event_dispatcher_process_running_alt() {
        if (NIL == com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_process_running_p()) {
            com.cyc.cycjava.cycl.event_utilities.start_generic_event_dispatcher_process();
        }
        return $generic_event_dispatcher_process$.getGlobalValue();
    }

    public static SubLObject ensure_generic_event_dispatcher_process_running() {
        if (NIL == event_utilities.generic_event_dispatcher_process_running_p()) {
            event_utilities.start_generic_event_dispatcher_process();
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }

    public static final SubLObject dispatch_events_for_generic_event_dispatcher_alt() {
        {
            SubLObject lock = $generic_event_dispatcher_lock$.getGlobalValue();
            SubLObject broker = event_broker.core_event_broker();
            SubLObject lock_2 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_2);
                {
                    SubLObject cdolist_list_var = bag.bag_unique_element_list($generic_event_dispatcher_applications$.getGlobalValue());
                    SubLObject app_symbol = NIL;
                    for (app_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , app_symbol = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_register_application_listeners(symbol_value(app_symbol), broker);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_2);
                }
            }
            try {
                while (true) {
                    event_broker.receive_event(broker);
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject lock_3 = lock;
                            SubLObject release_4 = NIL;
                            try {
                                release_4 = seize_lock(lock_3);
                                {
                                    SubLObject cdolist_list_var = bag.bag_unique_element_list($generic_event_dispatcher_applications$.getGlobalValue());
                                    SubLObject app_symbol = NIL;
                                    for (app_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , app_symbol = cdolist_list_var.first()) {
                                        com.cyc.cycjava.cycl.event_utilities.generic_event_dispatcher_deregister_application_listeners(symbol_value(app_symbol), broker);
                                    }
                                }
                            } finally {
                                if (NIL != release_4) {
                                    release_lock(lock_3);
                                }
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
    }

    public static SubLObject dispatch_events_for_generic_event_dispatcher() {
        final SubLObject lock = event_utilities.$generic_event_dispatcher_lock$.getGlobalValue();
        final SubLObject broker = event_broker.core_event_broker();
        SubLObject release = NIL;
        Label_0114 : {
            try {
                release = seize_lock(lock);
                SubLObject cdolist_list_var = bag.bag_unique_element_list(event_utilities.$generic_event_dispatcher_applications$.getGlobalValue());
                SubLObject app_symbol = NIL;
                app_symbol = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    event_utilities.generic_event_dispatcher_register_application_listeners(symbol_value(app_symbol), broker);
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
                    SubLObject cdolist_list_var2 = bag.bag_unique_element_list(event_utilities.$generic_event_dispatcher_applications$.getGlobalValue());
                    SubLObject app_symbol2 = NIL;
                    app_symbol2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        event_utilities.generic_event_dispatcher_deregister_application_listeners(symbol_value(app_symbol2), broker);
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

    public static final SubLObject generic_event_dispatcher_register_application_listeners_alt(SubLObject listeners, SubLObject broker) {
        {
            SubLObject cdolist_list_var = listeners;
            SubLObject listener = NIL;
            for (listener = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , listener = cdolist_list_var.first()) {
                event_broker.register_event_listener(listener, broker);
            }
        }
        return broker;
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

    public static final SubLObject generic_event_dispatcher_deregister_application_listeners_alt(SubLObject listeners, SubLObject broker) {
        {
            SubLObject cdolist_list_var = listeners;
            SubLObject listener = NIL;
            for (listener = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , listener = cdolist_list_var.first()) {
                event_broker.deregister_event_listener(listener, broker);
            }
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

    public static final SubLObject declare_simple_event_dispatcher_process_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject prefix = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    prefix = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt15);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt15);
                            if (NIL == member(current_5, $list_alt16, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt15);
                        }
                        {
                            SubLObject broker_tail = property_list_member($BROKER, current);
                            SubLObject broker = (NIL != broker_tail) ? ((SubLObject) (cadr(broker_tail))) : NIL;
                            SubLObject docstring_tail = property_list_member($DOCSTRING, current);
                            SubLObject docstring = (NIL != docstring_tail) ? ((SubLObject) (cadr(docstring_tail))) : NIL;
                            SubLObject postfix_tail = property_list_member($POSTFIX, current);
                            SubLObject postfix = (NIL != postfix_tail) ? ((SubLObject) (cadr(postfix_tail))) : $str_alt19$_EVENT_DISPATCHER;
                            current = temp;
                            {
                                SubLObject body = current;
                                return com.cyc.cycjava.cycl.event_utilities.declare_simple_event_dispatcher_process_internal(prefix, postfix, broker, body);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject declare_simple_event_dispatcher_process(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, event_utilities.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefix = NIL;
        destructuring_bind_must_consp(current, datum, event_utilities.$list15);
        prefix = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, event_utilities.$list15);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, event_utilities.$list15);
            if (NIL == member(current_$3, event_utilities.$list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == event_utilities.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, event_utilities.$list15);
        }
        final SubLObject broker_tail = property_list_member($BROKER, current);
        final SubLObject broker = (NIL != broker_tail) ? cadr(broker_tail) : NIL;
        final SubLObject docstring_tail = property_list_member($DOCSTRING, current);
        final SubLObject docstring = (NIL != docstring_tail) ? cadr(docstring_tail) : NIL;
        final SubLObject postfix_tail = property_list_member($POSTFIX, current);
        final SubLObject postfix = (NIL != postfix_tail) ? cadr(postfix_tail) : event_utilities.$str19$_EVENT_DISPATCHER;
        final SubLObject body;
        current = body = temp;
        return event_utilities.declare_simple_event_dispatcher_process_internal(prefix, postfix, broker, body);
    }

    public static final SubLObject declare_simple_event_dispatcher_process_internal_alt(SubLObject prefix, SubLObject postfix, SubLObject broker, SubLObject body) {
        {
            SubLObject lock = com.cyc.cycjava.cycl.event_utilities.event_build_variable_symbol($str_alt20$, prefix, postfix, $str_alt21$_LOCK);
            SubLObject lockname = com.cyc.cycjava.cycl.event_utilities.event_build_string_label($str_alt20$, prefix, postfix, $str_alt22$_Lock);
            SubLObject starter = com.cyc.cycjava.cycl.event_utilities.event_build_function_symbol($str_alt23$START_, prefix, postfix, UNPROVIDED);
            SubLObject stopper = com.cyc.cycjava.cycl.event_utilities.event_build_function_symbol($str_alt24$STOP_, prefix, postfix, UNPROVIDED);
            SubLObject running_p = com.cyc.cycjava.cycl.event_utilities.event_build_function_symbol($str_alt20$, prefix, postfix, $str_alt25$_RUNNING_);
            SubLObject ensure_running = com.cyc.cycjava.cycl.event_utilities.event_build_function_symbol($str_alt26$ENSURE_, prefix, postfix, $str_alt27$_RUNNING);
            SubLObject listeners = com.cyc.cycjava.cycl.event_utilities.event_build_variable_symbol($str_alt20$, prefix, postfix, $str_alt28$_LISTENERS);
            SubLObject register = com.cyc.cycjava.cycl.event_utilities.event_build_function_symbol($str_alt29$REGISTER_LISTENER_WITH_, prefix, postfix, UNPROVIDED);
            SubLObject deregister = com.cyc.cycjava.cycl.event_utilities.event_build_function_symbol($str_alt30$DEREGISTER_LISTENER_WITH_, prefix, postfix, UNPROVIDED);
            return com.cyc.cycjava.cycl.event_utilities.construct_event_dispatcher_process_declaration(lock, lockname, starter, stopper, running_p, ensure_running, listeners, register, deregister, broker, body);
        }
    }

    public static SubLObject declare_simple_event_dispatcher_process_internal(final SubLObject prefix, final SubLObject postfix, final SubLObject broker, final SubLObject body) {
        final SubLObject lock = event_utilities.event_build_variable_symbol(event_utilities.$str20$, prefix, postfix, event_utilities.$str21$_LOCK);
        final SubLObject lockname = event_utilities.event_build_string_label(event_utilities.$str20$, prefix, postfix, event_utilities.$$$_Lock);
        final SubLObject starter = event_utilities.event_build_function_symbol(event_utilities.$str23$START_, prefix, postfix, UNPROVIDED);
        final SubLObject stopper = event_utilities.event_build_function_symbol(event_utilities.$str24$STOP_, prefix, postfix, UNPROVIDED);
        final SubLObject running_p = event_utilities.event_build_function_symbol(event_utilities.$str20$, prefix, postfix, event_utilities.$str25$_RUNNING_);
        final SubLObject ensure_running = event_utilities.event_build_function_symbol(event_utilities.$str26$ENSURE_, prefix, postfix, event_utilities.$str27$_RUNNING);
        final SubLObject listeners = event_utilities.event_build_variable_symbol(event_utilities.$str20$, prefix, postfix, event_utilities.$str28$_LISTENERS);
        final SubLObject register = event_utilities.event_build_function_symbol(event_utilities.$str29$REGISTER_LISTENER_WITH_, prefix, postfix, UNPROVIDED);
        final SubLObject deregister = event_utilities.event_build_function_symbol(event_utilities.$str30$DEREGISTER_LISTENER_WITH_, prefix, postfix, UNPROVIDED);
        return event_utilities.construct_event_dispatcher_process_declaration(lock, lockname, starter, stopper, running_p, ensure_running, listeners, register, deregister, broker, body);
    }

    public static final SubLObject construct_event_dispatcher_process_declaration_alt(SubLObject lock, SubLObject lockname, SubLObject starter, SubLObject stopper, SubLObject running_p, SubLObject ensure_running, SubLObject listeners, SubLObject register, SubLObject deregister, SubLObject broker, SubLObject body) {
        return listS(PROGN, new SubLObject[]{ com.cyc.cycjava.cycl.event_utilities.declare_event_lock(lock, lockname), com.cyc.cycjava.cycl.event_utilities.declare_event_code_running_p(running_p, listeners), com.cyc.cycjava.cycl.event_utilities.declare_event_code_ensure_running(ensure_running, starter, running_p), com.cyc.cycjava.cycl.event_utilities.declare_event_global(listeners, NIL), com.cyc.cycjava.cycl.event_utilities.declare_event_code_register(register, lock, listeners, broker, running_p), com.cyc.cycjava.cycl.event_utilities.declare_event_code_deregister(deregister, lock, listeners, broker, running_p), com.cyc.cycjava.cycl.event_utilities.declare_event_code_stopper(stopper, listeners), com.cyc.cycjava.cycl.event_utilities.declare_event_code_starter(starter, listeners), append(body, NIL) });
    }

    public static SubLObject construct_event_dispatcher_process_declaration(final SubLObject lock, final SubLObject lockname, final SubLObject starter, final SubLObject stopper, final SubLObject running_p, final SubLObject ensure_running, final SubLObject listeners, final SubLObject register, final SubLObject deregister, final SubLObject broker, final SubLObject body) {
        return listS(PROGN, new SubLObject[]{ event_utilities.declare_event_lock(lock, lockname), event_utilities.declare_event_code_running_p(running_p, listeners), event_utilities.declare_event_code_ensure_running(ensure_running, starter, running_p), event_utilities.declare_event_global(listeners, NIL), event_utilities.declare_event_code_register(register, lock, listeners, broker, running_p), event_utilities.declare_event_code_deregister(deregister, lock, listeners, broker, running_p), event_utilities.declare_event_code_stopper(stopper, listeners), event_utilities.declare_event_code_starter(starter, listeners), append(body, NIL) });
    }

    public static final SubLObject declare_event_lexical_alt(SubLObject var, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        return list(DEFLEXICAL_PRIVATE, var, initial_value);
    }

    public static SubLObject declare_event_lexical(final SubLObject var, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        return list(DEFLEXICAL_PRIVATE, var, initial_value);
    }

    public static final SubLObject declare_event_lock_alt(SubLObject lockvar, SubLObject lockname) {
        return com.cyc.cycjava.cycl.event_utilities.declare_event_lexical(lockvar, list(MAKE_LOCK, lockname));
    }

    public static SubLObject declare_event_lock(final SubLObject lockvar, final SubLObject lockname) {
        return event_utilities.declare_event_lexical(lockvar, list(MAKE_LOCK, lockname));
    }

    public static final SubLObject declare_event_global_alt(SubLObject var, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        return list(DEFGLOBAL_PRIVATE, var, initial_value);
    }

    public static SubLObject declare_event_global(final SubLObject var, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        return list(event_utilities.DEFGLOBAL_PRIVATE, var, initial_value);
    }

    public static final SubLObject declare_event_code_starter_alt(SubLObject starter, SubLObject listeners) {
        return list(DEFINE_PUBLIC, starter, NIL, list(RET, list(START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, list(QUOTE, listeners))));
    }

    public static SubLObject declare_event_code_starter(final SubLObject starter, final SubLObject listeners) {
        return list(DEFINE_PUBLIC, starter, NIL, list(RET, list(event_utilities.START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, list(QUOTE, listeners))));
    }

    public static final SubLObject declare_event_code_stopper_alt(SubLObject stopper, SubLObject listeners) {
        return list(DEFINE_PUBLIC, stopper, NIL, list(RET, list(STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, list(QUOTE, listeners))));
    }

    public static SubLObject declare_event_code_stopper(final SubLObject stopper, final SubLObject listeners) {
        return list(DEFINE_PUBLIC, stopper, NIL, list(RET, list(event_utilities.STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, list(QUOTE, listeners))));
    }

    public static final SubLObject declare_event_code_running_p_alt(SubLObject running_p, SubLObject listeners) {
        return list(DEFINE_PUBLIC, running_p, NIL, list(RET, list(GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P, list(QUOTE, listeners))));
    }

    public static SubLObject declare_event_code_running_p(final SubLObject running_p, final SubLObject listeners) {
        return list(DEFINE_PUBLIC, running_p, NIL, list(RET, list(event_utilities.GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P, list(QUOTE, listeners))));
    }

    public static final SubLObject declare_event_code_ensure_running_alt(SubLObject ensure_running, SubLObject starter, SubLObject running_p) {
        return listS(DEFINE_PUBLIC, ensure_running, NIL, list(PUNLESS, list(running_p), list(starter)), $list_alt42);
    }

    public static SubLObject declare_event_code_ensure_running(final SubLObject ensure_running, final SubLObject starter, final SubLObject running_p) {
        return listS(DEFINE_PUBLIC, ensure_running, NIL, list(PUNLESS, list(running_p), list(starter)), event_utilities.$list42);
    }

    public static final SubLObject declare_event_code_register_alt(SubLObject register, SubLObject lock, SubLObject listeners, SubLObject broker, SubLObject running_p) {
        {
            SubLObject listener_var = $sym43$LISTENER_VAR;
            return list(DEFINE_PUBLIC, register, list(listener_var), list(WITH_LOCK_HELD, list(lock), list(PUNLESS, listS(FIND, listener_var, listeners, $list_alt46), list(CPUSH, listener_var, listeners), list(PWHEN, list(running_p), list(REGISTER_EVENT_LISTENER, listener_var, broker)))), list(RET, listener_var));
        }
    }

    public static SubLObject declare_event_code_register(final SubLObject register, final SubLObject lock, final SubLObject listeners, final SubLObject broker, final SubLObject running_p) {
        final SubLObject listener_var = event_utilities.$sym43$LISTENER_VAR;
        return list(DEFINE_PUBLIC, register, list(listener_var), list(WITH_LOCK_HELD, list(lock), list(PUNLESS, listS(FIND, listener_var, listeners, event_utilities.$list46), list(CPUSH, listener_var, listeners), list(PWHEN, list(running_p), list(event_utilities.REGISTER_EVENT_LISTENER, listener_var, broker)))), list(RET, listener_var));
    }

    public static final SubLObject declare_event_code_deregister_alt(SubLObject deregister, SubLObject lock, SubLObject listeners, SubLObject broker, SubLObject running_p) {
        {
            SubLObject listener_var = $sym50$LISTENER_VAR;
            return list(DEFINE_PUBLIC, deregister, list(listener_var), list(WITH_LOCK_HELD, list(lock), list(CSETQ, listeners, listS(REMOVE, listener_var, listeners, $list_alt46)), list(PWHEN, list(running_p), list(DEREGISTER_EVENT_LISTENER, listener_var, broker))), list(RET, listener_var));
        }
    }

    public static SubLObject declare_event_code_deregister(final SubLObject deregister, final SubLObject lock, final SubLObject listeners, final SubLObject broker, final SubLObject running_p) {
        final SubLObject listener_var = event_utilities.$sym50$LISTENER_VAR;
        return list(DEFINE_PUBLIC, deregister, list(listener_var), list(WITH_LOCK_HELD, list(lock), list(CSETQ, listeners, listS(REMOVE, listener_var, listeners, event_utilities.$list46)), list(PWHEN, list(running_p), list(event_utilities.DEREGISTER_EVENT_LISTENER, listener_var, broker))), list(RET, listener_var));
    }

    public static final SubLObject event_build_function_symbol_alt(SubLObject head, SubLObject prefix, SubLObject postfix, SubLObject tail) {
        if (tail == UNPROVIDED) {
            tail = $str_alt20$;
        }
        return intern(cconcatenate(head, new SubLObject[]{ prefix, postfix, tail }), UNPROVIDED);
    }

    public static SubLObject event_build_function_symbol(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail) {
        if (tail == UNPROVIDED) {
            tail = event_utilities.$str20$;
        }
        return intern(cconcatenate(head, new SubLObject[]{ prefix, postfix, tail }), UNPROVIDED);
    }

    public static final SubLObject event_build_variable_symbol_alt(SubLObject head, SubLObject prefix, SubLObject postfix, SubLObject tail) {
        if (tail == UNPROVIDED) {
            tail = $str_alt20$;
        }
        return intern(cconcatenate($str_alt54$_, new SubLObject[]{ head, prefix, postfix, tail, $str_alt54$_ }), UNPROVIDED);
    }

    public static SubLObject event_build_variable_symbol(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail) {
        if (tail == UNPROVIDED) {
            tail = event_utilities.$str20$;
        }
        return intern(cconcatenate(event_utilities.$str54$_, new SubLObject[]{ head, prefix, postfix, tail, event_utilities.$str54$_ }), UNPROVIDED);
    }

    public static final SubLObject event_build_string_label_alt(SubLObject head, SubLObject prefix, SubLObject postfix, SubLObject tail) {
        if (tail == UNPROVIDED) {
            tail = $str_alt20$;
        }
        return cconcatenate(head, new SubLObject[]{ prefix, postfix, tail });
    }

    public static SubLObject event_build_string_label(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail) {
        if (tail == UNPROVIDED) {
            tail = event_utilities.$str20$;
        }
        return cconcatenate(head, new SubLObject[]{ prefix, postfix, tail });
    }

    public static final SubLObject event_message_cracker_privacy_alt(SubLObject privacy_level) {
        {
            SubLObject pcase_var = privacy_level;
            if (pcase_var.eql($PROTECTED)) {
                return DEFINE_PROTECTED;
            } else {
                if (pcase_var.eql($PUBLIC)) {
                    return DEFINE_PUBLIC;
                } else {
                    if (pcase_var.eql($PRIVATE)) {
                        return DEFINE_PRIVATE;
                    } else {
                        Errors.error($str_alt60$Unknown_privacy_level__S____not_o, privacy_level);
                    }
                }
            }
        }
        return NIL;
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
        Errors.error(event_utilities.$str60$Unknown_privacy_level__S____not_o, privacy_level);
        return NIL;
    }

    /**
     * Given an event type and a event message sub-slot, generate the name
     * for a message cracker for that slot.
     */
    @LispMethod(comment = "Given an event type and a event message sub-slot, generate the name\r\nfor a message cracker for that slot.\nGiven an event type and a event message sub-slot, generate the name\nfor a message cracker for that slot.")
    public static final SubLObject event_construct_message_cracker_symbol_alt(SubLObject type, SubLObject slot) {
        return intern(cconcatenate(symbol_name(type), new SubLObject[]{ $str_alt61$_RETRIEVE_, symbol_name(slot) }), UNPROVIDED);
    }

    /**
     * Given an event type and a event message sub-slot, generate the name
     * for a message cracker for that slot.
     */
    @LispMethod(comment = "Given an event type and a event message sub-slot, generate the name\r\nfor a message cracker for that slot.\nGiven an event type and a event message sub-slot, generate the name\nfor a message cracker for that slot.")
    public static SubLObject event_construct_message_cracker_symbol(final SubLObject type, final SubLObject slot) {
        return intern(cconcatenate(symbol_name(type), new SubLObject[]{ event_utilities.$str61$_RETRIEVE_, symbol_name(slot) }), UNPROVIDED);
    }

    public static final SubLObject event_is_handler_registration_eventP_alt(SubLObject event) {
        return makeBoolean((event_model.event_class(event) == $EVENT_HANDLER_REGISTERED) || (event_model.event_class(event) == $EVENT_HANDLER_DEREGISTERED));
    }

    public static SubLObject event_is_handler_registration_eventP(final SubLObject event) {
        return makeBoolean((event_model.event_class(event) == event_utilities.$EVENT_HANDLER_REGISTERED) || (event_model.event_class(event) == event_utilities.$EVENT_HANDLER_DEREGISTERED));
    }

    /**
     * Ensure that the event is of the valid type expected;  error otherwise.
     */
    @LispMethod(comment = "Ensure that the event is of the valid type expected;  error otherwise.")
    public static final SubLObject with_validated_event_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt64);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject event = NIL;
                    SubLObject event_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt64);
                    event = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt64);
                    event_type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, listS(CHECK_TYPE, event, $list_alt66), list(PUNLESS, list(EQ, list(EVENT_CLASS, event), event_type), list(PUNLESS, list($sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_, event), list(ERROR, $str_alt70$Event__S_is_of_type__S__not__S_, event, list(EVENT_CLASS, event), event_type))), bq_cons(PROGN, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt64);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Ensure that the event is of the valid type expected;  error otherwise.
     */
    @LispMethod(comment = "Ensure that the event is of the valid type expected;  error otherwise.")
    public static SubLObject with_validated_event_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, event_utilities.$list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject event = NIL;
        SubLObject event_type = NIL;
        destructuring_bind_must_consp(current, datum, event_utilities.$list64);
        event = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, event_utilities.$list64);
        event_type = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(CHECK_TYPE, event, event_utilities.$list66), list(PUNLESS, list(EQ, list(event_utilities.EVENT_CLASS, event), event_type), list(PUNLESS, list(event_utilities.$sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_, event), list(ERROR, event_utilities.$str70$Event__S_is_of_type__S__not__S_, event, list(event_utilities.EVENT_CLASS, event), event_type))), bq_cons(PROGN, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, event_utilities.$list64);
        return NIL;
    }

    /**
     * Generate the message cracker methods for unpacking the message slots.
     */
    @LispMethod(comment = "Generate the message cracker methods for unpacking the message slots.")
    public static final SubLObject define_event_message_crackers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt71);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject event_type = NIL;
                    SubLObject slot_list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt71);
                    event_type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt71);
                    slot_list = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt71);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt71);
                            if (NIL == member(current_6, $list_alt72, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt71);
                        }
                        {
                            SubLObject privacy_level_tail = property_list_member($PRIVACY_LEVEL, current);
                            SubLObject privacy_level = (NIL != privacy_level_tail) ? ((SubLObject) (cadr(privacy_level_tail))) : $PROTECTED;
                            current = temp;
                            if (NIL == current) {
                                {
                                    SubLObject expansions = NIL;
                                    SubLObject event = $sym74$EVENT;
                                    SubLObject cdolist_list_var = slot_list;
                                    SubLObject slot = NIL;
                                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                        {
                                            SubLObject define_privacy = com.cyc.cycjava.cycl.event_utilities.event_message_cracker_privacy(privacy_level);
                                            SubLObject expansion = list(define_privacy, com.cyc.cycjava.cycl.event_utilities.event_construct_message_cracker_symbol(event_type, slot), list(event), list(WITH_VALIDATED_EVENT_TYPE, list(event, event_type), list(RET, list(GETF, list(EVENT_MESSAGE, event), slot))));
                                            expansions = cons(expansion, expansions);
                                        }
                                    }
                                    return bq_cons(PROGN, append(expansions, NIL));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt71);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Generate the message cracker methods for unpacking the message slots.
     */
    @LispMethod(comment = "Generate the message cracker methods for unpacking the message slots.")
    public static SubLObject define_event_message_crackers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, event_utilities.$list71);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject event_type = NIL;
        SubLObject slot_list = NIL;
        destructuring_bind_must_consp(current, datum, event_utilities.$list71);
        event_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, event_utilities.$list71);
        slot_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, event_utilities.$list71);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, event_utilities.$list71);
            if (NIL == member(current_$4, event_utilities.$list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == event_utilities.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, event_utilities.$list71);
        }
        final SubLObject privacy_level_tail = property_list_member($PRIVACY_LEVEL, current);
        final SubLObject privacy_level = (NIL != privacy_level_tail) ? cadr(privacy_level_tail) : $PROTECTED;
        current = temp;
        if (NIL == current) {
            SubLObject expansions = NIL;
            final SubLObject event = event_utilities.$sym74$EVENT;
            SubLObject cdolist_list_var = slot_list;
            SubLObject slot = NIL;
            slot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject define_privacy = event_utilities.event_message_cracker_privacy(privacy_level);
                final SubLObject expansion = list(define_privacy, event_utilities.event_construct_message_cracker_symbol(event_type, slot), list(event), list(event_utilities.WITH_VALIDATED_EVENT_TYPE, list(event, event_type), list(RET, list(GETF, list(event_utilities.EVENT_MESSAGE, event), slot))));
                expansions = cons(expansion, expansions);
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            } 
            return bq_cons(PROGN, append(expansions, NIL));
        }
        cdestructuring_bind_error(datum, event_utilities.$list71);
        return NIL;
    }

    public static SubLObject declare_event_utilities_file() {
        declareMacro("declare_event_class", "DECLARE-EVENT-CLASS");
        declareFunction("generic_event_dispatcher_process_running_for_application_p", "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION-P", 1, 0, false);
        declareFunction("generic_event_dispatcher_process", "GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false);
        declareFunction("start_generic_event_dispatcher_process_for_application", "START-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION", 1, 0, false);
        declareFunction("stop_generic_event_dispatcher_process_for_application", "STOP-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION", 1, 0, false);
        declareFunction("ensure_generic_event_dispatcher_process_running_for_application", "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION", 1, 0, false);
        declareFunction("generic_event_dispatcher_process_running_p", "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-P", 0, 0, false);
        declareFunction("start_generic_event_dispatcher_process", "START-GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false);
        declareFunction("stop_generic_event_dispatcher_process", "STOP-GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false);
        declareFunction("ensure_generic_event_dispatcher_process_running", "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING", 0, 0, false);
        declareFunction("dispatch_events_for_generic_event_dispatcher", "DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER", 0, 0, false);
        declareFunction("generic_event_dispatcher_register_application_listeners", "GENERIC-EVENT-DISPATCHER-REGISTER-APPLICATION-LISTENERS", 2, 0, false);
        declareFunction("generic_event_dispatcher_deregister_application_listeners", "GENERIC-EVENT-DISPATCHER-DEREGISTER-APPLICATION-LISTENERS", 2, 0, false);
        declareMacro("declare_simple_event_dispatcher_process", "DECLARE-SIMPLE-EVENT-DISPATCHER-PROCESS");
        declareFunction("declare_simple_event_dispatcher_process_internal", "DECLARE-SIMPLE-EVENT-DISPATCHER-PROCESS-INTERNAL", 4, 0, false);
        declareFunction("construct_event_dispatcher_process_declaration", "CONSTRUCT-EVENT-DISPATCHER-PROCESS-DECLARATION", 11, 0, false);
        declareFunction("declare_event_lexical", "DECLARE-EVENT-LEXICAL", 1, 1, false);
        declareFunction("declare_event_lock", "DECLARE-EVENT-LOCK", 2, 0, false);
        declareFunction("declare_event_global", "DECLARE-EVENT-GLOBAL", 1, 1, false);
        declareFunction("declare_event_code_starter", "DECLARE-EVENT-CODE-STARTER", 2, 0, false);
        declareFunction("declare_event_code_stopper", "DECLARE-EVENT-CODE-STOPPER", 2, 0, false);
        declareFunction("declare_event_code_running_p", "DECLARE-EVENT-CODE-RUNNING-P", 2, 0, false);
        declareFunction("declare_event_code_ensure_running", "DECLARE-EVENT-CODE-ENSURE-RUNNING", 3, 0, false);
        declareFunction("declare_event_code_register", "DECLARE-EVENT-CODE-REGISTER", 5, 0, false);
        declareFunction("declare_event_code_deregister", "DECLARE-EVENT-CODE-DEREGISTER", 5, 0, false);
        declareFunction("event_build_function_symbol", "EVENT-BUILD-FUNCTION-SYMBOL", 3, 1, false);
        declareFunction("event_build_variable_symbol", "EVENT-BUILD-VARIABLE-SYMBOL", 3, 1, false);
        declareFunction("event_build_string_label", "EVENT-BUILD-STRING-LABEL", 3, 1, false);
        declareFunction("event_message_cracker_privacy", "EVENT-MESSAGE-CRACKER-PRIVACY", 1, 0, false);
        declareFunction("event_construct_message_cracker_symbol", "EVENT-CONSTRUCT-MESSAGE-CRACKER-SYMBOL", 2, 0, false);
        declareFunction("event_is_handler_registration_eventP", "EVENT-IS-HANDLER-REGISTRATION-EVENT?", 1, 0, false);
        declareMacro("with_validated_event_type", "WITH-VALIDATED-EVENT-TYPE");
        declareMacro("define_event_message_crackers", "DEFINE-EVENT-MESSAGE-CRACKERS");
        return NIL;
    }

    public static final SubLObject init_event_utilities_file_alt() {
        deflexical("*GENERIC-EVENT-DISPATCHER-LOCK*", NIL != boundp($generic_event_dispatcher_lock$) ? ((SubLObject) ($generic_event_dispatcher_lock$.getGlobalValue())) : make_lock($str_alt9$Generic_Event_Dispatcher_Process_));
        deflexical("*GENERIC-EVENT-DISPATCHER-APPLICATIONS*", NIL != boundp($generic_event_dispatcher_applications$) ? ((SubLObject) ($generic_event_dispatcher_applications$.getGlobalValue())) : bag.new_bag(UNPROVIDED, UNPROVIDED));
        deflexical("*GENERIC-EVENT-DISPATCHER-PROCESS*", NIL != boundp($generic_event_dispatcher_process$) ? ((SubLObject) ($generic_event_dispatcher_process$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_event_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*GENERIC-EVENT-DISPATCHER-LOCK*", SubLTrampolineFile.maybeDefault(event_utilities.$generic_event_dispatcher_lock$, event_utilities.$generic_event_dispatcher_lock$, () -> make_lock(event_utilities.$str9$Generic_Event_Dispatcher_Process_)));
            deflexical("*GENERIC-EVENT-DISPATCHER-APPLICATIONS*", SubLTrampolineFile.maybeDefault(event_utilities.$generic_event_dispatcher_applications$, event_utilities.$generic_event_dispatcher_applications$, () -> bag.new_bag(UNPROVIDED, UNPROVIDED)));
            deflexical("*GENERIC-EVENT-DISPATCHER-PROCESS*", SubLTrampolineFile.maybeDefault(event_utilities.$generic_event_dispatcher_process$, event_utilities.$generic_event_dispatcher_process$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*GENERIC-EVENT-DISPATCHER-LOCK*", NIL != boundp($generic_event_dispatcher_lock$) ? ((SubLObject) ($generic_event_dispatcher_lock$.getGlobalValue())) : make_lock($str_alt9$Generic_Event_Dispatcher_Process_));
            deflexical("*GENERIC-EVENT-DISPATCHER-APPLICATIONS*", NIL != boundp($generic_event_dispatcher_applications$) ? ((SubLObject) ($generic_event_dispatcher_applications$.getGlobalValue())) : bag.new_bag(UNPROVIDED, UNPROVIDED));
            deflexical("*GENERIC-EVENT-DISPATCHER-PROCESS*", NIL != boundp($generic_event_dispatcher_process$) ? ((SubLObject) ($generic_event_dispatcher_process$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_event_utilities_file_Previous() {
        deflexical("*GENERIC-EVENT-DISPATCHER-LOCK*", SubLTrampolineFile.maybeDefault(event_utilities.$generic_event_dispatcher_lock$, event_utilities.$generic_event_dispatcher_lock$, () -> make_lock(event_utilities.$str9$Generic_Event_Dispatcher_Process_)));
        deflexical("*GENERIC-EVENT-DISPATCHER-APPLICATIONS*", SubLTrampolineFile.maybeDefault(event_utilities.$generic_event_dispatcher_applications$, event_utilities.$generic_event_dispatcher_applications$, () -> bag.new_bag(UNPROVIDED, UNPROVIDED)));
        deflexical("*GENERIC-EVENT-DISPATCHER-PROCESS*", SubLTrampolineFile.maybeDefault(event_utilities.$generic_event_dispatcher_process$, event_utilities.$generic_event_dispatcher_process$, NIL));
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject setup_event_utilities_file() {
        declare_defglobal(event_utilities.$generic_event_dispatcher_lock$);
        declare_defglobal(event_utilities.$generic_event_dispatcher_applications$);
        declare_defglobal(event_utilities.$generic_event_dispatcher_process$);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"));

    static private final SubLString $str_alt6$Must_specify_a_parent_class_ = makeString("Must specify a parent class.");

    @Override
    public void declareFunctions() {
        event_utilities.declare_event_utilities_file();
    }

    @Override
    public void initializeVariables() {
        event_utilities.init_event_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        event_utilities.setup_event_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt9$Generic_Event_Dispatcher_Process_ = makeString("Generic Event Dispatcher Process Lock");

    static private final SubLList $list_alt15 = list(list(makeSymbol("PREFIX"), makeSymbol("&KEY"), makeSymbol("BROKER"), makeSymbol("DOCSTRING"), list(makeSymbol("POSTFIX"), makeString("-EVENT-DISPATCHER"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt16 = list(makeKeyword("BROKER"), makeKeyword("DOCSTRING"), makeKeyword("POSTFIX"));

    static private final SubLString $str_alt19$_EVENT_DISPATCHER = makeString("-EVENT-DISPATCHER");

    static private final SubLString $str_alt21$_LOCK = makeString("-LOCK");

    static private final SubLString $str_alt22$_Lock = makeString(" Lock");

    static private final SubLString $str_alt23$START_ = makeString("START-");

    static private final SubLString $str_alt24$STOP_ = makeString("STOP-");

    static private final SubLString $str_alt25$_RUNNING_ = makeString("-RUNNING?");

    static private final SubLString $str_alt26$ENSURE_ = makeString("ENSURE-");

    static private final SubLString $str_alt27$_RUNNING = makeString("-RUNNING");

    static private final SubLString $str_alt28$_LISTENERS = makeString("-LISTENERS");

    static private final SubLString $str_alt29$REGISTER_LISTENER_WITH_ = makeString("REGISTER-LISTENER-WITH-");

    static private final SubLString $str_alt30$DEREGISTER_LISTENER_WITH_ = makeString("DEREGISTER-LISTENER-WITH-");

    static private final SubLList $list_alt42 = list(list(RET, list(makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS"))));

    static private final SubLList $list_alt46 = list(list(QUOTE, EQUALP));

    static private final SubLString $str_alt54$_ = makeString("*");

    static private final SubLString $str_alt60$Unknown_privacy_level__S____not_o = makeString("Unknown privacy level ~S -- not one of :protected, :public, :private.");

    static private final SubLString $str_alt61$_RETRIEVE_ = makeString("-RETRIEVE-");

    static private final SubLList $list_alt64 = list(list(makeSymbol("EVENT"), makeSymbol("EVENT-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt66 = list(makeSymbol("EVENT-P"));

    static private final SubLString $str_alt70$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");

    static private final SubLList $list_alt71 = list(list(makeSymbol("EVENT-TYPE"), makeSymbol("SLOT-LIST"), makeSymbol("&KEY"), list(makeSymbol("PRIVACY-LEVEL"), makeKeyword("PROTECTED"))));

    static private final SubLList $list_alt72 = list(makeKeyword("PRIVACY-LEVEL"));
}

/**
 * Total time: 122 ms
 */
