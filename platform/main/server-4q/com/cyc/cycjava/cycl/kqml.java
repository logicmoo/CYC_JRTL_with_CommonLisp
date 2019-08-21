package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.kqml;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.kqml.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kqml extends SubLTranslatedFile {
    public static final SubLFile me = new kqml();

    public static final String myName = "com.cyc.cycjava.cycl.kqml";

    public static final String myFingerPrint = "27875a0181070618a1c2a73935aa6c4f7945a3c7ffc5435b32db232d3566b1db";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("PERFORMATIVE"), makeSymbol("&REST"), makeSymbol("PARMS"));





    public static final SubLSymbol ASK_ALL = makeSymbol("ASK-ALL");



    public static final SubLSymbol A_SENDER = makeSymbol("A-SENDER");



    public static final SubLSymbol A_RECEIVER = makeSymbol("A-RECEIVER");



    public static final SubLSymbol A_REPLY_WITH = makeSymbol("A-REPLY-WITH");

    private static final SubLSymbol $IN_REPLY_TO = makeKeyword("IN-REPLY-TO");

    public static final SubLSymbol AN_IN_REPLY_TO = makeSymbol("AN-IN-REPLY-TO");



    public static final SubLList $list13 = list(makeSymbol("SOME"), makeSymbol("CONTENT"));



    public static final SubLSymbol KQML = makeSymbol("KQML");







    public static final SubLString $str19$__kqml_demo__S__ = makeString("~%kqml-demo ~S~%");

    public static final SubLString $str20$kqml_performative__S__ = makeString("kqml-performative ~S~%");

    public static final SubLString $str21$kqml_parm_value__sender__S__ = makeString("kqml-parm-value :sender ~S~%");

    public static SubLObject create_kqml(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject performative = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        performative = current.first();
        SubLObject parms;
        current = parms = current.rest();
        SubLObject v_kqml = list(LIST, list(QUOTE, performative));
        while (NIL != parms) {
            v_kqml = append(v_kqml, list(list(QUOTE, parms.first()), cadr(parms)));
            parms = cddr(parms);
        } 
        return v_kqml;
    }

    public static SubLObject kqml_performative(final SubLObject v_kqml) {
        return v_kqml.first();
    }

    public static SubLObject kqml_parm_value(final SubLObject v_kqml, final SubLObject parm) {
        for (SubLObject parms = v_kqml.rest(); NIL != parms; parms = cddr(parms)) {
            if (parms.first().eql(parm)) {
                return cadr(parms);
            }
        }
        return NIL;
    }

    public static SubLObject kqml_demo() {
        SubLObject v_kqml = NIL;
        v_kqml = list(new SubLObject[]{ ASK_ALL, $SENDER, A_SENDER, $RECEIVER, A_RECEIVER, $REPLY_WITH, A_REPLY_WITH, $IN_REPLY_TO, AN_IN_REPLY_TO, $CONTENT, $list13, $LANGUAGE, KQML, $ONTOLOGY, CYCL, $FORCE, T });
        format(T, $str19$__kqml_demo__S__, v_kqml);
        format(T, $str20$kqml_performative__S__, kqml_performative(v_kqml));
        format(T, $str21$kqml_parm_value__sender__S__, kqml_parm_value(v_kqml, $SENDER));
        return NIL;
    }

    public static SubLObject declare_kqml_file() {
        declareMacro(me, "create_kqml", "CREATE-KQML");
        declareFunction(me, "kqml_performative", "KQML-PERFORMATIVE", 1, 0, false);
        declareFunction(me, "kqml_parm_value", "KQML-PARM-VALUE", 2, 0, false);
        declareFunction(me, "kqml_demo", "KQML-DEMO", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_kqml_file() {
        return NIL;
    }

    public static SubLObject setup_kqml_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kqml_file();
    }

    @Override
    public void initializeVariables() {
        init_kqml_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kqml_file();
    }

    static {























    }
}

/**
 * Total time: 18 ms
 */
