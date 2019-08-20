/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.V10;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CORBA-MACROS
 *  source file: /cyc/top/cycl/sksi/corba/corba-macros.lisp
 *  created:     2019/07/03 17:37:52
 */
public final class corba_macros extends SubLTranslatedFile implements V10 {
    // // Constructor
    private corba_macros() {
    }

    public static final SubLFile me = new corba_macros();


    // // Definitions
    public static final SubLObject with_open_corba_connection(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject corba_connection = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    corba_connection = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject connection_timeout_tail = property_list_member($CONNECTION_TIMEOUT, current);
                            SubLObject connection_timeout = (NIL != connection_timeout_tail) ? ((SubLObject) (cadr(connection_timeout_tail))) : NIL;
                            SubLObject transaction_timeout_tail = property_list_member($TRANSACTION_TIMEOUT, current);
                            SubLObject transaction_timeout = (NIL != transaction_timeout_tail) ? ((SubLObject) (cadr(transaction_timeout_tail))) : NIL;
                            SubLObject access_mode_tail = property_list_member($ACCESS_MODE, current);
                            SubLObject access_mode = (NIL != access_mode_tail) ? ((SubLObject) (cadr(access_mode_tail))) : $PUBLIC;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject transaction_timed_out = $sym7$TRANSACTION_TIMED_OUT;
                                return list(CLET, list(transaction_timed_out), list(IGNORE, transaction_timed_out), list(WITH_TIMEOUT, list(transaction_timeout, transaction_timed_out), list(CUNWIND_PROTECT, listS(PWHEN, list(CORBA_CONNECTION_OPEN, corba_connection, connection_timeout, access_mode), append(body, NIL)), list(PWHEN, list(CORBA_CONNECTION_OPEN_P, corba_connection), list(CORBA_CONNECTION_CLOSE, corba_connection)))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject declare_corba_macros_file() {
        declareMacro("with_open_corba_connection", "WITH-OPEN-CORBA-CONNECTION");
        return NIL;
    }

    public static final SubLObject init_corba_macros_file() {
        return NIL;
    }

    public static final SubLObject setup_corba_macros_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeSymbol("CORBA-CONNECTION"), makeSymbol("&KEY"), makeSymbol("CONNECTION-TIMEOUT"), makeSymbol("TRANSACTION-TIMEOUT"), list(makeSymbol("ACCESS-MODE"), makeKeyword("PUBLIC"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list(makeKeyword("CONNECTION-TIMEOUT"), makeKeyword("TRANSACTION-TIMEOUT"), makeKeyword("ACCESS-MODE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    static private final SubLSymbol $sym7$TRANSACTION_TIMED_OUT = makeUninternedSymbol("TRANSACTION-TIMED-OUT");











    private static final SubLSymbol CORBA_CONNECTION_OPEN = makeSymbol("CORBA-CONNECTION-OPEN");

    private static final SubLSymbol CORBA_CONNECTION_OPEN_P = makeSymbol("CORBA-CONNECTION-OPEN-P");

    private static final SubLSymbol CORBA_CONNECTION_CLOSE = makeSymbol("CORBA-CONNECTION-CLOSE");

    // // Initializers
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
}

