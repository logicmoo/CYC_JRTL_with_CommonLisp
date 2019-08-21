package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cyc_bookkeeping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cyc_bookkeeping.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cyc_bookkeeping extends SubLTranslatedFile {
    public static final SubLFile me = new cyc_bookkeeping();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_bookkeeping";

    public static final String myFingerPrint = "5e63efaf0c4abecba62228f463ba077a2e4985a20a041af661f568e9b8b4de47";

    // deflexical
    /**
     * If T, bookkeeping information, if any, is considered. Can be set to nil by
     * applications that don't care about bookkeeping.
     */
    public static final SubLSymbol $bookkeeping_enabledP$ = makeSymbol("*BOOKKEEPING-ENABLED?*");



    // Internal Constants
    public static final SubLSymbol $sym0$_BOOKKEEPING_ENABLED__ = makeSymbol("*BOOKKEEPING-ENABLED?*");

    public static final SubLSymbol WITH_BOOKKEEPING_INFO = makeSymbol("WITH-BOOKKEEPING-INFO");

    public static final SubLList $list2 = list(makeSymbol("BOOKKEEPING-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $cyc_bookkeeping_info$ = makeSymbol("*CYC-BOOKKEEPING-INFO*");

    public static final SubLList $list5 = list(makeSymbol("ASSERTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym6$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");

    public static final SubLSymbol $the_cyclist$ = makeSymbol("*THE-CYCLIST*");

    public static final SubLSymbol ASSERTED_BY = makeSymbol("ASSERTED-BY");

    public static final SubLSymbol $the_date$ = makeSymbol("*THE-DATE*");



    public static final SubLSymbol $ke_purpose$ = makeSymbol("*KE-PURPOSE*");

    public static final SubLSymbol ASSERTED_WHY = makeSymbol("ASSERTED-WHY");

    public static final SubLSymbol $the_second$ = makeSymbol("*THE-SECOND*");

    public static final SubLSymbol ASSERTED_SECOND = makeSymbol("ASSERTED-SECOND");

    public static final SubLList $list15 = list(makeSymbol("NEW-BOOKKEEPING-INFO"), makeSymbol("*THE-CYCLIST*"), makeSymbol("*THE-DATE*"), makeSymbol("*KE-PURPOSE*"), makeSymbol("*THE-SECOND*"));



    public static final SubLList $list17 = list(list(makeSymbol("*CYC-BOOKKEEPING-INFO*"), NIL));

    public static final SubLSymbol NEW_BOOKKEEPING_INFO = makeSymbol("NEW-BOOKKEEPING-INFO");











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

    public static SubLObject without_bookkeeping(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list17, append(body, NIL));
    }

    public static SubLObject cyc_bookkeeping_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cyc_bookkeeping_info$.getDynamicValue(thread);
    }

    public static SubLObject do_bookkeepingP() {
        return makeBoolean((NIL != $bookkeeping_enabledP$.getGlobalValue()) && (NIL != cyc_bookkeeping_info()));
    }

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

    public static SubLObject assertion_bookkeeping_info(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject who = assertions_high.asserted_by(assertion);
        final SubLObject when = assertions_high.asserted_when(assertion);
        final SubLObject why = assertions_high.asserted_why(assertion);
        final SubLObject when_sec = assertions_high.asserted_second(assertion);
        return new_bookkeeping_info(who, when, why, when_sec);
    }

    public static SubLObject cyc_bookkeeping_info_for(final SubLObject what) {
        return getf(cyc_bookkeeping_info(), what, UNPROVIDED);
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
        declareMacro(me, "with_bookkeeping_info", "WITH-BOOKKEEPING-INFO");
        declareMacro(me, "with_assertion_bookkeeping_info", "WITH-ASSERTION-BOOKKEEPING-INFO");
        declareMacro(me, "possibly_with_bookkeeping_info", "POSSIBLY-WITH-BOOKKEEPING-INFO");
        declareMacro(me, "without_bookkeeping", "WITHOUT-BOOKKEEPING");
        declareFunction(me, "cyc_bookkeeping_info", "CYC-BOOKKEEPING-INFO", 0, 0, false);
        declareFunction(me, "do_bookkeepingP", "DO-BOOKKEEPING?", 0, 0, false);
        declareFunction(me, "new_bookkeeping_info", "NEW-BOOKKEEPING-INFO", 0, 4, false);
        declareFunction(me, "assertion_bookkeeping_info", "ASSERTION-BOOKKEEPING-INFO", 1, 0, false);
        declareFunction(me, "cyc_bookkeeping_info_for", "CYC-BOOKKEEPING-INFO-FOR", 1, 0, false);
        declareFunction(me, "perform_constant_bookkeeping", "PERFORM-CONSTANT-BOOKKEEPING", 1, 0, false);
        declareFunction(me, "perform_assertion_bookkeeping", "PERFORM-ASSERTION-BOOKKEEPING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cyc_bookkeeping_file() {
        deflexical("*BOOKKEEPING-ENABLED?*", SubLTrampolineFile.maybeDefault($sym0$_BOOKKEEPING_ENABLED__, $bookkeeping_enabledP$, T));
        defparameter("*CYC-BOOKKEEPING-INFO*", NIL);
        return NIL;
    }

    public static SubLObject setup_cyc_bookkeeping_file() {
        declare_defglobal($sym0$_BOOKKEEPING_ENABLED__);
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

    static {



























    }
}

/**
 * Total time: 100 ms
 */
