package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class agent_manager_protocol extends SubLTranslatedFile {
    public static final SubLFile me = new agent_manager_protocol();

    public static final String myName = "com.cyc.cycjava.cycl.agent_manager_protocol";

    public static final String myFingerPrint = "cbdbd2cff9a78bf789f40d04e777fa5d6b726bd1f611bb52560342893fd06e1b";

    // Internal Constants
    public static final SubLSymbol FIPA_TRANSPORT_MESSAGE = makeSymbol("FIPA-TRANSPORT-MESSAGE");





    public static final SubLSymbol ENVELOPE = makeSymbol("ENVELOPE");



    public static final SubLList $list5 = list(makeSymbol("PERFORMATIVE"), makeSymbol("&REST"), makeSymbol("PARMS"));

    public static final SubLSymbol ASK_ALL = makeSymbol("ASK-ALL");



    public static final SubLSymbol A_SENDER = makeSymbol("A-SENDER");



    public static final SubLSymbol A_RECEIVER = makeSymbol("A-RECEIVER");



    public static final SubLSymbol A_REPLY_WITH = makeSymbol("A-REPLY-WITH");

    private static final SubLSymbol $IN_REPLY_TO = makeKeyword("IN-REPLY-TO");

    public static final SubLSymbol AN_IN_REPLY_TO = makeSymbol("AN-IN-REPLY-TO");



    public static final SubLList $list16 = list(makeSymbol("SOME"), makeSymbol("CONTENT"));



    public static final SubLSymbol AMP = makeSymbol("AMP");







    public static final SubLString $str22$__amp_demo__S__ = makeString("~%amp-demo ~S~%");

    public static final SubLString $str23$amp_performative__S__ = makeString("amp-performative ~S~%");

    public static final SubLString $str24$amp_parm_value__sender__S__ = makeString("amp-parm-value :sender ~S~%");

    public static SubLObject create_fipa_transport_message(final SubLObject envelope, final SubLObject payload) {
        return list(FIPA_TRANSPORT_MESSAGE, envelope, payload);
    }

    public static SubLObject fipa_transport_message_envelope(final SubLObject fipa_transport_message) {
        return second(fipa_transport_message);
    }

    public static SubLObject fipa_tranport_message_payload(final SubLObject fipa_transport_message) {
        return third(fipa_transport_message);
    }

    public static SubLObject create_fipa_envelope(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        SubLObject parms;
        final SubLObject current = parms = datum;
        SubLObject envelope = list(LIST, list(QUOTE, ENVELOPE));
        while (NIL != parms) {
            envelope = append(envelope, list(list(QUOTE, parms.first()), cadr(parms)));
            parms = cddr(parms);
        } 
        return envelope;
    }

    public static SubLObject fipa_envelope_value(final SubLObject envelope, final SubLObject parm) {
        for (SubLObject parms = envelope.rest(); NIL != parms; parms = cddr(parms)) {
            if (parms.first().eql(parm)) {
                return cadr(parms);
            }
        }
        return NIL;
    }

    public static SubLObject create_fipa_payload(final SubLObject amp) {
        return list(PAYLOAD, amp);
    }

    public static SubLObject fipa_payload_amp(final SubLObject payload) {
        return second(payload);
    }

    public static SubLObject create_amp(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject performative = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        performative = current.first();
        SubLObject parms;
        current = parms = current.rest();
        SubLObject amp = list(LIST, list(QUOTE, performative));
        while (NIL != parms) {
            amp = append(amp, list(list(QUOTE, parms.first()), cadr(parms)));
            parms = cddr(parms);
        } 
        return amp;
    }

    public static SubLObject amp_performative(final SubLObject amp) {
        return amp.first();
    }

    public static SubLObject amp_parm_value(final SubLObject amp, final SubLObject parm) {
        for (SubLObject parms = amp.rest(); NIL != parms; parms = cddr(parms)) {
            if (parms.first().eql(parm)) {
                return cadr(parms);
            }
        }
        return NIL;
    }

    public static SubLObject amp_demo() {
        SubLObject amp = NIL;
        amp = list(new SubLObject[]{ ASK_ALL, $SENDER, A_SENDER, $RECEIVER, A_RECEIVER, $REPLY_WITH, A_REPLY_WITH, $IN_REPLY_TO, AN_IN_REPLY_TO, $CONTENT, $list16, $LANGUAGE, AMP, $ONTOLOGY, CYCL, $FORCE, T });
        format(T, $str22$__amp_demo__S__, amp);
        format(T, $str23$amp_performative__S__, amp_performative(amp));
        format(T, $str24$amp_parm_value__sender__S__, amp_parm_value(amp, $SENDER));
        return NIL;
    }

    public static SubLObject declare_agent_manager_protocol_file() {
        declareFunction(me, "create_fipa_transport_message", "CREATE-FIPA-TRANSPORT-MESSAGE", 2, 0, false);
        declareFunction(me, "fipa_transport_message_envelope", "FIPA-TRANSPORT-MESSAGE-ENVELOPE", 1, 0, false);
        declareFunction(me, "fipa_tranport_message_payload", "FIPA-TRANPORT-MESSAGE-PAYLOAD", 1, 0, false);
        declareMacro(me, "create_fipa_envelope", "CREATE-FIPA-ENVELOPE");
        declareFunction(me, "fipa_envelope_value", "FIPA-ENVELOPE-VALUE", 2, 0, false);
        declareFunction(me, "create_fipa_payload", "CREATE-FIPA-PAYLOAD", 1, 0, false);
        declareFunction(me, "fipa_payload_amp", "FIPA-PAYLOAD-AMP", 1, 0, false);
        declareMacro(me, "create_amp", "CREATE-AMP");
        declareFunction(me, "amp_performative", "AMP-PERFORMATIVE", 1, 0, false);
        declareFunction(me, "amp_parm_value", "AMP-PARM-VALUE", 2, 0, false);
        declareFunction(me, "amp_demo", "AMP-DEMO", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_agent_manager_protocol_file() {
        return NIL;
    }

    public static SubLObject setup_agent_manager_protocol_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_agent_manager_protocol_file();
    }

    @Override
    public void initializeVariables() {
        init_agent_manager_protocol_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_agent_manager_protocol_file();
    }

    
}

/**
 * Total time: 27 ms
 */
