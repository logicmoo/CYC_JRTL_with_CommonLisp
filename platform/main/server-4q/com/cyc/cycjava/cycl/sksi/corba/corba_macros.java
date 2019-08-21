package com.cyc.cycjava.cycl.sksi.corba;


import com.cyc.cycjava.cycl.sksi.corba.corba_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.sksi.corba.corba_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class corba_macros extends SubLTranslatedFile {
    public static final SubLFile me = new corba_macros();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_macros";

    public static final String myFingerPrint = "4ec1400e1d3ba72ef4878621dbed9ef5558b9b2f9f942d17faa31d24f742a64c";

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("CORBA-CONNECTION"), makeSymbol("&KEY"), makeSymbol("CONNECTION-TIMEOUT"), makeSymbol("TRANSACTION-TIMEOUT"), list(makeSymbol("ACCESS-MODE"), makeKeyword("PUBLIC"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("CONNECTION-TIMEOUT"), makeKeyword("TRANSACTION-TIMEOUT"), makeKeyword("ACCESS-MODE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    public static final SubLSymbol $sym7$TRANSACTION_TIMED_OUT = makeUninternedSymbol("TRANSACTION-TIMED-OUT");











    public static final SubLSymbol CORBA_CONNECTION_OPEN = makeSymbol("CORBA-CONNECTION-OPEN");

    public static final SubLSymbol CORBA_CONNECTION_OPEN_P = makeSymbol("CORBA-CONNECTION-OPEN-P");

    public static final SubLSymbol CORBA_CONNECTION_CLOSE = makeSymbol("CORBA-CONNECTION-CLOSE");

    public static SubLObject with_open_corba_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject corba_connection = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        corba_connection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject connection_timeout_tail = property_list_member($CONNECTION_TIMEOUT, current);
        final SubLObject connection_timeout = (NIL != connection_timeout_tail) ? cadr(connection_timeout_tail) : NIL;
        final SubLObject transaction_timeout_tail = property_list_member($TRANSACTION_TIMEOUT, current);
        final SubLObject transaction_timeout = (NIL != transaction_timeout_tail) ? cadr(transaction_timeout_tail) : NIL;
        final SubLObject access_mode_tail = property_list_member($ACCESS_MODE, current);
        final SubLObject access_mode = (NIL != access_mode_tail) ? cadr(access_mode_tail) : $PUBLIC;
        final SubLObject body;
        current = body = temp;
        final SubLObject transaction_timed_out = $sym7$TRANSACTION_TIMED_OUT;
        return list(CLET, list(transaction_timed_out), list(IGNORE, transaction_timed_out), list(WITH_TIMEOUT, list(transaction_timeout, transaction_timed_out), list(CUNWIND_PROTECT, listS(PWHEN, list(CORBA_CONNECTION_OPEN, corba_connection, connection_timeout, access_mode), append(body, NIL)), list(PWHEN, list(CORBA_CONNECTION_OPEN_P, corba_connection), list(CORBA_CONNECTION_CLOSE, corba_connection)))));
    }

    public static SubLObject declare_corba_macros_file() {
        declareMacro(me, "with_open_corba_connection", "WITH-OPEN-CORBA-CONNECTION");
        return NIL;
    }

    public static SubLObject init_corba_macros_file() {
        return NIL;
    }

    public static SubLObject setup_corba_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_corba_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_corba_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_corba_macros_file();
    }

    static {

















    }
}

/**
 * Total time: 23 ms
 */
