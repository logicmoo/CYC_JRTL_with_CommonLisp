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
 * module:      KQML
 * source file: /cyc/top/cycl/kqml.lisp
 * created:     2019/07/03 17:37:58
 */
public final class kqml extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new kqml();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("PERFORMATIVE"), makeSymbol("&REST"), makeSymbol("PARMS"));

    private static final SubLSymbol ASK_ALL = makeSymbol("ASK-ALL");

    private static final SubLSymbol A_SENDER = makeSymbol("A-SENDER");

    private static final SubLSymbol A_RECEIVER = makeSymbol("A-RECEIVER");

    private static final SubLSymbol A_REPLY_WITH = makeSymbol("A-REPLY-WITH");

    private static final SubLSymbol $IN_REPLY_TO = makeKeyword("IN-REPLY-TO");

    private static final SubLSymbol AN_IN_REPLY_TO = makeSymbol("AN-IN-REPLY-TO");

    static private final SubLList $list13 = list(makeSymbol("SOME"), makeSymbol("CONTENT"));

    private static final SubLSymbol KQML = makeSymbol("KQML");

    static private final SubLString $str19$__kqml_demo__S__ = makeString("~%kqml-demo ~S~%");

    static private final SubLString $str20$kqml_performative__S__ = makeString("kqml-performative ~S~%");

    static private final SubLString $str21$kqml_parm_value__sender__S__ = makeString("kqml-parm-value :sender ~S~%");

    // Definitions
    /**
     * Return a KQML expression from the given PERFORMATIVE and PARMS.
     * The values of the performative parameters are evaluated when creating
     * the KQML expression.  The performative and parameters are quoted.
     */
    @LispMethod(comment = "Return a KQML expression from the given PERFORMATIVE and PARMS.\r\nThe values of the performative parameters are evaluated when creating\r\nthe KQML expression.  The performative and parameters are quoted.\nReturn a KQML expression from the given PERFORMATIVE and PARMS.\nThe values of the performative parameters are evaluated when creating\nthe KQML expression.  The performative and parameters are quoted.")
    public static final SubLObject create_kqml_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject performative = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            performative = current.first();
            current = current.rest();
            {
                SubLObject parms = current;
                SubLObject v_kqml = list(LIST, list(QUOTE, performative));
                while (true) {
                    if (NIL == parms) {
                        return v_kqml;
                    }
                    v_kqml = append(v_kqml, list(list(QUOTE, parms.first()), cadr(parms)));
                    parms = cddr(parms);
                } 
            }
        }
    }

    // Definitions
    /**
     * Return a KQML expression from the given PERFORMATIVE and PARMS.
     * The values of the performative parameters are evaluated when creating
     * the KQML expression.  The performative and parameters are quoted.
     */
    @LispMethod(comment = "Return a KQML expression from the given PERFORMATIVE and PARMS.\r\nThe values of the performative parameters are evaluated when creating\r\nthe KQML expression.  The performative and parameters are quoted.\nReturn a KQML expression from the given PERFORMATIVE and PARMS.\nThe values of the performative parameters are evaluated when creating\nthe KQML expression.  The performative and parameters are quoted.")
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

    /**
     * Return the performative word from the KQML expression.
     */
    @LispMethod(comment = "Return the performative word from the KQML expression.")
    public static final SubLObject kqml_performative_alt(SubLObject v_kqml) {
        return v_kqml.first();
    }

    /**
     * Return the performative word from the KQML expression.
     */
    @LispMethod(comment = "Return the performative word from the KQML expression.")
    public static SubLObject kqml_performative(final SubLObject v_kqml) {
        return v_kqml.first();
    }

    /**
     * Return the value corresponding to the KQML performative PARM, or NIL if
     * not present in the KQML expression.
     */
    @LispMethod(comment = "Return the value corresponding to the KQML performative PARM, or NIL if\r\nnot present in the KQML expression.\nReturn the value corresponding to the KQML performative PARM, or NIL if\nnot present in the KQML expression.")
    public static final SubLObject kqml_parm_value_alt(SubLObject v_kqml, SubLObject parm) {
        {
            SubLObject parms = v_kqml.rest();
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
     * Return the value corresponding to the KQML performative PARM, or NIL if
     * not present in the KQML expression.
     */
    @LispMethod(comment = "Return the value corresponding to the KQML performative PARM, or NIL if\r\nnot present in the KQML expression.\nReturn the value corresponding to the KQML performative PARM, or NIL if\nnot present in the KQML expression.")
    public static SubLObject kqml_parm_value(final SubLObject v_kqml, final SubLObject parm) {
        for (SubLObject parms = v_kqml.rest(); NIL != parms; parms = cddr(parms)) {
            if (parms.first().eql(parm)) {
                return cadr(parms);
            }
        }
        return NIL;
    }

    public static final SubLObject kqml_demo_alt() {
        {
            SubLObject v_kqml = NIL;
            v_kqml = list(new SubLObject[]{ ASK_ALL, $SENDER, A_SENDER, $RECEIVER, A_RECEIVER, $REPLY_WITH, A_REPLY_WITH, $IN_REPLY_TO, AN_IN_REPLY_TO, $CONTENT, $list_alt13, $LANGUAGE, KQML, $ONTOLOGY, CYCL, $FORCE, T });
            format(T, $str_alt19$__kqml_demo__S__, v_kqml);
            format(T, $str_alt20$kqml_performative__S__, com.cyc.cycjava.cycl.kqml.kqml_performative(v_kqml));
            format(T, $str_alt21$kqml_parm_value__sender__S__, com.cyc.cycjava.cycl.kqml.kqml_parm_value(v_kqml, $SENDER));
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
        declareMacro("create_kqml", "CREATE-KQML");
        declareFunction("kqml_performative", "KQML-PERFORMATIVE", 1, 0, false);
        declareFunction("kqml_parm_value", "KQML-PARM-VALUE", 2, 0, false);
        declareFunction("kqml_demo", "KQML-DEMO", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_kqml_file() {
        return NIL;
    }

    public static SubLObject setup_kqml_file() {
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("PERFORMATIVE"), makeSymbol("&REST"), makeSymbol("PARMS"));

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

    static private final SubLList $list_alt13 = list(makeSymbol("SOME"), makeSymbol("CONTENT"));

    static private final SubLString $str_alt19$__kqml_demo__S__ = makeString("~%kqml-demo ~S~%");

    static private final SubLString $str_alt20$kqml_performative__S__ = makeString("kqml-performative ~S~%");

    static private final SubLString $str_alt21$kqml_parm_value__sender__S__ = makeString("kqml-parm-value :sender ~S~%");
}

/**
 * Total time: 18 ms
 */
