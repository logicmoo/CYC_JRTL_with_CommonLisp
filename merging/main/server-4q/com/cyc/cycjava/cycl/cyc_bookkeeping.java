/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYC-BOOKKEEPING
 * source file: /cyc/top/cycl/cyc-bookkeeping.lisp
 * created:     2019/07/03 17:37:48
 */
public final class cyc_bookkeeping extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cyc_bookkeeping();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_bookkeeping";




    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $bookkeeping_enabledP$ = makeSymbol("*BOOKKEEPING-ENABLED?*");

    private static final SubLSymbol WITH_BOOKKEEPING_INFO = makeSymbol("WITH-BOOKKEEPING-INFO");

    static private final SubLList $list2 = list(makeSymbol("BOOKKEEPING-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $cyc_bookkeeping_info$ = makeSymbol("*CYC-BOOKKEEPING-INFO*");

    static private final SubLList $list5 = list(makeSymbol("ASSERTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym6$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");

    public static final SubLSymbol $the_cyclist$ = makeSymbol("*THE-CYCLIST*");

    private static final SubLSymbol ASSERTED_BY = makeSymbol("ASSERTED-BY");

    public static final SubLSymbol $the_date$ = makeSymbol("*THE-DATE*");

    public static final SubLSymbol $ke_purpose$ = makeSymbol("*KE-PURPOSE*");

    private static final SubLSymbol ASSERTED_WHY = makeSymbol("ASSERTED-WHY");

    public static final SubLSymbol $the_second$ = makeSymbol("*THE-SECOND*");

    private static final SubLSymbol ASSERTED_SECOND = makeSymbol("ASSERTED-SECOND");

    static private final SubLList $list15 = list(makeSymbol("NEW-BOOKKEEPING-INFO"), makeSymbol("*THE-CYCLIST*"), makeSymbol("*THE-DATE*"), makeSymbol("*KE-PURPOSE*"), makeSymbol("*THE-SECOND*"));

    static private final SubLList $list17 = list(list(makeSymbol("*CYC-BOOKKEEPING-INFO*"), NIL));

    private static final SubLSymbol NEW_BOOKKEEPING_INFO = makeSymbol("NEW-BOOKKEEPING-INFO");

    /**
     * Binds *cyc-bookkeeping-info* to BOOKKEEPING-INFO, which must
     * be a plist.  The cyc-* functions will use this bookkeeping info
     * if it is bound.  Supported bookkeeping properties for the plist include:
     * :who      The Cyclist who performed the operation
     * :when     The universal date on which the operation was performed
     * :purpose  The #$Cyc-BasedProject for which the operation was performed
     * :second   The universal second at which the operation was performed
     */
    @LispMethod(comment = "Binds *cyc-bookkeeping-info* to BOOKKEEPING-INFO, which must\r\nbe a plist.  The cyc-* functions will use this bookkeeping info\r\nif it is bound.  Supported bookkeeping properties for the plist include:\r\n:who      The Cyclist who performed the operation\r\n:when     The universal date on which the operation was performed\r\n:purpose  The #$Cyc-BasedProject for which the operation was performed\r\n:second   The universal second at which the operation was performed\nBinds *cyc-bookkeeping-info* to BOOKKEEPING-INFO, which must\nbe a plist.  The cyc-* functions will use this bookkeeping info\nif it is bound.  Supported bookkeeping properties for the plist include:\n:who      The Cyclist who performed the operation\n:when     The universal date on which the operation was performed\n:purpose  The #$Cyc-BasedProject for which the operation was performed\n:second   The universal second at which the operation was performed")
    public static final SubLObject with_bookkeeping_info_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject bookkeeping_info = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            bookkeeping_info = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($cyc_bookkeeping_info$, bookkeeping_info)), append(body, NIL));
            }
        }
    }

    /**
     * Binds *cyc-bookkeeping-info* to BOOKKEEPING-INFO, which must
     * be a plist.  The cyc-* functions will use this bookkeeping info
     * if it is bound.  Supported bookkeeping properties for the plist include:
     * :who      The Cyclist who performed the operation
     * :when     The universal date on which the operation was performed
     * :purpose  The #$Cyc-BasedProject for which the operation was performed
     * :second   The universal second at which the operation was performed
     */
    @LispMethod(comment = "Binds *cyc-bookkeeping-info* to BOOKKEEPING-INFO, which must\r\nbe a plist.  The cyc-* functions will use this bookkeeping info\r\nif it is bound.  Supported bookkeeping properties for the plist include:\r\n:who      The Cyclist who performed the operation\r\n:when     The universal date on which the operation was performed\r\n:purpose  The #$Cyc-BasedProject for which the operation was performed\r\n:second   The universal second at which the operation was performed\nBinds *cyc-bookkeeping-info* to BOOKKEEPING-INFO, which must\nbe a plist.  The cyc-* functions will use this bookkeeping info\nif it is bound.  Supported bookkeeping properties for the plist include:\n:who      The Cyclist who performed the operation\n:when     The universal date on which the operation was performed\n:purpose  The #$Cyc-BasedProject for which the operation was performed\n:second   The universal second at which the operation was performed")
    public static SubLObject with_bookkeeping_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject bookkeeping_info = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        bookkeeping_info = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($cyc_bookkeeping_info$, bookkeeping_info)), append(body, NIL));
    }

    /**
     * Use the bookkeeping info from ASSERTION during the evaluation of BODY.
     */
    @LispMethod(comment = "Use the bookkeeping info from ASSERTION during the evaluation of BODY.")
    public static final SubLObject with_assertion_bookkeeping_info_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            assertion = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject assertion_var = $sym6$ASSERTION_VAR;
                return list(CLET, list(list(assertion_var, assertion), list($the_cyclist$, list(ASSERTED_BY, assertion_var)), list($the_date$, list(ASSERTED_WHEN, assertion_var)), list($ke_purpose$, list(ASSERTED_WHY, assertion_var)), list($the_second$, list(ASSERTED_SECOND, assertion_var))), listS(WITH_BOOKKEEPING_INFO, $list_alt15, append(body, NIL)));
            }
        }
    }

    /**
     * Use the bookkeeping info from ASSERTION during the evaluation of BODY.
     */
    @LispMethod(comment = "Use the bookkeeping info from ASSERTION during the evaluation of BODY.")
    public static SubLObject with_assertion_bookkeeping_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        assertion = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject assertion_var = $sym6$ASSERTION_VAR;
        return list(CLET, list(list(assertion_var, assertion), list($the_cyclist$, list(ASSERTED_BY, assertion_var)), list($the_date$, list(ASSERTED_WHEN, assertion_var)), list($ke_purpose$, list(ASSERTED_WHY, assertion_var)), list($the_second$, list(ASSERTED_SECOND, assertion_var))), listS(WITH_BOOKKEEPING_INFO, $list15, append(body, NIL)));
    }

    /**
     * Like @xref with-bookkeeping-info, except will not bind
     * cyc-bookkeeping-info* to NIL if BOOKKEEPING-INFO is nil.
     */
    @LispMethod(comment = "Like @xref with-bookkeeping-info, except will not bind\r\ncyc-bookkeeping-info* to NIL if BOOKKEEPING-INFO is nil.\nLike @xref with-bookkeeping-info, except will not bind\ncyc-bookkeeping-info* to NIL if BOOKKEEPING-INFO is nil.")
    public static final SubLObject possibly_with_bookkeeping_info_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject bookkeeping_info = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            bookkeeping_info = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                if (NIL != bookkeeping_info) {
                    return listS(WITH_BOOKKEEPING_INFO, bookkeeping_info, append(body, NIL));
                } else {
                    return bq_cons(PROGN, append(body, NIL));
                }
            }
        }
    }

    /**
     * Like @xref with-bookkeeping-info, except will not bind
     * cyc-bookkeeping-info* to NIL if BOOKKEEPING-INFO is nil.
     */
    @LispMethod(comment = "Like @xref with-bookkeeping-info, except will not bind\r\ncyc-bookkeeping-info* to NIL if BOOKKEEPING-INFO is nil.\nLike @xref with-bookkeeping-info, except will not bind\ncyc-bookkeeping-info* to NIL if BOOKKEEPING-INFO is nil.")
    public static SubLObject possibly_with_bookkeeping_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject bookkeeping_info = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        bookkeeping_info = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL != bookkeeping_info) {
            return listS(WITH_BOOKKEEPING_INFO, bookkeeping_info, append(body, NIL));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    /**
     * Binds *cyc-bookkeeping-info* to NIL, which causes the cyc-* functions
     * to not do any bookkeeping operations.
     */
    @LispMethod(comment = "Binds *cyc-bookkeeping-info* to NIL, which causes the cyc-* functions\r\nto not do any bookkeeping operations.\nBinds *cyc-bookkeeping-info* to NIL, which causes the cyc-* functions\nto not do any bookkeeping operations.")
    public static final SubLObject without_bookkeeping_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt17, append(body, NIL));
        }
    }

    /**
     * Binds *cyc-bookkeeping-info* to NIL, which causes the cyc-* functions
     * to not do any bookkeeping operations.
     */
    @LispMethod(comment = "Binds *cyc-bookkeeping-info* to NIL, which causes the cyc-* functions\r\nto not do any bookkeeping operations.\nBinds *cyc-bookkeeping-info* to NIL, which causes the cyc-* functions\nto not do any bookkeeping operations.")
    public static SubLObject without_bookkeeping(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list17, append(body, NIL));
    }

    /**
     * Public accessor for *cyc-bookkeeping-info*
     */
    @LispMethod(comment = "Public accessor for *cyc-bookkeeping-info*")
    public static final SubLObject cyc_bookkeeping_info_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cyc_bookkeeping_info$.getDynamicValue(thread);
        }
    }

    /**
     * Public accessor for *cyc-bookkeeping-info*
     */
    @LispMethod(comment = "Public accessor for *cyc-bookkeeping-info*")
    public static SubLObject cyc_bookkeeping_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cyc_bookkeeping_info$.getDynamicValue(thread);
    }

    public static final SubLObject do_bookkeepingP_alt() {
        return makeBoolean((NIL != $bookkeeping_enabledP$.getGlobalValue()) && (NIL != com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info()));
    }

    public static SubLObject do_bookkeepingP() {
        return makeBoolean((NIL != $bookkeeping_enabledP$.getGlobalValue()) && (NIL != cyc_bookkeeping_info()));
    }

    /**
     * Constructs a plist from any or all of the arguments passed in,
     * suitable for passing to @xref with-bookkeeping-info
     */
    @LispMethod(comment = "Constructs a plist from any or all of the arguments passed in,\r\nsuitable for passing to @xref with-bookkeeping-info\nConstructs a plist from any or all of the arguments passed in,\nsuitable for passing to @xref with-bookkeeping-info")
    public static final SubLObject new_bookkeeping_info_alt(SubLObject who, SubLObject when, SubLObject why, SubLObject when_sec) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        if (when == UNPROVIDED) {
            when = NIL;
        }
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (when_sec == UNPROVIDED) {
            when_sec = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != when_sec) {
                plist = nconc(list($SECOND, when_sec), plist);
            }
            if (NIL != why) {
                plist = nconc(list($PURPOSE, why), plist);
            }
            if (NIL != when) {
                plist = nconc(list($WHEN, when), plist);
            }
            if (NIL != who) {
                plist = nconc(list($WHO, who), plist);
            }
            return plist;
        }
    }

    @LispMethod(comment = "Constructs a plist from any or all of the arguments passed in,\r\nsuitable for passing to @xref with-bookkeeping-info\nConstructs a plist from any or all of the arguments passed in,\nsuitable for passing to @xref with-bookkeeping-info")
    public static SubLObject new_bookkeeping_info(SubLObject who, SubLObject when, SubLObject why, SubLObject when_sec) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        if (when == UNPROVIDED) {
            when = NIL;
        }
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (when_sec == UNPROVIDED) {
            when_sec = NIL;
        }
        SubLObject plist = NIL;
        if (NIL != when_sec) {
            plist = nconc(list($SECOND, when_sec), plist);
        }
        if (NIL != why) {
            plist = nconc(list($PURPOSE, why), plist);
        }
        if (NIL != when) {
            plist = nconc(list($WHEN, when), plist);
        }
        if (NIL != who) {
            plist = nconc(list($WHO, who), plist);
        }
        return plist;
    }

    /**
     * Constructs a plist from the bookkeeping info of ASSERTION
     * suitable for passing to @xref with-bookkeeping-info
     */
    @LispMethod(comment = "Constructs a plist from the bookkeeping info of ASSERTION\r\nsuitable for passing to @xref with-bookkeeping-info\nConstructs a plist from the bookkeeping info of ASSERTION\nsuitable for passing to @xref with-bookkeeping-info")
    public static final SubLObject assertion_bookkeeping_info_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject who = assertions_high.asserted_by(assertion);
            SubLObject when = assertions_high.asserted_when(assertion);
            SubLObject why = assertions_high.asserted_why(assertion);
            SubLObject when_sec = assertions_high.asserted_second(assertion);
            return com.cyc.cycjava.cycl.cyc_bookkeeping.new_bookkeeping_info(who, when, why, when_sec);
        }
    }

    /**
     * Constructs a plist from the bookkeeping info of ASSERTION
     * suitable for passing to @xref with-bookkeeping-info
     */
    @LispMethod(comment = "Constructs a plist from the bookkeeping info of ASSERTION\r\nsuitable for passing to @xref with-bookkeeping-info\nConstructs a plist from the bookkeeping info of ASSERTION\nsuitable for passing to @xref with-bookkeeping-info")
    public static SubLObject assertion_bookkeeping_info(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject who = assertions_high.asserted_by(assertion);
        final SubLObject when = assertions_high.asserted_when(assertion);
        final SubLObject why = assertions_high.asserted_why(assertion);
        final SubLObject when_sec = assertions_high.asserted_second(assertion);
        return new_bookkeeping_info(who, when, why, when_sec);
    }

    /**
     * Assumes that equality of WHAT can be tested with #'eql.
     */
    @LispMethod(comment = "Assumes that equality of WHAT can be tested with #\'eql.")
    public static final SubLObject cyc_bookkeeping_info_for_alt(SubLObject what) {
        return getf(com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info(), what, UNPROVIDED);
    }

    @LispMethod(comment = "Assumes that equality of WHAT can be tested with #\'eql.")
    public static SubLObject cyc_bookkeeping_info_for(final SubLObject what) {
        return getf(cyc_bookkeeping_info(), what, UNPROVIDED);
    }

    public static final SubLObject perform_constant_bookkeeping_alt(SubLObject constant) {
        if (NIL != com.cyc.cycjava.cycl.cyc_bookkeeping.do_bookkeepingP()) {
            {
                SubLObject who = com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info_for($WHO);
                SubLObject when = com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info_for($WHEN);
                SubLObject purpose = com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info_for($PURPOSE);
                SubLObject when_sec = com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info_for($SECOND);
                return fi.fi_timestamp_constant_int(who, when, purpose, when_sec);
            }
        }
        return NIL;
    }

    public static SubLObject perform_constant_bookkeeping(final SubLObject constant) {
        if (NIL != do_bookkeepingP()) {
            final SubLObject who = cyc_bookkeeping_info_for($WHO);
            final SubLObject when = cyc_bookkeeping_info_for($WHEN);
            final SubLObject purpose = cyc_bookkeeping_info_for($PURPOSE);
            final SubLObject when_sec = cyc_bookkeeping_info_for($SECOND);
            return fi.fi_timestamp_constant_int(who, when, purpose, when_sec);
        }
        return NIL;
    }

    public static final SubLObject perform_assertion_bookkeeping_alt(SubLObject assertion) {
        if (NIL != com.cyc.cycjava.cycl.cyc_bookkeeping.do_bookkeepingP()) {
            {
                SubLObject who = com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info_for($WHO);
                SubLObject when = com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info_for($WHEN);
                SubLObject purpose = com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info_for($PURPOSE);
                SubLObject when_sec = com.cyc.cycjava.cycl.cyc_bookkeeping.cyc_bookkeeping_info_for($SECOND);
                return fi.fi_timestamp_assertion_int(who, when, purpose, when_sec);
            }
        }
        return NIL;
    }

    public static SubLObject perform_assertion_bookkeeping(final SubLObject assertion) {
        if (NIL != do_bookkeepingP()) {
            final SubLObject who = cyc_bookkeeping_info_for($WHO);
            final SubLObject when = cyc_bookkeeping_info_for($WHEN);
            final SubLObject purpose = cyc_bookkeeping_info_for($PURPOSE);
            final SubLObject when_sec = cyc_bookkeeping_info_for($SECOND);
            return fi.fi_timestamp_assertion_int(who, when, purpose, when_sec);
        }
        return NIL;
    }

    public static SubLObject declare_cyc_bookkeeping_file() {
        declareMacro("with_bookkeeping_info", "WITH-BOOKKEEPING-INFO");
        declareMacro("with_assertion_bookkeeping_info", "WITH-ASSERTION-BOOKKEEPING-INFO");
        declareMacro("possibly_with_bookkeeping_info", "POSSIBLY-WITH-BOOKKEEPING-INFO");
        declareMacro("without_bookkeeping", "WITHOUT-BOOKKEEPING");
        declareFunction("cyc_bookkeeping_info", "CYC-BOOKKEEPING-INFO", 0, 0, false);
        declareFunction("do_bookkeepingP", "DO-BOOKKEEPING?", 0, 0, false);
        declareFunction("new_bookkeeping_info", "NEW-BOOKKEEPING-INFO", 0, 4, false);
        declareFunction("assertion_bookkeeping_info", "ASSERTION-BOOKKEEPING-INFO", 1, 0, false);
        declareFunction("cyc_bookkeeping_info_for", "CYC-BOOKKEEPING-INFO-FOR", 1, 0, false);
        declareFunction("perform_constant_bookkeeping", "PERFORM-CONSTANT-BOOKKEEPING", 1, 0, false);
        declareFunction("perform_assertion_bookkeeping", "PERFORM-ASSERTION-BOOKKEEPING", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyc_bookkeeping_file_alt() {
        deflexical("*BOOKKEEPING-ENABLED?*", NIL != boundp($bookkeeping_enabledP$) ? ((SubLObject) ($bookkeeping_enabledP$.getGlobalValue())) : T);
        defparameter("*CYC-BOOKKEEPING-INFO*", NIL);
        return NIL;
    }

    public static SubLObject init_cyc_bookkeeping_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*BOOKKEEPING-ENABLED?*", SubLTrampolineFile.maybeDefault($bookkeeping_enabledP$, $bookkeeping_enabledP$, T));
            defparameter("*CYC-BOOKKEEPING-INFO*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*BOOKKEEPING-ENABLED?*", NIL != boundp($bookkeeping_enabledP$) ? ((SubLObject) ($bookkeeping_enabledP$.getGlobalValue())) : T);
        }
        return NIL;
    }

    public static SubLObject init_cyc_bookkeeping_file_Previous() {
        deflexical("*BOOKKEEPING-ENABLED?*", SubLTrampolineFile.maybeDefault($bookkeeping_enabledP$, $bookkeeping_enabledP$, T));
        defparameter("*CYC-BOOKKEEPING-INFO*", NIL);
        return NIL;
    }

    public static SubLObject setup_cyc_bookkeeping_file() {
        declare_defglobal($bookkeeping_enabledP$);
        register_external_symbol(WITH_BOOKKEEPING_INFO);
        register_external_symbol(NEW_BOOKKEEPING_INFO);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cyc_bookkeeping_file();
    }

    @Override
    public void initializeVariables() {
        init_cyc_bookkeeping_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyc_bookkeeping_file();
    }

    

    static private final SubLList $list_alt2 = list(makeSymbol("BOOKKEEPING-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(makeSymbol("ASSERTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt15 = list(makeSymbol("NEW-BOOKKEEPING-INFO"), makeSymbol("*THE-CYCLIST*"), makeSymbol("*THE-DATE*"), makeSymbol("*KE-PURPOSE*"), makeSymbol("*THE-SECOND*"));

    static private final SubLList $list_alt17 = list(list(makeSymbol("*CYC-BOOKKEEPING-INFO*"), NIL));
}

/**
 * Total time: 100 ms
 */
