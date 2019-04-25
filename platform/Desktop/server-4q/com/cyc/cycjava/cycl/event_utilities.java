package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class event_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.event_utilities";
    public static final String myFingerPrint = "3b30838fbe1de9ef766645eb900981ff4d9f27bb6cfaa17c7a4fd3228b7e3b0f";
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 1102L)
    private static SubLSymbol $generic_event_dispatcher_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 1320L)
    private static SubLSymbol $generic_event_dispatcher_applications$;
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 1594L)
    private static SubLSymbol $generic_event_dispatcher_process$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$PARENT;
    private static final SubLSymbol $kw4$DOCSTRING;
    private static final SubLSymbol $kw5$HIERARCHY;
    private static final SubLString $str6$Must_specify_a_parent_class_;
    private static final SubLSymbol $sym7$REGISTER_EVENT_CLASS;
    private static final SubLSymbol $sym8$_GENERIC_EVENT_DISPATCHER_LOCK_;
    private static final SubLString $str9$Generic_Event_Dispatcher_Process_;
    private static final SubLSymbol $sym10$_GENERIC_EVENT_DISPATCHER_APPLICATIONS_;
    private static final SubLSymbol $sym11$_GENERIC_EVENT_DISPATCHER_PROCESS_;
    private static final SubLString $str12$Generic_Event_Dispatcher_Process;
    private static final SubLSymbol $sym13$DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER;
    private static final SubLSymbol $kw14$TERMINATED;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$BROKER;
    private static final SubLSymbol $kw18$POSTFIX;
    private static final SubLString $str19$_EVENT_DISPATCHER;
    private static final SubLString $str20$;
    private static final SubLString $str21$_LOCK;
    private static final SubLString $str22$_Lock;
    private static final SubLString $str23$START_;
    private static final SubLString $str24$STOP_;
    private static final SubLString $str25$_RUNNING_;
    private static final SubLString $str26$ENSURE_;
    private static final SubLString $str27$_RUNNING;
    private static final SubLString $str28$_LISTENERS;
    private static final SubLString $str29$REGISTER_LISTENER_WITH_;
    private static final SubLString $str30$DEREGISTER_LISTENER_WITH_;
    private static final SubLSymbol $sym31$PROGN;
    private static final SubLSymbol $sym32$DEFLEXICAL_PRIVATE;
    private static final SubLSymbol $sym33$MAKE_LOCK;
    private static final SubLSymbol $sym34$DEFGLOBAL_PRIVATE;
    private static final SubLSymbol $sym35$DEFINE_PUBLIC;
    private static final SubLSymbol $sym36$RET;
    private static final SubLSymbol $sym37$START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION;
    private static final SubLSymbol $sym38$QUOTE;
    private static final SubLSymbol $sym39$STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION;
    private static final SubLSymbol $sym40$GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P;
    private static final SubLSymbol $sym41$PUNLESS;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$LISTENER_VAR;
    private static final SubLSymbol $sym44$WITH_LOCK_HELD;
    private static final SubLSymbol $sym45$FIND;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$CPUSH;
    private static final SubLSymbol $sym48$PWHEN;
    private static final SubLSymbol $sym49$REGISTER_EVENT_LISTENER;
    private static final SubLSymbol $sym50$LISTENER_VAR;
    private static final SubLSymbol $sym51$CSETQ;
    private static final SubLSymbol $sym52$REMOVE;
    private static final SubLSymbol $sym53$DEREGISTER_EVENT_LISTENER;
    private static final SubLString $str54$_;
    private static final SubLSymbol $kw55$PROTECTED;
    private static final SubLSymbol $sym56$DEFINE_PROTECTED;
    private static final SubLSymbol $kw57$PUBLIC;
    private static final SubLSymbol $kw58$PRIVATE;
    private static final SubLSymbol $sym59$DEFINE_PRIVATE;
    private static final SubLString $str60$Unknown_privacy_level__S____not_o;
    private static final SubLString $str61$_RETRIEVE_;
    private static final SubLSymbol $kw62$EVENT_HANDLER_REGISTERED;
    private static final SubLSymbol $kw63$EVENT_HANDLER_DEREGISTERED;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$CHECK_TYPE;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$EVENT_CLASS;
    private static final SubLSymbol $sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_;
    private static final SubLSymbol $sym69$ERROR;
    private static final SubLString $str70$Event__S_is_of_type__S__not__S_;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $kw73$PRIVACY_LEVEL;
    private static final SubLSymbol $sym74$EVENT;
    private static final SubLSymbol $sym75$WITH_VALIDATED_EVENT_TYPE;
    private static final SubLSymbol $sym76$GETF;
    private static final SubLSymbol $sym77$EVENT_MESSAGE;
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 811L)
    public static SubLObject declare_event_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_key = (SubLObject)event_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list0);
        class_key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)event_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)event_utilities.NIL;
        SubLObject current_$1 = (SubLObject)event_utilities.NIL;
        while (event_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)event_utilities.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)event_utilities.$list0);
            if (event_utilities.NIL == conses_high.member(current_$1, (SubLObject)event_utilities.$list1, (SubLObject)event_utilities.UNPROVIDED, (SubLObject)event_utilities.UNPROVIDED)) {
                bad = (SubLObject)event_utilities.T;
            }
            if (current_$1 == event_utilities.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (event_utilities.NIL != bad && event_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_utilities.$list0);
        }
        final SubLObject parent_tail = cdestructuring_bind.property_list_member((SubLObject)event_utilities.$kw3$PARENT, current);
        final SubLObject parent = (SubLObject)((event_utilities.NIL != parent_tail) ? conses_high.cadr(parent_tail) : event_utilities.NIL);
        final SubLObject docstring_tail = cdestructuring_bind.property_list_member((SubLObject)event_utilities.$kw4$DOCSTRING, current);
        final SubLObject docstring = (SubLObject)((event_utilities.NIL != docstring_tail) ? conses_high.cadr(docstring_tail) : event_utilities.NIL);
        final SubLObject hierarchy_tail = cdestructuring_bind.property_list_member((SubLObject)event_utilities.$kw5$HIERARCHY, current);
        final SubLObject hierarchy = (SubLObject)((event_utilities.NIL != hierarchy_tail) ? conses_high.cadr(hierarchy_tail) : event_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        if (event_utilities.NIL == parent) {
            Errors.error((SubLObject)event_utilities.$str6$Must_specify_a_parent_class_);
        }
        return (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym7$REGISTER_EVENT_CLASS, class_key, parent, hierarchy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 1654L)
    public static SubLObject generic_event_dispatcher_process_running_for_application_p(final SubLObject app_symbol) {
        if (event_utilities.NIL != generic_event_dispatcher_process_running_p()) {
            SubLObject known_applicationP = (SubLObject)event_utilities.NIL;
            SubLObject release = (SubLObject)event_utilities.NIL;
            try {
                release = Locks.seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
                known_applicationP = bag.bag_memberP(app_symbol, event_utilities.$generic_event_dispatcher_applications$.getGlobalValue());
            }
            finally {
                if (event_utilities.NIL != release) {
                    Locks.release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
                }
            }
            return known_applicationP;
        }
        return (SubLObject)event_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 2048L)
    public static SubLObject generic_event_dispatcher_process() {
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 2147L)
    public static SubLObject start_generic_event_dispatcher_process_for_application(final SubLObject app_symbol) {
        SubLObject release = (SubLObject)event_utilities.NIL;
        try {
            release = Locks.seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            if (event_utilities.NIL == bag.bag_add(app_symbol, event_utilities.$generic_event_dispatcher_applications$.getGlobalValue())) {
                generic_event_dispatcher_register_application_listeners(Symbols.symbol_value(app_symbol), event_broker.core_event_broker());
            }
            if (event_utilities.NIL == generic_event_dispatcher_process_running_p()) {
                start_generic_event_dispatcher_process();
            }
        }
        finally {
            if (event_utilities.NIL != release) {
                Locks.release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 2629L)
    public static SubLObject stop_generic_event_dispatcher_process_for_application(final SubLObject app_symbol) {
        SubLObject release = (SubLObject)event_utilities.NIL;
        try {
            release = Locks.seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            bag.bag_remove(app_symbol, event_utilities.$generic_event_dispatcher_applications$.getGlobalValue());
            if (event_utilities.NIL == bag.bag_memberP(app_symbol, event_utilities.$generic_event_dispatcher_applications$.getGlobalValue())) {
                generic_event_dispatcher_deregister_application_listeners(Symbols.symbol_value(app_symbol), event_broker.core_event_broker());
            }
            if (event_utilities.NIL != bag.bag_emptyP(event_utilities.$generic_event_dispatcher_applications$.getGlobalValue())) {
                stop_generic_event_dispatcher_process();
            }
        }
        finally {
            if (event_utilities.NIL != release) {
                Locks.release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 3191L)
    public static SubLObject ensure_generic_event_dispatcher_process_running_for_application(final SubLObject app_symbol) {
        if (event_utilities.NIL == generic_event_dispatcher_process_running_for_application_p(app_symbol)) {
            start_generic_event_dispatcher_process_for_application(app_symbol);
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 3487L)
    public static SubLObject generic_event_dispatcher_process_running_p() {
        return (SubLObject)SubLObjectFactory.makeBoolean(event_utilities.NIL != event_utilities.$generic_event_dispatcher_process$.getGlobalValue() && event_utilities.NIL != Threads.valid_process_p(event_utilities.$generic_event_dispatcher_process$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 3689L)
    public static SubLObject start_generic_event_dispatcher_process() {
        SubLObject release = (SubLObject)event_utilities.NIL;
        try {
            release = Locks.seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            if (event_utilities.NIL != generic_event_dispatcher_process_running_p()) {
                stop_generic_event_dispatcher_process();
            }
            event_utilities.$generic_event_dispatcher_process$.setGlobalValue(process_utilities.make_cyc_server_process((SubLObject)event_utilities.$str12$Generic_Event_Dispatcher_Process, (SubLObject)event_utilities.$sym13$DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER));
        }
        finally {
            if (event_utilities.NIL != release) {
                Locks.release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 4122L)
    public static SubLObject stop_generic_event_dispatcher_process() {
        SubLObject release = (SubLObject)event_utilities.NIL;
        try {
            release = Locks.seize_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            if (event_utilities.NIL != generic_event_dispatcher_process_running_p()) {
                Threads.kill_process(event_utilities.$generic_event_dispatcher_process$.getGlobalValue());
                event_utilities.$generic_event_dispatcher_process$.setGlobalValue((SubLObject)event_utilities.NIL);
            }
        }
        finally {
            if (event_utilities.NIL != release) {
                Locks.release_lock(event_utilities.$generic_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 4443L)
    public static SubLObject ensure_generic_event_dispatcher_process_running() {
        if (event_utilities.NIL == generic_event_dispatcher_process_running_p()) {
            start_generic_event_dispatcher_process();
        }
        return event_utilities.$generic_event_dispatcher_process$.getGlobalValue();
    }
    
	@SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 4657L)
	public static SubLObject dispatch_events_for_generic_event_dispatcher() {
		final SubLObject lock = event_utilities.$generic_event_dispatcher_lock$.getGlobalValue();
		final SubLObject broker = event_broker.core_event_broker();
		SubLObject release = (SubLObject) event_utilities.NIL;
		Label_0114: {
			try {
				release = Locks.seize_lock(lock);
				SubLObject cdolist_list_var = bag.bag_unique_element_list(event_utilities.$generic_event_dispatcher_applications$.getGlobalValue());
				SubLObject app_symbol = (SubLObject) event_utilities.NIL;
				app_symbol = cdolist_list_var.first();
				while (event_utilities.NIL != cdolist_list_var) {
					generic_event_dispatcher_register_application_listeners(Symbols.symbol_value(app_symbol), broker);
					cdolist_list_var = cdolist_list_var.rest();
					app_symbol = cdolist_list_var.first();
				}
				break Label_0114;
			} finally {
				if (event_utilities.NIL != release) {
					Locks.release_lock(lock);
				}
			}
		}
		try {
			while (true) {
				event_broker.receive_event(broker);
			}
		} finally {
			final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
			try {
				Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject) event_utilities.T);
				final SubLObject _values = Values.getValuesAsVector();
				SubLObject release_$2 = (SubLObject) event_utilities.NIL;
				try {
					release_$2 = Locks.seize_lock(lock);
					SubLObject cdolist_list_var2 = bag.bag_unique_element_list(event_utilities.$generic_event_dispatcher_applications$.getGlobalValue());
					SubLObject app_symbol2 = (SubLObject) event_utilities.NIL;
					app_symbol2 = cdolist_list_var2.first();
					while (event_utilities.NIL != cdolist_list_var2) {
						generic_event_dispatcher_deregister_application_listeners(Symbols.symbol_value(app_symbol2),broker);
						cdolist_list_var2 = cdolist_list_var2.rest();
						app_symbol2 = cdolist_list_var2.first();
					}
				} finally {
					if (event_utilities.NIL != release_$2) {
						Locks.release_lock(lock);
					}
				}
				Values.restoreValuesFromVector(_values);
			} finally {
				Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
	}
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 5386L)
    public static SubLObject generic_event_dispatcher_register_application_listeners(final SubLObject listeners, final SubLObject broker) {
        SubLObject cdolist_list_var = listeners;
        SubLObject listener = (SubLObject)event_utilities.NIL;
        listener = cdolist_list_var.first();
        while (event_utilities.NIL != cdolist_list_var) {
            event_broker.register_event_listener(listener, broker);
            cdolist_list_var = cdolist_list_var.rest();
            listener = cdolist_list_var.first();
        }
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 5577L)
    public static SubLObject generic_event_dispatcher_deregister_application_listeners(final SubLObject listeners, final SubLObject broker) {
        SubLObject cdolist_list_var = listeners;
        SubLObject listener = (SubLObject)event_utilities.NIL;
        listener = cdolist_list_var.first();
        while (event_utilities.NIL != cdolist_list_var) {
            event_broker.deregister_event_listener(listener, broker);
            cdolist_list_var = cdolist_list_var.rest();
            listener = cdolist_list_var.first();
        }
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 5769L)
    public static SubLObject declare_simple_event_dispatcher_process(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefix = (SubLObject)event_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list15);
        prefix = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)event_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)event_utilities.NIL;
        SubLObject current_$3 = (SubLObject)event_utilities.NIL;
        while (event_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)event_utilities.$list15);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)event_utilities.$list15);
            if (event_utilities.NIL == conses_high.member(current_$3, (SubLObject)event_utilities.$list16, (SubLObject)event_utilities.UNPROVIDED, (SubLObject)event_utilities.UNPROVIDED)) {
                bad = (SubLObject)event_utilities.T;
            }
            if (current_$3 == event_utilities.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (event_utilities.NIL != bad && event_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_utilities.$list15);
        }
        final SubLObject broker_tail = cdestructuring_bind.property_list_member((SubLObject)event_utilities.$kw17$BROKER, current);
        final SubLObject broker = (SubLObject)((event_utilities.NIL != broker_tail) ? conses_high.cadr(broker_tail) : event_utilities.NIL);
        final SubLObject docstring_tail = cdestructuring_bind.property_list_member((SubLObject)event_utilities.$kw4$DOCSTRING, current);
        final SubLObject docstring = (SubLObject)((event_utilities.NIL != docstring_tail) ? conses_high.cadr(docstring_tail) : event_utilities.NIL);
        final SubLObject postfix_tail = cdestructuring_bind.property_list_member((SubLObject)event_utilities.$kw18$POSTFIX, current);
        final SubLObject postfix = (SubLObject)((event_utilities.NIL != postfix_tail) ? conses_high.cadr(postfix_tail) : event_utilities.$str19$_EVENT_DISPATCHER);
        final SubLObject body;
        current = (body = temp);
        return declare_simple_event_dispatcher_process_internal(prefix, postfix, broker, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 6085L)
    public static SubLObject declare_simple_event_dispatcher_process_internal(final SubLObject prefix, final SubLObject postfix, final SubLObject broker, final SubLObject body) {
        final SubLObject lock = event_build_variable_symbol((SubLObject)event_utilities.$str20$, prefix, postfix, (SubLObject)event_utilities.$str21$_LOCK);
        final SubLObject lockname = event_build_string_label((SubLObject)event_utilities.$str20$, prefix, postfix, (SubLObject)event_utilities.$str22$_Lock);
        final SubLObject starter = event_build_function_symbol((SubLObject)event_utilities.$str23$START_, prefix, postfix, (SubLObject)event_utilities.UNPROVIDED);
        final SubLObject stopper = event_build_function_symbol((SubLObject)event_utilities.$str24$STOP_, prefix, postfix, (SubLObject)event_utilities.UNPROVIDED);
        final SubLObject running_p = event_build_function_symbol((SubLObject)event_utilities.$str20$, prefix, postfix, (SubLObject)event_utilities.$str25$_RUNNING_);
        final SubLObject ensure_running = event_build_function_symbol((SubLObject)event_utilities.$str26$ENSURE_, prefix, postfix, (SubLObject)event_utilities.$str27$_RUNNING);
        final SubLObject listeners = event_build_variable_symbol((SubLObject)event_utilities.$str20$, prefix, postfix, (SubLObject)event_utilities.$str28$_LISTENERS);
        final SubLObject register = event_build_function_symbol((SubLObject)event_utilities.$str29$REGISTER_LISTENER_WITH_, prefix, postfix, (SubLObject)event_utilities.UNPROVIDED);
        final SubLObject deregister = event_build_function_symbol((SubLObject)event_utilities.$str30$DEREGISTER_LISTENER_WITH_, prefix, postfix, (SubLObject)event_utilities.UNPROVIDED);
        return construct_event_dispatcher_process_declaration(lock, lockname, starter, stopper, running_p, ensure_running, listeners, register, deregister, broker, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 7107L)
    public static SubLObject construct_event_dispatcher_process_declaration(final SubLObject lock, final SubLObject lockname, final SubLObject starter, final SubLObject stopper, final SubLObject running_p, final SubLObject ensure_running, final SubLObject listeners, final SubLObject register, final SubLObject deregister, final SubLObject broker, final SubLObject body) {
        return (SubLObject)ConsesLow.listS((SubLObject)event_utilities.$sym31$PROGN, new SubLObject[] { declare_event_lock(lock, lockname), declare_event_code_running_p(running_p, listeners), declare_event_code_ensure_running(ensure_running, starter, running_p), declare_event_global(listeners, (SubLObject)event_utilities.NIL), declare_event_code_register(register, lock, listeners, broker, running_p), declare_event_code_deregister(deregister, lock, listeners, broker, running_p), declare_event_code_stopper(stopper, listeners), declare_event_code_starter(starter, listeners), ConsesLow.append(body, (SubLObject)event_utilities.NIL) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 7862L)
    public static SubLObject declare_event_lexical(final SubLObject var, SubLObject initial_value) {
        if (initial_value == event_utilities.UNPROVIDED) {
            initial_value = (SubLObject)event_utilities.NIL;
        }
        return (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym32$DEFLEXICAL_PRIVATE, var, initial_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 7991L)
    public static SubLObject declare_event_lock(final SubLObject lockvar, final SubLObject lockname) {
        return declare_event_lexical(lockvar, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym33$MAKE_LOCK, lockname));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8110L)
    public static SubLObject declare_event_global(final SubLObject var, SubLObject initial_value) {
        if (initial_value == event_utilities.UNPROVIDED) {
            initial_value = (SubLObject)event_utilities.NIL;
        }
        return (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym34$DEFGLOBAL_PRIVATE, var, initial_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8228L)
    public static SubLObject declare_event_code_starter(final SubLObject starter, final SubLObject listeners) {
        return (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym35$DEFINE_PUBLIC, starter, (SubLObject)event_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym36$RET, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym37$START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym38$QUOTE, listeners))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8422L)
    public static SubLObject declare_event_code_stopper(final SubLObject stopper, final SubLObject listeners) {
        return (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym35$DEFINE_PUBLIC, stopper, (SubLObject)event_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym36$RET, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym39$STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym38$QUOTE, listeners))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8615L)
    public static SubLObject declare_event_code_running_p(final SubLObject running_p, final SubLObject listeners) {
        return (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym35$DEFINE_PUBLIC, running_p, (SubLObject)event_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym36$RET, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym40$GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym38$QUOTE, listeners))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8813L)
    public static SubLObject declare_event_code_ensure_running(final SubLObject ensure_running, final SubLObject starter, final SubLObject running_p) {
        return (SubLObject)ConsesLow.listS((SubLObject)event_utilities.$sym35$DEFINE_PUBLIC, ensure_running, (SubLObject)event_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym41$PUNLESS, (SubLObject)ConsesLow.list(running_p), (SubLObject)ConsesLow.list(starter)), (SubLObject)event_utilities.$list42);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 9084L)
    public static SubLObject declare_event_code_register(final SubLObject register, final SubLObject lock, final SubLObject listeners, final SubLObject broker, final SubLObject running_p) {
        final SubLObject listener_var = (SubLObject)event_utilities.$sym43$LISTENER_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym35$DEFINE_PUBLIC, register, (SubLObject)ConsesLow.list(listener_var), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym44$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym41$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)event_utilities.$sym45$FIND, listener_var, listeners, (SubLObject)event_utilities.$list46), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym47$CPUSH, listener_var, listeners), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym48$PWHEN, (SubLObject)ConsesLow.list(running_p), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym49$REGISTER_EVENT_LISTENER, listener_var, broker)))), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym36$RET, listener_var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 9545L)
    public static SubLObject declare_event_code_deregister(final SubLObject deregister, final SubLObject lock, final SubLObject listeners, final SubLObject broker, final SubLObject running_p) {
        final SubLObject listener_var = (SubLObject)event_utilities.$sym50$LISTENER_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym35$DEFINE_PUBLIC, deregister, (SubLObject)ConsesLow.list(listener_var), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym44$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym51$CSETQ, listeners, (SubLObject)ConsesLow.listS((SubLObject)event_utilities.$sym52$REMOVE, listener_var, listeners, (SubLObject)event_utilities.$list46)), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym48$PWHEN, (SubLObject)ConsesLow.list(running_p), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym53$DEREGISTER_EVENT_LISTENER, listener_var, broker))), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym36$RET, listener_var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 9981L)
    public static SubLObject event_build_function_symbol(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail) {
        if (tail == event_utilities.UNPROVIDED) {
            tail = (SubLObject)event_utilities.$str20$;
        }
        return Packages.intern(Sequences.cconcatenate(head, new SubLObject[] { prefix, postfix, tail }), (SubLObject)event_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 10128L)
    public static SubLObject event_build_variable_symbol(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail) {
        if (tail == event_utilities.UNPROVIDED) {
            tail = (SubLObject)event_utilities.$str20$;
        }
        return Packages.intern(Sequences.cconcatenate((SubLObject)event_utilities.$str54$_, new SubLObject[] { head, prefix, postfix, tail, event_utilities.$str54$_ }), (SubLObject)event_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 10282L)
    public static SubLObject event_build_string_label(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail) {
        if (tail == event_utilities.UNPROVIDED) {
            tail = (SubLObject)event_utilities.$str20$;
        }
        return Sequences.cconcatenate(head, new SubLObject[] { prefix, postfix, tail });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 10416L)
    public static SubLObject event_message_cracker_privacy(final SubLObject privacy_level) {
        if (privacy_level.eql((SubLObject)event_utilities.$kw55$PROTECTED)) {
            return (SubLObject)event_utilities.$sym56$DEFINE_PROTECTED;
        }
        if (privacy_level.eql((SubLObject)event_utilities.$kw57$PUBLIC)) {
            return (SubLObject)event_utilities.$sym35$DEFINE_PUBLIC;
        }
        if (privacy_level.eql((SubLObject)event_utilities.$kw58$PRIVATE)) {
            return (SubLObject)event_utilities.$sym59$DEFINE_PRIVATE;
        }
        Errors.error((SubLObject)event_utilities.$str60$Unknown_privacy_level__S____not_o, privacy_level);
        return (SubLObject)event_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 10931L)
    public static SubLObject event_construct_message_cracker_symbol(final SubLObject type, final SubLObject slot) {
        return Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(type), new SubLObject[] { event_utilities.$str61$_RETRIEVE_, Symbols.symbol_name(slot) }), (SubLObject)event_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 11215L)
    public static SubLObject event_is_handler_registration_eventP(final SubLObject event) {
        return (SubLObject)SubLObjectFactory.makeBoolean(event_model.event_class(event) == event_utilities.$kw62$EVENT_HANDLER_REGISTERED || event_model.event_class(event) == event_utilities.$kw63$EVENT_HANDLER_DEREGISTERED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 11411L)
    public static SubLObject with_validated_event_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject event = (SubLObject)event_utilities.NIL;
        SubLObject event_type = (SubLObject)event_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list64);
        event = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list64);
        event_type = current.first();
        current = current.rest();
        if (event_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym31$PROGN, (SubLObject)ConsesLow.listS((SubLObject)event_utilities.$sym65$CHECK_TYPE, event, (SubLObject)event_utilities.$list66), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym41$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)event_utilities.EQ, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym67$EVENT_CLASS, event), event_type), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym41$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_, event), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym69$ERROR, (SubLObject)event_utilities.$str70$Event__S_is_of_type__S__not__S_, event, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym67$EVENT_CLASS, event), event_type))), reader.bq_cons((SubLObject)event_utilities.$sym31$PROGN, ConsesLow.append(body, (SubLObject)event_utilities.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_utilities.$list64);
        return (SubLObject)event_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 11896L)
    public static SubLObject define_event_message_crackers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list71);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject event_type = (SubLObject)event_utilities.NIL;
        SubLObject slot_list = (SubLObject)event_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list71);
        event_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_utilities.$list71);
        slot_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)event_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)event_utilities.NIL;
        SubLObject current_$4 = (SubLObject)event_utilities.NIL;
        while (event_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)event_utilities.$list71);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)event_utilities.$list71);
            if (event_utilities.NIL == conses_high.member(current_$4, (SubLObject)event_utilities.$list72, (SubLObject)event_utilities.UNPROVIDED, (SubLObject)event_utilities.UNPROVIDED)) {
                bad = (SubLObject)event_utilities.T;
            }
            if (current_$4 == event_utilities.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (event_utilities.NIL != bad && event_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_utilities.$list71);
        }
        final SubLObject privacy_level_tail = cdestructuring_bind.property_list_member((SubLObject)event_utilities.$kw73$PRIVACY_LEVEL, current);
        final SubLObject privacy_level = (SubLObject)((event_utilities.NIL != privacy_level_tail) ? conses_high.cadr(privacy_level_tail) : event_utilities.$kw55$PROTECTED);
        current = temp;
        if (event_utilities.NIL == current) {
            SubLObject expansions = (SubLObject)event_utilities.NIL;
            final SubLObject event = (SubLObject)event_utilities.$sym74$EVENT;
            SubLObject cdolist_list_var = slot_list;
            SubLObject slot = (SubLObject)event_utilities.NIL;
            slot = cdolist_list_var.first();
            while (event_utilities.NIL != cdolist_list_var) {
                final SubLObject define_privacy = event_message_cracker_privacy(privacy_level);
                final SubLObject expansion = (SubLObject)ConsesLow.list(define_privacy, event_construct_message_cracker_symbol(event_type, slot), (SubLObject)ConsesLow.list(event), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym75$WITH_VALIDATED_EVENT_TYPE, (SubLObject)ConsesLow.list(event, event_type), (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym36$RET, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym76$GETF, (SubLObject)ConsesLow.list((SubLObject)event_utilities.$sym77$EVENT_MESSAGE, event), slot))));
                expansions = (SubLObject)ConsesLow.cons(expansion, expansions);
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            return reader.bq_cons((SubLObject)event_utilities.$sym31$PROGN, ConsesLow.append(expansions, (SubLObject)event_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_utilities.$list71);
        return (SubLObject)event_utilities.NIL;
    }
    
    public static SubLObject declare_event_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.event_utilities", "declare_event_class", "DECLARE-EVENT-CLASS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "generic_event_dispatcher_process_running_for_application_p", "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "generic_event_dispatcher_process", "GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "start_generic_event_dispatcher_process_for_application", "START-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "stop_generic_event_dispatcher_process_for_application", "STOP-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "ensure_generic_event_dispatcher_process_running_for_application", "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "generic_event_dispatcher_process_running_p", "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "start_generic_event_dispatcher_process", "START-GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "stop_generic_event_dispatcher_process", "STOP-GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "ensure_generic_event_dispatcher_process_running", "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "dispatch_events_for_generic_event_dispatcher", "DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "generic_event_dispatcher_register_application_listeners", "GENERIC-EVENT-DISPATCHER-REGISTER-APPLICATION-LISTENERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "generic_event_dispatcher_deregister_application_listeners", "GENERIC-EVENT-DISPATCHER-DEREGISTER-APPLICATION-LISTENERS", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.event_utilities", "declare_simple_event_dispatcher_process", "DECLARE-SIMPLE-EVENT-DISPATCHER-PROCESS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_simple_event_dispatcher_process_internal", "DECLARE-SIMPLE-EVENT-DISPATCHER-PROCESS-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "construct_event_dispatcher_process_declaration", "CONSTRUCT-EVENT-DISPATCHER-PROCESS-DECLARATION", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_event_lexical", "DECLARE-EVENT-LEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_event_lock", "DECLARE-EVENT-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_event_global", "DECLARE-EVENT-GLOBAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_event_code_starter", "DECLARE-EVENT-CODE-STARTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_event_code_stopper", "DECLARE-EVENT-CODE-STOPPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_event_code_running_p", "DECLARE-EVENT-CODE-RUNNING-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_event_code_ensure_running", "DECLARE-EVENT-CODE-ENSURE-RUNNING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_event_code_register", "DECLARE-EVENT-CODE-REGISTER", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "declare_event_code_deregister", "DECLARE-EVENT-CODE-DEREGISTER", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "event_build_function_symbol", "EVENT-BUILD-FUNCTION-SYMBOL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "event_build_variable_symbol", "EVENT-BUILD-VARIABLE-SYMBOL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "event_build_string_label", "EVENT-BUILD-STRING-LABEL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "event_message_cracker_privacy", "EVENT-MESSAGE-CRACKER-PRIVACY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "event_construct_message_cracker_symbol", "EVENT-CONSTRUCT-MESSAGE-CRACKER-SYMBOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_utilities", "event_is_handler_registration_eventP", "EVENT-IS-HANDLER-REGISTRATION-EVENT?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.event_utilities", "with_validated_event_type", "WITH-VALIDATED-EVENT-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.event_utilities", "define_event_message_crackers", "DEFINE-EVENT-MESSAGE-CRACKERS");
        return (SubLObject)event_utilities.NIL;
    }
    
    public static SubLObject init_event_utilities_file() {
        event_utilities.$generic_event_dispatcher_lock$ = SubLFiles.deflexical("*GENERIC-EVENT-DISPATCHER-LOCK*", maybeDefault((SubLObject)event_utilities.$sym8$_GENERIC_EVENT_DISPATCHER_LOCK_, event_utilities.$generic_event_dispatcher_lock$, ()->(Locks.make_lock((SubLObject)event_utilities.$str9$Generic_Event_Dispatcher_Process_))));
        event_utilities.$generic_event_dispatcher_applications$ = SubLFiles.deflexical("*GENERIC-EVENT-DISPATCHER-APPLICATIONS*", maybeDefault((SubLObject)event_utilities.$sym10$_GENERIC_EVENT_DISPATCHER_APPLICATIONS_, event_utilities.$generic_event_dispatcher_applications$, ()->(bag.new_bag((SubLObject)event_utilities.UNPROVIDED, (SubLObject)event_utilities.UNPROVIDED))));
        event_utilities.$generic_event_dispatcher_process$ = SubLFiles.deflexical("*GENERIC-EVENT-DISPATCHER-PROCESS*", (SubLObject)(maybeDefault((SubLObject)event_utilities.$sym11$_GENERIC_EVENT_DISPATCHER_PROCESS_, event_utilities.$generic_event_dispatcher_process$, event_utilities.NIL)));
        return (SubLObject)event_utilities.NIL;
    }
    
    public static SubLObject setup_event_utilities_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)event_utilities.$sym8$_GENERIC_EVENT_DISPATCHER_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)event_utilities.$sym10$_GENERIC_EVENT_DISPATCHER_APPLICATIONS_);
        subl_macro_promotions.declare_defglobal((SubLObject)event_utilities.$sym11$_GENERIC_EVENT_DISPATCHER_PROCESS_);
        return (SubLObject)event_utilities.NIL;
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
        me = (SubLFile)new event_utilities();
        event_utilities.$generic_event_dispatcher_lock$ = null;
        event_utilities.$generic_event_dispatcher_applications$ = null;
        event_utilities.$generic_event_dispatcher_process$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("DOCSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("HIERARCHY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("DOCSTRING"), (SubLObject)SubLObjectFactory.makeKeyword("HIERARCHY"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$PARENT = SubLObjectFactory.makeKeyword("PARENT");
        $kw4$DOCSTRING = SubLObjectFactory.makeKeyword("DOCSTRING");
        $kw5$HIERARCHY = SubLObjectFactory.makeKeyword("HIERARCHY");
        $str6$Must_specify_a_parent_class_ = SubLObjectFactory.makeString("Must specify a parent class.");
        $sym7$REGISTER_EVENT_CLASS = SubLObjectFactory.makeSymbol("REGISTER-EVENT-CLASS");
        $sym8$_GENERIC_EVENT_DISPATCHER_LOCK_ = SubLObjectFactory.makeSymbol("*GENERIC-EVENT-DISPATCHER-LOCK*");
        $str9$Generic_Event_Dispatcher_Process_ = SubLObjectFactory.makeString("Generic Event Dispatcher Process Lock");
        $sym10$_GENERIC_EVENT_DISPATCHER_APPLICATIONS_ = SubLObjectFactory.makeSymbol("*GENERIC-EVENT-DISPATCHER-APPLICATIONS*");
        $sym11$_GENERIC_EVENT_DISPATCHER_PROCESS_ = SubLObjectFactory.makeSymbol("*GENERIC-EVENT-DISPATCHER-PROCESS*");
        $str12$Generic_Event_Dispatcher_Process = SubLObjectFactory.makeString("Generic Event Dispatcher Process");
        $sym13$DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER = SubLObjectFactory.makeSymbol("DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER");
        $kw14$TERMINATED = SubLObjectFactory.makeKeyword("TERMINATED");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("BROKER"), (SubLObject)SubLObjectFactory.makeSymbol("DOCSTRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSTFIX"), (SubLObject)SubLObjectFactory.makeString("-EVENT-DISPATCHER"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROKER"), (SubLObject)SubLObjectFactory.makeKeyword("DOCSTRING"), (SubLObject)SubLObjectFactory.makeKeyword("POSTFIX"));
        $kw17$BROKER = SubLObjectFactory.makeKeyword("BROKER");
        $kw18$POSTFIX = SubLObjectFactory.makeKeyword("POSTFIX");
        $str19$_EVENT_DISPATCHER = SubLObjectFactory.makeString("-EVENT-DISPATCHER");
        $str20$ = SubLObjectFactory.makeString("");
        $str21$_LOCK = SubLObjectFactory.makeString("-LOCK");
        $str22$_Lock = SubLObjectFactory.makeString(" Lock");
        $str23$START_ = SubLObjectFactory.makeString("START-");
        $str24$STOP_ = SubLObjectFactory.makeString("STOP-");
        $str25$_RUNNING_ = SubLObjectFactory.makeString("-RUNNING?");
        $str26$ENSURE_ = SubLObjectFactory.makeString("ENSURE-");
        $str27$_RUNNING = SubLObjectFactory.makeString("-RUNNING");
        $str28$_LISTENERS = SubLObjectFactory.makeString("-LISTENERS");
        $str29$REGISTER_LISTENER_WITH_ = SubLObjectFactory.makeString("REGISTER-LISTENER-WITH-");
        $str30$DEREGISTER_LISTENER_WITH_ = SubLObjectFactory.makeString("DEREGISTER-LISTENER-WITH-");
        $sym31$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym32$DEFLEXICAL_PRIVATE = SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE");
        $sym33$MAKE_LOCK = SubLObjectFactory.makeSymbol("MAKE-LOCK");
        $sym34$DEFGLOBAL_PRIVATE = SubLObjectFactory.makeSymbol("DEFGLOBAL-PRIVATE");
        $sym35$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym36$RET = SubLObjectFactory.makeSymbol("RET");
        $sym37$START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION = SubLObjectFactory.makeSymbol("START-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION");
        $sym38$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym39$STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION = SubLObjectFactory.makeSymbol("STOP-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION");
        $sym40$GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P = SubLObjectFactory.makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION-P");
        $sym41$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS"))));
        $sym43$LISTENER_VAR = SubLObjectFactory.makeUninternedSymbol("LISTENER-VAR");
        $sym44$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $sym45$FIND = SubLObjectFactory.makeSymbol("FIND");
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)event_utilities.EQUALP));
        $sym47$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym48$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym49$REGISTER_EVENT_LISTENER = SubLObjectFactory.makeSymbol("REGISTER-EVENT-LISTENER");
        $sym50$LISTENER_VAR = SubLObjectFactory.makeUninternedSymbol("LISTENER-VAR");
        $sym51$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym52$REMOVE = SubLObjectFactory.makeSymbol("REMOVE");
        $sym53$DEREGISTER_EVENT_LISTENER = SubLObjectFactory.makeSymbol("DEREGISTER-EVENT-LISTENER");
        $str54$_ = SubLObjectFactory.makeString("*");
        $kw55$PROTECTED = SubLObjectFactory.makeKeyword("PROTECTED");
        $sym56$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $kw57$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $kw58$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $sym59$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $str60$Unknown_privacy_level__S____not_o = SubLObjectFactory.makeString("Unknown privacy level ~S -- not one of :protected, :public, :private.");
        $str61$_RETRIEVE_ = SubLObjectFactory.makeString("-RETRIEVE-");
        $kw62$EVENT_HANDLER_REGISTERED = SubLObjectFactory.makeKeyword("EVENT-HANDLER-REGISTERED");
        $kw63$EVENT_HANDLER_DEREGISTERED = SubLObjectFactory.makeKeyword("EVENT-HANDLER-DEREGISTERED");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym65$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-P"));
        $sym67$EVENT_CLASS = SubLObjectFactory.makeSymbol("EVENT-CLASS");
        $sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_ = SubLObjectFactory.makeSymbol("EVENT-IS-HANDLER-REGISTRATION-EVENT?");
        $sym69$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str70$Event__S_is_of_type__S__not__S_ = SubLObjectFactory.makeString("Event ~S is of type ~S, not ~S.");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIVACY-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"))));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVACY-LEVEL"));
        $kw73$PRIVACY_LEVEL = SubLObjectFactory.makeKeyword("PRIVACY-LEVEL");
        $sym74$EVENT = SubLObjectFactory.makeUninternedSymbol("EVENT");
        $sym75$WITH_VALIDATED_EVENT_TYPE = SubLObjectFactory.makeSymbol("WITH-VALIDATED-EVENT-TYPE");
        $sym76$GETF = SubLObjectFactory.makeSymbol("GETF");
        $sym77$EVENT_MESSAGE = SubLObjectFactory.makeSymbol("EVENT-MESSAGE");
    }
}

/*

	Total time: 122 ms
	
*/