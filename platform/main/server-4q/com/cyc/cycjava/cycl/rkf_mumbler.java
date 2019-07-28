package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.rkf_mumbler;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.rkf_mumbler.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rkf_mumbler extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_mumbler();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_mumbler";

    public static final String myFingerPrint = "e2001b71b765fd09641003d1390afe3dcc85fb702647a85b9b8240ff5334a947";



    // deflexical
    private static final SubLSymbol $rkf_event_to_mumble_listener$ = makeSymbol("*RKF-EVENT-TO-MUMBLE-LISTENER*");

    private static final SubLSymbol $RKF_TRACE_EVENT = makeKeyword("RKF-TRACE-EVENT");

    private static final SubLSymbol $RKF_BASE_EVENT = makeKeyword("RKF-BASE-EVENT");



    public static final SubLList $list3 = list(list(makeSymbol("SOURCE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $rkf_default_mumble_address$ = makeSymbol("*RKF-DEFAULT-MUMBLE-ADDRESS*");

    public static final SubLSymbol RKF_MAP_EVENT_TO_MUMBLE = makeSymbol("RKF-MAP-EVENT-TO-MUMBLE");

    public static SubLObject rkf_with_my_mumblings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject source = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        source = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($rkf_default_mumble_address$, source)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static SubLObject rkf_mumble(final SubLObject string, SubLObject source) {
        if (source == UNPROVIDED) {
            source = $rkf_default_mumble_address$.getDynamicValue();
        }
        final SubLObject event = event_model.new_event($RKF_TRACE_EVENT, string, source);
        event_broker.post_event(event, rkf_event_dispatcher.current_rkf_event_broker());
        return string;
    }

    public static SubLObject rkf_fetch_mumble(final SubLObject address) {
        return message_mailboxes.retrieve_mail_from_message_mailbox(address);
    }

    public static SubLObject rkf_ensure_mumble_address(final SubLObject address) {
        final SubLObject mbox_suite = message_mailboxes.current_message_mailbox_suite();
        message_mailboxes.ensure_message_mailbox_allocation(address, mbox_suite);
        return address;
    }

    public static SubLObject map_rkf_event_to_mailbox(final SubLObject event) {
        final SubLObject source = event_model.event_source(event);
        final SubLObject message = event_model.event_message(event);
        message_mailboxes.store_mail_in_message_mailbox(source, message, UNPROVIDED);
        return event;
    }

    public static SubLObject rkf_map_event_to_mumble(final SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        map_rkf_event_to_mailbox(event);
        return event;
    }

    public static SubLObject ensure_rkf_event_to_mumble_ready(final SubLObject address) {
        rkf_event_dispatcher.ensure_rkf_event_dispatcher_running();
        rkf_ensure_mumble_address(address);
        return address;
    }

    public static SubLObject declare_rkf_mumbler_file() {
        declareMacro(me, "rkf_with_my_mumblings", "RKF-WITH-MY-MUMBLINGS");
        declareFunction(me, "rkf_mumble", "RKF-MUMBLE", 1, 1, false);
        declareFunction(me, "rkf_fetch_mumble", "RKF-FETCH-MUMBLE", 1, 0, false);
        declareFunction(me, "rkf_ensure_mumble_address", "RKF-ENSURE-MUMBLE-ADDRESS", 1, 0, false);
        declareFunction(me, "map_rkf_event_to_mailbox", "MAP-RKF-EVENT-TO-MAILBOX", 1, 0, false);
        declareFunction(me, "rkf_map_event_to_mumble", "RKF-MAP-EVENT-TO-MUMBLE", 1, 1, false);
        declareFunction(me, "ensure_rkf_event_to_mumble_ready", "ENSURE-RKF-EVENT-TO-MUMBLE-READY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_mumbler_file() {
        defparameter("*RKF-DEFAULT-MUMBLE-ADDRESS*", $SELF);
        deflexical("*RKF-EVENT-TO-MUMBLE-LISTENER*", event_broker.describe_funcall_listener($RKF_TRACE_EVENT, RKF_MAP_EVENT_TO_MUMBLE, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_rkf_mumbler_file() {
        event_model.register_event_class($RKF_TRACE_EVENT, $RKF_BASE_EVENT, NIL);
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($rkf_event_to_mumble_listener$.getGlobalValue());
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_mumbler_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_mumbler_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_mumbler_file();
    }

    static {










    }
}

/**
 * Total time: 18 ms
 */
