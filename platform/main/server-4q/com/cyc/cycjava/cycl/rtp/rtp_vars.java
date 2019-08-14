/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rtp;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RTP-VARS
 * source file: /cyc/top/cycl/rtp/rtp-vars.lisp
 * created:     2019/07/03 17:38:39
 */
public final class rtp_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rtp_vars();

 public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_vars";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $tp_equal$ = makeSymbol("*TP-EQUAL*");

    // defparameter
    // the Mt from which semantic tests should be run
    /**
     * the Mt from which semantic tests should be run
     */
    @LispMethod(comment = "the Mt from which semantic tests should be run\ndefparameter")
    public static final SubLSymbol $rtp_semantic_mt$ = makeSymbol("*RTP-SEMANTIC-MT*");

    // defparameter
    // the Mt from which all syntactic information will be accessed
    /**
     * the Mt from which all syntactic information will be accessed
     */
    @LispMethod(comment = "the Mt from which all syntactic information will be accessed\ndefparameter")
    public static final SubLSymbol $rtp_syntactic_mt$ = makeSymbol("*RTP-SYNTACTIC-MT*");

    // defparameter
    /**
     * the amount of tracing desired. The higher the number, the more output will be
     * shown
     */
    @LispMethod(comment = "the amount of tracing desired. The higher the number, the more output will be\r\nshown\ndefparameter\nthe amount of tracing desired. The higher the number, the more output will be\nshown")
    public static final SubLSymbol $rtp_trace_level$ = makeSymbol("*RTP-TRACE-LEVEL*");

    // defparameter
    // what kind of information should the template parser return?
    /**
     * what kind of information should the template parser return?
     */
    @LispMethod(comment = "what kind of information should the template parser return?\ndefparameter")
    public static final SubLSymbol $rtp_return_style$ = makeSymbol("*RTP-RETURN-STYLE*");



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

    static {
    }
}

/**
 * Total time: 10 ms
 */
