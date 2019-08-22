package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rtp_vars extends SubLTranslatedFile {
    public static final SubLFile me = new rtp_vars();

    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_vars";

    public static final String myFingerPrint = "3d1aa3c22f147246fc25af0b87d2516fd93576868ede49c71746e3d6eab21fbc";

    // deflexical
    // Definitions
    public static final SubLSymbol $tp_equal$ = makeSymbol("*TP-EQUAL*");

    // defparameter
    // the Mt from which semantic tests should be run
    public static final SubLSymbol $rtp_semantic_mt$ = makeSymbol("*RTP-SEMANTIC-MT*");

    // defparameter
    // the Mt from which all syntactic information will be accessed
    public static final SubLSymbol $rtp_syntactic_mt$ = makeSymbol("*RTP-SYNTACTIC-MT*");

    // defparameter
    /**
     * the amount of tracing desired. The higher the number, the more output will be
     * shown
     */
    public static final SubLSymbol $rtp_trace_level$ = makeSymbol("*RTP-TRACE-LEVEL*");

    // defparameter
    // what kind of information should the template parser return?
    public static final SubLSymbol $rtp_return_style$ = makeSymbol("*RTP-RETURN-STYLE*");

    private static final SubLObject $$AllEnglishTemplateMt = reader_make_constant_shell(makeString("AllEnglishTemplateMt"));



    public static SubLObject declare_rtp_vars_file() {
        return NIL;
    }

    public static SubLObject init_rtp_vars_file() {
        deflexical("*TP-EQUAL*", symbol_function(EQUALP));
        defparameter("*RTP-SEMANTIC-MT*", NIL);
        defparameter("*RTP-SYNTACTIC-MT*", $$AllEnglishTemplateMt);
        defparameter("*RTP-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*RTP-RETURN-STYLE*", $SIMPLE);
        return NIL;
    }

    public static SubLObject setup_rtp_vars_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rtp_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_rtp_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rtp_vars_file();
    }

    
}

/**
 * Total time: 10 ms
 */
