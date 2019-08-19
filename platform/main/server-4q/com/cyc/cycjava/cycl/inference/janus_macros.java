package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class janus_macros extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.janus_macros";
    public static String myFingerPrint = "2c8a2f76005522b75216eea405c2cb75a3289f863ce0c828abae8f87502c3493";
    private static SubLSymbol $sym0$CLET;
    private static SubLList $list1;
    private static SubLList $list2;

    @SubL(source = "cycl/inference/janus-macros.lisp", position = 800L)
    public static SubLObject janus_within_create(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym0$CLET, $list1, append(body, NIL));
    }

    @SubL(source = "cycl/inference/janus-macros.lisp", position = 900L)
    public static SubLObject janus_within_assert(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym0$CLET, $list2, append(body, NIL));
    }

    @SubL(source = "cycl/inference/janus-macros.lisp", position = 1100L)
    public static SubLObject janus_within_query(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym0$CLET, $list1, append(body, NIL));
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
        me = new janus_macros();
        $sym0$CLET = makeSymbol("CLET");
        $list1 = list(list(makeSymbol("*JANUS-WITHIN-SOMETHING?*"), T));
        $list2 = list(list(makeSymbol("*JANUS-WITHIN-SOMETHING?*"), T), list(makeSymbol("*JANUS-EXTRACTION-DEDUCE-SPECS*"), NIL));
    }
}
/*
 *
 * Total time: 63 ms
 *
 */