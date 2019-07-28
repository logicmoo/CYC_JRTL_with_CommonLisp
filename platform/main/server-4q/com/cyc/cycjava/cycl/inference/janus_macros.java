package com.cyc.cycjava.cycl.inference;


import com.cyc.cycjava.cycl.inference.janus_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.inference.janus_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class janus_macros extends SubLTranslatedFile {
    public static final SubLFile me = new janus_macros();

    public static final String myName = "com.cyc.cycjava.cycl.inference.janus_macros";

    public static final String myFingerPrint = "2c8a2f76005522b75216eea405c2cb75a3289f863ce0c828abae8f87502c3493";



    public static final SubLList $list1 = list(list(makeSymbol("*JANUS-WITHIN-SOMETHING?*"), T));

    public static final SubLList $list2 = list(list(makeSymbol("*JANUS-WITHIN-SOMETHING?*"), T), list(makeSymbol("*JANUS-EXTRACTION-DEDUCE-SPECS*"), NIL));

    public static SubLObject janus_within_create(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject janus_within_assert(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    public static SubLObject janus_within_query(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject declare_janus_macros_file() {
        declareMacro(me, "janus_within_create", "JANUS-WITHIN-CREATE");
        declareMacro(me, "janus_within_assert", "JANUS-WITHIN-ASSERT");
        declareMacro(me, "janus_within_query", "JANUS-WITHIN-QUERY");
        return NIL;
    }

    public static SubLObject init_janus_macros_file() {
        return NIL;
    }

    public static SubLObject setup_janus_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_janus_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_janus_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_janus_macros_file();
    }

    static {




    }
}

/**
 * Total time: 63 ms
 */
