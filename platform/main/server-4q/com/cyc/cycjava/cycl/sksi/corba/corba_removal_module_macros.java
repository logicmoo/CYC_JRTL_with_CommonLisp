/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V10;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CORBA-REMOVAL-MODULE-MACROS
 *  source file: /cyc/top/cycl/sksi/corba/corba-removal-module-macros.lisp
 *  created:     2019/07/03 17:38:36
 */
public final class corba_removal_module_macros extends SubLTranslatedFile implements V10 {
    // // Constructor
    private corba_removal_module_macros() {
    }

    public static final SubLFile me = new corba_removal_module_macros();

    public static final String myName = "com.cyc.cycjava_2.cycl.sksi.corba.corba_removal_module_macros";

    // // Definitions
    public static final SubLObject corba_sks_declare_removal_module_suite(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sks = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            sks = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pred = $sym1$PRED;
                    return list(CDOLIST, bq_cons(pred, $list_alt3), list(CORBA_SKS_DECLARE_REMOVAL_MODULE, sks, pred));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static final SubLObject corba_sks_undeclare_removal_module_suite(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sks = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            sks = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pred = $sym5$PRED;
                    return list(CDOLIST, bq_cons(pred, $list_alt3), list(CORBA_SKS_UNDECLARE_REMOVAL_MODULE, sks, pred));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static final SubLObject corba_sks_declare_removal_module(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sks = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            sks = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject name = $sym8$NAME;
                    SubLObject expand_fn = $sym9$EXPAND_FN;
                    SubLObject req_pattern = $sym10$REQ_PATTERN;
                    SubLObject content_mt = $sym11$CONTENT_MT;
                    return list(CLET, list(list(name, list(MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred)), list(expand_fn, list(CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL, pred)), list(req_pattern, list(DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN, pred)), list(content_mt, list(SKS_GET_CONTENT_MT, sks))), list(INFERENCE_REMOVAL_MODULE, name, list(new SubLObject[]{ LIST, $SENSE, $POS, $PREDICATE, pred, $REQUIRED_PATTERN, req_pattern, $COST_EXPRESSION, FIVE_INTEGER, $EXPAND, expand_fn, $REQUIRED_MT, content_mt })), list(NOTE_SKSI_CORBA_MODULE, name, content_mt), list(REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE, pred));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    public static final SubLObject corba_sks_undeclare_removal_module(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sks = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            sks = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject name = $sym28$NAME;
                    return list(CLET, list(list(name, list(MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred))), listS(UNDECLARE_INFERENCE_REMOVAL_MODULE, name, $list_alt30), list(UN_NOTE_SKSI_CORBA_MODULE, name));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_corba_removal_module_macros_file() {
        declareMacro("corba_sks_declare_removal_module_suite", "CORBA-SKS-DECLARE-REMOVAL-MODULE-SUITE");
        declareMacro("corba_sks_undeclare_removal_module_suite", "CORBA-SKS-UNDECLARE-REMOVAL-MODULE-SUITE");
        declareMacro("corba_sks_declare_removal_module", "CORBA-SKS-DECLARE-REMOVAL-MODULE");
        declareMacro("corba_sks_undeclare_removal_module", "CORBA-SKS-UNDECLARE-REMOVAL-MODULE");
        return NIL;
    }

    public static final SubLObject init_corba_removal_module_macros_file() {
        return NIL;
    }

    public static final SubLObject setup_corba_removal_module_macros_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("SKS"));

    static private final SubLSymbol $sym1$PRED = makeUninternedSymbol("PRED");



    static private final SubLList $list_alt3 = list(list(makeSymbol("GET-CORBA-REMOVAL-PREDICATES")));

    private static final SubLSymbol CORBA_SKS_DECLARE_REMOVAL_MODULE = makeSymbol("CORBA-SKS-DECLARE-REMOVAL-MODULE");

    static private final SubLSymbol $sym5$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol CORBA_SKS_UNDECLARE_REMOVAL_MODULE = makeSymbol("CORBA-SKS-UNDECLARE-REMOVAL-MODULE");

    static private final SubLList $list_alt7 = list(makeSymbol("SKS"), makeSymbol("PRED"));

    static private final SubLSymbol $sym8$NAME = makeUninternedSymbol("NAME");

    static private final SubLSymbol $sym9$EXPAND_FN = makeUninternedSymbol("EXPAND-FN");

    static private final SubLSymbol $sym10$REQ_PATTERN = makeUninternedSymbol("REQ-PATTERN");

    static private final SubLSymbol $sym11$CONTENT_MT = makeUninternedSymbol("CONTENT-MT");



    private static final SubLSymbol MAKE_CORBA_MODULE_NAME_KEYWORD = makeSymbol("MAKE-CORBA-MODULE-NAME-KEYWORD");

    private static final SubLSymbol CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL = makeSymbol("CORBA-PRED-GET-REMOVAL-MODULE-EXPAND-FN-SYMBOL");

    private static final SubLSymbol DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN = makeSymbol("DETERMINE-CORBA-REMOVAL-MODULE-REQUIRED-PATTERN");

    private static final SubLSymbol SKS_GET_CONTENT_MT = makeSymbol("SKS-GET-CONTENT-MT");

    private static final SubLSymbol INFERENCE_REMOVAL_MODULE = makeSymbol("INFERENCE-REMOVAL-MODULE");

















    private static final SubLSymbol NOTE_SKSI_CORBA_MODULE = makeSymbol("NOTE-SKSI-CORBA-MODULE");

    private static final SubLSymbol REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE = makeSymbol("REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE");

    static private final SubLSymbol $sym28$NAME = makeUninternedSymbol("NAME");

    private static final SubLSymbol UNDECLARE_INFERENCE_REMOVAL_MODULE = makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE");

    static private final SubLList $list_alt30 = list(NIL);

    private static final SubLSymbol UN_NOTE_SKSI_CORBA_MODULE = makeSymbol("UN-NOTE-SKSI-CORBA-MODULE");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_corba_removal_module_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_corba_removal_module_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_corba_removal_module_macros_file();
    }
}

