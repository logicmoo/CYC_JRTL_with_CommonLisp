/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      AGENT-MANAGER-PROTOCOL
 * source file: /cyc/top/cycl/agent-manager-protocol.lisp
 * created:     2019/07/03 17:37:58
 */
public final class agent_manager_protocol extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new agent_manager_protocol();

 public static final String myName = "com.cyc.cycjava.cycl.agent_manager_protocol";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol FIPA_TRANSPORT_MESSAGE = makeSymbol("FIPA-TRANSPORT-MESSAGE");

    private static final SubLSymbol ENVELOPE = makeSymbol("ENVELOPE");

    static private final SubLList $list5 = list(makeSymbol("PERFORMATIVE"), makeSymbol("&REST"), makeSymbol("PARMS"));

    private static final SubLSymbol ASK_ALL = makeSymbol("ASK-ALL");

    private static final SubLSymbol A_SENDER = makeSymbol("A-SENDER");

    private static final SubLSymbol A_RECEIVER = makeSymbol("A-RECEIVER");

    private static final SubLSymbol A_REPLY_WITH = makeSymbol("A-REPLY-WITH");

    private static final SubLSymbol $IN_REPLY_TO = makeKeyword("IN-REPLY-TO");

    private static final SubLSymbol AN_IN_REPLY_TO = makeSymbol("AN-IN-REPLY-TO");

    static private final SubLList $list16 = list(makeSymbol("SOME"), makeSymbol("CONTENT"));

    private static final SubLSymbol AMP = makeSymbol("AMP");

    static private final SubLString $str22$__amp_demo__S__ = makeString("~%amp-demo ~S~%");

    static private final SubLString $str23$amp_performative__S__ = makeString("amp-performative ~S~%");

    static private final SubLString $str24$amp_parm_value__sender__S__ = makeString("amp-parm-value :sender ~S~%");

    // Definitions
    /**
     * Return a FIPA Transport Message expression from the given ENVELOPE
     * and PAYLOAD.
     */
    @LispMethod(comment = "Return a FIPA Transport Message expression from the given ENVELOPE\r\nand PAYLOAD.\nReturn a FIPA Transport Message expression from the given ENVELOPE\nand PAYLOAD.")
    public static final SubLObject create_fipa_transport_message_alt(SubLObject envelope, SubLObject payload) {
        return list(FIPA_TRANSPORT_MESSAGE, envelope, payload);
    }

    // Definitions
    /**
     * Return a FIPA Transport Message expression from the given ENVELOPE
     * and PAYLOAD.
     */
    @LispMethod(comment = "Return a FIPA Transport Message expression from the given ENVELOPE\r\nand PAYLOAD.\nReturn a FIPA Transport Message expression from the given ENVELOPE\nand PAYLOAD.")
    public static SubLObject create_fipa_transport_message(final SubLObject envelope, final SubLObject payload) {
        return list(FIPA_TRANSPORT_MESSAGE, envelope, payload);
    }

    /**
     * Return the envelope of the FIPA-TRANSPORT-MESSAGE.
     */
    @LispMethod(comment = "Return the envelope of the FIPA-TRANSPORT-MESSAGE.")
    public static final SubLObject fipa_transport_message_envelope_alt(SubLObject fipa_transport_message) {
        return second(fipa_transport_message);
    }

    /**
     * Return the envelope of the FIPA-TRANSPORT-MESSAGE.
     */
    @LispMethod(comment = "Return the envelope of the FIPA-TRANSPORT-MESSAGE.")
    public static SubLObject fipa_transport_message_envelope(final SubLObject fipa_transport_message) {
        return second(fipa_transport_message);
    }

    /**
     * Return the payload of the FIPA-TRANSPORT-MESSAGE.
     */
    @LispMethod(comment = "Return the payload of the FIPA-TRANSPORT-MESSAGE.")
    public static final SubLObject fipa_tranport_message_payload_alt(SubLObject fipa_transport_message) {
        return third(fipa_transport_message);
    }

    /**
     * Return the payload of the FIPA-TRANSPORT-MESSAGE.
     */
    @LispMethod(comment = "Return the payload of the FIPA-TRANSPORT-MESSAGE.")
    public static SubLObject fipa_tranport_message_payload(final SubLObject fipa_transport_message) {
        return third(fipa_transport_message);
    }

    /**
     * Return an envelope expression from the given PARMS. These consist of
     * pairs of of parameters and values. The values of the performative parameters
     * are evaluated when creating the envelope expression.  The parameters are quoted.
     */
    @LispMethod(comment = "Return an envelope expression from the given PARMS. These consist of\r\npairs of of parameters and values. The values of the performative parameters\r\nare evaluated when creating the envelope expression.  The parameters are quoted.\nReturn an envelope expression from the given PARMS. These consist of\npairs of of parameters and values. The values of the performative parameters\nare evaluated when creating the envelope expression.  The parameters are quoted.")
    public static final SubLObject create_fipa_envelope_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject parms = current;
            SubLObject envelope = list(LIST, list(QUOTE, ENVELOPE));
            while (true) {
                if (NIL == parms) {
                    return envelope;
                }
                envelope = append(envelope, list(list(QUOTE, parms.first()), cadr(parms)));
                parms = cddr(parms);
            } 
        }
    }

    /**
     * Return an envelope expression from the given PARMS. These consist of
     * pairs of of parameters and values. The values of the performative parameters
     * are evaluated when creating the envelope expression.  The parameters are quoted.
     */
    @LispMethod(comment = "Return an envelope expression from the given PARMS. These consist of\r\npairs of of parameters and values. The values of the performative parameters\r\nare evaluated when creating the envelope expression.  The parameters are quoted.\nReturn an envelope expression from the given PARMS. These consist of\npairs of of parameters and values. The values of the performative parameters\nare evaluated when creating the envelope expression.  The parameters are quoted.")
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

    /**
     * Return the value corresponding to the ENVELOPE performative PARM, or NIL if
     * not present in the ENVELOPE expression.
     */
    @LispMethod(comment = "Return the value corresponding to the ENVELOPE performative PARM, or NIL if\r\nnot present in the ENVELOPE expression.\nReturn the value corresponding to the ENVELOPE performative PARM, or NIL if\nnot present in the ENVELOPE expression.")
    public static final SubLObject fipa_envelope_value_alt(SubLObject envelope, SubLObject parm) {
        {
            SubLObject parms = envelope.rest();
            while (true) {
                if (NIL == parms) {
                    return NIL;
                }
                if (parms.first() == parm) {
                    return cadr(parms);
                }
                parms = cddr(parms);
            } 
        }
    }

    /**
     * Return the value corresponding to the ENVELOPE performative PARM, or NIL if
     * not present in the ENVELOPE expression.
     */
    @LispMethod(comment = "Return the value corresponding to the ENVELOPE performative PARM, or NIL if\r\nnot present in the ENVELOPE expression.\nReturn the value corresponding to the ENVELOPE performative PARM, or NIL if\nnot present in the ENVELOPE expression.")
    public static SubLObject fipa_envelope_value(final SubLObject envelope, final SubLObject parm) {
        for (SubLObject parms = envelope.rest(); NIL != parms; parms = cddr(parms)) {
            if (parms.first().eql(parm)) {
                return cadr(parms);
            }
        }
        return NIL;
    }

    /**
     * Return the fipa payload expression containing the given AMP expression.
     */
    @LispMethod(comment = "Return the fipa payload expression containing the given AMP expression.")
    public static final SubLObject create_fipa_payload_alt(SubLObject amp) {
        return list(PAYLOAD, amp);
    }

    /**
     * Return the fipa payload expression containing the given AMP expression.
     */
    @LispMethod(comment = "Return the fipa payload expression containing the given AMP expression.")
    public static SubLObject create_fipa_payload(final SubLObject amp) {
        return list(PAYLOAD, amp);
    }

    /**
     * Return the AMP expression contained in the given fipa PAYLOAD.
     */
    @LispMethod(comment = "Return the AMP expression contained in the given fipa PAYLOAD.")
    public static final SubLObject fipa_payload_amp_alt(SubLObject payload) {
        return second(payload);
    }

    /**
     * Return the AMP expression contained in the given fipa PAYLOAD.
     */
    @LispMethod(comment = "Return the AMP expression contained in the given fipa PAYLOAD.")
    public static SubLObject fipa_payload_amp(final SubLObject payload) {
        return second(payload);
    }

    /**
     * Return a AMP expression from the given PERFORMATIVE and PARMS.
     * The values of the performative parameters are evaluated when creating
     * the AMP expression.  The performative and parameters are quoted.
     */
    @LispMethod(comment = "Return a AMP expression from the given PERFORMATIVE and PARMS.\r\nThe values of the performative parameters are evaluated when creating\r\nthe AMP expression.  The performative and parameters are quoted.\nReturn a AMP expression from the given PERFORMATIVE and PARMS.\nThe values of the performative parameters are evaluated when creating\nthe AMP expression.  The performative and parameters are quoted.")
    public static final SubLObject create_amp_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject performative = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            performative = current.first();
            current = current.rest();
            {
                SubLObject parms = current;
                SubLObject amp = list(LIST, list(QUOTE, performative));
                while (true) {
                    if (NIL == parms) {
                        return amp;
                    }
                    amp = append(amp, list(list(QUOTE, parms.first()), cadr(parms)));
                    parms = cddr(parms);
                } 
            }
        }
    }

    /**
     * Return a AMP expression from the given PERFORMATIVE and PARMS.
     * The values of the performative parameters are evaluated when creating
     * the AMP expression.  The performative and parameters are quoted.
     */
    @LispMethod(comment = "Return a AMP expression from the given PERFORMATIVE and PARMS.\r\nThe values of the performative parameters are evaluated when creating\r\nthe AMP expression.  The performative and parameters are quoted.\nReturn a AMP expression from the given PERFORMATIVE and PARMS.\nThe values of the performative parameters are evaluated when creating\nthe AMP expression.  The performative and parameters are quoted.")
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

    /**
     * Return the performative word from the AMP expression.
     */
    @LispMethod(comment = "Return the performative word from the AMP expression.")
    public static final SubLObject amp_performative_alt(SubLObject amp) {
        return amp.first();
    }

    @LispMethod(comment = "Return the performative word from the AMP expression.")
    public static SubLObject amp_performative(final SubLObject amp) {
        return amp.first();
    }/**
     * Return the performative word from the AMP expression.
     */


    /**
     * Return the value corresponding to the AMP performative PARM, or NIL if
     * not present in the AMP expression.
     */
    @LispMethod(comment = "Return the value corresponding to the AMP performative PARM, or NIL if\r\nnot present in the AMP expression.\nReturn the value corresponding to the AMP performative PARM, or NIL if\nnot present in the AMP expression.")
    public static final SubLObject amp_parm_value_alt(SubLObject amp, SubLObject parm) {
        {
            SubLObject parms = amp.rest();
            while (true) {
                if (NIL == parms) {
                    return NIL;
                }
                if (parms.first() == parm) {
                    return cadr(parms);
                }
                parms = cddr(parms);
            } 
        }
    }

    @LispMethod(comment = "Return the value corresponding to the AMP performative PARM, or NIL if\r\nnot present in the AMP expression.\nReturn the value corresponding to the AMP performative PARM, or NIL if\nnot present in the AMP expression.")
    public static SubLObject amp_parm_value(final SubLObject amp, final SubLObject parm) {
        for (SubLObject parms = amp.rest(); NIL != parms; parms = cddr(parms)) {
            if (parms.first().eql(parm)) {
                return cadr(parms);
            }
        }
        return NIL;
    }/**
     * Return the value corresponding to the AMP performative PARM, or NIL if
     * not present in the AMP expression.
     */


    public static final SubLObject amp_demo_alt() {
        {
            SubLObject amp = NIL;
            amp = list(new SubLObject[]{ ASK_ALL, $SENDER, A_SENDER, $RECEIVER, A_RECEIVER, $REPLY_WITH, A_REPLY_WITH, $IN_REPLY_TO, AN_IN_REPLY_TO, $CONTENT, $list_alt16, $LANGUAGE, AMP, $ONTOLOGY, CYCL, $FORCE, T });
            format(T, $str_alt22$__amp_demo__S__, amp);
            format(T, $str_alt23$amp_performative__S__, com.cyc.cycjava.cycl.agent_manager_protocol.amp_performative(amp));
            format(T, $str_alt24$amp_parm_value__sender__S__, com.cyc.cycjava.cycl.agent_manager_protocol.amp_parm_value(amp, $SENDER));
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
        declareFunction("create_fipa_transport_message", "CREATE-FIPA-TRANSPORT-MESSAGE", 2, 0, false);
        declareFunction("fipa_transport_message_envelope", "FIPA-TRANSPORT-MESSAGE-ENVELOPE", 1, 0, false);
        declareFunction("fipa_tranport_message_payload", "FIPA-TRANPORT-MESSAGE-PAYLOAD", 1, 0, false);
        declareMacro("create_fipa_envelope", "CREATE-FIPA-ENVELOPE");
        declareFunction("fipa_envelope_value", "FIPA-ENVELOPE-VALUE", 2, 0, false);
        declareFunction("create_fipa_payload", "CREATE-FIPA-PAYLOAD", 1, 0, false);
        declareFunction("fipa_payload_amp", "FIPA-PAYLOAD-AMP", 1, 0, false);
        declareMacro("create_amp", "CREATE-AMP");
        declareFunction("amp_performative", "AMP-PERFORMATIVE", 1, 0, false);
        declareFunction("amp_parm_value", "AMP-PARM-VALUE", 2, 0, false);
        declareFunction("amp_demo", "AMP-DEMO", 0, 0, false);
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

    

    static private final SubLList $list_alt5 = list(makeSymbol("PERFORMATIVE"), makeSymbol("&REST"), makeSymbol("PARMS"));

    static private final SubLList $list_alt16 = list(makeSymbol("SOME"), makeSymbol("CONTENT"));

    static private final SubLString $str_alt22$__amp_demo__S__ = makeString("~%amp-demo ~S~%");

    static private final SubLString $str_alt23$amp_performative__S__ = makeString("amp-performative ~S~%");

    static private final SubLString $str_alt24$amp_parm_value__sender__S__ = makeString("amp-parm-value :sender ~S~%");
}

/**
 * Total time: 27 ms
 */
